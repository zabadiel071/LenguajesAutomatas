package AFD

/**
 * Created by Zabdiel on 05/07/2017.
 * S = (a,b)
 * x | x tiene cantidad impar de a's
 */
class Ejercicio1(cadena: String) : AFD(cadena) {
    override fun q0(){
        position++
        try{
            when(cadena[position]){
                'a' -> q1()
                'b' -> q0()
            }
        }catch (e: StringIndexOutOfBoundsException){}
    }

    fun q1(){
        position++
        try{
            when(cadena[position]){
                'a' -> q0()
                'b' -> q1()
            }
        }catch (e: StringIndexOutOfBoundsException){status = true}
    }
}