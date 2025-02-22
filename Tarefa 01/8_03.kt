//autor: Pedro Nicolas Costa
//tarefa 8_3
fun main(){
    var Q = IntArray(10)
    var maior = 0
    var i = 0

    for(i in 0..9){
        print("Digite o ${i+1}º valor... ")
        Q[i] = readLine()?.toIntOrNull()?: 0
        if(Q[i]<0){
            print("Valor Inválido. Insira apenas números positivos.")
            return
        }
    }

    maior = Q.max()
    println("O maior número deste array é $maior.")

    for(numero in Q){
        if(numero == maior){
            println("Este número é o ${i+1}º número do array.")
            println("Este número está localizado na posição $i do array.")
        }
        i++
    }
}