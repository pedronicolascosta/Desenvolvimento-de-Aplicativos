//autor: Pedro Nicolas Costa
//hands On 05

fun nResp(w: Int): String{
    return when (w){
        0,1 -> "A"
        4,5,6 -> "B"
        else -> "X"
    }
}

fun main(){
    val list = arrayOf(1, 2, 3, 4, 5, 6, 7)
    var i = 0

    while(i<list.size){
        if(i % 2 == 0){
            val opt = list[i]
            print(nResp(opt) + " ")
        }
        i++
    } // A X B X
}