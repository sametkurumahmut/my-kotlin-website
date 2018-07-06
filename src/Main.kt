import kotlinmdl.components.MdlLayoutTitle
import kotlinmdl.components.dslish.*
import kotlinmdl.components.style.MdlMaterialIcons
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

                nav("navigation") {
                    link {
                        +MdlMaterialIcons.accountCircle()
                        +About.title
                        element.onclick = {
                            content = initialContent
                            headerTitle.title = content!!.title
                            null
                        }
                    }
                }
            }
            content = initialContent
        }
    }
}
