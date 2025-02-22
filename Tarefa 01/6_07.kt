//autor: Pedro Nicolas Costa
//tarefa 6_7
fun main() {

    var numeros = arrayOf(0, 0)

    for(i in 0..1){
        print("Digite o ${i+1}º número... ")
        numeros[i] = readLine()?.toIntOrNull() ?: 0
    }

    if(numeros[0] === numeros[1]){
        println("Os números inseridos são IGUAIS")
    }
    else{
        numeros.sort()
        println("Os números inseridos são DIFERENTES, e o maior é ${numeros[1]}")
    }
}