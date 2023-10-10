package com.example.kotilnbasic.Main

fun main() {
    val items = arrayOf(1, 2, 3)

    try {
        val item = items[4]
    } catch (e: Exception) {
        print(e)
    }
}