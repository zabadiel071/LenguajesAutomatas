package Application

import javafx.scene.paint.Color
import tornadofx.*

/**
 * Created by Zabdiel on 06/07/2017.
 */
class Styles: Stylesheet() {
    companion object {
        val wrapper by cssclass()
    }
    init {
        wrapper{
            padding = box(10.px)

            s(label){
                minWidth = 100.px
            }

            s(listView){
                backgroundColor = multi(Color.ANTIQUEWHITE)
            }

            s(form){
                backgroundColor = multi(Color.ANTIQUEWHITE)

                s(field){
                    fontSize = 14.px
                }

                button{
                    fontSize = 16.px
                }

                progressIndicator{
                    prefWidth = 16.px
                    prefHeight = prefWidth
                }
            }

        }
    }
}