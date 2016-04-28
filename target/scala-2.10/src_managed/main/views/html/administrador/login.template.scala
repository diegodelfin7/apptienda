
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("Login")/*1.15*/{_display_(Seq[Any](format.raw/*1.16*/("""
    <style>
        body """),format.raw/*3.14*/("""{"""),format.raw/*3.15*/("""
            font-family: "Lucida Grande","DejaVu Sans","Bitstream Vera Sans",Verdana,Arial,sans-serif;
        """),format.raw/*5.9*/("""}"""),format.raw/*5.10*/("""
        #container """),format.raw/*6.20*/("""{"""),format.raw/*6.21*/("""
            background: white;
            border: 1px solid #ccc;
            width: 25em;
            margin-left: auto;
            margin-right: auto;
            margin-top: 100px;
        """),format.raw/*13.9*/("""}"""),format.raw/*13.10*/("""
        #header """),format.raw/*14.17*/("""{"""),format.raw/*14.18*/("""
            width: 100%;
            background: #417690;
            color: #ffc;
            overflow: hidden;
        """),format.raw/*19.9*/("""}"""),format.raw/*19.10*/("""
        #branding """),format.raw/*20.19*/("""{"""),format.raw/*20.20*/("""
            float: left;
        """),format.raw/*22.9*/("""}"""),format.raw/*22.10*/("""
        #branding h1, #branding h1 a:link, #branding h1 a:visited """),format.raw/*23.67*/("""{"""),format.raw/*23.68*/("""
            color: #f4f379;
        """),format.raw/*25.9*/("""}"""),format.raw/*25.10*/("""
        #branding h1 """),format.raw/*26.22*/("""{"""),format.raw/*26.23*/("""
            padding: .2em 0 .1em 5em;
            font-size: 18px;
            margin: 8px 1.2em;
            font-weight: normal;
        """),format.raw/*31.9*/("""}"""),format.raw/*31.10*/("""
        #content """),format.raw/*32.18*/("""{"""),format.raw/*32.19*/("""
            margin: 10px 15px;
        """),format.raw/*34.9*/("""}"""),format.raw/*34.10*/("""
        .form-row """),format.raw/*35.19*/("""{"""),format.raw/*35.20*/("""
            padding: 4px 0;
            float: left;
            width: 100%;
        """),format.raw/*39.9*/("""}"""),format.raw/*39.10*/("""
        .form-row label """),format.raw/*40.25*/("""{"""),format.raw/*40.26*/("""
            padding-right: 0.5em;
            line-height: 2em;
            font-size: 1em;
            clear: both;
            font-weight: 500;
        """),format.raw/*46.9*/("""}"""),format.raw/*46.10*/("""
        .form-row input """),format.raw/*47.25*/("""{"""),format.raw/*47.26*/("""
            clear: both;
            padding: 4px;
            width: 100%;
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            box-sizing: border-box;
            border-radius: 5px;
        """),format.raw/*55.9*/("""}"""),format.raw/*55.10*/("""
        .submit-row"""),format.raw/*56.20*/("""{"""),format.raw/*56.21*/("""
            clear: both;
            padding: 1em 0 0 7em;
        """),format.raw/*59.9*/("""}"""),format.raw/*59.10*/("""
    </style>
    <div id="container">
        <div id="header">
            <div id="branding">
                <h1 id="site-name">
                    <a href="/admin">Administración</a>
                </h1>
            </div>
        </div>
        <div id="content">
            <div id="content-main">
                <form style="margin-top: 1em" action="/login" method="post">
                    <div class="form-row">
                        <label>Usuario:</label>
                        <input type="text" name="usuario">
                    </div>
                    <div class="form-row">
                        <label>Contraseña:</label>
                        <input type="password" name="clave">
                    </div>
                    <div class="submit-row">
                        <button type="submit" class="btn btn-primary">Iniciar Sesion</button>
                    </div>
                    """),_display_(Seq[Any](/*83.22*/if(flash.contains("type"))/*83.48*/{_display_(Seq[Any](format.raw/*83.49*/("""
                        <div class="alert alert-"""),_display_(Seq[Any](/*84.50*/{flash.get("type")})),format.raw/*84.69*/("""">
                        """),_display_(Seq[Any](/*85.26*/flash/*85.31*/.get(flash.get("type")))),format.raw/*85.54*/("""
                        </div>
                    """)))})),format.raw/*87.22*/("""
                </form>
            </div>
        </div>
        <div id="footer">
        </div>
    </div>
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 27 23:42:11 PET 2016
                    SOURCE: /Users/diegodelfin7/Desktop/proy Tienda virtual/tienda/app/views/administrador/login.scala.html
                    HASH: 73462a87022a20b1d77e511dc569ce19e7c28fdb
                    MATRIX: 878->1|899->14|937->15|992->43|1020->44|1160->158|1188->159|1236->180|1264->181|1493->383|1522->384|1568->402|1597->403|1751->530|1780->531|1828->551|1857->552|1920->588|1949->589|2045->657|2074->658|2140->697|2169->698|2220->721|2249->722|2421->867|2450->868|2497->887|2526->888|2595->930|2624->931|2672->951|2701->952|2819->1043|2848->1044|2902->1070|2931->1071|3120->1233|3149->1234|3203->1260|3232->1261|3505->1507|3534->1508|3583->1529|3612->1530|3710->1601|3739->1602|4730->2557|4765->2583|4804->2584|4891->2635|4932->2654|4997->2683|5011->2688|5056->2711|5143->2766
                    LINES: 29->1|29->1|29->1|31->3|31->3|33->5|33->5|34->6|34->6|41->13|41->13|42->14|42->14|47->19|47->19|48->20|48->20|50->22|50->22|51->23|51->23|53->25|53->25|54->26|54->26|59->31|59->31|60->32|60->32|62->34|62->34|63->35|63->35|67->39|67->39|68->40|68->40|74->46|74->46|75->47|75->47|83->55|83->55|84->56|84->56|87->59|87->59|111->83|111->83|111->83|112->84|112->84|113->85|113->85|113->85|115->87
                    -- GENERATED --
                */
            