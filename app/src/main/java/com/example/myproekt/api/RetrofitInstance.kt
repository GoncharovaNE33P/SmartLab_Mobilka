package com.example.myproekt.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInstance
{
    private val interceptor: HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY}
    private val client:OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(interceptor)
        .build()
    val api:Api = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(Api.BASE_URL_SMARTLAB)
        .client(client)
        .build()
        .create(Api::class.java)

    val apiSmartLab:Api = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(Api.BASE_URL_SMARTLAB)
        .client(client)
        .build()
        .create(Api::class.java)
}