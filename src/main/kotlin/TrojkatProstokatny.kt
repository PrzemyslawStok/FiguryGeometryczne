class TrojkatProstokatny(val a: Double, val b: Double) : Figura2D() {
    val c: Double

    init {
        c = Math.sqrt(a * a + b * b)
    }

    override fun obliczPole(): Double {
        return a * b
    }

    override fun obliczObwod(): Double {
        return a + b + c
    }

    override fun info() {
        println("Trójkat prostokatny")
        super.info()
    }
}
