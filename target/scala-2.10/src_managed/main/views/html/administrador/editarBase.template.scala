
package views.html.administrador

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object editarBase extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[String,Html,Html,Html,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(usuario: String)(content1:Html)(content2:Html)(content3:Html)(content4:Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.administrador.modulo


Seq[Any](format.raw/*1.79*/("""
"""),_display_(Seq[Any](/*3.2*/modulo(usuario)/*3.17*/{_display_(Seq[Any](format.raw/*3.18*/("""
    """),_display_(Seq[Any](/*4.6*/content1)),format.raw/*4.14*/("""
""")))}/*5.2*/{_display_(Seq[Any](format.raw/*5.3*/("""
    """),_display_(Seq[Any](/*6.6*/content2)),format.raw/*6.14*/("""
""")))}/*7.2*/{_display_(Seq[Any](format.raw/*7.3*/("""
    Editar """),_display_(Seq[Any](/*8.13*/content3)),format.raw/*8.21*/("""
""")))}/*9.2*/{_display_(Seq[Any](format.raw/*9.3*/("""

""")))}/*11.2*/{_display_(Seq[Any](format.raw/*11.3*/("""
    """),_display_(Seq[Any](/*12.6*/content4)),format.raw/*12.14*/("""
""")))})))}
    }
    
    def render(usuario:String,content1:Html,content2:Html,content3:Html,content4:Html): play.api.templates.HtmlFormat.Appendable = apply(usuario)(content1)(content2)(content3)(content4)
    
    def f:((String) => (Html) => (Html) => (Html) => (Html) => play.api.templates.HtmlFormat.Appendable) = (usuario) => (content1) => (content2) => (content3) => (content4) => apply(usuario)(content1)(content2)(content3)(content4)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 27 23:42:11 PET 2016
                    SOURCE: /Users/diegodelfin7/Desktop/proy Tienda virtual/tienda/app/views/administrador/editarBase.scala.html
                    HASH: 2ea9881444f374499557549794c0e996d209d6d9
                    MATRIX: 813->1|1024->78|1061->122|1084->137|1122->138|1163->145|1192->153|1212->156|1249->157|1290->164|1319->172|1339->175|1376->176|1425->190|1454->198|1474->201|1511->202|1534->207|1572->208|1614->215|1644->223
                    LINES: 26->1|30->1|31->3|31->3|31->3|32->4|32->4|33->5|33->5|34->6|34->6|35->7|35->7|36->8|36->8|37->9|37->9|39->11|39->11|40->12|40->12
                    -- GENERATED --
                */
            