package com.example.directcurrencyconverter.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.directcurrencyconverter.databinding.FirstScreenBinding

class FirstScreen:AppCompatActivity() {

    lateinit var binding: FirstScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FirstScreenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



    }

}
