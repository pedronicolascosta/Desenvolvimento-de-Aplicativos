//autor: Pedro Nicolas Costa
//tarefa 8_4
fun main(){
    var Q = IntArray(10)
    var menor = 0
    var i = 0

    for(i in 0..9){
        print("Digite o ${i+1}º valor... ")
        Q[i] = readLine()?.toIntOrNull()?: 0
        if(Q[i]<0){
            print("Valor Inválido. Insira apenas números positivos.")
            return
        }
    }

    menor = Q.min()
    println("O menor número deste array é $menor.")

    for(numero in Q){
        if(numero == menor){
            println("Este número é o ${i+1}º número do array.")
            println("Este número está localizado na posição $i do array.")
        }
        i++
    }
}