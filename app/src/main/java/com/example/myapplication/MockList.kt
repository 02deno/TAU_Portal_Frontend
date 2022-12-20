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

        val lessonModel3 = LessonModel("Gömülü Sistemler",
            "17.30-19.00",
            "ED-13",
            "Faruk Bağcı")


        val lessonList: ArrayList<LessonModel> = ArrayList()
        lessonList.add(lessonModel1)
        lessonList.add(lessonModel2)
        lessonList.add(lessonModel3)
        return lessonList

    }





}