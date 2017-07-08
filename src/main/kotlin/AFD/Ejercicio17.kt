package AFD

/**
 * Created by Zabdiel on 08/07/2017.
 */
class Ejercicio17(cadena:String) : AFD(cadena) {
    override fun q0() {
        position++
        try{
            when(cadena[position]){
                'a' -> q4()
                'b' -> q1()
            }
        }catch (e: StringIndexOutOfBoundsException){}
    }

    private fun q1() {
        position++
        try{
            when(cadena[position]){
                'a' -> q2()
                'b' -> q1()
            }
        }catch (e: StringIndexOutOfBoundsException){}
    }

    private fun q2() {
        position++
        try{
            when(cadena[position]){
                'a' -> q4()
                'b' -> q3()
            }
        }catch (e: StringIndexOutOfBoundsException){}
    }

    private fun q3() {
        position++
        try{
            when(cadena[position]){
                'a' -> q4()
                'b' -> q3()
            }
        }catch (e: StringIndexOutOfBoundsException){status = true}
    }

    private fun q4() {
        position++
        try{
            when(cadena[position]){
                'a','b' -> q4()
            }
        }catch (e: StringIndexOutOfBoundsException){status = false}
    }
}
