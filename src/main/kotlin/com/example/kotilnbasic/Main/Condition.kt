package com.example.kotilnbasic.Main


fun main() {
    var i = 5

    var result = when {
        i > 10 -> {
            "10 보다 크다"
        }
        i > 5 -> {
            "5 보다 크다"
        }
        else -> {
            "!!"
        }
    }

    println(result)

    // boolean result = 1 > 10 ? true : false;
    var con = if (i > 10) true else false
    println(con)
}