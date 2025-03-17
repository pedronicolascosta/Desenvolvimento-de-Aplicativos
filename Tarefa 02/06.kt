//autor: Pedro Nicolas Costa
//quiz 2.06
fun msg(c: Char, contador: Int): Unit{
    var i = 1
    while(i<= contador){
        print(c + " ")
        i++
    }
}

fun main(){
    val lista = charArrayOf('a', 'b', 'c')
    for(i in lista.indices){
        if(i%2 == 0){
            msg(lista[i],i) //c c 
        }
    }
}