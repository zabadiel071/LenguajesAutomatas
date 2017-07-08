package AFD

/**
 * Created by Zabdiel on 07/07/2017.
 */
class Ejercicio12(cadena:String) : AFD(cadena) {
    override fun q0() {
        position++
        try{
            when(cadena[position]){
                'a' -> q3()
                'b' -> q1()
            }
        }catch (e: StringIndexOutOfBoundsException){}
    }

    private fun q1() {
        position++
        try{
            when(cadena[position]){
                'a' -> q3()
                'b' -> q2()
            }
        }catch (e: StringIndexOutOfBoundsException){}
    }

    private fun q2() {
        position++
        try{
            when(cadena[position]){
                'a','b' -> q2()
            }
        }catch (e: StringIndexOutOfBoundsException){status=true}
    }

    private fun q3() {
        position++
        try{
            when(cadena[position]){
                'a' -> q4()
                'b' -> q6()
            }
        }catch (e: StringIndexOutOfBoundsException){}
    }

    private fun q4() {
        position++
        try{
            when(cadena[position]){
                'a' -> q5()
                'b' -> q6()
            }
        }catch (e: StringIndexOutOfBoundsException){}
    }

    private fun q5() {
        position++
        try{
            when(cadena[position]){
                'a' -> q5()
                'b' -> q6()
            }
        }catch (e: StringIndexOutOfBoundsException){status = true}
    }

    private fun q6() {
        position++
        try{
            when(cadena[position]){
                'a' -> q3()
                'b' -> q6()
            }
        }catch (e: StringIndexOutOfBoundsException){status = false}
    }
}