//autor: Pedro Nicolas Costa
//tarefa 6_8
fun main() {
    var idade = 0

    print("Insira a sua idade... ")
    idade = readLine()?.toIntOrNull() ?: 0

    if(idade >= 18 && idade <= 67){
        println("Você está AUTORIZADO a doar sangue.")
    }
    else{
        println("Você NÃO ESTÁ AUTORIZADO a doar sangue.")
    }
}