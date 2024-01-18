fun main () {


    val obj1 = Bike("KTM", "250", "Black", 249)
    obj1.small(300)

    val obj2 = Bike("Hero", "Splendor", "Golden", 100)
    obj2.small(100)

    val obj3 = Bike("MV", "MV Augusta", "Red chili", 999)
    obj3.small(999)
}

class Bike ( var name:String, var model: String, var color: String, var displacement: Int){

    fun small(displacement: Int){

        if (displacement<150){
            println("for kids")
        }else{
            println("for legend")
        }
    }

}