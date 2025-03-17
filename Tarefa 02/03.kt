//autor: Pedro Nicolas Costa
//quiz 2.03
fun ai(a: Int, b: Int) = a+b
fun mi(a: Int, b: Int) = a*b

fun main(){
    val numeros = intArrayOf(2, 3, 4)
    var res = 0
    for(x in numeros)
        res += (ai(x,1) + mi(x,1))
    println(res) //21
}