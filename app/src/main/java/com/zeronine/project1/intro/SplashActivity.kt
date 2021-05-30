package com.zeronine.project1.intro

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.zeronine.project1.MainActivity
import com.zeronine.project1.R

class SplashActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT:Long = 2000 // 3000 : 1sec

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT)





    }
}