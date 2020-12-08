package com.example.platebusterapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.widget.TextView

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun forgetpassscreen(view: View) {
        val button=findViewById<TextView>(R.id.textView14)
        button.setOnClickListener{
            val intent= Intent(this,forgetpass::class.java)
            startActivity(intent)
        }
    }
}