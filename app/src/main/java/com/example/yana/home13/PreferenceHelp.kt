package com.example.yana.home13

import android.content.Context
import android.content.SharedPreferences

object PreferenceHelp {

    private lateinit var preference: SharedPreferences

    fun initPreference(context: Context) {
        preference = context.getSharedPreferences("Home13", Context.MODE_PRIVATE)
    }

    fun saveName(name: String) {
        preference.edit().putString("name", name).apply()
    }

    fun getName(): String? {
        return preference.getString("name", "")
    }

    fun saveSecondName(secondName: String) {
        preference.edit().putString("secondName", secondName).apply()
    }

    fun getSecondName(): String? {
        return preference.getString("secondName", "")
    }

    fun saveedLogin(edLogin: String) {
        preference.edit().putString("edLogin", edLogin).apply()
    }

    fun getedLogin(): String? {
        return preference.getString("edLogin", "")
    }

    fun saveedPassword(edPassword: String) {
        preference.edit().putString("edPassword", edPassword).apply()
    }

    fun getedPassword(): String? {
        return preference.getString("edPassword", "")
    }
}