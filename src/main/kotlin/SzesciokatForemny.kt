class SzesciokatForemny(val a: Double) : Figura2D() {
    override fun obliczPole(): Double {
        return 6.0 * a * a * Math.sqrt(3.0) / 4.0
    }

    override fun obliczObwod(): Double {
        return 6.0 * a
    }
}
