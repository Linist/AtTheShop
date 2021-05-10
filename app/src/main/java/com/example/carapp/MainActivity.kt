package com.example.carapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val btnIN = findViewById<Button>(R.id.logInBtn)
        val btnSUPPORT = findViewById<Button>(R.id.btnSupport)

        // set on-click listener
        btnIN.setOnClickListener {
            Intent(this,StatusActivity::class.java).also {
                startActivity(it)
            }
        }
        btnSUPPORT.setOnClickListener {
            Intent(this,SupportActivity::class.java).also {
                startActivity(it)
            }
        }

    }
}