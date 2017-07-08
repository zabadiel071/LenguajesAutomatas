package AFD

/**
 * Created by Zabdiel on 07/07/2017.
 */
class Ejercicio8(cadena:String) :AFD(cadena) {
    override fun q0() {
        position++
        try{
            when(cadena[position]){
                'a' -> q1()
                'b' -> q3()
            }
        }catch (e: StringIndexOutOfBoundsException){status = true}
    }

    private fun q1() {
        position++
        try{
            when(cadena[position]){
                'a' -> q0()
                'b' -> q2()
            }
        }catch (e: StringIndexOutOfBoundsException){status = false}
    }

    private fun q2() {
        position++
        try{
            when(cadena[position]){
                'a' -> q3()
                'b' -> q1()
            }
        }catch (e: StringIndexOutOfBoundsException){status = false}
    }

    private fun q3() {
        position++
        try{
            when(cadena[position]){
                'a' -> q2()
                'b' -> q0()
            }
        }catch (e: StringIndexOutOfBoundsException){status = false}
    }
}
