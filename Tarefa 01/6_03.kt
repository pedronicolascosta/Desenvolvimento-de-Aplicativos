//autor: Pedro Nicolas Costa
//tarefa 6_3
fun main() {
    var notas = arrayOf(0.0, 0.0, 0.0)
    var soma = 0.0
    var media = 0.0

    for(i in 0..2){
        print("Digite a ${i+1}º nota para o aluno... ")
        notas[i] = readLine()?.toDoubleOrNull() ?: 0.0

        soma += notas[i]
    }

    media = soma/3.0

    for(i in 0..2){
        println("A ${i+1}º nota informada foi ${notas[i]} ")
    }

    println("A média do aluno é $media")

    if(media >= 6.0){
        println("Aluno APROVADO.")
    }
    else{
        println("Aluno REPROVADO.")
    }
}