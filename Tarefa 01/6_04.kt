//autor: Pedro Nicolas Costa
//tarefa 6_4
fun main() {
    var notas = arrayOf(0.0, 0.0, 0.0)
    var pesoNotas = arrayOf(0.0, 0.0, 0.0)
    var pesos = arrayOf(2, 3, 4)
    var soma = 0.0
    var media = 0.0

    for(i in 0..2){
        print("Digite a ${i+1}º nota para o aluno... ")
        notas[i] = readLine()?.toDoubleOrNull() ?: 0.0

        pesoNotas[i] = notas[i]*pesos[i]
        soma += pesoNotas[i]
    }

    media = soma/pesos.sum()

    for(i in 0..2){
        println("A ${i+1}º nota informada foi ${notas[i]} ")
    }

    println("A média ponderada do aluno é $media")

    if(media >= 5.0){
        println("Aluno APROVADO.")
    }
    else{
        println("Aluno REPROVADO.")
    }
}