//autor: Pedro Nicolas Costa
//tarefa 7_5
fun main(){
    var N = 0
    var i = 0

    print("Entre com um valor numérico inteiro... ")
    N = readLine()?.toIntOrNull() ?: 0

    if(N <= 0 || N<10) {
        println("Valor Inválido.")
    }
    else{
        for(i in 1..N){
            println("$i. USCS")
        }
    }
}