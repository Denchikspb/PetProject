package com.example.petproject.app

import android.app.Application
import com.example.petproject.di.DaggerApplicationComponent

class PetProjectApplication : Application() {

    override fun onCreate() {
        super.onCreate()

//        val appComponent = DaggerApplicationComponent.create()
    }
}