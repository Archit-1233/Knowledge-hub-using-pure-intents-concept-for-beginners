package com.example.geekyhub.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class frontscreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frontscreen)

        val app=findViewById<CardView>(R.id.first)
        app.setOnClickListener(){
            val intent=Intent(this,android::class.java)
            startActivity(intent)


        }
       val dial=findViewById<Button>(R.id.contact)
        dial.setOnClickListener(){
            val intent=Intent(Intent.ACTION_DIAL)
            intent.data= Uri.parse("tel:7906221668")
            startActivity(intent)

        }
        val web=findViewById<CardView>(R.id.second)
        web.setOnClickListener(){
            val intent=Intent(this,webd::class.java)
            startActivity(intent)

        }
        val ios=findViewById<CardView>(R.id.third)
        ios.setOnClickListener(){
            val intent=Intent(this,ioss::class.java)

            startActivity(intent)

        }
        val machinee=findViewById<CardView>(R.id.forth)
        machinee.setOnClickListener(){
            val intent=Intent(this,machine::class.java)
            startActivity(intent)

        }
        val blockchainnn=findViewById<CardView>(R.id.fifth)
        blockchainnn.setOnClickListener(){
            val intent=Intent(this,blockchain::class.java)
            startActivity(intent)
        }
        val data=findViewById<CardView>(R.id.sixth)
        data.setOnClickListener(){
            val intent=Intent(this,datascience::class.java)
            startActivity(intent)
        }





    }
}