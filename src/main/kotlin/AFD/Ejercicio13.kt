package AFD

/**
 * Created by Zabdiel on 07/07/2017.
 */
class Ejercicio13(cadena:String) : AFD(cadena) {
    override fun q0() {
        position++
        try{
            when(cadena[position]){
                '0' -> q1()
                '1' -> q3()
            }
        }catch (e: StringIndexOutOfBoundsException){}
    }

    private fun q1() {
        position++
        try{
            when(cadena[position]){
                '0' -> q2()
                '1' -> q3()
            }
        }catch (e: StringIndexOutOfBoundsException){}
    }

    private fun q2() {
        position++
        try{
            when(cadena[position]){
                '0','1' -> q2()
            }
        }catch (e: StringIndexOutOfBoundsException){status = true}
    }

    private fun q3() {
        position++
        try{
            when(cadena[position]){
                '0' -> q1()
                '1' -> q2()
            }
        }catch (e: StringIndexOutOfBoundsException){}
    }
}