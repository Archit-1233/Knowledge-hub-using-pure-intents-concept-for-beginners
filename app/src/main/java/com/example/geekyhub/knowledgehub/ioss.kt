package com.example.geekyhub.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ioss : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ios)
        val swift=findViewById<ImageView>(R.id.swift)
        val c=findViewById<ImageView>(R.id.objectivec)
        val dart=findViewById<ImageView>(R.id.dart)
        swift.setOnClickListener(){
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://docs.swift.org/swift-book/documentation/the-swift-programming-language/ ")
            startActivity(intent)
        }
        c.setOnClickListener(){
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data=Uri.parse("https://www.udacity.com/course/objective-c-for-swift-developers--ud1009")
            startActivity(intent)

        }
        dart.setOnClickListener(){
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data=Uri.parse("https://dart.dev/")
            startActivity(intent)

        }
    }
}