package com.supermario.databinding02

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.supermario.databinding02.databinding.StudentLayoutBinding

class MyAdapter(var students: List<Student>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(var studentLayoutBinding: StudentLayoutBinding): RecyclerView.ViewHolder(studentLayoutBinding.root){
        //var nameTv = view.findViewById<TextView>(R.id.nameTv)
        //var ageTv = view.findViewById<TextView>(R.id.ageTv)
        fun bind(s: Student){
            studentLayoutBinding.apply {
                student =s
                executePendingBindings()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        //var view =LayoutInflater.from(parent.context).inflate(R.layout.student_layout,parent,false)
        var studentLayoutBinding = DataBindingUtil.inflate<StudentLayoutBinding>(LayoutInflater.from(parent.context), R.layout.student_layout,parent,false)
        return MyViewHolder(studentLayoutBinding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(students[position])
        //holder.nameTv.text = students[position].name.toString()
        //holder.ageTv.text = students[position].age.toString()
    }

    override fun getItemCount(): Int {
        return students.size
    }
}