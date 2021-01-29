abstract class Figura2D {
    open fun obliczPole():Double
    abstract fun obliczObwod():Double

    open fun info(){
        println("Pole powierzchni wynosi: ${obliczPole()}")
        println("Obwód figury wynosi: ${obliczObwod()}")
    }
}
