package com.example.myfirstapplication

data class Dado(private var faces: Int = 6){
    fun rolar() = (1..faces).random()
}
