package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<Model>()
        list.add(Model(R.drawable.layout1,"Ice Cream Sundae","145, Mall of India", 5,"520 reviews", "03 Mar 2021 02:00 AM", "Rs. 180"))
        list.add(Model(R.drawable.layout1,"Ice Cream Sundae","145, Mall of India", 5,"520 reviews", "03 Mar 2021 02:00 AM", "Rs. 180"))
        list.add(Model(R.drawable.layout1,"Ice Cream Sundae","145, Mall of India", 5,"520 reviews", "03 Mar 2021 02:00 AM", "Rs. 180"))
        list.add(Model(R.drawable.layout1,"Ice Cream Sundae","145, Mall of India", 5,"520 reviews", "03 Mar 2021 02:00 AM", "Rs. 180"))
        list.add(Model(R.drawable.layout1,"Ice Cream Sundae","145, Mall of India", 5,"520 reviews", "03 Mar 2021 02:00 AM", "Rs. 180"))
        list.add(Model(R.drawable.layout1,"Ice Cream Sundae","145, Mall of India", 5,"520 reviews", "03 Mar 2021 02:00 AM", "Rs. 180"))
        list.add(Model(R.drawable.layout1,"Ice Cream Sundae","145, Mall of India", 5,"520 reviews", "03 Mar 2021 02:00 AM", "Rs. 180"))
        list.add(Model(R.drawable.layout1,"Ice Cream Sundae","145, Mall of India", 5,"520 reviews", "03 Mar 2021 02:00 AM", "Rs. 180"))
        list.add(Model(R.drawable.layout1,"Ice Cream Sundae","145, Mall of India", 5,"520 reviews", "03 Mar 2021 02:00 AM", "Rs. 180"))
        list.add(Model(R.drawable.layout1,"Ice Cream Sundae","145, Mall of India", 5,"520 reviews", "03 Mar 2021 02:00 AM", "Rs. 180"))
        list.add(Model(R.drawable.layout1,"Ice Cream Sundae","145, Mall of India", 5,"520 reviews", "03 Mar 2021 02:00 AM", "Rs. 180"))


        val recyclerView = findViewById<RecyclerView>(R.id.rv_order)
        recyclerView.adapter = MyCustomAdapter(list)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL,false)
    }
}