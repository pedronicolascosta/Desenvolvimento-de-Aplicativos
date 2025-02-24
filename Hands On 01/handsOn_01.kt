//autor: Pedro Nicolas Costa
//hands On 01

fun main(){

    var a = 10
    var b = 2
    var x: Int

    while (a % b != 0){
        x = a % b
        a = b
        b = x
    }

    println(b) //2
}