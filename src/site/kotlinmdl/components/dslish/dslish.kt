package site.kotlinmdl.components.dslish

import kotlinmdl.components.IMdlComponent
import kotlinmdl.extensions.plus
import kotlinmdl.internal.extensions.empty
import org.w3c.dom.Element
import site.kotlinmdl.components.MdlFontAwesomeIcon

//region Mdl Component Extensions
fun <T : Element> IMdlComponent<T>.fontAwesomeIcon(
        iconName: String,
        classes: String = String.empty,
        block: MdlFontAwesomeIcon.() -> Unit = {}) = this + MdlFontAwesomeIcon(iconName, classes).apply(block)
//endregion

//region Element Extensions
fun Element.mdlFontAwesomeIcon(
        iconName: String,
        classes: String = String.empty,
        block: MdlFontAwesomeIcon.() -> Unit = {}) = this + MdlFontAwesomeIcon(iconName, classes).apply(block)
//endregion
