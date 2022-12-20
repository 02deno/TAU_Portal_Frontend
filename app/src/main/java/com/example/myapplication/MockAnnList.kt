package com.example.myapplication

object MockAnnList {

    fun getMockedItemList(): List<AnnModel> {
        val annModel1 = AnnModel("Yarın yılbaşı tatilinden dolayı yemekhane yemek verilmeyecektir.")

        val annModel2 = AnnModel("Bilgisayar Mühendisliği final sınav takvimi açıklanmıştır.")

        val annModel3 = AnnModel("Final sınavlarına 1 hafta kalmıştır.")

        val annList: ArrayList<AnnModel> = ArrayList()
        annList.add(annModel1)
        annList.add(annModel2)
        annList.add(annModel3)
        return annList

    }
}