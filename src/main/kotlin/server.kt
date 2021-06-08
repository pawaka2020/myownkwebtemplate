package kweb.template

import kweb.*

fun main() {

    // test test
    Kweb(port = 16097) {
        doc.body {
            h1().text("Hello Wowo!")
        }
    }
}