package com.example.petproject.di

import com.example.petproject.login.di.LoginComponent
import dagger.Module

@Module(subcomponents = [LoginComponent::class])
interface SubcomponentsModule {
}