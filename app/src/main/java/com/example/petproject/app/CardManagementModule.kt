package com.example.petproject.app

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class CardManagementModule {

    @Module
    companion object {

        @Provides
        @JvmStatic
        fun provideB(): TestClassB = TestClassBImpl()
    }

    @Binds
    abstract fun bindA(impl: TestClassAImpl): TestClassA

//    @Provides
//    fun provideB(): TestClassB = TestClassBImpl()
//
//    @Binds
//    fun bindC(impl: TestClassCImpl): TestClassC

}