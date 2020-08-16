package com.valhalla.nybooks.data.repository

import com.valhalla.nybooks.data.result.BooksResult

interface BooksRepository {

    fun getBooks(booksResultCallback: (result: BooksResult) -> Unit)
}