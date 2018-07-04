import kotlinmdl.components.MdlLayoutTitle
import kotlinmdl.components.dslish.fixedDrawer
import kotlinmdl.components.dslish.fixedHeader
import kotlinmdl.components.dslish.mdlLayout
import kotlinmdl.components.dslish.row
import site.app
import site.pages.About

fun main(args: Array<String>) {
    app {
        mdlLayout("layout") {
            val initialContent = About
            val headerTitle = MdlLayoutTitle(initialContent.title)
            fixedHeader { row { +headerTitle } }
            fixedDrawer("drawer") {

            }
            content = initialContent
        }
    }
}
