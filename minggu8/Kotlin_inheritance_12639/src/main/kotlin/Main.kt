open class Person(age: Int, name: String) {
    init {
        println("My name is $name.")
        println("My age is $age")
    }
}

class Pelukis(age: Int, name: String): Person(age, name) {

    fun pelukis() {
        println("Saya adalah seorang pelukis")
    }
}

class Programer(age: Int, name: String): Person(age, name) {
    fun programer() {
        println("I play for LA Galaxy.")
    }
}

fun main(args: Array<String>) {
    val t1 = Pelukis(21, "Yusuf")
    t1.pelukis()

    println()

    val f1 = Programer(29, "Hikam")
    f1.programer()
}