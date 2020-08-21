package abc.server

import io.ktor.application.call
import io.ktor.html.respondHtml
import io.ktor.routing.Route
import io.ktor.routing.get
import kotlinx.html.*

fun Route.generateLoadingHTML(path: String) {
    get(path) {
        call.respondHtml {
            head {
            }
            body("wrapper") {
                div("wrapper") {
                    id = "js-response"
                    div("wrapper wrapper-loading") {
                        div("js-loading") {
                            +"Loading..."
                        }
                    }
                }
                script(src = "/main.bundle.js") {}
            }
        }
    }
}