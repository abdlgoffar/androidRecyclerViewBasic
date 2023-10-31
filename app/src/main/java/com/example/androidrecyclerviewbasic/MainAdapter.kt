package com.example.androidrecyclerviewbasic

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//contoh recycler view atau adapter class callback
class MainAdapter(private val data: List<String>): RecyclerView.Adapter<MainAdapter.ViewHolderMainAdapter>() {


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
     * component xml adapter yang sudah di setting dengan nested class yang extends ke RecyclerView.ViewHolder seperti contoh dibawah.
     * selain itu method ini juga bisa digunakan untuk menambahkan event-event listener
     */
    override fun onBindViewHolder(holder: ViewHolderMainAdapter, position: Int) {
        holder.adapterMainTextView.text =  data[position]
    }

    /**
     * nested class ini biasa digunakan untuk mengambil component-component yang tersedia di dalam adapter file xml yang sudah di configurasi di atas dengan method onCreateViewHolder()
     */
    class ViewHolderMainAdapter(view: View): RecyclerView.ViewHolder(view) {
        val adapterMainTextView = view.findViewById<TextView>(R.id.adapterMainTextView)
    }
}
