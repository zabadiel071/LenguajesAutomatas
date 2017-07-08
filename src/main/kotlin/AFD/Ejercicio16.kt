package AFD

/**
 * Created by Zabdiel on 08/07/2017.
 */
class Ejercicio16(cadena:String) : AFD(cadena) {
    override fun q0() {
        position++
        try{
            when(cadena[position]){
                'a' -> q2()
                'b' -> q1()
            }
        }catch (e: StringIndexOutOfBoundsException){}
    }

    private fun q1() {
        position++
        try{
            when(cadena[position]){
                'a','b' -> q1()
            }
        }catch (e: StringIndexOutOfBoundsException){status = false}
    }

    private fun q2() {
        position++
        try{
            when(cadena[position]){
                'a' -> q2()
                'b' -> q3()
            }
        }catch (e: StringIndexOutOfBoundsException){}
    }

    private fun q3() {
        position++
        try{
            when(cadena[position]){
                'a' -> q1()
                'b' -> q3()
            }
        }catch (e: StringIndexOutOfBoundsException){status = true}
    }
}