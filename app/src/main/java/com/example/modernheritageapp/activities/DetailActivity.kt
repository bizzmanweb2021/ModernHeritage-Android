package com.example.modernheritageapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.modernheritageapp.R
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        clicks()

    }

    private fun clicks() {
        tvCancel.setOnClickListener {
            onBackPressed()
        }
        backArrow.setOnClickListener {
             onBackPressed()
        }
        rescheduleSec.setOnClickListener {
            startActivity(Intent(this,RescheduleActivity::class.java))
        }
        locationSec.setOnClickListener {
           startActivity(Intent(this,LocationActivity::class.java))
        }
    }

}