package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AnnListAdapter(val annList: ArrayList<AnnModel>) :
    RecyclerView.Adapter<AnnListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnnListViewHolder {
        return AnnListViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.viewholder_announcement,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return annList.size
    }

    override fun onBindViewHolder(holder: AnnListViewHolder, position: Int) {
        holder.bindItems(annList[position])
    }
}