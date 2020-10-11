package abc.client

import kotlinx.css.*
import kotlinx.css.properties.border
import kotlinx.html.js.onClickFunction
import org.w3c.dom.events.Event
import react.RBuilder
import styled.css
import styled.styledDiv
import kotlin.browser.window

data class Snake(
    val name: String,
    val message: String
)

val snakeList = listOf(
    Snake("Моя любимая змейка", "Я лублу тибя, змейка"),
    Snake("Катя", "Тата-рата-татата-татата-татата"),
    Snake("Змейка", "Змейка")
)

fun RBuilder.snakeRender(snake: Snake) {
    styledDiv {
        attrs.onClickFunction = {
            window.alert(snake.message)
        }
        css {
            width = 200.px
            height = 200.px
            backgroundColor = Color.lightGreen
            fontSize = 20.px
            cursor = Cursor.pointer
            margin(10.px)
            border(3.px, BorderStyle.solid, Color.green)
        }
        +snake.name
    }
}