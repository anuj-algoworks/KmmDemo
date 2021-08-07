package com.kdroid.kmmdemo.android.ui.home

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.kdroid.kmmdemo.android.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = intent.extras
        val userName:String = intent!!.getString("name","anuj")
        binding.tvUserDetail.text = "Welcome to KMM world, $userName!"
    }
}