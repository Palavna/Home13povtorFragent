package com.example.yana.home13

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SingInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_in)

        val edLog = findViewById<EditText>(R.id.edLog)
        val edPassw = findViewById<EditText>(R.id.edPassw)
        val butVhod = findViewById<Button>(R.id.butVhod)

        butVhod.setOnClickListener{
            val edLogin = PreferenceHelp.getedLogin()
            val edPassword = PreferenceHelp.getedPassword()
            if (edPassword == edPassw.text.toString() && edLogin == edLog.text.toString()){
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}