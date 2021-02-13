package com.example.petproject.login.di

import com.example.petproject.presentation.LoginViewModel
import com.example.petproject.presentation.LoginViewModelImpl
import dagger.Binds
import dagger.Module

@Module
interface LoginModule {

    @Binds
    fun bindLoginViewModel(loginViewModel: LoginViewModelImpl): LoginViewModel
}