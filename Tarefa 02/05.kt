//autor: Pedro Nicolas Costa
//quiz 2.05
fun func(n: Int): Int{
    return if(n == 0) 1 else n* func(n-1)
}
fun main(){
    val numero = 5
    println(func(3) + func(4)) //30
}