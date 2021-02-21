package com.example.petproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.petproject.app.CardManagementRepo
import com.example.petproject.app.TestClassA
import com.example.petproject.app.TestClassB
import com.example.petproject.datasource.LocalDataSource
import com.example.petproject.di.ApplicationComponent
import com.example.petproject.di.DaggerApplicationComponent
import com.example.petproject.login.ui.LoginActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
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

        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.page_1 -> {
                    Toast.makeText(this, "first", Toast.LENGTH_SHORT)
                    // navigate
                    true
                }
                R.id.page_2 -> {
                    Toast.makeText(this, "second", Toast.LENGTH_SHORT)
                    // navigate
                    true
                }
                R.id.page_3 -> {
                    Toast.makeText(this, "third", Toast.LENGTH_SHORT)
                    // navigate
                    true
                }
                R.id.page_4 -> {
                    Toast.makeText(this, "fourth", Toast.LENGTH_SHORT)
                    // navigate
                    true
                }
                else -> false
            }
        }

        testClassA.show()

    }
}