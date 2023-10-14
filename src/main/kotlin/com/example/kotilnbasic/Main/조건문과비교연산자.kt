fun main() {

    var a = 11

    if (a > 10) {
        println("a는 10보다 크다")
    } else {
        println("a는 10보다 작거나 같다")
    }

    doWhen(1)
    doWhen("규형")
    doWhen(12L)
    doWhen(3.1324)
    doWhen("Kotlin")

    doWhenAssign(1)
}

fun doWhen (a:Any) {
    when(a) {
        1 -> println("정수 1입니다.")
        "규형" -> println("규형입니다.")
        is Long -> println("Long 타입입니다.")
        !is String -> println("String 타입이 아닙니다")
        else -> println("어떤 조건도 만족하지 않습니다")
    }
}

fun doWhenAssign (a:Any) {
    var result = when(a) {
        1 -> "정수 1입니다."
        "규형" -> "규형입니다."
        is Long -> "Long 타입입니다."
        !is String -> "String 타입이 아닙니다"
        else -> "어떤 조건도 만족하지 않습니다"
    }

    println(result)
}