//autor: Pedro Nicolas Costa
//hands On 03

fun main(){

    val a: String = "Kotlin"
    val b: String = a
    val c: String = "Kotlin"
    val d: String = "Kot" + "lin"
    val e: String = "a"

    val x: Int = 10
    val y: Int = 10
    val z: Int = x

    val a1 = if (a.equals(c)) 1 else 0
    val a2 = if (a == c) 1 else 0
    val a3 = if (x == y) 1 else 0
    val a4 = if (x == z) 1 else 0
    val a5 = if (b != d) 1 else 0
    val a6 = if (a === e && y == z) 1 else 0
    val a7 = if (d.equals(b)) 1 else 0
    val a8 = if (a !== e || y != z) 1 else 0

    var r = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8

    println(r) //6
}