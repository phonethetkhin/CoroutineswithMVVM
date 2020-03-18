package com.example.coroutineswithmvvm

import androidx.lifecycle.MutableLiveData

class PostRepository {
    val apiservice = RetrofitObj.apiservice
    val postlivedata = MutableLiveData<List<PostModel>>()

    suspend fun getPostFromAPI() {
        val result = apiservice.getAllPosts()
        if (result.isSuccessful) {
            postlivedata.postValue(result.body())
        }

    }
}