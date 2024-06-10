package com.example.practicumexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)
        val startButton =findViewById<Button>(R.id.startButton)
        val exitButton= findViewById<Button>(R.id.existButton)

        startButton.setOnClickListener {
            val intent=Intent(this, MainScreen::class.java)
            startActivity(intent)
        }
    }
}