package com.example.factronome_android

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    val SPLASH_TIME_OUT: Long = 3000 //3초 후 메인으로 넘어감. (코틀린은 세미콜론 안쓰넹..)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            //일정 시간 후 어떤 액티비티(메인 - 로그인)로 넘어갈지
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT)
    }
}