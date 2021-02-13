package com.example.petproject.app

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CardManagementRepo @Inject constructor(){

    init {
        println("ssss CardManagementRepo")
    }

    fun show() {
        println("ssss show")
    }
}