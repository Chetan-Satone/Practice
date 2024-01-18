fun main() {
//    for(i in 1..20 step 2){
//        println(i)
//    }
//
//    println("Get this loop")
//
//    for(i in 20 downTo 1 step 2){
//        println(i)
//    }


    val number = 2
    for (i in 1..10){
        //println(number.toString() + "x" + i + "=" +  (number * i))  // to convert integer into string (number.toString)
        println(" $number x $i  = ${number * i}")  // String templating

    }
}