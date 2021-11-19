package com.example.yana.home13.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.yana.home13.R

class SingUpFragment : Fragment(R.layout.fragment_sing_up) {

    private val viewModel: SingUpViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val edName = view.findViewById<EditText>(R.id.edName)
        val edSecond = view.findViewById<EditText>(R.id.edSecond)
        val edLogin = view.findViewById<EditText>(R.id.edLogin)
        val edPassword = view.findViewById<EditText>(R.id.edPassword)
        val edRepPass = view.findViewById<EditText>(R.id.edRepPass)
        val butCreate = view.findViewById<Button>(R.id.butCreate)

        butCreate.setOnClickListener {
            viewModel.saveUserData(
                edName.text.toString(),
                edSecond.text.toString(),
                edLogin.text.toString(),
                edPassword.text.toString()
            )
            navigateMainScreen(edName.text.toString(), edSecond.text.toString())
        }
    }
    private fun navigateMainScreen(edName: String, edSecond: String) {
        val directions = SingUpFragmentDirections.actionSingUpFragmentToDisplayFragment(
            edName,
            edSecond
        )
        findNavController().navigate(directions)
    }
}

