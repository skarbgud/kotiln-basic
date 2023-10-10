package com.example.kotilnbasic.Main

fun main() {
    var name: String? = null
    name = "규형"

    name = null

    var name2: String = ""

    name?.let {
        name2 = name
    }

    // 타입이 다르기때문에 null 체크 필요
    if (name != null) {
        name2 = name
    }
}