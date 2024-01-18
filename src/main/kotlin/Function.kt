fun main(){
    println( "perform addition")

    println(sum (10,20 ))
    println(sum(2.2, 3.2))
    println(evenOrOdd(100))
    println(evenOrOdd(17))
}

fun sum (var1: Int, var2:Int): Int{
    return var1 * var2
}

fun sum ( var1: Double, var2: Double): Double{
    return var1-var2
}

fun evenOrOdd( var1 :Int) {
    val result = if(var1 %2 ==0) "even" else "odd"
    println(result)

}





