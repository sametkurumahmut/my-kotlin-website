import kotlinmdl.components.MdlLayoutTitle
import kotlinmdl.components.dslish.fixedDrawer
import kotlinmdl.components.dslish.fixedHeader
import kotlinmdl.components.dslish.mdlLayout
import kotlinmdl.components.dslish.row
import kotlinmdl.material.style.MaterialShade
import kotlinmdl.style.MdlColor
import kotlinx.html.b
import kotlinx.html.dom.create
import kotlinx.html.img
import kotlinx.html.js.header
import site.app
import site.pages.About
import site.res.static.Img
import kotlin.browser.document

fun main(args: Array<String>) {
    app {
        mdlLayout("layout") {
            val initialContent = About
            val headerTitle = MdlLayoutTitle(initialContent.title)
            fixedHeader { row { +headerTitle } }
            fixedDrawer("drawer") {
                +document.create.header("drawer-header ${MdlColor.Background.BlueGrey(MaterialShade.Primary.S300())}") {
                    img("Avatar", Img.AVATAR, "avatar")
                    b { +"Samet Kurumahmut" }
                    +"Mobile Developer"
                }
            }
            content = initialContent
        }
    }
}
