package com.example.myshoppinglistapp.ui.theme

import androidx.compose.ui.text.toUpperCase

fun main() {

//   fun val numbers = listOf(1,2,3)
//    val doubled = numbers.map { it * 2 } // Result [2,4,6]
//    println(doubled)

//    val blueRoseVase = Vase("Blue", "Rose")
//    val redRoseVase = blueRoseVase.copy("Red")
//    println(blueRoseVase)
//    println(redRoseVase)

    // nullable string
    val name:String? = "Ella"
    name?.let {
        println(it.toUpperCase())
    }
}

data class Vase(val color: String, val design: String)