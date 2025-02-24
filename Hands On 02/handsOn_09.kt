//autor: Pedro Nicolas Costa
//hands On 09

fun main(){

    val lista = arrayOf(1, 2, 3, 4, 5)
    var r = 0;

    for (n in lista){
        if (n % 2 == 0){
            r += n
        }
    }

    for (i in 1..5 step 2){
        r *= i
    }

    println(r) //90
}