fun main() {

//    for (i in 1..10) {
//        if (i == 3) break
//        println(i)
//    }

    loop@for (i in 1..10) {
        for (j in 1..10) {
            if (i == 1 && j == 2) break@loop
            println("i: $i, j: $j")
        }
    }

    /**
     * 라벨링을 통해서 break, continue문 사용할 때 어느곳으로 향할지 알 수 있다
     */
    first@for(i in 1..10) {
        println("처음")
        second@for(j in 1..10) {
            println(j)
            break@first
        }
    }
    /**
     *  결과 :
     *  처음
     *  1
     *
     *  first@ 라벨이 붙은 바깥 반복문이 멈춘다
     */

    first@for(i in 1..10) {
        println("처음")
        second@for(j in 1..10) {
            println(j)
            break@second
        }
    }
    /**
     *  결과 :
    처음
    1
    처음
    1
    처음
    1
    처음
    1
    처음
    1
    처음
    1
    처음
    1
    처음
    1
    처음
    1
    처음
    1
     *
     *  first@ 라벨이 붙은 바깥 반복문이 멈춘다
     */

    println(true && false)
    println(true || false)
    println(!true)
    println(!false)

    var a = 6
    var b = 4

    println("a > 5 && b > 5 ===> " + (a > 5 && b > 5))
}