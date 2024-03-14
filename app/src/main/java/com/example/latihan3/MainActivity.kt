package com.example.latihan3

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.latihan3.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.textView.text = "Hello, View Binding!"
        binding.button.text = "Click me"
        binding.button.setOnClickListener {
            binding.textView.text = "Anda mencoba menekan tombol"
        }
    }
}