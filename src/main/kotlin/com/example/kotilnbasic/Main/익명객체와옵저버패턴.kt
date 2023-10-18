fun main() {
    EventPrinter().start()
}

interface EventListener {
    fun onEvent(count: Int)
}

class Counter2(var listener: EventListener) {
    fun count() {
        for (i in 1..100) {
            if (i % 5 == 0) listener.onEvent(i)
        }
    }
}

//class EventPrinter: EventListener {
//    override fun onEvent(count: Int) {
//        print("${count}-")
//    }
//
//    fun start() {
//        val counter = Counter2(this)
//        counter.count()
//    }
//}

class EventPrinter {
    fun start() {
        val counter = Counter2(object: EventListener{
            override fun onEvent(count: Int) {
                print("${count}-")
            }
        })
        counter.count()
    }
}