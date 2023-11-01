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
        val mainAdapter =  MainAdapter(listOf<String>("abdul goffar", "cristiano ronaldo", "lionel messi", "donald trump"), object: MainAdapter.ListenerMainAdapter {
            override fun onClick(data: String) {
                Log.d("MainActivity", data)
            }

        })
        findViewById<RecyclerView>(R.id.activityMainRecyclerView).adapter = mainAdapter

    }
}