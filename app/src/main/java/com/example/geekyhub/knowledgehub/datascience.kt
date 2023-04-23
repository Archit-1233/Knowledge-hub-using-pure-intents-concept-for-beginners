package com.example.geekyhub.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class datascience : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datascience)

        val go=findViewById<ImageView>(R.id.go)
        go.setOnClickListener(){
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://go.dev/")
            startActivity(intent)
        }
        val scala=findViewById<ImageView>(R.id.scala)
        scala.setOnClickListener(){
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data=Uri.parse("https://www.scala-lang.org/ ")
            startActivity(intent)
        }

    }
}