package com.example.kotilnbasic.Main

fun main() {
    val john = Person("John", 20)
//    println(john.name)
    println(john.age)

    john.age = 23
}

class Person(
    private val name: String,
    var age: Int,
)