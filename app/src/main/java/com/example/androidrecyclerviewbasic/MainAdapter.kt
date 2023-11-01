package com.example.androidrecyclerviewbasic

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//contoh recycler view atau adapter class callback
class MainAdapter(private val data: List<MainModel>): RecyclerView.Adapter<MainAdapter.ViewHolderMainAdapter>() {


    /**
     * method ini digunakan untuk configurasi view file xml adapter yang dimiliki oleh class callback ini.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderMainAdapter {
        return ViewHolderMainAdapter(LayoutInflater.from(parent.context).inflate(R.layout.adapter_main, parent, false))
    }

    /**
     * method ini digunakan untuk set item/data di component adapter  dan sekaligus untuk mengembalikan jumlah item/data tersebut
     */
    override fun getItemCount(): Int {
        return data.size
    }

    /**
     * method ini digunakan untuk setting/mengisi data
     * component xml adapter yang sudah di setting dengan nested class yang extends ke RecyclerView.ViewHolder seperti dibawah.
     * selain itu method ini juga bisa digunakan untuk menambahkan listener contohnya seperti event onClick dan lain-lain.
     */
    override fun onBindViewHolder(holder: ViewHolderMainAdapter, position: Int) {
        holder.adapterMainTextView.text =  data[position].name
        holder.adapterMainImageView.setImageResource(data[position].image)
    }

    /**
     * nested class ini biasa digunakan untuk mengambil component-component yang tersedia di dalam adapter file xml yang sudah di configurasi di atas dengan method onCreateViewHolder()
     */
    class ViewHolderMainAdapter(view: View): RecyclerView.ViewHolder(view) {
        val adapterMainTextView = view.findViewById<TextView>(R.id.adapterMainTextView)
        val adapterMainImageView = view.findViewById<ImageView>(R.id.adapterMainImageView)
    }

    /**
     * interface untuk contract event-event listener
     */
    interface ListenerMainAdapter {
        fun onClick(data: String)
    }
}
