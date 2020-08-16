package com.valhalla.nybooks.data.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BookResultResponse(
    @Json(name = "book_details")
    val bookDetailResponses: List<BookDetailResponse>
)