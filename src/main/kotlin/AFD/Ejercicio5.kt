package AFD

/**
 * Created by Zabdiel on 06/07/2017.
 * S = (0,1)
 * x | x no comienza con abab
 */
class Ejercicio5(cadena:String):AFD(cadena) {
    override fun q0() {
        position++
        try{
            when(cadena[position]){
                'a' -> q1()
                'b' -> q5()
            }
        }catch (e: StringIndexOutOfBoundsException){status = true}
    }

    private fun q1() {
        position++
        try{
            when(cadena[position]){
                'a' -> q5()
                'b' -> q2()
            }
        }catch (e: StringIndexOutOfBoundsException){status = true}
    }

    private fun q2(){
        position++
        try{
            when(cadena[position]){
                'a' -> q3()
                'b' -> q5()
            }
        }catch (e: StringIndexOutOfBoundsException){status = true}
    }

    private fun q3(){
        position++
        try{
            when(cadena[position]){
                'a' -> q5()
                'b' -> q4()
            }
        }catch (e: StringIndexOutOfBoundsException){status = true}
    }

    private fun q4(){
        position++
        try{
            when(cadena[position]){
                'a','b' -> q4()
            }
        }catch (e: StringIndexOutOfBoundsException){}
    }

    private fun q5(){
        position++
        try{
            when(cadena[position]){
                'a','b' -> q5()
            }
        }catch (e: StringIndexOutOfBoundsException){status = true}
    }
}