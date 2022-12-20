package com.example.myapplication

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ItemListViewHolder (lessonView : View): RecyclerView.ViewHolder(lessonView){

    fun bindItems(lessonModel : LessonModel) {
        val lessonName = itemView.findViewById(R.id.lessonName) as TextView
        val time = itemView.findViewById(R.id.time) as TextView
        val location = itemView.findViewById(R.id.location) as TextView
        val teacher = itemView.findViewById(R.id.teacher) as TextView

        lessonName.text = lessonModel.lessonName
        time.text = lessonModel.time
        location.text = lessonModel.location
        teacher.text = lessonModel.teacher

    }
}