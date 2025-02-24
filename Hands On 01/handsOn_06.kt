//autor: Pedro Nicolas Costa
//hands On 06

fun main(){

    val a: Int = "8".toInt()
    val b: Int = "5".toInt()
    val c: Int = a + b
    val d: Long = c.toLong() + 5L

    val e: Float = "1.5".toFloat()
    val f: Double = e.toDouble() * 0.5 + d

    val g = (f / 2).toInt()
    val r = (d / c) + (d / b) - (g % a)

    println(r) //3
}