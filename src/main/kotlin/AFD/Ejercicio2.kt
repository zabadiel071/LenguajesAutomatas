package AFD

/**
 * Created by Zabdiel on 06/07/2017.
 * S = (a,b)
 * x | x tiene cantidad par de a's
 */
class Ejercicio2(cadena:String) : AFD(cadena){
    override fun q0(){
        position++
        try{
            when(cadena[position]){
                'a' -> q1()
                'b' -> q0()
            }
        }catch (e: StringIndexOutOfBoundsException){status = true}
    }

    fun q1(){
        position++
        try{
            when(cadena[position]){
                'a' -> q0()
                'b' -> q1()
            }
        }catch (e: StringIndexOutOfBoundsException){}
    }
}