package Application

import tornadofx.App
import tornadofx.importStylesheet

/**
 * Created by Zabdiel on 06/07/2017.
 */
class MainApp : App() {
    override val primaryView = MainScreen::class
    init {
        importStylesheet(Styles::class)
    }
}