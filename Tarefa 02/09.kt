//autor: Pedro Nicolas Costa
//quiz 2.09
fun q(x: Int) = x * x
fun ehP(x: Int) = if(x%2 == 0) "a" else "b"
fun f(n: Int): Int = if(n<=1) n else f(n-1)+f(n-2)

fun main(){
    val n = 8
    println("${q(n)} ${ehP(n)} ${f(n)}") //64 a 21
}