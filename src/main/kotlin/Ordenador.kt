package org.example

class Ordenador(tipo: TipoOredenador = TipoOredenador.BASICO, nombre: String, precio: Double) :
    Articulo(nombre, precio) {

    var tipo: TipoOredenador = tipo
        private set

    override fun promocionNavidad(descuento: Double) {
        if (precio > 500.0) {
            return super.promocionNavidad(descuento)
        }
    }

    override fun toString(): String {
        return "$nombre - ${"%.2f".format(precio)}€ (Tipo: $tipo, ID: $id)"
    }
}