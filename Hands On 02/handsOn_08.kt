//autor: Pedro Nicolas Costa
//hands On 08

fun main(){

    var x = 0
    var y = 5

    while (x < 5){
        y += x
        x++
    }

    do{
        y -= 1;
    }while(y>10)

    val r: Int = x + y
    println("$r") //15
}