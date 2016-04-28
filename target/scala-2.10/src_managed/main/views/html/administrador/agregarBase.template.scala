
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
object agregarBase extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[String,Html,Html,Html,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(usuario: String)(content1:Html)(content2:Html)(content3:Html)(content4:Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.administrador.modulo


Seq[Any](format.raw/*1.79*/("""
"""),_display_(Seq[Any](/*3.2*/modulo(usuario)/*3.17*/{_display_(Seq[Any](format.raw/*3.18*/("""
    """),_display_(Seq[Any](/*4.6*/content1)),format.raw/*4.14*/("""
""")))}/*5.2*/{_display_(Seq[Any](format.raw/*5.3*/("""
    """),_display_(Seq[Any](/*6.6*/content2)),format.raw/*6.14*/("""
    > Añadir """),_display_(Seq[Any](/*7.15*/content3)),format.raw/*7.23*/("""
""")))}/*8.2*/{_display_(Seq[Any](format.raw/*8.3*/("""
    Añadir """),_display_(Seq[Any](/*9.13*/content3)),format.raw/*9.21*/("""
""")))}/*10.2*/{_display_(Seq[Any](format.raw/*10.3*/("""

""")))}/*12.2*/{_display_(Seq[Any](format.raw/*12.3*/("""
    """),_display_(Seq[Any](/*13.6*/content4)),format.raw/*13.14*/("""
""")))})),format.raw/*14.2*/("""
"""))}
    }
    
    def render(usuario:String,content1:Html,content2:Html,content3:Html,content4:Html): play.api.templates.HtmlFormat.Appendable = apply(usuario)(content1)(content2)(content3)(content4)
    
    def f:((String) => (Html) => (Html) => (Html) => (Html) => play.api.templates.HtmlFormat.Appendable) = (usuario) => (content1) => (content2) => (content3) => (content4) => apply(usuario)(content1)(content2)(content3)(content4)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 27 23:42:11 PET 2016
                    SOURCE: /Users/diegodelfin7/Desktop/proy Tienda virtual/tienda/app/views/administrador/agregarBase.scala.html
                    HASH: 3b530afcf5968b9209dc315b2ad05e90c8e4863a
                    MATRIX: 814->1|1025->78|1062->122|1085->137|1123->138|1164->145|1193->153|1213->156|1250->157|1291->164|1320->172|1371->188|1400->196|1420->199|1457->200|1506->214|1535->222|1556->225|1594->226|1617->231|1655->232|1697->239|1727->247|1761->250
                    LINES: 26->1|30->1|31->3|31->3|31->3|32->4|32->4|33->5|33->5|34->6|34->6|35->7|35->7|36->8|36->8|37->9|37->9|38->10|38->10|40->12|40->12|41->13|41->13|42->14
                    -- GENERATED --
                */
            