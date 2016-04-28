
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
object listarBase extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[String,Html,Html,Html,Html,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(usuario: String)(content1:Html)(content2:Html)(content3:Html)(content4:Html)(content5:Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.administrador.modulo


Seq[Any](format.raw/*1.94*/("""
"""),_display_(Seq[Any](/*3.2*/modulo(usuario)/*3.17*/{_display_(Seq[Any](format.raw/*3.18*/("""
    """),_display_(Seq[Any](/*4.6*/content1)),format.raw/*4.14*/("""
""")))}/*5.2*/{_display_(Seq[Any](format.raw/*5.3*/("""
    """),_display_(Seq[Any](/*6.6*/content2)),format.raw/*6.14*/("""
""")))}/*7.2*/{_display_(Seq[Any](format.raw/*7.3*/("""
    Listar """),_display_(Seq[Any](/*8.13*/content3)),format.raw/*8.21*/("""
""")))}/*9.2*/{_display_(Seq[Any](format.raw/*9.3*/("""
    <ul class="object-tools">
        <li>
            """),_display_(Seq[Any](/*12.14*/content4)),format.raw/*12.22*/("""
        </li>
    </ul>
""")))}/*15.2*/{_display_(Seq[Any](format.raw/*15.3*/("""
    """),_display_(Seq[Any](/*16.6*/content5)),format.raw/*16.14*/("""
""")))})))}
    }
    
    def render(usuario:String,content1:Html,content2:Html,content3:Html,content4:Html,content5:Html): play.api.templates.HtmlFormat.Appendable = apply(usuario)(content1)(content2)(content3)(content4)(content5)
    
    def f:((String) => (Html) => (Html) => (Html) => (Html) => (Html) => play.api.templates.HtmlFormat.Appendable) = (usuario) => (content1) => (content2) => (content3) => (content4) => (content5) => apply(usuario)(content1)(content2)(content3)(content4)(content5)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 27 23:42:11 PET 2016
                    SOURCE: /Users/diegodelfin7/Desktop/proy Tienda virtual/tienda/app/views/administrador/listarBase.scala.html
                    HASH: a71f5c000608dce870d5520a847bd16742b63c05
                    MATRIX: 818->1|1044->93|1081->137|1104->152|1142->153|1183->160|1212->168|1232->171|1269->172|1310->179|1339->187|1359->190|1396->191|1445->205|1474->213|1494->216|1531->217|1627->277|1657->285|1704->314|1742->315|1784->322|1814->330
                    LINES: 26->1|30->1|31->3|31->3|31->3|32->4|32->4|33->5|33->5|34->6|34->6|35->7|35->7|36->8|36->8|37->9|37->9|40->12|40->12|43->15|43->15|44->16|44->16
                    -- GENERATED --
                */
            