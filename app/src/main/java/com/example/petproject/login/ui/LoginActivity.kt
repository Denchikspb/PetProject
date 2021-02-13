package com.example.petproject.login.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.petproject.R
import kotlinx.android.synthetic.main.login_activity.*

class LoginActivity : AppCompatActivity() {

//    @Inject
//    lateinit var loginViewViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)


        Glide.with(this)
            .load("https://s5o.ru/storage/simple/ru/edt/21/cc/4c/8f/rue474e97851e.jpg")
            .placeholder(R.drawable.ic_launcher_foreground)
            .into(iv_one)

        Glide.with(this)
            .load("https://images.outlookindia.com/public/uploads/articles/2020/2/5/Ronaldo-JUVE-AP_571_855.jpg")
            .placeholder(R.drawable.ic_launcher_foreground)
            .into(iv_two)
    }
}