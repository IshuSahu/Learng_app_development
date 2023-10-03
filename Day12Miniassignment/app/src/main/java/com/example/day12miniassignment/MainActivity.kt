package com.example.day12miniassignment

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNext = findViewById<Button>(R.id.button)
        btnNext.setOnClickListener{
            intent = Intent(applicationContext,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}