package com.example.petproject.app

import javax.inject.Inject
import javax.inject.Singleton

interface CardManagement{

}

@Singleton
class CardManagementImpl @Inject constructor(): CardManagement {

    init {
        println("ssss CardManagementTest")
    }
}