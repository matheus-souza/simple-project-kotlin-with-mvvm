package com.valhalla.nybooks.data.repository

import com.valhalla.nybooks.R
import com.valhalla.nybooks.data.model.Book
import com.valhalla.nybooks.data.module.ApiModule
import com.valhalla.nybooks.data.response.BookBodyResponse
import com.valhalla.nybooks.data.result.BooksResult
import com.valhalla.nybooks.ui.books.BooksViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BooksApiDataSource : BooksRepository {

    override fun getBooks(booksResultCallback: (result: BooksResult) -> Unit) {
        ApiModule.service.getBooks().enqueue(object : Callback<BookBodyResponse> {
            override fun onResponse(
                call: Call<BookBodyResponse>,
                response: Response<BookBodyResponse>
            ) {
                when {
                    response.isSuccessful -> {
                        val books: MutableList<Book> = mutableListOf()

                        response.body()?.let { bookBodyResponse ->
                            for (result in bookBodyResponse.resultResponse) {
                                books.add(result.bookDetailResponses[0].getBookModel())
                            }
                        }

                        booksResultCallback(BooksResult.Success(books))
                    }
                    else -> booksResultCallback(BooksResult.ApiError(response.code()))
                }
            }

            override fun onFailure(call: Call<BookBodyResponse>, t: Throwable) {
                booksResultCallback(BooksResult.ServerError)
            }
        })
    }
}