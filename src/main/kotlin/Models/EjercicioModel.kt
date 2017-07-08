package Models

import tornadofx.ViewModel

/**
 * Created by Zabdiel on 07/07/2017.
 */
class EjercicioModel(var e: Ejercicio) : ViewModel(){
    val nombre = bind { e.nombreProperty()}
    val descripcion = bind { e.descripcionProperty()}
    val alfabeto = bind { e.alfabetoProperty()}
    val cadena =  bind{e.cadenaProperty()}
}