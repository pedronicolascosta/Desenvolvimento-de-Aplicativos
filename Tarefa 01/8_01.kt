//autor: Pedro Nicolas Costa
//tarefa 8_1
fun main(){
    val array = IntArray(10)
    println("Entre com 10 valores numéricos inteiros: ")

    for(i in 0 until 10){
        print("Digite um valor para o ${i+1}º número... ")
        array[i] = readLine()?.toIntOrNull() ?: 0
    }

    println(" --- Elementos Armazenados no Array --- ")
    for(i in 0 until 10){
        println("${array[i]}")
    }

    print("Entre com o valor a ser consultado no array: ")
    val valor = readLine()?.toIntOrNull() ?: return

    for(i in 0 until 10){
        if(array[i] == valor){
            println("O valor $valor existe no array!")
            return
        }
    }
    println("O valor $valor NÃO EXISTE no array!")
}
