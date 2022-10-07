package com.example.bindinglivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val quoteLiveData = MutableLiveData("What you see is what you get")

    fun updateQuote() {
        quoteLiveData.value = "You'll believe it when you see it"
    }

}