package com.example.modernheritageapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.modernheritageapp.R
import com.example.modernheritageapp.adapters.CalenderAdapter
import com.example.modernheritageapp.adapters.RescheduleAdapter
import kotlinx.android.synthetic.main.activity_reschedule.*

class RescheduleActivity : AppCompatActivity() {
    private var adapter : RescheduleAdapter ?= null
    private var calAdapter : CalenderAdapter ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reschedule)
        clicks()
        setAdapter()
        setCalAdapter()
    }

    private fun setCalAdapter() {
        calAdapter = CalenderAdapter(this)
        recycleCalender.adapter = calAdapter
    }

    private fun setAdapter() {
        adapter = RescheduleAdapter(this)
        recycleReschedule.adapter = adapter
    }

    private fun clicks() {
        backArrow.setOnClickListener {
            onBackPressed()
        }
    }
}