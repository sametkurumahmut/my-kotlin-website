package site.pages

import kotlinmdl.components.MdlLayoutContent
import kotlinmdl.internal.extensions.styleAttribute
import site.res.static.Img

object About : MdlLayoutContent("About", body = {
    this.element.styleAttribute = "background: url('${Img.ME}') center / cover; filter: alpha(opacity=61);"
})
