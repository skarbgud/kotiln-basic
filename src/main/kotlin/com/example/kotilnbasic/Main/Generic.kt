package com.example.kotilnbasic.Main

fun main() {
    val box = Box(10)
    val box2 = Box("Adsfsdfs")

    println(box.value)
}

class Box<T>(var value: T) {

}