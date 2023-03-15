package com.jaytaravia.luckynumapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //widgets of this activity
        val b1: Button = findViewById(R.id.btn)
        val text: TextView = findViewById(R.id.textView)
        val editTXT: EditText = findViewById(R.id.editText)

        b1.setOnClickListener(){
            var username = editTXT.text

            //Explicit intents
            var i  = Intent(this,LuckyNumberActivity::class.java)

            //Passing the username
            i.putExtra("name",username)

            startActivity(i)

        }

    }
}