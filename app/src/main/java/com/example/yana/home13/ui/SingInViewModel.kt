package com.example.yana.home13.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.yana.home13.PreferenceHelp

class SingInViewModel: ViewModel() {

     val isValidCredential = MutableLiveData<Boolean>()
    
    fun checkUserData(password:String, login:String){
        val edLogin = PreferenceHelp.getedLogin()
        val edPassword = PreferenceHelp.getedPassword()
        isValidCredential.postValue(edPassword == password && edLogin == login)
    }
}