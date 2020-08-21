package abc.client

import kotlinx.css.*
import abc.common.test
import react.dom.a
import react.dom.render
import react.router.dom.browserRouter
import react.router.dom.route
import react.router.dom.switch
import styled.StyledComponents
import styled.css
import styled.injectGlobal
import styled.styledDiv
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
                    styledDiv {
                        styledDiv {
                            css {
                                fontSize = 50.px
                            }
                            +"Main page. The code is $test"
                        }
                        a(href = "/next") {
                            +"Another page"
                        }
                    }
                }
                route("/next", exact = true) {
                    a(href = "/") {
                        +"Go back ->"
                    }
                }
            }
        }
    }
}