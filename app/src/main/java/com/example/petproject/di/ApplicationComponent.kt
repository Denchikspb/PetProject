package com.example.petproject.di

import com.example.petproject.MainActivity
import com.example.petproject.app.CardManagementModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [CardManagementModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)
}