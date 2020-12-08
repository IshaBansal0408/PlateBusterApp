package com.example.platebusterapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class forgetpass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgetpass)
    }
    fun nophone_email(view: View) {
        val button=findViewById<Button>(R.id.noemail)
        button.setOnClickListener{
            val intent= Intent(this,forgetpassemail::class.java)
            startActivity(intent)
        }
    }
}