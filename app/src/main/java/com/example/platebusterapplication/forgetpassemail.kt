package com.example.platebusterapplication


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class forgetpassemail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgetpassemail)
    }
    fun phone(view: View) {
        val button=findViewById<Button>(R.id.noemail)
        button.setOnClickListener{
            val intent= Intent(this,forgetpass::class.java)
            startActivity(intent)
        }
    }
}