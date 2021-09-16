package com.example.yana.home13

import android.app.Application

class Home13Applic: Application() {

    override fun onCreate() {
        super.onCreate()
        PreferenceHelp.initPreference(this)
    }
}