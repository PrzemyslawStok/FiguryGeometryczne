open class Figura2D {
    open fun obliczPole():Double{
        return 0.0
    }
    open fun obliczObwod():Double{
        return 0.0
    }

    fun info(){
        println("Pole powierzchni wynosi: ${obliczPole()}")
        println("Obwód figury wynosi: ${obliczObwod()}")
    }
}
