package com.example.kotilnbasic.Main

fun main() {
    val items = listOf(1, 2, 3, 4, 5)

    items.forEach { item ->
        println(item)
    }

    // for (int i = 0; i < items.length; i++)
    for (i in 0..(items.size - 1)) {
        print(items[i])
    }
}