class buku {
    var judul = ""
    var pengarang = ""
    var penerbit = ""
    var year = ""
}

fun main() {
    val c1 = buku()
    val c2 = buku()
    c1.judul = "Judul: Annora Kyara"
    c1.pengarang = "Pengarang : Noor"
    c1.penerbit = "Penerbit : WM Production"
    c1.year = "Tahun : 2008"
    c2.judul = "Judul : Ataraxia"
    c2.pengarang = "Pengarang : Yuka"
    c2.penerbit = "Penerbit : Haruna"
    c2.year = "Tahun : 2009"


    println(c1.judul)
    println(c1.pengarang)
    println(c1.penerbit)
    println(c1.year)
    println(c2.judul)
    println(c2.pengarang)
    println(c2.penerbit)
    println(c2.year)
}