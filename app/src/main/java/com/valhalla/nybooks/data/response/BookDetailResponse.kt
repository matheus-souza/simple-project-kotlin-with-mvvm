package com.valhalla.nybooks.data.response

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BookDetailResponse(
    val title: String,
    val author: String,
    val description: String
)