package com.example.day13datatransfertodifferent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn =  findViewById<Button>(R.id.button)
        val et1 = findViewById<EditText>(R.id.editTextText1)
        val et2 = findViewById<EditText>(R.id.editTextText2)
        val et3 = findViewById<EditText>(R.id.editTextText3)

        btn.setOnClickListener{
            val message = et1.text.toString() + " " +et2.text.toString()+ " " +et2.text.toString()
        }
    }
}