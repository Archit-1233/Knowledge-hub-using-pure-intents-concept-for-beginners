package com.example.geekyhub.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class machine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_machine)
        val java=findViewById<ImageView>(R.id.jaava)
        java.setOnClickListener(){
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.w3schools.com/java/")
            startActivity(intent)
        }
//        val javascript=findViewById<ImageView>(R.id.javascript)
//        javascript.setOnClickListener(){
//            val intent=Intent(Intent.ACTION_VIEW)
//            intent.data= Uri.parse(" https://www.w3schools.com/js/")
//            startActivity(intent)
//
//        }
        val python=findViewById<ImageView>(R.id.python)
        python.setOnClickListener(){
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.geeksforgeeks.org/python-programming-language/")
            startActivity(intent)
        }




    }


}