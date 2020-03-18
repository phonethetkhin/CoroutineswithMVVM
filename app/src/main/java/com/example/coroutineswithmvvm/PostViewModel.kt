package com.example.coroutineswithmvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class PostViewModel : ViewModel() {
    val repository = PostRepository()
    val postlivedata = repository.postlivedata

    fun getPostLiveDataViewModel() {
        viewModelScope.launch {
            repository.getPostFromAPI()
        }
    }

}