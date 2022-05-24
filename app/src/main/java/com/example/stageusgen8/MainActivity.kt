package com.example.stageusgen8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // 초기 Fragment 가져오기
        val fragment = LoginFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_box, fragment).commit()

        initEvent()
    }

    fun initEvent() {

        // login_button에 대한 이벤트 처리 ( LoginFragment() 출력 )
        val loginButton = findViewById<Button>(R.id.login_button)
        loginButton.setOnClickListener {
            val fragment = LoginFragment()
            supportFragmentManager.beginTransaction().replace(R.id.fragment_box, fragment).commit()
        }

        val signupButton = findViewById<Button>(R.id.signup_button)
        signupButton.setOnClickListener {
            val fragment = SignupFragment()
            supportFragmentManager.beginTransaction().replace(R.id.fragment_box, fragment).commit()
        }
    }
}