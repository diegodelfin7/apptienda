
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
object modulo extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[String,Html,Html,Html,Html,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(usuario: String)(content1:Html)(content2:Html)(content3:Html)(content4:Html)(content5:Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.administrador.template


Seq[Any](format.raw/*1.94*/("""
"""),_display_(Seq[Any](/*3.2*/template(usuario)/*3.19*/{_display_(Seq[Any](format.raw/*3.20*/("""
    <style>
        div.breadcrumbs"""),format.raw/*5.24*/("""{"""),format.raw/*5.25*/("""
            padding: 2px 8px 3px 8px;
            font-size: 11px;
            color: #999;
            border-top: 1px solid #fff;
            border-bottom: 1px solid #ddd;
            #text-align: left;
        """),format.raw/*12.9*/("""}"""),format.raw/*12.10*/("""
        li, dt, dd """),format.raw/*13.20*/("""{"""),format.raw/*13.21*/("""
            font-size: 11px;
            line-height: 14px;
        """),format.raw/*16.9*/("""}"""),format.raw/*16.10*/("""
        .object-tools"""),format.raw/*17.22*/("""{"""),format.raw/*17.23*/("""
            font-size: 10px;
            font-weight: bold;
            font-family: Arial,Helvetica,sans-serif;
            padding-left: 0;
            float: right;
            position: relative;
            margin-top: -2.4em;
            margin-bottom: -2em;
        """),format.raw/*26.9*/("""}"""),format.raw/*26.10*/("""
        .object-tools a.addlink"""),format.raw/*27.32*/("""{"""),format.raw/*27.33*/("""
            background: #999 url(../assets/images/tooltag-add.png) 95% center no-repeat;
            padding-right: 26px;
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/("""
        .object-tools a, .object-tools a:visited """),format.raw/*31.50*/("""{"""),format.raw/*31.51*/("""
            display: block;
            float: left;
            color: #fff;
            padding: .2em 10px;
            background: #999;
        """),format.raw/*37.9*/("""}"""),format.raw/*37.10*/("""
        .object-tools a:hover """),format.raw/*38.31*/("""{"""),format.raw/*38.32*/("""
            background: #5b80b2
        """),format.raw/*40.9*/("""}"""),format.raw/*40.10*/("""
        .object-tools a """),format.raw/*41.25*/("""{"""),format.raw/*41.26*/("""
            border-radius: 15px;
        """),format.raw/*43.9*/("""}"""),format.raw/*43.10*/("""
        h1 """),format.raw/*44.12*/("""{"""),format.raw/*44.13*/("""
            font-size: 18px;
            color: #666;
            padding: 0 6px 0 0;
            margin: 0 0 .2em 0;
        """),format.raw/*49.9*/("""}"""),format.raw/*49.10*/("""
        input[type=text], input[type=password], input[type=email], input[type=url], input[type=number], textarea, select, .vTextField """),format.raw/*50.135*/("""{"""),format.raw/*50.136*/("""
            border: 1px solid #ccc;
        """),format.raw/*52.9*/("""}"""),format.raw/*52.10*/("""
        .vTextField """),format.raw/*53.21*/("""{"""),format.raw/*53.22*/("""
            width: 20em;
        """),format.raw/*55.9*/("""}"""),format.raw/*55.10*/("""
        .vButton """),format.raw/*56.18*/("""{"""),format.raw/*56.19*/("""
            border: 2px solid #5b80b2;
            background: #7CA0C7;#url(/assets/images/default-bg.gif) bottom repeat-x;
            font-weight: bold;
            color: #fff;
            #float: right;
        """),format.raw/*62.9*/("""}"""),format.raw/*62.10*/("""

        .add-row td a"""),format.raw/*64.22*/("""{"""),format.raw/*64.23*/("""
            background: url(/assets/images/icon_addlink.gif) 0 50% no-repeat;
            padding-left: 14px;
            font-size: 11px;
            outline: 0;
        """),format.raw/*69.9*/("""}"""),format.raw/*69.10*/("""
        .inline-deletelink """),format.raw/*70.28*/("""{"""),format.raw/*70.29*/("""
            float: right;
            text-indent: -9999px;
            background: transparent url(/assets/images/inline-delete.png) no-repeat;
            width: 15px;
            height: 15px;
            border: 0px none;
            outline: 0;
        """),format.raw/*78.9*/("""}"""),format.raw/*78.10*/("""
        .inline-deletelink:hover """),format.raw/*79.34*/("""{"""),format.raw/*79.35*/("""
            background-position: -15px 0px
        """),format.raw/*81.9*/("""}"""),format.raw/*81.10*/("""
        td.padd """),format.raw/*82.17*/("""{"""),format.raw/*82.18*/("""
            padding-top: 5px;
            #padding-bottom: 5px;
        """),format.raw/*85.9*/("""}"""),format.raw/*85.10*/("""
        td.padd input[type='text'] """),format.raw/*86.36*/("""{"""),format.raw/*86.37*/("""
            width: 17em;
        """),format.raw/*88.9*/("""}"""),format.raw/*88.10*/("""
        div.well """),format.raw/*89.18*/("""{"""),format.raw/*89.19*/("""
            width: 150px;
            margin-top: 10px;
            padding: 10px;
        """),format.raw/*93.9*/("""}"""),format.raw/*93.10*/("""
        #draganddrop"""),format.raw/*94.21*/("""{"""),format.raw/*94.22*/("""
            border: 2px dashed #92AAB0;
            #height: 50px;
            color: #92AAB0;
            text-align: center;
            vertical-align: middle;
            font-size: 110%;
            font-weight: bold;
            #display: table-cell;
        """),format.raw/*103.9*/("""}"""),format.raw/*103.10*/("""
    </style>
    """),_display_(Seq[Any](/*105.6*/content1)),format.raw/*105.14*/("""
""")))}/*106.2*/{_display_(Seq[Any](format.raw/*106.3*/("""
    <div class="breadcrumbs">
        <a href="/admin">Inicio</a>
        """),_display_(Seq[Any](/*109.10*/content2)),format.raw/*109.18*/("""
    </div>
""")))}/*111.2*/{_display_(Seq[Any](format.raw/*111.3*/("""
    """),_display_(Seq[Any](/*112.6*/content3)),format.raw/*112.14*/("""
""")))}/*113.2*/{_display_(Seq[Any](format.raw/*113.3*/("""
    """),_display_(Seq[Any](/*114.6*/content4)),format.raw/*114.14*/("""
""")))}/*115.2*/{_display_(Seq[Any](format.raw/*115.3*/("""
    """),_display_(Seq[Any](/*116.6*/content5)),format.raw/*116.14*/("""
""")))})))}
    }
    
    def render(usuario:String,content1:Html,content2:Html,content3:Html,content4:Html,content5:Html): play.api.templates.HtmlFormat.Appendable = apply(usuario)(content1)(content2)(content3)(content4)(content5)
    
    def f:((String) => (Html) => (Html) => (Html) => (Html) => (Html) => play.api.templates.HtmlFormat.Appendable) = (usuario) => (content1) => (content2) => (content3) => (content4) => (content5) => apply(usuario)(content1)(content2)(content3)(content4)(content5)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 27 23:42:11 PET 2016
                    SOURCE: /Users/diegodelfin7/Desktop/proy Tienda virtual/tienda/app/views/administrador/modulo.scala.html
                    HASH: 0e5a1386e24d852faefefe015a76275e037bec1d
                    MATRIX: 814->1|1042->93|1079->139|1104->156|1142->157|1207->195|1235->196|1484->418|1513->419|1562->440|1591->441|1690->513|1719->514|1770->537|1799->538|2109->821|2138->822|2199->855|2228->856|2389->990|2418->991|2497->1042|2526->1043|2708->1198|2737->1199|2797->1231|2826->1232|2896->1275|2925->1276|2979->1302|3008->1303|3079->1347|3108->1348|3149->1361|3178->1362|3337->1494|3366->1495|3531->1631|3561->1632|3635->1679|3664->1680|3714->1702|3743->1703|3806->1739|3835->1740|3882->1759|3911->1760|4160->1982|4189->1983|4242->2008|4271->2009|4475->2186|4504->2187|4561->2216|4590->2217|4884->2484|4913->2485|4976->2520|5005->2521|5086->2575|5115->2576|5161->2594|5190->2595|5293->2671|5322->2672|5387->2709|5416->2710|5479->2746|5508->2747|5555->2766|5584->2767|5707->2863|5736->2864|5786->2886|5815->2887|6118->3162|6148->3163|6205->3184|6236->3192|6258->3195|6297->3196|6413->3275|6444->3283|6478->3298|6517->3299|6560->3306|6591->3314|6613->3317|6652->3318|6695->3325|6726->3333|6748->3336|6787->3337|6830->3344|6861->3352
                    LINES: 26->1|30->1|31->3|31->3|31->3|33->5|33->5|40->12|40->12|41->13|41->13|44->16|44->16|45->17|45->17|54->26|54->26|55->27|55->27|58->30|58->30|59->31|59->31|65->37|65->37|66->38|66->38|68->40|68->40|69->41|69->41|71->43|71->43|72->44|72->44|77->49|77->49|78->50|78->50|80->52|80->52|81->53|81->53|83->55|83->55|84->56|84->56|90->62|90->62|92->64|92->64|97->69|97->69|98->70|98->70|106->78|106->78|107->79|107->79|109->81|109->81|110->82|110->82|113->85|113->85|114->86|114->86|116->88|116->88|117->89|117->89|121->93|121->93|122->94|122->94|131->103|131->103|133->105|133->105|134->106|134->106|137->109|137->109|139->111|139->111|140->112|140->112|141->113|141->113|142->114|142->114|143->115|143->115|144->116|144->116
                    -- GENERATED --
                */
            