class Car {
    var color = ""
    var year = 0
}

fun main() {
    val c1 = Car()
    c1.color = "Hitam"
    c1.year = 2006

    val c2 = Car()
    c2.color = "Hijau"
    c2.year = 2007

    println(c1.color)
    println(c1.year)
    println(c2.color)
    println(c2.year)
}