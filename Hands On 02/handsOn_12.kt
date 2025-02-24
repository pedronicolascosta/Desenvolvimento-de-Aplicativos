//autor: Pedro Nicolas Costa
//hands On 12

fun main(){

    var r = 0
    val a = readLine()?.toIntOrNull() // 4
    val b = readLine()?.toIntOrNull() // 7

    if (a != null && b != null && a<b){
        for(i in a..b){
           if(i % 2 == 0){
               r += (i*2 + a/(i+1) + b/(i+2))
           }
            else{
                r += (i+a % (i+1) + b%(i+2))
           }
        }
    }
    println(r) // 48
}