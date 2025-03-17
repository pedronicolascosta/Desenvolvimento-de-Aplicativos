//autor: Pedro Nicolas Costa
//quiz 2.10
fun q(vararg nums: Int): List<Int>{
    var r = mutableListOf<Int>();
    for (num in nums){
        r.add(num * num)
    }
    return r
}

fun main(){
    var quadrados = q(2,3)
    println("Quadrados: $quadrados")
    quadrados = q(2, 3, 4, 5)
    println("Quadrados: $quadrados")
}

//resposta:
//Quadrados: [4, 9]
//Quadrados: [4, 9, 16, 25]