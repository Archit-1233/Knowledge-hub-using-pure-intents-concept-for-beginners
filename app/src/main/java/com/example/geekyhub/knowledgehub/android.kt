package com.example.geekyhub.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html.ImageGetter
import android.widget.ImageView

class android : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android)
        val java=findViewById<ImageView>(R.id.java)
        java.setOnClickListener(){
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.w3schools.com/java/")
            startActivity(intent)

        }
        val kotlin=findViewById<ImageView>(R.id.kotlin)
        kotlin.setOnClickListener(){
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://kotlinlang.org/")
            startActivity(intent)

        }



    }
}