fun main() {

    var price = 4000

    var a = Book("코틀린알아보기", 10000).apply {
        name = "[초특가]" + name
        discount()
    }

    a.run {
        println("상품명: ${name}, 가격: ${price}원")
    } // run 함수가 run이 속해있는 main 함수의 price 변수를 우선시하고 있어서 4000원이 출력됨

    a.let {
        println("상품명: ${it.name}, 가격: ${it.price}원")
    }
}

class Book(var name: String, var price: Int) {
    fun discount() {
        price -= 2000
    }
}