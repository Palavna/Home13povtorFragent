package com.example.yana.home13

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs

class DisplayFragment : Fragment(R.layout.fragment_display) {

    private val args: DisplayFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name = view.findViewById<TextView>(R.id.name)
        val secondName = view.findViewById<TextView>(R.id.secondName)

        name.text = PreferenceHelp.getName()
        secondName.text = PreferenceHelp.getSecondName()
    }
}
