
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(usuario: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.administrador.template


Seq[Any](format.raw/*1.19*/("""
"""),_display_(Seq[Any](/*3.2*/template(usuario)/*3.19*/{_display_(Seq[Any](format.raw/*3.20*/("""
    <style>
        .module"""),format.raw/*5.16*/("""{"""),format.raw/*5.17*/("""
            border: 1px solid #ccc;
            margin-bottom: 5px;
        """),format.raw/*8.9*/("""}"""),format.raw/*8.10*/("""
        .module caption"""),format.raw/*9.24*/("""{"""),format.raw/*9.25*/("""
            margin: 0;
            padding: 2px 5px 3px 5px;
            font-size: 11px;
            text-align: left;
            font-weight: bold;
            background-color: #AEC7E1;
            color: #fff;
        """),format.raw/*17.9*/("""}"""),format.raw/*17.10*/("""
        .module table th """),format.raw/*18.26*/("""{"""),format.raw/*18.27*/("""
            width: 100%;
            text-align: left;
            font-size: 12px;
            font-weight: bold;
        """),format.raw/*23.9*/("""}"""),format.raw/*23.10*/("""
        .module td,th """),format.raw/*24.23*/("""{"""),format.raw/*24.24*/("""
            font-size: 11px;
            line-height: 13px;
            border-bottom: 1px solid #eee;
            vertical-align: top;
            padding: 5px;
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/("""
    </style>
""")))}/*32.2*/{_display_(Seq[Any](format.raw/*32.3*/("""

""")))}/*34.2*/{_display_(Seq[Any](format.raw/*34.3*/("""
    Sitio
""")))}/*36.2*/{_display_(Seq[Any](format.raw/*36.3*/("""

""")))}/*38.2*/{_display_(Seq[Any](format.raw/*38.3*/("""
    <div class="module">
        <table id="modulos" style="width: 100%">
            <caption>Modulos</caption>
            <tbody>
            </tbody>
        </table>
    </div>
    <script>
        var modulos=["Categorias","Productos"]
        var path=["admin/categoria","admin/producto"]
        for(var i in modulos)"""),format.raw/*49.30*/("""{"""),format.raw/*49.31*/("""
            $("#modulos tbody").append('' +
            '<tr>' +
                '<th scope="row">' +
                        '<a href="'+path[i]+'">'+modulos[i]+'</a>' +
                    '</th>' +
                '</tr>'
            )
        """),format.raw/*57.9*/("""}"""),format.raw/*57.10*/("""
        $(".module").parent().css("width","400px")
    </script>
""")))})),format.raw/*60.2*/("""
"""))}
    }
    
    def render(usuario:String): play.api.templates.HtmlFormat.Appendable = apply(usuario)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (usuario) => apply(usuario)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 27 23:42:11 PET 2016
                    SOURCE: /Users/diegodelfin7/Desktop/proy Tienda virtual/tienda/app/views/administrador/index.scala.html
                    HASH: bdc09d995e670f0aa2921c013bb8f5319e282866
                    MATRIX: 788->1|941->18|978->64|1003->81|1041->82|1098->112|1126->113|1232->193|1260->194|1312->219|1340->220|1599->452|1628->453|1683->480|1712->481|1868->610|1897->611|1949->635|1978->636|2182->813|2211->814|2246->831|2284->832|2307->837|2345->838|2377->852|2415->853|2438->858|2476->859|2841->1196|2870->1197|3153->1453|3182->1454|3283->1524
                    LINES: 26->1|30->1|31->3|31->3|31->3|33->5|33->5|36->8|36->8|37->9|37->9|45->17|45->17|46->18|46->18|51->23|51->23|52->24|52->24|58->30|58->30|60->32|60->32|62->34|62->34|64->36|64->36|66->38|66->38|77->49|77->49|85->57|85->57|88->60
                    -- GENERATED --
                */
            