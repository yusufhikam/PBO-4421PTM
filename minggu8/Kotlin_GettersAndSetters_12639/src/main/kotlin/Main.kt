fun main(args: Array<String>) {

    val p = Person()
    p.name = "Yusuf"
    println("${p.name}")
}

class Person {
    var name: String = "defaultValue"

        get() = field

        set(value) {
            field = value
        }
}