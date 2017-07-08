package AFD

/**
 * Created by Zabdiel on 07/07/2017.
 */
class Ejercicio11(cadena:String) : AFD(cadena) {
    override fun q0() {
        position++
        try{
            when(cadena[position]){
                'a' -> q1()
                'b' -> q0()
            }
        }catch (e: StringIndexOutOfBoundsException){}
    }

    private fun q1() {
        position++
        try{
            when(cadena[position]){
                'a' -> q1()
                'b' -> q2()
            }
        }catch (e: StringIndexOutOfBoundsException){}
    }

    private fun q2() {
        position++
        try{
            when(cadena[position]){
                'a' -> q3()
                'b' -> q0()
            }
        }catch (e: StringIndexOutOfBoundsException){}
    }

    private fun q3() {
        position++
        try{
            when(cadena[position]){
                'a' -> q3()
                'b' -> q4()
            }
        }catch (e: StringIndexOutOfBoundsException){}
    }

    private fun q4() {
        position++
        try{
            when(cadena[position]){
                'a' -> q3()
                'b' -> q5()
            }
        }catch (e: StringIndexOutOfBoundsException){}
    }

    private fun q5() {
        position++
        try{
            when(cadena[position]){
                'a' -> q3()
                'b' -> q5()
            }
        }catch (e: StringIndexOutOfBoundsException){status = true}
    }
}