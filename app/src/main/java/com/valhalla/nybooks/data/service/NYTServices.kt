package com.valhalla.nybooks.data.service

import com.valhalla.nybooks.BuildConfig
import com.valhalla.nybooks.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NYTServices {
    @GET("lists.json")
    fun getBooks(
        @Query("api-key") apiKey: String = BuildConfig.API_KEY,
        @Query("list") list: String = "hardcover-fiction"
    ): Call<BookBodyResponse>
}