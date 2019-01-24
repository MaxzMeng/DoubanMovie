package me.maxandroid.doubanmovie.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

private const val BASE_URL = "http://192.168.31.85:3000/movie/"


val retrofit by lazy {
    Retrofit.Builder()
        .client(
            OkHttpClient.Builder()
                .build()
        )
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}