package com.example.petproject.app

import javax.inject.Inject

interface TestClassC {

    fun show()
}

class TestClassCImpl @Inject constructor() : TestClassC {

    init {
        println("ssss TestClassCImpl")
    }

    override fun show() {
        println("show")
    }
}