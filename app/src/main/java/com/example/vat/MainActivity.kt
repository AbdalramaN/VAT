package com.example.vat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vat.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(R.layout.activity_main)

        binding.btnCalculateVat.setOnClickListener {
            calculateVat()
        }// End setOnClickListener


    }// End onCreate

    private fun calculateVat() {

    }
    }
