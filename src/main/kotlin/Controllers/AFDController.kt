package Controllers

import AFD.*
import Models.Ejercicio
import javafx.beans.property.Property
import javafx.collections.FXCollections
import tornadofx.Controller

/**
 * Created by Zabdiel on 07/07/2017.
 */
class AFDController : Controller(){
    val ejercicios = FXCollections.observableArrayList<Ejercicio>()

    init {
        ejercicios += Ejercicio("Ejercicio1", "x | x tiene cantidad impar de a's", "{a,b}")
        ejercicios += Ejercicio("Ejercicio2", "x | x tiene cantidad par de a's", "{a,b}")
        ejercicios += Ejercicio("Ejercicio3", "x | x comienza con 00", "{0,1}")
        ejercicios += Ejercicio("Ejercicio4", "x | x no comienza con 00", "{0,1}")
        ejercicios += Ejercicio("Ejercicio5", "x | x no comienza con abab", "{a,b}")
        ejercicios += Ejercicio("Ejercicio6", "x | x no contiene la subcadena 11, pero si\n contiene la subcadena 00", "{0,1}")
        ejercicios += Ejercicio("Ejercicio7", "x | x tiene un numero impar de \nocurrencias de la subcadena ab", "{a,b}")
        ejercicios += Ejercicio("Ejercicio8", "x | x es de longitud par, tiene numero par de a's", "{a,b}")
        ejercicios += Ejercicio("Ejercicio9", "x | x tenga cantidad de 0 divisible entre 3", "{0,1}")
        ejercicios += Ejercicio("Ejercicio10", "x | x contenga a lo mucho un par 1's \nconsecutivos", "{0,1}")
        ejercicios += Ejercicio("Ejercicio11", "x | x contenga 'aba' y termina en 'bb'", "{a,b}")
        ejercicios += Ejercicio("Ejercicio12", "x | x comienza con 'bb' o termina con 'aaa'", "{a,b}")
        ejercicios += Ejercicio("Ejercicio13", "x | x contiene la subcadena 00 o 11", "{0,1}")
        ejercicios += Ejercicio("Ejercicio14", "x | x comienza o termina con 01", "{0,1}")
        ejercicios += Ejercicio("Ejercicio15", "x | x tiene un numero de a's es par y \nel numero de b's es divisible por 3", "{a,b}")
        ejercicios += Ejercicio("Ejercicio16", "x | x tiene la forma aMbN donde M,N>0 \n(M,N ->Exponentes)", "{a,b}")
        ejercicios += Ejercicio("Ejercicio17", "x | x tiene la forma bMabN donde M,N>0 \n(M,N ->Exponentes)", "{a,b}")
    }

    fun runAFD(nombre: String,cadena:String) : Boolean {
        when(nombre){
            "Ejercicio1" -> return Ejercicio1(cadena).status
            "Ejercicio2" -> return Ejercicio2(cadena).status
            "Ejercicio3" -> return Ejercicio3(cadena).status
            "Ejercicio4" -> return Ejercicio4(cadena).status
            "Ejercicio5" -> return Ejercicio5(cadena).status
            "Ejercicio6" -> return Ejercicio6(cadena).status
            "Ejercicio7" -> return Ejercicio7(cadena).status
            "Ejercicio8" -> return Ejercicio8(cadena).status
            "Ejercicio9" -> return Ejercicio9(cadena).status
            "Ejercicio10" -> return Ejercicio10(cadena).status
            "Ejercicio11" -> return Ejercicio11(cadena).status
            "Ejercicio12" -> return Ejercicio12(cadena).status
            "Ejercicio13" -> return Ejercicio13(cadena).status
            "Ejercicio14" -> return Ejercicio14(cadena).status
            "Ejercicio15" -> return Ejercicio15(cadena).status
            "Ejercicio16" -> return Ejercicio16(cadena).status
            "Ejercicio17" -> return Ejercicio17(cadena).status
            else -> return false
        }
    }
}