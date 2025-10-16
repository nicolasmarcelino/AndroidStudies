package com.example.androidstudies

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var homeButton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        homeButton = findViewById(R.id.homeButton)
    }

    override fun onStart() {
        super.onStart()
        homeButton.setOnClickListener {
            sendToHome()
        }
    }

    private fun sendToHome() {
        var intencao = Intent(this, HomeActivity::class.java)
        startActivity(intencao)
    }
}