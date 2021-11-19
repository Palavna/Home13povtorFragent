package com.example.yana.home13.ui

import androidx.lifecycle.ViewModel
import com.example.yana.home13.PreferenceHelp

class SingUpViewModel: ViewModel() {

    fun saveUserData(name:String, secondName:String, login:String, password:String){
        PreferenceHelp.saveName(name)
        PreferenceHelp.saveSecondName(secondName)
        PreferenceHelp.saveedLogin(login)
        PreferenceHelp.saveedPassword(password)
    }
}