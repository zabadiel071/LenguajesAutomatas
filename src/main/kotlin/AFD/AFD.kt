package AFD

/**
 * Created by Zabdiel on 06/07/2017.
 * Superclase de automátas finitos deterministicos
 * Alfabeto 1 : {0,1}
 * Alfabeto 2 : {a,b}
 */
abstract class AFD(val cadena:String) {
    var position = -1
    var status = false

    init {
        q0()
    }

    abstract fun q0()
}