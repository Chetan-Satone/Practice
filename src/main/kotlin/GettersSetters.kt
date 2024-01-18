fun main() {

    val p1 = People("milton", 14)
    println(p1.age)
    p1.age = 24
    p1.age = -7
    println(p1.name)

}

class People(nameParam:String, ageParam:Int){

    var name:String = nameParam
        get() {
            return field.uppercase()
        }

    var age:Int = ageParam
        set(value){
            if(value>0){
                field = value
            }
            else {
                println("age cannot be negative")
            }
        }

    override fun toString(): String {
        return "People(name='$name', age=$age)"
    }
}
