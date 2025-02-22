//autor: Pedro Nicolas Costa
//tarefa 8_5
fun main(){
    var A = IntArray(10)
    var X = 0
    var M = IntArray(10)

    for(i in 0..9){
        print("Digite o valor ${i+1}/10 do Array... ")
        A[i] = readLine()?.toIntOrNull()?: 0
    }

    print("Digite o valor do multiplicador... ")
    X = readLine()?.toIntOrNull()?: 0
    if(X == 0){
        print("Valor Inválido. Digite um número diferente de 0.")
        return
    }

    println("--- Números do Array Multiplicados ---")
    for(i in 0..9){
        M[i] = A[i]*X
        println("${M[i]}")
    }
}