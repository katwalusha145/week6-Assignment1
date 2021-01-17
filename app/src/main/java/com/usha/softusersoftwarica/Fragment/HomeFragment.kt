package com.usha.softusersoftwarica.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.usha.softusersoftwarica.Adapter.StudentListAdapter
import com.usha.softusersoftwarica.Dashboard.DashboardActivity
import com.usha.softusersoftwarica.Model.Student
import com.usha.softusersoftwarica.R


class HomeFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_home, container, false)
        recyclerView =view.findViewById(R.id.recyclerView)

        Student("usha katwal","20","ktm","Female")
        val adapter = StudentListAdapter(this.context!!, DashboardActivity.lisfOfStudent)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this.context)

        return view;
    }



}