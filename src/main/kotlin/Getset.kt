fun main(){

    val mario = Girl()
    mario.age= 14
    mario.actualAge= 18
    println("mario actual age = ${mario.actualAge}")
    println("mario pretended age = ${mario.age}")

    val dell = Girl()
    dell.age = 50
    dell.actualAge = 50
    println("dell actual age = ${dell.actualAge}")
    println("dell pretended age = ${dell.age}")

}

class Girl {
    var age:Int = 0
        set(value) {
            field= if (value<18)
                18
            else if(value in 18..30)
                value
            else
                value -3
        }
    var actualAge:Int = 0
}