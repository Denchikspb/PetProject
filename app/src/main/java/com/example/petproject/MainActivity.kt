package com.example.petproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.petproject.util.BottomNavManager

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavManager: BottomNavManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            setupNavigationManager()
        }
    }

    private fun setupNavigationManager() {
        bottomNavManager = BottomNavManager(
            fragmentManager = supportFragmentManager,
            containerId = R.id.container_fragment,
            bottomNavigationView = findViewById(R.id.bottom_nav_view)
        )
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        bottomNavManager.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        bottomNavManager.onRestoreInstanceState(savedInstanceState)
        setupNavigationManager()
    }

    override fun onBackPressed() {
        if (!bottomNavManager.onBackPressed()) super.onBackPressed()
    }

}