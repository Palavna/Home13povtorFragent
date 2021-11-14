package com.example.yana.home13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SingUpFragment: Fragment(R.layout.fragment_sing_up) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val edName = view.findViewById<EditText>(R.id.edName)
        val edSecond = view.findViewById<EditText>(R.id.edSecond)
        val edLogin = view.findViewById<EditText>(R.id.edLogin)
        val edPassword = view.findViewById<EditText>(R.id.edPassword)
        val edRepPass = view.findViewById<EditText>(R.id.edRepPass)
        val butCreate = view.findViewById<Button>(R.id.butCreate)

        butCreate.setOnClickListener{

            PreferenceHelp.saveName(edName.text.toString())
            PreferenceHelp.saveSecondName(edSecond.text.toString())
            PreferenceHelp.saveedLogin(edLogin.text.toString())
            PreferenceHelp.saveedPassword(edPassword.text.toString())

            val directions = SingUpFragmentDirections.actionSingUpFragmentToDisplayFragment(
                edName.text.toString(),
                edSecond.text.toString())
            findNavController().navigate(directions)
        }
    }
}






//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.fragment_sing_up)

//
//        butCreate.setOnClickListener{
//            PreferenceHelp.saveName(edName.text.toString())
//            PreferenceHelp.saveSecondName(edSecond.text.toString())
//            PreferenceHelp.saveedLogin(edLogin.text.toString())
//            PreferenceHelp.saveedPassword(edPassword.text.toString())
//
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//            finish()
//        }
//    }
