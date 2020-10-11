package abc.client

import kotlinx.css.*
import react.dom.render
import react.router.dom.browserRouter
import react.router.dom.route
import react.router.dom.switch
import styled.StyledComponents
import styled.injectGlobal
import kotlin.browser.document

fun main() {
    StyledComponents.injectGlobal {
        a {
            color = Color.blueViolet
            fontSize = 12.px
        }
    }
    render(document.getElementById("js-response")) {
        browserRouter {
            switch {
                route("/", exact = true) {
                    child(SwitcherComponent::class) {}
                }
            }
        }
    }
}