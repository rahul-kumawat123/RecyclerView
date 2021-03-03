package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyCustomAdapter(val list: ArrayList<Model>): RecyclerView.Adapter<MyCustomAdapter.MyCustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyCustomViewHolder {
        return MyCustomViewHolder((LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)))
    }

    override fun getItemCount(): Int {
     return list.size
    }

    override fun onBindViewHolder(holder: MyCustomViewHolder, position: Int) {
        holder.imageView.setImageResource(list[position].imageResource)
        holder.textView1.text = list[position].textName1
        holder.textView2.text = list[position].textName2
        holder.ratingBar.numStars=list[position].ratingBar
        holder.textView3.text = list[position].textName3
        holder.textView4.text = list[position].textName4
        holder.textView5.text = list[position].textName5
    }

    class MyCustomViewHolder(item_view: View): RecyclerView.ViewHolder(item_view){
        val imageView = item_view.findViewById<ImageView>(R.id.imageView2)
        val textView1 = item_view.findViewById<TextView>(R.id.textView1)
        val textView2 = item_view.findViewById<TextView>(R.id.textView2)
        val ratingBar = item_view.findViewById<RatingBar>(R.id.ratingBar)
        val textView3 = item_view.findViewById<TextView>(R.id.textView3)
        val textView4 = item_view.findViewById<TextView>(R.id.textView4)
        val textView5 = item_view.findViewById<TextView>(R.id.textView5)
    }
}