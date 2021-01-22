class Prostokat(val a: Double, val b: Double):Figura2D() {
    override fun obliczPole(): Double {
        return a*b
    }

    override fun obliczObwod(): Double {
        return super.obliczObwod()
    }
}
