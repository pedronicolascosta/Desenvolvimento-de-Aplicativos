//autor: Pedro Nicolas Costa
//hands On 04

fun mResp(w: Int){
    return when (w){
        1 -> print("SCS ")
        2 -> print("SBC ")
        3 -> print("SA ")
        else -> print("E ")
    }
}

fun main(){
    val list = arrayOf(1, 2, 3, 4)
    var i = 0

    while(i<list.size){
        if(i % 2 == 0){
            val opt = list[i]
            mResp(opt)
        }
        i++
    } //SCS SA
}