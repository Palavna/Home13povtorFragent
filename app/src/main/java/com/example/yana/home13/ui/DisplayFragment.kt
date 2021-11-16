package com.example.yana.home13.ui

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.yana.home13.PreferenceHelp
import com.example.yana.home13.R

class DisplayFragment : Fragment(R.layout.fragment_display) {

    private val args: DisplayFragmentArgs by navArgs()

    private val viewModel: DisplayViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name = view.findViewById<TextView>(R.id.name)
        val secondName = view.findViewById<TextView>(R.id.secondName)

        name.text = PreferenceHelp.getName()
        secondName.text = PreferenceHelp.getSecondName()
    }
}
