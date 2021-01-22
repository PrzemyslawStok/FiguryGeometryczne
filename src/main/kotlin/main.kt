fun main() {
    val figura1 = Figura2D()

    val listaFigur = mutableListOf<Figura2D>()
    listaFigur.add(figura1)

    val kwadrat1 = Kwadrat(2.0)
    val prostokat = Prostokat(2.0,5.0)

    listaFigur.add(kwadrat1)
    listaFigur.add(prostokat)
    listaFigur.add(Kwadrat(2.0))

    for(figura in listaFigur) {
        println("-------------------")
        figura.info()
    }
}
