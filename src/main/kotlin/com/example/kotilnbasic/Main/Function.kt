package com.example.kotilnbasic.Main

fun main() {
    print(sum(b = 10, a = 20))
}


fun sum(a: Int, b:Int, c: Int = 0) : Int = a + b + c