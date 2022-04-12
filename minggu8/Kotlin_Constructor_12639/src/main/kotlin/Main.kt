// primary constructor

fun main(args: Array<String>){
    val person1 = Person("Yusuf", 21)

    println("First Name = ${person1.firstName}")
    println("Age = ${person1.age}")
}

class Person(val firstName: String, var age: Int){

}

//Secondary Constructor

fun main (args: Array<String>){
    val p1 = AuthLog("Bad Password")
}

open class Log{
    var data: String = ""
    var numberOfdata = 0
    constructor(_data: String){

    }
    constructor(_data: String, _numberOfdata: Int){
        data = _data
        numberOfdata = _numberOfdata
        println("$data: $_numberOfdata times")
    }
}

class AuthLog: Log {
    constructor(_data: String): this("From AuthLog -> " + _data, 10){
    }
    constructor(_data: String, _numberOfdata: Int): super(_data, _numberOfdata)
}
