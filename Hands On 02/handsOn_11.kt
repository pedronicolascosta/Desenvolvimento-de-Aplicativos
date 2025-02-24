//autor: Pedro Nicolas Costa
//hands On 11

fun main(){

    var r = 0
    val a = readLine()?.toIntOrNull() // 3
    val b = readLine()?.toIntOrNull() // 8

    if (a != null && b != null){
        for(i in a..b){
            r += (i + a%i + b%i)
        }
    }
    println(r) // 56
}