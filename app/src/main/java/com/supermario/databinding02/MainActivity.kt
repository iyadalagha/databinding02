package com.supermario.databinding02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var students = arrayListOf<Student>().apply {
            add(Student().apply {
                name.set("Ahmed")
                age.set(33)
                imageUrl.set("https://st.depositphotos.com/1269204/1219/i/600/depositphotos_12196477-stock-photo-smiling-men-isolated-on-the.jpg")
            })
            add(Student().apply {
//                name.set("Amal")
                age.set(55)
                imageUrl.set("https://image.freepik.com/free-photo/pleased-handsome-businessman-pointing-person-making-good-point-nice-job-praising-employee-saying-well-done_176420-21751.jpg")
            })
            add(Student().apply {
                name.set("Rami")
                age.set(44)
                imageUrl.set("https://st.depositphotos.com/1269204/1219/i/600/depositphotos_12196477-stock-photo-smiling-men-isolated-on-the.jpg")
            })
            add(Student().apply {
                name.set("Omar")
                age.set(55)
                imageUrl.set("https://st.depositphotos.com/1269204/1219/i/600/depositphotos_12196477-stock-photo-smiling-men-isolated-on-the.jpg")
            })
        }
        var rv = findViewById<RecyclerView>(R.id.recyclerView)
        rv.adapter = MyAdapter2(students)
        rv.layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)

    }
}