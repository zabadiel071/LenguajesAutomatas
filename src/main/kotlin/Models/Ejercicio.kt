package Models

import tornadofx.getProperty
import tornadofx.property

/**
 * Created by Zabdiel on 07/07/2017.
 */
class Ejercicio(nombre:String?=null,
                descripcion:String?=null,
                alfabeto:String?=null,
                cadena:String?=null)
{
    var nombre by property<String>(nombre)
    fun nombreProperty() = getProperty(Ejercicio::nombre)

    var descripcion by property<String>(descripcion)
    fun descripcionProperty() = getProperty(Ejercicio::descripcion)

    var alfabeto by property<String>(alfabeto)
    fun alfabetoProperty() = getProperty(Ejercicio::alfabeto)

    var cadena by property<String>(cadena)
    fun cadenaProperty() = getProperty(Ejercicio::cadena)
}