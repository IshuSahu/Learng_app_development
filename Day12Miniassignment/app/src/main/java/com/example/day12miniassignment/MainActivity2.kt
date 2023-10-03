package com.example.day12miniassignment

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnContact = findViewById<Button>(R.id.contactus)
        btnContact.setOnClickListener{
             intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:7414983279"));
            startActivity(intent);
        }
    }
}