
package views.html

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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("css/bootstrap.min.css"))),format.raw/*8.95*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("DataTables-1.10.0/media/css/jquery.dataTables.min.css"))),format.raw/*9.127*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png"))),format.raw/*10.97*/("""">
        <script src=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("js/jquery.min.js"))),format.raw/*11.59*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("DataTables-1.10.0/media/js/jquery.dataTables.min.js"))),format.raw/*12.94*/("""" type="text/javascript"></script>
        <script src="/assets/jquery-validation-1.13.0/dist/jquery.validate.min.js" type="text/javascript"></script>
        <script src="/assets/jquery-validation-1.13.0/dist/localization/messages_es.js" type="text/javascript"></script>
        <style>
            body"""),format.raw/*16.17*/("""{"""),format.raw/*16.18*/("""
                font-family: "Lucida Grande","DejaVu Sans","Bitstream Vera Sans",Verdana,Arial,sans-serif;
            """),format.raw/*18.13*/("""}"""),format.raw/*18.14*/("""
            .alert"""),format.raw/*19.19*/("""{"""),format.raw/*19.20*/("""
                padding-top:5px;padding-bottom:5px;
                margin-top:5px;margin-bottom:5px;
                cursor: pointer;
            """),format.raw/*23.13*/("""}"""),format.raw/*23.14*/("""
            a:link, a:visited"""),format.raw/*24.30*/("""{"""),format.raw/*24.31*/("""
                color: #5b80b2;
                text-decoration: none;
            """),format.raw/*27.13*/("""}"""),format.raw/*27.14*/("""
            a:hover"""),format.raw/*28.20*/("""{"""),format.raw/*28.21*/("""
                color: #1051A8;
                cursor: pointer;
                text-decoration: none;
            """),format.raw/*32.13*/("""}"""),format.raw/*32.14*/("""
        </style>
    </head>
    <body>
        """),_display_(Seq[Any](/*36.10*/content)),format.raw/*36.17*/("""
    </body>
    <script>
        $('body').click(function(e)"""),format.raw/*39.36*/("""{"""),format.raw/*39.37*/("""
            if(e.target.tagName=="DIV" && $(e.target).hasClass('alert'))"""),format.raw/*40.73*/("""{"""),format.raw/*40.74*/("""
                $(e.target).fadeOut("slow",function()"""),format.raw/*41.54*/("""{"""),format.raw/*41.55*/("""
                    $(e.target).remove()
                """),format.raw/*43.17*/("""}"""),format.raw/*43.18*/(""")
            """),format.raw/*44.13*/("""}"""),format.raw/*44.14*/("""
        """),format.raw/*45.9*/("""}"""),format.raw/*45.10*/(""")
    </script>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 27 23:42:11 PET 2016
                    SOURCE: /Users/diegodelfin7/Desktop/proy Tienda virtual/tienda/app/views/main.scala.html
                    HASH: 911eb50f216c1868ca1a3594cd209afb38ade884
                    MATRIX: 778->1|902->31|990->84|1016->89|1113->151|1127->157|1183->192|1274->248|1288->254|1377->321|1474->382|1489->388|1543->420|1604->445|1619->451|1671->481|1764->538|1779->544|1866->609|2198->913|2227->914|2375->1034|2404->1035|2451->1054|2480->1055|2656->1203|2685->1204|2743->1234|2772->1235|2884->1319|2913->1320|2961->1340|2990->1341|3135->1458|3164->1459|3250->1509|3279->1516|3368->1577|3397->1578|3498->1651|3527->1652|3609->1706|3638->1707|3724->1765|3753->1766|3795->1780|3824->1781|3860->1790|3889->1791
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|44->16|44->16|46->18|46->18|47->19|47->19|51->23|51->23|52->24|52->24|55->27|55->27|56->28|56->28|60->32|60->32|64->36|64->36|67->39|67->39|68->40|68->40|69->41|69->41|71->43|71->43|72->44|72->44|73->45|73->45
                    -- GENERATED --
                */
            