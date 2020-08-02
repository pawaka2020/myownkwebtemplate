package kweb.template

import kweb.*

fun main() {
    Kweb(port = 16097) {
        doc.body {
            h1().text("Hello World!")
        }
    }
}