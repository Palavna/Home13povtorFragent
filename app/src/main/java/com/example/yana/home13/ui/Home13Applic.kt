package com.example.yana.home13.ui

import android.app.Application
import com.example.yana.home13.PreferenceHelp
import com.example.yana.home13.di.saveModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class Home13Applic: Application() {

    override fun onCreate() {
        super.onCreate()
        PreferenceHelp.initPreference(this)
        startKoin {
            androidContext(this@Home13Applic)
            saveModules
        }
    }
}