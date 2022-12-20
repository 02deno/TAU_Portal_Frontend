package com.example.myapplication

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class AnnListViewHolder (annView : View): RecyclerView.ViewHolder(annView){

    fun bindItems(annModel : AnnModel) {
        val message = itemView.findViewById(R.id.message) as TextView
        message.text = annModel.message

    }
}