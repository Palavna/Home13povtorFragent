package com.example.yana.home13

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val edLogin = PreferenceHelp.getedLogin()
        val edPassw = PreferenceHelp.getedPassword()

        Handler(Looper.getMainLooper()).postDelayed({
            if (!edLogin.isNullOrEmpty() && !edPassw.isNullOrEmpty()){
                val intent = Intent(this, SingInActivity::class.java)
                startActivity(intent)
                finish()
            }else{
                val intent = Intent(this, SingUpActivity::class.java)
                startActivity(intent)
                finish()
            }
        },1000)
    }
}