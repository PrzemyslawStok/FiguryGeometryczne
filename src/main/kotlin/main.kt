fun main() {
    //val figura1 = Figura2D()

    val listaFigur = mutableListOf<Figura2D>()
    //listaFigur.add(figura1)

    val kwadrat1 = Kwadrat(2.0)
    val prostokat = Prostokat(2.0,5.0)

    listaFigur.add(kwadrat1)
    listaFigur.add(prostokat)
    listaFigur.add(Kwadrat(2.0))

    listaFigur.add(Kolo(5.0))
    listaFigur.add(TrojkatRownoboczny(5.0))

    for(figura in listaFigur) {
        println("-------------------")
        figura.info()
    }

    val figura = znajdzNajmniejszePole(listaFigur)
    val najwiekszaFigura = znajdzNajwiekszePole(listaFigur)

    println("Najmniejsze znalezione pole: ${figura.obliczPole()}")
    println("Największe znalezione pole: ${najwiekszaFigura.obliczPole()}")
}

fun znajdzNajmniejszePole(listaFigur: MutableList<Figura2D>):Figura2D{
    var figuraTymczasowa = listaFigur[0]

    for(figura in listaFigur){
        if(figura.obliczPole()<figuraTymczasowa.obliczPole())
            figuraTymczasowa = figura
    }

    return figuraTymczasowa
}

fun znajdzNajwiekszePole(listaFigur: MutableList<Figura2D>):Figura2D{
    var figuraTymczasowa = listaFigur[0]

    for(figura in listaFigur){
        if(figura.obliczPole()>figuraTymczasowa.obliczPole())
            figuraTymczasowa = figura
    }

    return figuraTymczasowa
}
