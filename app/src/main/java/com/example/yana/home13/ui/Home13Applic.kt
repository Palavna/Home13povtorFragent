package com.example.yana.home13.ui

import android.app.Application
import com.example.yana.home13.PreferenceHelp

class Home13Applic: Application() {

    override fun onCreate() {
        super.onCreate()
        PreferenceHelp.initPreference(this)
    }
}