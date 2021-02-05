class OsmiokatForemny(val a: Double, val h: Double):Figura2D() {
    override fun obliczPole(): Double {
        return 8*a*h
    }

    override fun obliczObwod(): Double {
        return 8*a
    }
}
