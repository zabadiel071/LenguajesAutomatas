package AFD

/**
 * Created by Zabdiel on 06/07/2017.
 *  S = (0,1)
 *  x | x no contiene la subcadena 11, pero si contiene la subcadena 00
 */
class Ejercicio6(cadena:String):AFD(cadena) {
    override fun q0() {
        position++
        try{
            when(cadena[position]){
                '0' -> q1()
                '1' -> q2()
            }
        }catch (e: StringIndexOutOfBoundsException){}
    }

    private fun q1() {
        position++
        try{
            when(cadena[position]){
                '0' -> q5()
                '1' -> q0()
            }
        }catch (e: StringIndexOutOfBoundsException){}
    }

    private fun q2() {
        position++
        try{
            when(cadena[position]){
                '0' -> q1()
                '1' -> q3()
            }
        }catch (e: StringIndexOutOfBoundsException){}
    }

    private fun q3() {
        position++
        try{
            when(cadena[position]){
                '0','1' -> q3()
            }
        }catch (e: StringIndexOutOfBoundsException){}
    }


    private fun q5() {
        position++
        try{
            when(cadena[position]){
                '0' -> q5()
                '1' -> q4()
            }
        }catch (e: StringIndexOutOfBoundsException){status = true}
    }

    private fun q4() {
        position++
        try{
            when(cadena[position]){
                '0' -> q5()
                '1' -> q3()
            }
        }catch (e: StringIndexOutOfBoundsException){status = true}
    }
}