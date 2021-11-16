package com.example.yana.home13.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.yana.home13.PreferenceHelp
import com.example.yana.home13.R

class SingInFragment: Fragment(R.layout.fragment_sing_in) {

    private val viewModel: SingInViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val edLog = view.findViewById<EditText>(R.id.edLog)
        val edPassw = view.findViewById<EditText>(R.id.edPassw)
        val butVhod = view.findViewById<Button>(R.id.butVhod)

        butVhod.setOnClickListener{
            val edLogin = PreferenceHelp.getedLogin()
            val edPassword = PreferenceHelp.getedPassword()
            if (edPassword == edPassw.text.toString() && edLogin == edLog.text.toString()){
            }
        }
            val directions = SingInFragmentDirections.actionSingInFragmentToDisplayFragment(
                edLog.text.toString(),
                edPassw.text.toString()
            )
            findNavController().navigate(directions)
        }
    }



//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.fragment_sing_in)
//

//
//        butVhod.setOnClickListener{
//            val edLogin = PreferenceHelp.getedLogin()
//            val edPassword = PreferenceHelp.getedPassword()
//            if (edPassword == edPassw.text.toString() && edLogin == edLog.text.toString()){
//                val intent = Intent(this, MainActivity::class.java)
//                startActivity(intent)
//                finish()
//            }
//        }
//    }
