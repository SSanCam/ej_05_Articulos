package org.example

fun main() {
    val consola = GestionConsola()

    val articulo1 = Articulo("Champú", 25.0)
    val articulo2 = Articulo("Plátano", 45.0)
    val ordenadorGaming = Ordenador(TipoOredenador.GAMING, "ASUS", 1299.99)
    val ordenadorBasico = Ordenador(TipoOredenador.BASICO, "Lenovo", 399.99)

    val listaArticulos = listOf<Any>(articulo1, articulo2, ordenadorGaming, ordenadorBasico)
    for (articulo in listaArticulos) {
        if (articulo !is Ordenador) {
            consola.imprimir(articulo)
        } else {
            articulo.promocionNavidad(10.0)
            consola.imprimir(articulo)
        }

    }
}