package com.example.androidrecyclerviewbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //call adapter
        val mainAdapter =  MainAdapter(
            listOf<MainModel>(
                MainModel(1, "laptop", R.drawable.laptop),
                MainModel(2, "mouse", R.drawable.mouse),
                MainModel(3, "keyboard", R.drawable.keyboard),
                MainModel(4, "monitor", R.drawable.monitor)))

        findViewById<RecyclerView>(R.id.activityMainRecyclerView).adapter = mainAdapter

    }
}