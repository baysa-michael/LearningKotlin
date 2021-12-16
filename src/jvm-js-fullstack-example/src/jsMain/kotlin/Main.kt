import kotlinx.browser.document

fun main() {
    document.getElementByID("root")?.innerHTML = "Hello, Kotlin/JS!"
}