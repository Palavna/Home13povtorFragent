package com.example.yana.home13

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SingUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_up)
        val edName = findViewById<EditText>(R.id.edName)
        val edSecond = findViewById<EditText>(R.id.edSecond)
        val edLogin = findViewById<EditText>(R.id.edLogin)
        val edPassword = findViewById<EditText>(R.id.edPassword)
        val edRepPass = findViewById<EditText>(R.id.edRepPass)
        val butCreate = findViewById<Button>(R.id.butCreate)

        butCreate.setOnClickListener{
            PreferenceHelp.saveName(edName.text.toString())
            PreferenceHelp.saveSecondName(edSecond.text.toString())
            PreferenceHelp.saveedLogin(edLogin.text.toString())
            PreferenceHelp.saveedPassword(edPassword.text.toString())

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}