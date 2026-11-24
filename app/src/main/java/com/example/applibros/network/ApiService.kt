package com.example.applibros.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_URL =
    "https://openlibrary.org/search.json?q=jazz+history&fields=key,title,author_name,first_publish_year,isbn,cover_i,edition_count&limit=20"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface ApiService {
    @GET("libros")
    suspend fun getLibros(): String
}

object LibroApi {
    val retrofitService: ApiService by lazy {
        com.example.applibros.network.retrofit.create(ApiService::class.java)
    }
}