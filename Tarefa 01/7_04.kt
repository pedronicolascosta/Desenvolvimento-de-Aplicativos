//autor: Pedro Nicolas Costa
//tarefa 7_4
fun main(){
    var N = 0
    var i = 0

    print("Entre com um valor numérico inteiro... ")
    N = readLine()?.toIntOrNull() ?: 0

    if(N <= 0) {
        println("Valor Inválido.")
    }
    else{
        while(i<=N){
            println("$i")
            i++
        }
    }
}