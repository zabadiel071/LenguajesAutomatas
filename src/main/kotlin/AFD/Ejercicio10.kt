package AFD

/**
 * Created by Zabdiel on 07/07/2017.
     * x | x contenga a lo mucho un par 1's consecutivos
 */
class Ejercicio10(cadena:String) : AFD(cadena) {
    override fun q0() {
        position++
        try{
            when(cadena[position]){
                '0' -> q0()
                '1' -> q1()
            }
        }catch (e: StringIndexOutOfBoundsException){status = true}
    }

    private fun q1() {
        position++
        try{
            when(cadena[position]){
                '0' -> q0()
                '1' -> q2()
            }
        }catch (e: StringIndexOutOfBoundsException){status = true}
    }

    private fun q2() {
        position++
        try{
            when(cadena[position]){
                '0' -> q2()
                '1' -> q3()
            }
        }catch (e: StringIndexOutOfBoundsException){status = true}
    }

    private fun q3() {
        position++
        try{
            when(cadena[position]){
                '0' -> q2()
                '1' -> q4()
            }
        }catch (e: StringIndexOutOfBoundsException){status = true}
    }

    private fun q4() {
        position++
        try{
            when(cadena[position]){
                '0','1' -> q4()
            }
        }catch (e: StringIndexOutOfBoundsException){}
    }

}