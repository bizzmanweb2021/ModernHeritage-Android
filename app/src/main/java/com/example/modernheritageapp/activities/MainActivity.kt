package com.example.modernheritageapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.modernheritageapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clicks()

    }

    private fun clicks() {
        deliverySec.setOnClickListener {
            startActivity(Intent(this,DeliveryActivity::class.java))
        }
        vehicleSec.setOnClickListener {
            startActivity(Intent(this,VehicleActivity::class.java))
        }
        profileSec.setOnClickListener {
            startActivity(Intent(this,ProfileActivity::class.java))
        }
        commisionSec.setOnClickListener {
            startActivity(Intent(this,CommisionActivity::class.java))
        }
        pickUpSec.setOnClickListener {
            startActivity(Intent(this,PickUpActivity::class.java))
        }
        deliverHistorySec.setOnClickListener {
            startActivity(Intent(this,DetailActivity::class.java))
        }
        attendanceSec.setOnClickListener {
          //  startActivity(Intent(this,OrderDetailsActivity::class.java))

              startActivity(Intent(this,LeaveActivity::class.java))
        }
    }

}