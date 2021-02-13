package com.example.petproject.login.di

import com.example.petproject.di.LoginScope
import com.example.petproject.login.ui.LoginActivity
import dagger.Subcomponent

@LoginScope
@Subcomponent(modules = [LoginModule::class])
interface LoginComponent {

    fun inject(activity: LoginActivity)

    @Subcomponent.Builder
    interface Factory {
        fun create(): LoginComponent
    }
}