package com.example.yana.home13

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<TextView>(R.id.name)
        val secondName = findViewById<TextView>(R.id.secondName)

        name.text = PreferenceHelp.getName()
        secondName.text = PreferenceHelp.getSecondName()
    }
}