package com.example.yana.home13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SplashFragment: Fragment(R.layout.fragment_splash) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val edLogin = PreferenceHelp.getedLogin()
        val edPassw = PreferenceHelp.getedPassword()

        if (edLogin.isNullOrEmpty()
            && edPassw.isNullOrEmpty()){
            val direct = SplashFragmentDirections.actionSplashFragmentToSingUpFragment()
            findNavController().navigate(direct)
        }else{
            val direction = SplashFragmentDirections.actionSplashFragmentToSingInFragment()
            findNavController().navigate(direction)
        }
    }
}























//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.fragment_splash)
//
//
//        Handler(Looper.getMainLooper()).postDelayed({
//            if (!edLogin.isNullOrEmpty() && !edPassw.isNullOrEmpty()){
//                val intent = Intent(this, SingInActivity::class.java)
//                startActivity(intent)
//                finish()
//            }else{
//                val intent = Intent(this, SingUpActivity::class.java)
//                startActivity(intent)
//                finish()
//            }
//        },1000)
//    }
