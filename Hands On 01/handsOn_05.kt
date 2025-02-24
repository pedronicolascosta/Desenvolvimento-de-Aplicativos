//autor: Pedro Nicolas Costa
//hands On 05

import java.lang.Integer.parseInt
import java.lang.Long.parseLong
import java.lang.Float.parseFloat
import java.lang.Double.parseDouble

fun main(){

    val a: Int = parseInt("8")
    val b: Int = parseInt("5")
    val c: Int = a + b
    val d: Long = parseLong(c.toString()) + parseLong("5")

    val e: Float = parseFloat("1.5")
    val f: Double = parseDouble(e.toString()) * 0.5 + d

    val g = parseInt( (f/2).toInt().toString())
    val r = (d / c) + (d / b) - (g % a)

    println(r) //3
}