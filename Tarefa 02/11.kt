//autor: Pedro Nicolas Costa
//quiz 2.11
fun main(){
    val list1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val list2 = list1.toMutableList()
    val r = mutableListOf<Int>()

    for(k in list2.indices){
        if(list2.get(k) % 2 == 0){
            r.add(list2.get(k))
        }
    }

    println(r) //[2, 4, 6, 8]
}