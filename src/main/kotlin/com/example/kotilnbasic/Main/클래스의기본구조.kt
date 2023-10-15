fun main() {

    var a = Person("철수", 1990)
    var b = Person("영희", 1997)
    var c = Person("민수", 2004)

    a.introduce()
    b.introduce()
    c.introduce()
}

class Person (var name:String, val birthYear:Int) {
    fun introduce() {
        println("안녕하세요, ${birthYear}년생 ${name}입니다.")
    }
}