fun main() {

    var a = Animal("사자", 21)
    var b = Animal("하마", 34)
    var c = Animal("코끼리", 46)

    var d = Animal("강아지")
    var e = Animal("고양이")
}

class Animal(var name:String, val age:Int) {
    init {
        println("나이가 ${this.age}인 ${this.name}가 생성되었습니다.")
    }

    constructor(name: String): this(name, 12) {
        println("보조생성자가 사용되었습니다.")
    }
}