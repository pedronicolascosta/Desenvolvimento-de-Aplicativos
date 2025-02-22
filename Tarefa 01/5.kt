//autor: Pedro Nicolas Costa
//tarefa 1_05
fun main(){
    var x = 4
    var a = 15
    var b = 2
    var y = 8

    //Método Correto em Kotlin
    while ( a % b !=0){
        x = a % b
        y += 1
        b = y + x
        a = a - 1
    }
    println("y = $y") //23

    //Método Errado em Kotlin
    // while ( (x = a % b ) != 0 ){ //error: only expressions are allowed in this context.
    //     y += 1
    //     b = y + x
    //     a = a - 1
    // }

    // println("y = $y") 
}