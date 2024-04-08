package org.example

class GestionConsola: IConsola {
    override fun imprimir(texto: Any) {
        return println(texto)
    }
}