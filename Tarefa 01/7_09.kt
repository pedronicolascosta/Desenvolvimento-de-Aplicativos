//autor: Pedro Nicolas Costa
//tarefa 7_9
fun main(){
    var numeros = arrayOf(0,0,0,0,0,0,0,0,0,0)
    var soma = 0

    for(i in 0..9){
        print("Insira o ${i+1}º número inteiro... ")
        numeros[i] = readLine()?.toIntOrNull()?: 0
    }

    soma = numeros.sum()

    println("A soma dos valores inseridos é igual a ${soma}")
}