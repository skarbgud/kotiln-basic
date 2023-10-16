fun main() {
    var t = Tiger()
    t.eat()

    var r = Rabbit()
    r.eat()
    r.sniff()

    var w = Wolf()
    w.run()
    w.eat()
}

open class SomethingExtends {
    open fun eat() {
        println("음식을 먹습니다.")
    }
}

abstract class SomethingAbstract {
    abstract fun eat()
    fun sniff() {
        println("킁킁")
    }
}

class Tiger : SomethingExtends() {
    override fun eat() {
        println("고기를 먹습니다.")
    }
}

class Rabbit : SomethingAbstract() {
    override fun eat() {
        println("당근을 먹습니다.")
    }
}

interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println("음식을 먹습니다.")
    }
}

class Wolf : Runner, Eater {
    override fun run() {
        println("우다다다 뜁니다.")
    }

    override fun eat() {
        println("허겁지겁 먹습니다.")
    }
}