//autor: Pedro Nicolas Costa
//hands On 07

fun main(){

    val numbers1 = arrayOf(1, 2, 3, 4, 5)
    val numbers2 = arrayOf(10, 20, 30, 40, 50, 60, 70)

    var r = 0
    var i = 0

    while(i<numbers1.size && i<numbers2.size){
        if(i%2 == 0){
            r += numbers1[i] + numbers2[i]
        }
        i++
    }

    println(r) //99
}