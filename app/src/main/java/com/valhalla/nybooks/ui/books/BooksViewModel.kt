package com.valhalla.nybooks.ui.books

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.valhalla.nybooks.data.model.Book

class BooksViewModel : ViewModel() {

    val booksLiveData: MutableLiveData<List<Book>> = MutableLiveData()

    fun getBooks() {
        booksLiveData.value = createFakeBooks()
    }

    fun createFakeBooks(): List<Book> {
        return listOf(
            Book("title", "autor"),
            Book("title2", "autor2"),
            Book("title3", "autor3")
        )
    }
}