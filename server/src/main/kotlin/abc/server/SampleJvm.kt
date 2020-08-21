package abc.server

import io.ktor.application.Application
import io.ktor.http.content.file
import io.ktor.http.content.static
import io.ktor.routing.routing
import abc.common.test

fun Application.main() {
    println("Server started with code $test!")
    routing {
        static("/") {
            file("main.bundle.js")
        }
        generateLoadingHTML("{...}")
    }
}