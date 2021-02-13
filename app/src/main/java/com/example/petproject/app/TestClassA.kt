package com.example.petproject.app

import javax.inject.Inject

interface TestClassA {


    fun show()
}

class TestClassAImpl @Inject constructor(
    private val testClassB: TestClassB
): TestClassA {

    init {
        println("ssss TestClassAImpl")
    }

    override fun show() {
        println("ssss show class A")
        testClassB.toString()
    }
}