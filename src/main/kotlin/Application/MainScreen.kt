package Application

import Controllers.AFDController
import Models.Ejercicio
import Models.EjercicioModel
import javafx.scene.control.Button
import javafx.scene.control.ProgressIndicator
import javafx.scene.text.Font
import tornadofx.*


/**
 * Created by Zabdiel on 06/07/2017.
 */
class MainScreen : View() {
    val controller: AFDController by inject()
    val model = EjercicioModel(Ejercicio())

    val resultString = text{font = Font(18.0)}

    override val root = borderpane {
        title = "Ejercicios de lenguajes y autómatas"
        primaryStage.width = 700.0
        primaryStage.isResizable = false

        addClass("wrapper")

        left = listview(controller.ejercicios){
            cellFormat {
                text = it.nombre
            }
            model.rebindOnChange(this){ selectedEjercicio->
                e = selectedEjercicio ?: Ejercicio()
                e.cadena = ""
                resultString.text = ""
            }
        }

        center = form {
            useMaxWidth = true

            text("Autómata finito"){font = Font(28.0)}

            fieldset("Descripción") {
                field("Ejercicio:") {
                    text(model.nombre)
                }
                field("Descripcion:"){
                    text(model.descripcion)
                }
                field("Alfabeto:"){
                    text(model.alfabeto)
                }
            }
            fieldset("Datos de entrada"){
                field("Palabra:") {
                    textfield(model.cadena)
                }

                button("Probar"){
                    setOnAction{
                        probar()
                    }
                }
                field("Resultado")

                add(resultString)
            }
        }
    }

    private fun Button.probar() {
        if(model.e != null){
            if(model.commit() && model.cadena.value != null){
                graphic = ProgressIndicator()
                runAsync {
                    Thread.sleep(500)
                    controller.runAFD(model.nombre.value,model.cadena.value)
                } ui {success ->
                    if(success){
                        resultString.text = "La cadena es valida"
                    }
                    else{
                        resultString.text = "La cadena no es valida"
                    }
                    graphic = null
                }
            }
        }
    }
}