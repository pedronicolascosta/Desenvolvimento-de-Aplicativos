//autor: Pedro Nicolas Costa
//tarefa 7_1
fun main(){
    print("Entre com um valor numérico inteiro... ")
    val N = readLine()?.toIntOrNull()

    if(N == null){
        println("Por favor, entre com um número inteiro válido.")
    }
    else{
        println("Valor inserido: $N")
        if(N < 10){
            println("Valor Inválido.")
        }
        else{
            for(i in 1..N){
                println("$i. USCS")
            }
        }
    }
}