//autor: Pedro Nicolas Costa
//quiz 2.07
fun calcDisp(p: Double, d: Double = 10.0, ehEspecial: Boolean = false): Double {
    val ds = if(ehEspecial)
        d + 5.0
    else d
    val dp = p*(1 - ds/100)
    return when{
        dp < 0 -> 0.0
        else -> dp
    }
}

fun main(){
    println(calcDisp(ehEspecial = true, p=100.0, d=15.0))
    println(calcDisp(p = 100.00))

    val ps = listOf(100.0, 200.0, 300.0)
    for(lps in ps){
        val d = calcDisp(p = lps, ehEspecial = false)
        println("$lps, $d")
    }
}

//resultado:
//80.0
//90.0
//100.0, 90.0
//200.0, 180.0
//300.0, 270.0