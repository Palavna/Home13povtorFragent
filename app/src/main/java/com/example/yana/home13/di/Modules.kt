package com.example.yana.home13.di

import com.example.yana.home13.ui.SingInViewModel
import com.example.yana.home13.ui.SingUpViewModel
import com.example.yana.home13.ui.SplashViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

val saveModules by lazy {
    loadKoinModules(
        listOf(viewModelModuleInfo)
    )
}

val viewModelModuleInfo = module {
    viewModel { SplashViewModel() }
    viewModel { SingUpViewModel() }
    viewModel { SingInViewModel() }

}