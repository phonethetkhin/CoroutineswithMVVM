package com.example.coroutineswithmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcvMain.layoutManager=LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        rcvMain.setHasFixedSize(true)

        val viewmodel =ViewModelProviders.of(this).get(PostViewModel::class.java)
        viewmodel.postlivedata.observe(this, Observer {it?.let {
            rcvMain.adapter=PostAdapter(it)

        }


        })
        viewmodel.getPostLiveDataViewModel()


    }

}
