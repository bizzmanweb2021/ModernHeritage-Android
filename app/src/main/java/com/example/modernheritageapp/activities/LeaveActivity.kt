package com.example.modernheritageapp.activities

import android.graphics.PorterDuff
import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.modernheritageapp.R
import com.example.modernheritageapp.fragments.LeaveBalFragment
import com.example.modernheritageapp.fragments.LeaveCalenderFragment
import kotlinx.android.synthetic.main.activity_leave.*

class LeaveActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leave)

        clicks()

        supportFragmentManager.beginTransaction().replace(R.id.container,LeaveBalFragment()).commit()

    }

    private fun clicks() {

        butLeaveBal.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.container, LeaveBalFragment()).commit()

            val drawable = butLeaveBal.background as GradientDrawable
            drawable.setColorFilter(ContextCompat.getColor(this,R.color.darkBlue),PorterDuff.Mode.SRC_ATOP)

            val drawable1 = butLeaveCal.background as GradientDrawable
            drawable1.setColorFilter(ContextCompat.getColor(this,R.color.light_grey_four),PorterDuff.Mode.SRC_ATOP)

            butLeaveBal.setTextColor(ContextCompat.getColor(this,R.color.white))
            butLeaveCal.setTextColor(ContextCompat.getColor(this,R.color.darkBlue))
        }

        butLeaveCal.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.container,LeaveCalenderFragment()).commit()

            val drawable = butLeaveBal.background as GradientDrawable
            drawable.setColorFilter(ContextCompat.getColor(this,R.color.light_grey_four),PorterDuff.Mode.SRC_ATOP)

            val drawable1 = butLeaveCal.background as GradientDrawable
            drawable1.setColorFilter(ContextCompat.getColor(this,R.color.darkBlue),PorterDuff.Mode.SRC_ATOP)

            butLeaveBal.setTextColor(ContextCompat.getColor(this,R.color.darkBlue))
            butLeaveCal.setTextColor(ContextCompat.getColor(this,R.color.white))
        }

        backArrow.setOnClickListener {
            onBackPressed()
        }

    }

}