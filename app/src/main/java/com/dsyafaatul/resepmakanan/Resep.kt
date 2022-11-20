package com.dsyafaatul.resepmakanan

data class Resep(
    val title: String = "",
    val thumb: Int = 0,
    val key: String = "",
    val times: String = "",
    val serving: String = "",
    val difficulty: String = "",
    val ingredient: ArrayList<String> = arrayListOf<String>(),
    val step: ArrayList<String> = arrayListOf<String>(),
)