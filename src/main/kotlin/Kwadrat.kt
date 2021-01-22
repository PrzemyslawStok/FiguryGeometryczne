class Kwadrat(val a: Double): Figura2D() {
    override fun obliczPole(): Double {
        return a*a
    }

    override fun obliczObwod(): Double {
        return 4*a
    }
}
