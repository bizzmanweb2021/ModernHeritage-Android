package com.example.modernheritageapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.modernheritageapp.R
import kotlinx.android.synthetic.main.activity_order_details_two.*

class OrderDetailsTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_details_two)

        clicks()

    }

    private fun clicks() {
        backArrow.setOnClickListener {
            onBackPressed()
        }
    }
}