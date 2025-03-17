//autor: Pedro Nicolas Costa
//quiz 2.02
fun calc(valores: IntArray, op: String = "A"): Int{
    var res = if (op == "M") 1 else 0
    for(valor in valores){
        when(op){
            "A" -> res += valor
            "S" -> res -= valor
            "M" -> res *= valor
        }
    }
    return res
}

fun main(){
    val numeros = intArrayOf(2, 3, 4)
    val a = calc(numeros, "M")
    val b = calc(numeros)
    println(a+b) //33
}