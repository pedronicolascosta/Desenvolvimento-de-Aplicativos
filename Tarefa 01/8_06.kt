//autor: Pedro Nicolas Costa
//tarefa 8_5
fun main(){
    var numeros = IntArray(10)

    for(i in 0..9){
        print("Digite o valor ${i+1}/10 do Array... ")
        numeros[i] = readLine()?.toIntOrNull()?: 0
    }

   for(i in 9 downTo 0){
       println("${numeros[i]}")
   }
}