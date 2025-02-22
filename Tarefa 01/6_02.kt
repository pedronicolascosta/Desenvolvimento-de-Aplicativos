//autor: Pedro Nicolas Costa
//tarefa 6_2
fun main() {
    print("Entre com um valor numérico inteiro: ")
    val valor = readLine()?.toIntOrNull()

    if (valor != null) {
        if (valor % 2 == 0) {
            println("O número $valor é PAR")
        } else {
            println("O número $valor é ÍMPAR")
        }
    }
    else {
        println("Entrada inválida. Por favor, digite um número inteiro.")
    }
}