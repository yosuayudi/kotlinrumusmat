import kotlin.math.PI
import kotlin.math.sqrt

abstract class Shape {
    abstract fun calculateArea() : Double
    abstract fun calculatePerimeter() : Double
}

open class Rectangle(val width: Double, val length: Double) : Shape() {

    override fun calculateArea(): Double {
        return width*length
    }

    override fun calculatePerimeter(): Double {
        return 2 * (width + length)
    }
}

class Circle(var radius : Double) : Shape() {

    override fun calculateArea(): Double {
        return PI*radius*radius
    }

    override fun calculatePerimeter(): Double {
        return 2*PI*radius
    }
}

fun main() {
    //contoh volume persegi panjang
    val panjang = 10.0
    val lebar = 5.0
    val tinggi = 5.0
    val persegipanjang = Rectangle(panjang, lebar)
    println("Volume persegi panjang = ${persegipanjang.calculateArea()}")

        //contoh lingkaran
    val r = 5.0
    val lingkaran = Circle(r)
    println("Luas lingkaran = ${lingkaran.calculateArea()}")


}
