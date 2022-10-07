package com.example.bindinglivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.bindinglivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        /*mainViewModel.quoteLiveData.observe(this, {
            binding.quoteText.text = it
        })*/

        binding.mainViewModel = mainViewModel
        binding.lifecycleOwner = this

        /*binding.btnUpdate.setOnClickListener {
                mainViewModel.updateQuote()
        }*/


    }
}