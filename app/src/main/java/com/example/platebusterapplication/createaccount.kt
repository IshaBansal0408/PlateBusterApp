package com.example.platebusterapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class createaccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_createaccount)
    }
    fun gotologin(view: View) {
        val button=findViewById<Button>(R.id.button4)
        button.setOnClickListener{
            val intent= Intent(this,login::class.java)
            startActivity(intent)
        }
    }
}