package com.example.platebusterapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun CreateAccount(view: View) {
        val button=findViewById<Button>(R.id.button2)
        button.setOnClickListener{
            val intent= Intent(this,createaccount::class.java)
            startActivity(intent)
        }
    }
    fun Login(view: View) {
        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val intent= Intent(this,login::class.java)
            startActivity(intent)
        }
    }

}