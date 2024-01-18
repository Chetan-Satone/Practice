open class Person(name:String, cc: Int){
    init {
        println("My name is $name")
        println("My power is $cc")
    }
}

class Car(name: String, cc: Int): Person(name, cc){

    fun price(){
        println("I cost almost 300k")
    }
}
class Tyre(name:String, cc: Int):Person(name, cc){

    fun brand(){
        println("I used supercorsa tyre.")
    }
}
fun main(){
    val t1 = Car("BMW", 2000)
    t1.price()

    println()

    val t2 = Tyre("TATA", 1000)
    t2.brand()
}