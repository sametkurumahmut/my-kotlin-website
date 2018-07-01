package site

import org.w3c.dom.Element
import kotlin.browser.document

inline fun app(block: Element.() -> Unit = {}) = App().element?.apply(block)

class App {

    val element = document.getElementById(ELEMENT_NAME)

    init {
        requireNotNull(this.element) { "No '$ELEMENT_NAME' element found!" }
    }

    companion object {

        const val ELEMENT_NAME = "app"
    }
}
