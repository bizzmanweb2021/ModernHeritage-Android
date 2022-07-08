package com.example.modernheritageapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.modernheritageapp.R
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        clicks()
    }

    private fun clicks() {
        butGetStart.setOnClickListener {
            startActivity(Intent(this,SignUpActivity::class.java))
        }
    }
}