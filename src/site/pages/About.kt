package site.pages

import kotlinmdl.components.MdlLayoutContent
import kotlinmdl.components.dslish.*
import kotlinmdl.components.style.MdlMaterialIcons
import kotlinmdl.internal.extensions.styleAttribute
import kotlinmdl.style.MdlCellColSize
import kotlinmdl.style.MdlShadow
import kotlinx.html.dom.create
import kotlinx.html.id
import kotlinx.html.iframe
import kotlinx.html.js.br
import kotlinx.html.js.img
import site.kotlinmdl.components.dslish.fontAwesomeIcon
import site.res.static.Img
import site.style.FontAwesomeIcons
import kotlin.browser.document

object About : MdlLayoutContent("About", body = {
    this.element.styleAttribute = "background: url('${Img.ME}') center / cover; filter: alpha(opacity=61);"

    grid {
        cardCell(MdlCellColSize.S4, shadow = MdlShadow.DP2, classes = "card-square") {
            title(isExpandable = true) {
                this.element.styleAttribute = "background: url('${Img.HARD_CODED_GENERATOR_SHOWCASE}') center / cover; background-position: 90% 90%; background-repeat: no-repeat;"
            }
            supportingText("Unity3D API lets developers use hard-coded values (string, integer, etc.), however they are not generally useful in terms of flexibility and maintainability. As an example, when you change or remove a hard-coded value through Unity Editor, you are not notified if it is referenced from number of locations in your project. The beauty of Hard-Coded Generator is that when you modify a hard-coded value, it notifies you of any misspellings or missing references via Unity console.") {
                +document.create.br()
                +document.create.br()
                +"Hard-Coded Generator detects automatically hard-coded values and generates an assembly containing them. And, this tool is published on Unity Asset Store."
            }
            actions(true) {
                iconButtonExternalLink(href = "https://github.com/sametkurumahmut/hardcodedgenerator") {
                    fontAwesomeIcon(FontAwesomeIcons.GITHUB)
                }
                iconButtonExternalLink(href = "http://u3d.as/pFG") {
                    +document.create.img("Unity Logo", Img.UNITY_LOGO, "mini-icon-btn")
                }
                iconButtonExternalLink(MdlMaterialIcons.language(), "https://sametkurumahmut.github.io/hardcodedgenerator/")
            }
        }
        cardCell(MdlCellColSize.S4, shadow = MdlShadow.DP2, classes = "card-square") {
            title(isExpandable = true, classes = "embed-responsive embed-responsive-16by9") {
                val iframe = document.create.iframe(classes = "embed-responsive-item") {
                    id = "youtube-player"
                    src = "https://www.youtube.com/embed/y9SQ1N6-Z_M?enablejsapi=1&amp;theme=light"
                }
                iframe.setAttribute("allowfullscreen", "true")
                iframe.setAttribute("frameborder", "1")
                +iframe
            }
            supportingText("Unity3D gives you an option to store serializable data container classes into custom asset files. But you have to always write extra code for any of your classes that inherit ScriptableObject to generate custom asset of that class.") {
                +document.create.br()
                +document.create.br()
                +"Custom Asset Generator detects automatically the classes and generate menu item paths under \"Assets/Create/Custom Assets/\". And, this tool is published on Unity Asset Store."
            }
            actions(true) {
                iconButtonExternalLink(href = "https://github.com/sametkurumahmut/CustomAssetGenerator") {
                    fontAwesomeIcon(FontAwesomeIcons.GITHUB)
                }
                iconButtonExternalLink(href = "http://u3d.as/jsk") {
                    +document.create.img("Unity Logo", Img.UNITY_LOGO, "mini-icon-btn")
                }
                iconButtonExternalLink(MdlMaterialIcons.language(), "https://sametkurumahmut.github.io/CustomAssetGenerator/")
            }
        }
    }
})
