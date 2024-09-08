
interface Dimensionable {
    fun getArea(): Double
    fun printDimensions()
}

abstract class Shape(private val _name: String) : Dimensionable {
    var name = _name

    abstract fun setDimensions(vararg dimensions: Double)

    override fun printDimensions() {
        println("Shape: $name")
    }
}


class Square(name: String, private var side: Double) : Shape(name) {

    init {
        setDimensions(side)
    }

    override fun setDimensions(vararg dimensions: Double) {
        if (dimensions.isNotEmpty()) {
            side = dimensions[0]
        }
    }

    override fun getArea(): Double {
        return side * side
    }

    override fun printDimensions() {
        println("Square: $name, Side: $side")
    }
}



class Circle(name: String, private var radius: Double) : Shape(name) {

    init {
        setDimensions(radius)
    }

    override fun setDimensions(vararg dimensions: Double) {
        if (dimensions.isNotEmpty()) {
            radius = dimensions[0]
        }
    }

    override fun getArea(): Double {
        return Math.PI * radius * radius
    }

    override fun printDimensions() {
        println("Circle: $name, Radius: $radius")
    }
}



open class Triangle(name: String, protected var a: Double, protected var b: Double, protected var c: Double) : Shape(name) {

    init {
        setDimensions(a, b, c)
    }

    override fun setDimensions(vararg dimensions: Double) {
        if (dimensions.size == 3) {
            a = dimensions[0]
            b = dimensions[1]
            c = dimensions[2]
        }
    }

    override fun getArea(): Double {
        val s = (a + b + c) / 2
        return Math.sqrt(s * (s - a) * (s - b) * (s - c))
    }

    override fun printDimensions() {
        println("Triangle: $name, Sides: $a, $b, $c")
    }
}




class EquilateralTriangle(name: String, private var side: Double) : Triangle(name, side, side, side) {

    init {
        setDimensions(side)
    }

    override fun setDimensions(vararg dimensions: Double) {
        if (dimensions.isNotEmpty()) {
            side = dimensions[0]
            // Update the sides in the superclass
            a = side
            b = side
            c = side
        }
    }

    override fun printDimensions() {
        println("Equilateral Triangle: $name, Side: $side")
    }
}



fun main() {
    // add
}

