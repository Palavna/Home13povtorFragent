package com.example.yana.home13.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import com.example.yana.home13.PreferenceHelp

class SplashViewModel : ViewModel() {

    val isNeededRegisterEvent = MutableLiveData<Boolean>()

    init {
        checkNeededRegistration()
    }

    private fun checkNeededRegistration() {
        val edLogin = PreferenceHelp.getedLogin()
        val edPassw = PreferenceHelp.getedPassword()

        isNeededRegisterEvent.postValue(
            edLogin.isNullOrEmpty() &&
                    edPassw.isNullOrEmpty()
        )
    }
}