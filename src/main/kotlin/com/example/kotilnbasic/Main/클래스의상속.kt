fun main() {
    var a = Creature("코코", 5, "개")
    var b = Dog("코코", 5)

    a.introduce()
    b.introduce()

    b.bark()

    var c = Cat("루비", 1)

    c.introduce()
    c.meow()
}

//코틀린은 상속금지가 기본값
open class Creature(var name: String, var age:Int, var type:String) {
    fun introduce() {
        println("저는 ${type} ${name}이고, ${age}살 입니다.")
    }
}

class Dog(name: String, age: Int) : Creature(name, age, "개"){
    fun bark() {
        println("멍멍")
    }
}

class Cat(name: String, age: Int) : Creature(name, age, "고양이") {
    fun meow() {
        println("야옹야옹")
    }
}