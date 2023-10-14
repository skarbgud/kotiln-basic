fun main() {

    var a:Int = 54321
    var b:Long = a.toLong()

    var intArr = arrayOf(1, 2, 3, 4, 5)

    var nullArr = arrayOfNulls<Int>( 5) //특정한 크기의 공간을 가지는 배열 생성

    intArr[2] = 8

    print(intArr[2])
}