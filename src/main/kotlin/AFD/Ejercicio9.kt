package AFD

/**
 * Created by Zabdiel on 07/07/2017.
 */
class Ejercicio9(cadena:String) : AFD(cadena) {
    override fun q0() {
        position++
        try{
            when(cadena[position]){
                '0' -> q1()
                '1' -> q0()
            }
        }catch (e: StringIndexOutOfBoundsException){status = true}
    }

    private fun q1() {
        position++
        try{
            when(cadena[position]){
                '0' -> q2()
                '1' -> q1()
            }
        }catch (e: StringIndexOutOfBoundsException){}
    }

    private fun q2() {
        position++
        try{
            when(cadena[position]){
                '0' -> q0()
                '1' -> q2()
            }
        }catch (e: StringIndexOutOfBoundsException){}
    }
}