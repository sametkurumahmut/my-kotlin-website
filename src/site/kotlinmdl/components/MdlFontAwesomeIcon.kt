package site.kotlinmdl.components

import kotlinmdl.components.MdlComponent
import kotlinmdl.extensions.attributeSeparator
import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.i
import org.w3c.dom.HTMLElement
import kotlin.browser.document

class MdlFontAwesomeIcon(iconName: String, classes: String = String.empty)
    : MdlComponent<HTMLElement>(document.create.i(classes attributeSeparator "fa fa-$iconName"))
