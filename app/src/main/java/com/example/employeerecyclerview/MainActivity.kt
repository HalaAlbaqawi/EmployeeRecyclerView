package com.example.employeerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val emloyees = mutableListOf (EmployeeDataModel
        ("hala", "developer",R.drawable.hhhhh),
        EmployeeDataModel ("hind", "developer",R.drawable.th),
        EmployeeDataModel ("hoda", "developer",R.drawable.llll))



    private lateinit var empRecyclerView: RecyclerView
    private lateinit var empAdapter: EmployeeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

empRecyclerView = findViewById(R.id.emp_recyclerview)
        empAdapter = EmployeeAdapter(emloyees)
        empRecyclerView.adapter = empAdapter
    }
}