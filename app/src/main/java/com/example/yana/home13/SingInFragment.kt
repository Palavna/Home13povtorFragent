package com.example.yana.home13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SingInFragment: Fragment(R.layout.fragment_sing_in) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val edLog = view.findViewById<EditText>(R.id.edLog)
        val edPassw = view.findViewById<EditText>(R.id.edPassw)
        val butVhod = view.findViewById<Button>(R.id.butVhod)

        butVhod.setOnClickListener{
            val directions = SingInFragmentDirections.actionSingInFragmentToDisplayFragment(
                edLog.text.toString(),
                edPassw.text.toString()
            )
            findNavController().navigate(directions)
        }
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
