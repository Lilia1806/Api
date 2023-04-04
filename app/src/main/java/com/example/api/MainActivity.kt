package com.example.api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.api.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.http.GET

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottom.setOnClickListener {
            Glide.with(binding.image).load("https://http.cat/${binding.text.text}")
                .into(binding.image)
        }
    }
}