package com.example.carapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StatusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_status)

        // get reference to button
        val btnOut = findViewById<Button>(R.id.btnLogOut)
        // set on-click listener
        btnOut.setOnClickListener {
            Intent(this,MainActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}
