package AFD

/**
 * Created by Zabdiel on 07/07/2017.
 * x | x tiene un numero impar de ocurrencias de la subcadena ab
 * {a,b}
 */
class Ejercicio7(cadena:String) : AFD(cadena){
    override fun q0() {
        position++
        try{
            when(cadena[position]){
                'a' -> q1()
                'b' -> q0()
            }
        }catch (e: StringIndexOutOfBoundsException){status = false}
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
                'b' -> q2()
            }
        }catch (e: StringIndexOutOfBoundsException){status = true}
    }

    private fun q3() {
        position++
        try{
            when(cadena[position]){
                'a' -> q3()
                'b' -> q0()
            }
        }catch (e: StringIndexOutOfBoundsException){status = true}
    }
}