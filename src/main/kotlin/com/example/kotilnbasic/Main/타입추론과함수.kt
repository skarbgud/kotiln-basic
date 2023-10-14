fun main() {
    //변수가 선언된 할당된 값으로 자료형을 추론이 가능함
    var a = 1234 //Int
    var b = 1234L //Long

    var c = 12.45 //Double
    var d = 12.45 //Float

    var e = 0xABCD //Int
    var f = 0b01010101 //Int

    var g = true //Boolean
    var h = 'c' //Char

    println(add(5, 6, 7))
}

//fun add(a:Int, b:Int, c:Int): Int {
//    return a + b + c
//}

//단일표현식 함수
fun add(a:Int, b:Int, c:Int) = a + b +c