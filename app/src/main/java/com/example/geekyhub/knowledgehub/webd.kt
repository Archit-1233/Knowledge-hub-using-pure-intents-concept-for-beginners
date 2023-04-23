package com.example.geekyhub.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class webd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webd)
        val html=findViewById<ImageView>(R.id.html)
        val css=findViewById<ImageView>(R.id.css)
        val javascript=findViewById<ImageView>(R.id.javascript)

        html.setOnClickListener(){
           val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.w3schools.com/html/")
            startActivity(intent)
        }
        css.setOnClickListener(){
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.w3schools.com/css/")
            startActivity(intent)

        }
        javascript.setOnClickListener(){
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.w3schools.com/js/")
            startActivity(intent)

        }

    }
}