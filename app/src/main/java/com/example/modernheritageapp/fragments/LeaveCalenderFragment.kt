package com.example.modernheritageapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.modernheritageapp.R
import com.example.modernheritageapp.adapters.LeaveCalenderAdapter
import kotlinx.android.synthetic.main.fragment_leave_calender.*


class LeaveCalenderFragment : Fragment() {
    private var adapter : LeaveCalenderAdapter ?= null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_leave_calender, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setAdapter()
    }

    private fun setAdapter() {
        adapter = LeaveCalenderAdapter(requireContext())
        recycleLeaveCalender.adapter = adapter

    }

}