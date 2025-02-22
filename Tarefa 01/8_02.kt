//autor: Pedro Nicolas Costa
//tarefa 8_2
fun main(){
    val notas = DoubleArray(10)
    var media = 0.0
    var cont = 0

    println("Entre com as notas de 10 alunos: ")

    for(i in 0 until 10){
        print("Digite a nota do ${i+1}º aluno... ")
        notas[i] = readLine()?.toDoubleOrNull() ?: 0.0
    }

    media = (notas.sum()/10)

    for(nota in notas){
        if(nota > media){
            cont++
        }
    }

    println("A média de notas dos alunos é $media")
    println("A quantidade de alunos acima da média é $cont")
}
