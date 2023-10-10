package com.example.kotilnbasic.Main

fun main() {
    val dog: Animal = Dog()
    val cat = Cat()

    if (dog is Dog) {
        dog.draw()
        println("멍멍이")
    }
}

interface Drawable {
    fun draw()
}

// open을 넣어줘야 상속이 가능
open class Man
class SuperMan : Man()

abstract class Animal {
    open fun move() {
        println("이동")
    }
}

class Dog : Animal(), Drawable {
    override fun move() {
        println("껑충")
    }

    override fun draw() {
        TODO("Not yet implemented")
    }
}

class Cat : Animal() {
    override fun move() {
        println("살총")
    }
}