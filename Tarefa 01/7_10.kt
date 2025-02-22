//autor: Pedro Nicolas Costa
//tarefa 7_10
fun main(){
    var numeros = arrayOf(0,0,0,0,0,0,0,0,0,0)
    var soma = 0

    for(i in 0..9){
        print("Insira o ${i+1}º número inteiro... ")
        numeros[i] = readLine()?.toIntOrNull()?: 0

        if(numeros[i] % 2 == 0){
            soma += numeros[i]
        }
    }

    println("A soma dos valores PARES inseridos é igual a ${soma}")
}