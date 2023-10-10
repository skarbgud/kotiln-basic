package com.example.kotilnbasic.Main

fun main() {
    val john = Person2("John", 20)
    val john2 = Person2("John", 20)

    println(john)
    println(john2)
    println(john == john2)

    println(john.hobby)
    john.some()
    println(john.hobby)
}

data class Person2(
    val name: String,
    var age: Int,
) {
    var hobby = "축구"
        private set
        get() = "취미 : $field"

    init {
        println("init")
    }

    fun some() {
        hobby = "농구"
    }
}