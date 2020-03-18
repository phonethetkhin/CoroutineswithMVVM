package com.example.coroutineswithmvvm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter(val postmodellist:List<PostModel>) : RecyclerView.Adapter<PostAdapter.ViewHolder>(){
    inner class ViewHolder(v: View) : RecyclerView.ViewHolder(v)
    {
        val tvuserId=v.findViewById<TextView>(R.id.tvUserID)
        val tvid=v.findViewById<TextView>(R.id.tvID)
        val tvtitle=v.findViewById<TextView>(R.id.tvTitle)
        val tvbody=v.findViewById<TextView>(R.id.tvBody)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v=LayoutInflater.from(parent.context).inflate(R.layout.postlistitem,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
return postmodellist.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
holder.tvuserId.text=postmodellist[position].userId.toString()
holder.tvid.text=postmodellist[position].id.toString()
holder.tvtitle.text=postmodellist[position].title
holder.tvbody.text=postmodellist[position].body
    }
}