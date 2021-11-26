package com.supermario.databinding02

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.supermario.databinding02.databinding.StudentLayoutBinding

class MyAdapter2(var students: List<Student>) : RecyclerView.Adapter<MyAdapter2.StudentVH>() {

    class StudentVH(var studentLayoutBinding: StudentLayoutBinding): RecyclerView.ViewHolder(studentLayoutBinding.root){
        //var nameTv = view.findViewById<TextView>(R.id.nameTv)
        //var ageTv = view.findViewById<TextView>(R.id.ageTv)
        public fun bind(student: Student){
            studentLayoutBinding.student
            studentLayoutBinding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentVH {
        //var view = LayoutInflater.from(parent.context).inflate(R.layout.student_layout, parent,false)
        var studentLayoutBinding = DataBindingUtil.inflate<StudentLayoutBinding>(LayoutInflater.from(parent.context), R.layout.student_layout, parent, false)
        return StudentVH(studentLayoutBinding)
    }

    override fun onBindViewHolder(holder: StudentVH, position: Int) {
        //holder.nameTv.text = students[position].name.toString()
        //holder.ageTv.text = students[position].age.toString()
        holder.studentLayoutBinding.student = students[position]
        holder.studentLayoutBinding.executePendingBindings()
    }

    override fun getItemCount(): Int {
        return students.size
    }

    companion object{
        @JvmStatic
        @BindingAdapter("android:src")
        public fun setImage(im:ImageView, url:String){
            Log.d("ttt",url)
            Glide.with(im.context).load(url).into(im)
        }
    }
}