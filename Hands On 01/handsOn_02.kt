//autor: Pedro Nicolas Costa
//hands on 02

fun main(){

    val a = 14
    val b = 5
    val c = 7
    val d = 2

    val a1 = (a / b) * (c % d)
    val a2 = (a - c) / (b * d)
    val a3 = (b * d) - (b + (d % c))

    println( (a1 * a2) - a3 ) //-3
}