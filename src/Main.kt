
interface Dimensionable {
    fun getArea(): Double
}

abstract class Shape(private val _name: String) : Dimensionable {
    var name = _name
    abstract override fun getArea(): Double
}

class Square(name: String, private val side: Double) : Shape(name) {
    override fun getArea(): Double {
        return 0.0 //change this
    }
}

class Circle(name: String, private val radius: Double) : Shape(name) {
    override fun getArea(): Double {
        return 0.0 //change this
    }
}

open class Triangle(name: String, private val base: Double, private val height: Double) : Shape(name) {
    override fun getArea(): Double {
        return 0.0 //change this
    }
}

class EquilateralTriangle(name: String, side: Double) : Triangle(name, side, calculateHeight(side)) {

    companion object {
        // Calculates the height of an equilateral triangle given the side length
        fun calculateHeight(side: Double): Double {
            return 0.0 //change this
        }
    }
}

fun main() {
    //add
}