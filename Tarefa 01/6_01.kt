//autor: Pedro Nicolas Costa
//tarefa 6_1
fun main(){
    println(" ------------ Início do Programa ------------ ")
    print("Entre com um valor numérico inteiro: ")

    val valor = readLine()?.toIntOrNull()

    if(valor != null){
        println("Valor entrado: $valor")

        if(valor > 10){
            println("Valor entrado maior que 10!")
        } else{
            println("Valor entrado NÃO É maior que 10!")
        }
    } else{
        println("Entrada inválida. Por favor, digite um número inteiro.")
    }

    println(" ------------ Fim do Programa ------------ ")
    println("Pressione Enter para sair...")
    readLine()
}