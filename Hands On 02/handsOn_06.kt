//autor: Pedro Nicolas Costa
//hands On 06

fun kResp(w: Int): String{
    return when (w){
        in 1..4 -> "W"
        in 0..8 -> "R"
        else -> "U"
    }
}

fun main(){
    val list = arrayOf(1, 2, 3, 4, 5, 6, 7)
    var i = 0

    while(i<list.size){
        if(i % 2 == 1){
            val opt = list[i]
            print(kResp(opt) + " ")
        }
        i++
    } //W W R
}