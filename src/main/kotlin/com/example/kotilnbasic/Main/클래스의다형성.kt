fun main() {
    var a = Drink()
    a.drink()

    var b:Drink = Cola()
    b.drink()

    if (b is Cola) { //is 안에서는 다운캐스팅이됨
        b.washDishes()
    }

    var c = b as Cola
    c.washDishes()
    b.washDishes() // as를 사용하면 반환값 뿐만 아니라 변수자체가 다운캐스팅된다.
}

open class Drink {
    val name = "음료"

    open fun drink() {
        println("${name}를 마십니다")
    }
}

class Cola: Drink() {
    var type = "콜라"

    override fun drink() {
        println("${name}중에 ${type}를 마십니다.")
    }

    fun washDishes() {
        println("${type}로 설거지를 합니다.")
    }
}