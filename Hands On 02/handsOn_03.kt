//autor: Pedro Nicolas Costa
//hands On 03

fun gResp(w: Int): String{
    return when (w){
        1 -> "A"
        2 -> "B"
        3 -> "K"
        else -> "Oi"
    }
}

fun main(){
    val list = arrayOf(1, 2, 3, 4)
    var i = 0

    while(i<list.size){
        val opt = list[i]
        print(gResp(opt) + " ")
        i++
    } //A B K Oi
}