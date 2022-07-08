package com.example.modernheritageapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.modernheritageapp.R
import com.example.modernheritageapp.adapters.CommisionAdapter
import kotlinx.android.synthetic.main.activity_commision.*

class CommisionActivity : AppCompatActivity() {
    private var adapter : CommisionAdapter ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_commision)

        clicks()
        setAdapter()
    }

    private fun setAdapter() {
        adapter = CommisionAdapter(this)
        recycleCommision.adapter = adapter
    }

    private fun clicks() {
        backArrow.setOnClickListener {
            onBackPressed()
        }
    }
}