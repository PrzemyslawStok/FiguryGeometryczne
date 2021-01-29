class Kolo(val r: Double):Figura2D() {
    override fun obliczPole(): Double {
        return Math.PI*r*r
    }

    override fun obliczObwod(): Double {
        return 2*Math.PI*r
    }
}
