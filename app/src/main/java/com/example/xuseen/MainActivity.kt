package com.example.xuseen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private lateinit var myButton: Button
    private lateinit var mytextView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        myButton = findViewById(R.id.Button)
        mytextView = findViewById(R.id.TextView)

        myButton.setOnClickListener{

            mytextView.text = "we have changed the text"
        }

    }
}