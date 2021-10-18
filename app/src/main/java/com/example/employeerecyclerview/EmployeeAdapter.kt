package com.example.employeerecyclerview

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmployeeAdapter (val employees: List<EmployeeDataModel>) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        /// to bring the item layout here and connect it with the Adapter

        val item_layout_view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout,parent,false)

        Log.d("EmployeeAdapter", "onCreateViewHolder() Called")
        return ViewHolder(item_layout_view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
/// this fun to save the data

        Log.d("EmployeeAdapter", "onCreateViewHolder() Called Position: $position")
        holder.fullName.text = employees[position].fullName
        holder.job.text = employees[position].jobTitle
        holder.img.setImageResource(employees[position].img)
    }

    override fun getItemCount(): Int {
      return employees.size
    }


}
class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
    val fullName : TextView = view.findViewById(R.id.fullname)
    val job: TextView = view.findViewById(R.id.job_title)
    val img: ImageView = view.findViewById(R.id.emp_image)

}