class Rownoleglobok(val a: Double, val h: Double) : Figura2D() {
    override fun obliczPole(): Double {
        return a*h
    }

    override fun obliczObwod(): Double {
        val b = 0
        return 2*a + 2*b
    }
}
