package com.valhalla.nybooks.data.response

import com.squareup.moshi.JsonClass
import com.valhalla.nybooks.data.model.Book

@JsonClass(generateAdapter = true)
data class BookDetailResponse(
    val title: String,
    val author: String,
    val description: String
) {
    fun getBookModel() = Book(
        title = this.title,
        author = this.author,
        description = this.description
    )
}