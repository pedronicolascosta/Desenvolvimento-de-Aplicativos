//autor: Pedro Nicolas Costa
//quiz 2.08
fun eMsg(m: String, c: Int): Unit{
    var i = 1
    while(i<=c){
        print("$m$i ")
        i++
    }
}

fun main(){
    var a = 5
    eMsg(m = "CC", a) //CC1 CC2 CC3 CC4 CC5
}