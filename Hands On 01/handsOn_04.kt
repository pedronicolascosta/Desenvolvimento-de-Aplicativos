//autor: Pedro Nicolas Costa
//hands On 04

fun main(){

    val a: Int = 8
    val b: Int = 5
    val c: Int = a + b
    val d: Long = c.toLong() + 5L

    val e: Float = 1.5F
    val f: Double = e * 0.5 + d

    val g = (f / 2).toInt()
    val r = (d / c) + (d / b) - (g % a)

    println(r) //3
}