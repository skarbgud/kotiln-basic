fun main() {

    var a = 0

    while (a < 5) {
        println("a= "+a++)
    }

    for (i in 0..9 step  3) {
        println("i=$i")
    }

    for (j in 9 downTo 0) {
        println("j=$j")
    }

    for (i in 'a'..'e') {
        println(i)
    }
}