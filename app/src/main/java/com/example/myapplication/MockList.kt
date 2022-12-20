package com.example.myapplication

object MockList {
    fun getMockedItemList(): List<LessonModel> {
        val lessonModel1 = LessonModel("Yapay Zeka",
        "12.00-14.00",
        "ED-7",
        "Canan Yıldız")

        val lessonModel2 = LessonModel("Veri Analizi",
            "15.00-17.00",
            "ED-9",
            "Emre Işık")

        val lessonList: ArrayList<LessonModel> = ArrayList()
        lessonList.add(lessonModel1)
        lessonList.add(lessonModel2)
        return lessonList

    }





}