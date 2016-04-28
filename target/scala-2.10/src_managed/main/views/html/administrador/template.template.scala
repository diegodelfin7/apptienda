
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
object template extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[String,Html,Html,Html,Html,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(usuario: String)(content1: Html)(content2: Html)(content3: Html)(content4: Html)(content5: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.99*/("""
"""),_display_(Seq[Any](/*2.2*/main("Administrador")/*2.23*/{_display_(Seq[Any](format.raw/*2.24*/("""
    <style>
        #header """),format.raw/*4.17*/("""{"""),format.raw/*4.18*/("""
            width: 100%;
            background: #417690;
            color: #ffc;
            overflow: hidden;
        """),format.raw/*9.9*/("""}"""),format.raw/*9.10*/("""
        #branding """),format.raw/*10.19*/("""{"""),format.raw/*10.20*/("""
            float: left;
        """),format.raw/*12.9*/("""}"""),format.raw/*12.10*/("""
        #branding h1, #branding h1 a:link, #branding h1 a:visited """),format.raw/*13.67*/("""{"""),format.raw/*13.68*/("""
            color: #f4f379;
        """),format.raw/*15.9*/("""}"""),format.raw/*15.10*/("""
        #branding h1 """),format.raw/*16.22*/("""{"""),format.raw/*16.23*/("""
            padding: 0 10px;
            font-size: 18px;
            margin: 8px 0;
            font-weight: normal;
        """),format.raw/*21.9*/("""}"""),format.raw/*21.10*/("""
        #user-tools """),format.raw/*22.21*/("""{"""),format.raw/*22.22*/("""
            float: right;
            padding: 1.2em 10px;
            font-size: 11px;
            text-align: right;
        """),format.raw/*27.9*/("""}"""),format.raw/*27.10*/("""
        #user-tools a:hover """),format.raw/*28.29*/("""{"""),format.raw/*28.30*/("""
            text-decoration: underline
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/("""
        #header a:link, #header a:visited """),format.raw/*31.43*/("""{"""),format.raw/*31.44*/("""
            color: #fff;
        """),format.raw/*33.9*/("""}"""),format.raw/*33.10*/("""
        #content """),format.raw/*34.18*/("""{"""),format.raw/*34.19*/("""
            margin: 10px 15px;
        """),format.raw/*36.9*/("""}"""),format.raw/*36.10*/("""
    </style>
    """),_display_(Seq[Any](/*38.6*/content1)),format.raw/*38.14*/("""
    <div id="header">
        <div id="branding">
            <h1 id="site-name">
                <a href="/admin">Administrador xD</a>
            </h1>
        </div>
        <div id="user-tools">
            Bienvenido/a,<strong>"""),_display_(Seq[Any](/*46.35*/usuario)),format.raw/*46.42*/(""". </strong><a href="/admin/logout">Cerrar sesión</a>
        </div>
    </div>
    """),_display_(Seq[Any](/*49.6*/content2)),format.raw/*49.14*/("""
    <div id="content">
        <h1>"""),_display_(Seq[Any](/*51.14*/content3)),format.raw/*51.22*/("""</h1>
        <div id="content-main">
            """),_display_(Seq[Any](/*53.14*/content4)),format.raw/*53.22*/("""
            """),_display_(Seq[Any](/*54.14*/content5)),format.raw/*54.22*/("""
        </div>
    </div>
    <div id="footer">
    </div>
""")))})))}
    }
    
    def render(usuario:String,content1:Html,content2:Html,content3:Html,content4:Html,content5:Html): play.api.templates.HtmlFormat.Appendable = apply(usuario)(content1)(content2)(content3)(content4)(content5)
    
    def f:((String) => (Html) => (Html) => (Html) => (Html) => (Html) => play.api.templates.HtmlFormat.Appendable) = (usuario) => (content1) => (content2) => (content3) => (content4) => (content5) => apply(usuario)(content1)(content2)(content3)(content4)(content5)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 27 23:42:11 PET 2016
                    SOURCE: /Users/diegodelfin7/Desktop/proy Tienda virtual/tienda/app/views/administrador/template.scala.html
                    HASH: ebea006910e4a43b46559dc3718d9f58d929700f
                    MATRIX: 816->1|1007->98|1044->101|1073->122|1111->123|1169->154|1197->155|1350->282|1378->283|1426->303|1455->304|1518->340|1547->341|1643->409|1672->410|1738->449|1767->450|1818->473|1847->474|2006->606|2035->607|2085->629|2114->630|2274->763|2303->764|2361->794|2390->795|2467->845|2496->846|2568->890|2597->891|2660->927|2689->928|2736->947|2765->948|2834->990|2863->991|2919->1012|2949->1020|3227->1262|3256->1269|3378->1356|3408->1364|3483->1403|3513->1411|3602->1464|3632->1472|3683->1487|3713->1495
                    LINES: 26->1|29->1|30->2|30->2|30->2|32->4|32->4|37->9|37->9|38->10|38->10|40->12|40->12|41->13|41->13|43->15|43->15|44->16|44->16|49->21|49->21|50->22|50->22|55->27|55->27|56->28|56->28|58->30|58->30|59->31|59->31|61->33|61->33|62->34|62->34|64->36|64->36|66->38|66->38|74->46|74->46|77->49|77->49|79->51|79->51|81->53|81->53|82->54|82->54
                    -- GENERATED --
                */
            