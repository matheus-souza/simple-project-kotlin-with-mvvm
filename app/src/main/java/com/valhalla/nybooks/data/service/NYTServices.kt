package com.valhalla.nybooks.data.service

import com.valhalla.nybooks.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NYTServices {
    @GET("lists.json")
    fun getBooks(
        @Query("api-key") apiKey: String = "",
        @Query("list") list: String = "hardcover-fiction"
    ): Call<BookBodyResponse>
}