package com.example.coroutineswithmvvm

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitObj {
    val apiservice:Apiservice
    init {
         apiservice= Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Apiservice::class.java)
    }
}