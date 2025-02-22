//autor: Pedro Nicolas Costa
//tarefa 6_5
fun main() {
    var preco = 0.0
    var qtde = 0
    var total = 0.0
    var desconto = 0.0

    print("Insira o preço do produto a ser comprado pelo usuário... ")
    preco = readLine()?.toDoubleOrNull() ?: 0.0

    print("Insira a quantidade desse produto... ")
    qtde = readLine()?.toIntOrNull() ?: 0

    println("Preço por Unidade.... $preco")
    println("Qtde por Unidade..... $qtde")

    if(qtde >= 10){
        desconto = ((preco*qtde)/100)*10
        total = (preco*qtde)-desconto
        println("Desconto............. $desconto")
    }
    else{
        total = (preco*qtde)
    }

    println("Preço Final.......... $total")
}