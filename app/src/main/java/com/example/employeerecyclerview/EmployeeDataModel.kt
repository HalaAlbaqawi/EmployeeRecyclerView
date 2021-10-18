package com.example.employeerecyclerview

import androidx.annotation.DrawableRes

data class EmployeeDataModel(
    val fullName: String,
    val jobTitle: String,
    @DrawableRes val img: Int
)
