class TrojkatRownoboczny(val a: Double):Figura2D() {
    override fun obliczPole(): Double {
        return a*a*Math.sqrt(3.0)/4.0
    }

    override fun obliczObwod(): Double {
        return 3*a
    }

    override fun info() {
        println("Trójkąt równoboczny")
        super.info()
    }
}
