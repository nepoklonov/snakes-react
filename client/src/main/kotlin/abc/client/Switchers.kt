package abc.client

import kotlinx.css.Cursor
import kotlinx.css.cursor
import kotlinx.css.fontSize
import kotlinx.css.px
import kotlinx.html.js.onClickFunction
import react.RBuilder
import styled.css
import styled.styledDiv

enum class Switcher (
    val type: Int,
    val symbol: String
) {
    LEFT(-1, "<"), RIGHT(+1, ">")
}

inline fun RBuilder.switcherRender(switcher: Switcher, crossinline action : (Int) -> Unit) {
    styledDiv {
        attrs.onClickFunction = {
            action(switcher.type)
        }
        css {
            fontSize = 50.px
            cursor = Cursor.pointer
        }
        +switcher.symbol
    }
}