package com.example.petproject.app

import javax.inject.Inject

interface TestClassB {

}

class TestClassBImpl(): TestClassB {
//
//    @Inject
//    lateinit var testClassC: TestClassC

    init {
        println("ssss TestClassBImpl")
    }

    fun show() {
//        testClassC.show()
    }
}