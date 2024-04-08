package org.example

open class Articulo(nombre: String, precio: Double) {

    companion object {
        private var totalArticulos: Int = 0
    }

    init {
        totalArticulos++
    }

    private fun generarId(): Int {
        return totalArticulos
    }

    var nombre: String = nombre
        set(value) {
            require(nombre.isNotBlank()) { "El artículo debe tener un nombre." }
            field = value
        }
    var precio: Double = precio
        set(value) {
            require(precio > 0.0) { "El precio del artículo debe ser superior a 0." }
            field = value
        }

    val id: Int = generarId()

    open fun promocionNavidad(descuento: Double){
        precio -= ((descuento / 100) * precio)
    }

    override fun toString(): String {
        return "{$nombre}-{${String.format("%.2f", precio)}}€ (ID:$id)"
    }
}