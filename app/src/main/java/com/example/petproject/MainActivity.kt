package com.example.petproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.petproject.app.CardManagementRepo
import com.example.petproject.app.TestClassA
import com.example.petproject.app.TestClassB
import com.example.petproject.datasource.LocalDataSource
import com.example.petproject.di.ApplicationComponent
import com.example.petproject.di.DaggerApplicationComponent
import com.example.petproject.login.ui.LoginActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var testClassA: TestClassA

//    @Inject
//    lateinit var testClassB: TestClassB
//
//    @Inject
//    lateinit var testClassB: Lazy<TestClassB>

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerApplicationComponent.create().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start_btn.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        testClassA.show()

    }
}