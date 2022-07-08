package com.example.modernheritageapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.modernheritageapp.R
import kotlinx.android.synthetic.main.activity_order_details.*

class OrderDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_details)

        clicks()

    }

    private fun clicks() {
        backArrow.setOnClickListener {
            onBackPressed()
        }
        butSubmit.setOnClickListener {
            startActivity(Intent(this,OrderDetailsTwoActivity::class.java));
        }
    }

}