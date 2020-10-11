package abc.client

import kotlinx.css.*
import react.*
import react.dom.h1
import styled.css
import styled.styledDiv
import kotlin.browser.window
import kotlin.math.min

const val SNAKE_AMOUNT = 3

interface SwitcherState : RState {
    var firstSnakeIndex: Int
}

class SwitcherComponent : RComponent<RProps, SwitcherState>() {

    init {state.firstSnakeIndex = 10}

    override fun RBuilder.render() {
        h1 {
            +"Змейки"
        }
        styledDiv {
            css {
                display = Display.flex
                alignItems = Align.center
            }


            switcherRender(Switcher.LEFT) {
                setState {
                    firstSnakeIndex += it
                }
            }

            for (i in state.firstSnakeIndex.let { it..(it + SNAKE_AMOUNT) }) {
                snakeRender(snakeList[i % snakeList.size])
            }

            switcherRender(Switcher.RIGHT) {
                setState {
                    firstSnakeIndex += it
                }
            }
        }
    }
}