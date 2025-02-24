//autor: Pedro Nicolas Costa
//hands On 02

fun main(){
    val w = 7.0
    val isExpress = true
    println(calc(w, isExpress)) //100.0
}

fun calc(w: Double, isExpress: Boolean): Double{
    val cost = if(isExpress){
        if (w<= 5){
            50.0
        }
        else{
            100.0
        }
    }
    else{
        if(w<= 5){
            20.00
        }
        else{
            40.0
        }
    }
    return cost
}