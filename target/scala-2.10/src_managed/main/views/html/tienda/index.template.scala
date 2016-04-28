
package views.html.tienda

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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Cliente,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String,cliente: Cliente):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.tienda.template


Seq[Any](format.raw/*1.36*/("""
"""),_display_(Seq[Any](/*3.2*/template(message,cliente)/*3.27*/{_display_(Seq[Any](format.raw/*3.28*/("""
    <style>
        .dfa-banner """),format.raw/*5.21*/("""{"""),format.raw/*5.22*/("""
            position: relative;
        """),format.raw/*7.9*/("""}"""),format.raw/*7.10*/("""
        a.home-cta """),format.raw/*8.20*/("""{"""),format.raw/*8.21*/("""
            background: rgba(255, 255, 255, 0.7);
            opacity:0;
            height: 100%;
            left: 0;
            position: absolute;
            top: 0;
            width: 100%;
        """),format.raw/*16.9*/("""}"""),format.raw/*16.10*/("""
        .home-cta span """),format.raw/*17.24*/("""{"""),format.raw/*17.25*/("""
            background: #4386A1;
            border-radius: 3px;
            color: #FFFFFF;
            font: 14px function-pro;
            left: 32%;
            padding: 6px;
            position: absolute;
            text-align: center;
            text-decoration: none;
            text-transform: uppercase;
            top: 42%;
            width: 96px;
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/("""
    </style>
""")))}/*32.2*/{_display_(Seq[Any](format.raw/*32.3*/("""
    <div id="b1">
        <div id="b1_1">

        </div>
    </div>
    <div>
        <div class="dfa-banner" style="width: 290px; height: 195px;">
            <img height="195" src="/assets/promociones/20150225-bt4-tecno-gocamaras.jpg" width="290">
            <a class="home-cta" href="/categoria/camaras-digitales">
                <span>Compra ya</span>
            </a></div>
    </div>
    <script>
        imgb1=["VH-1-200215.jpg","VH-2-200215.jpg","VH-rosen-120215.jpg","VH-4-190215.jpg","VH-5-200215.jpg"]
        w=365*2
        h=186*2
        for(var i in imgb1)"""),format.raw/*49.28*/("""{"""),format.raw/*49.29*/("""
            $("#b1_1").append('<div><a><img src="/assets/promociones/'+imgb1[i]+'">'+'</a></div>')
        """),format.raw/*51.9*/("""}"""),format.raw/*51.10*/("""
        $("#b1_1 div:nth-child(1) img").click(function()"""),format.raw/*52.57*/("""{"""),format.raw/*52.58*/("""
            location.href="/categoria/televisores"
        """),format.raw/*54.9*/("""}"""),format.raw/*54.10*/(""")
        $("#b1").css("""),format.raw/*55.22*/("""{"""),format.raw/*55.23*/("""width:w,height:h,overflow:"hidden","margin-top": "30px""""),format.raw/*55.78*/("""}"""),format.raw/*55.79*/(""")
        $("#b1_1").css("""),format.raw/*56.24*/("""{"""),format.raw/*56.25*/("""width:w*5,height:h,"transform":"translateX(0px)""""),format.raw/*56.73*/("""}"""),format.raw/*56.74*/(""")
        $("#b1_1>div").css("""),format.raw/*57.28*/("""{"""),format.raw/*57.29*/("""float:"left""""),format.raw/*57.41*/("""}"""),format.raw/*57.42*/(""")
        $("#b1_1 img").prop("""),format.raw/*58.29*/("""{"""),format.raw/*58.30*/("""width:w,height:h"""),format.raw/*58.46*/("""}"""),format.raw/*58.47*/(""")
        var index=1
        setInterval(function()"""),format.raw/*60.31*/("""{"""),format.raw/*60.32*/("""
            $("#b1_1").css("""),format.raw/*61.28*/("""{"""),format.raw/*61.29*/(""""transform":"translateX(-"+index*w+"px)","transition-duration":"0.5s""""),format.raw/*61.98*/("""}"""),format.raw/*61.99*/(""")
            if(Transform($("#b1_1"))[4]<-w*3)"""),format.raw/*62.46*/("""{"""),format.raw/*62.47*/("""
                $("#b1_1").css("""),format.raw/*63.32*/("""{"""),format.raw/*63.33*/(""""transform":"translateX(-0px)","transition-duration":"0s""""),format.raw/*63.90*/("""}"""),format.raw/*63.91*/(""")
                index=0;
            """),format.raw/*65.13*/("""}"""),format.raw/*65.14*/("""
            index++;
        """),format.raw/*67.9*/("""}"""),format.raw/*67.10*/(""",4000)
        function Transform(elem)"""),format.raw/*68.33*/("""{"""),format.raw/*68.34*/("""
            return matrixToArray($(elem).css("transform"))
        """),format.raw/*70.9*/("""}"""),format.raw/*70.10*/("""
        function webkitTrans(elem)"""),format.raw/*71.35*/("""{"""),format.raw/*71.36*/("""
            return matrixToArray($(elem).css("-webkit-transform"))
        """),format.raw/*73.9*/("""}"""),format.raw/*73.10*/("""
        function mozTrans(elem)"""),format.raw/*74.32*/("""{"""),format.raw/*74.33*/("""
            return matrixToArray($(elem).css("-moz-transform"))
        """),format.raw/*76.9*/("""}"""),format.raw/*76.10*/("""
        function matrixToArray(str)"""),format.raw/*77.36*/("""{"""),format.raw/*77.37*/("""
            return str.split('(')[1].split(')')[0].split(',');
        """),format.raw/*79.9*/("""}"""),format.raw/*79.10*/("""
        $(".dfa-banner").hover(function()"""),format.raw/*80.42*/("""{"""),format.raw/*80.43*/("""
            $(".home-cta").animate("""),format.raw/*81.36*/("""{"""),format.raw/*81.37*/("""opacity:1"""),format.raw/*81.46*/("""}"""),format.raw/*81.47*/(""",400)
        """),format.raw/*82.9*/("""}"""),format.raw/*82.10*/(""",function()"""),format.raw/*82.21*/("""{"""),format.raw/*82.22*/("""
            $(".home-cta").animate("""),format.raw/*83.36*/("""{"""),format.raw/*83.37*/("""opacity:0"""),format.raw/*83.46*/("""}"""),format.raw/*83.47*/(""",300)
        """),format.raw/*84.9*/("""}"""),format.raw/*84.10*/(""")
    </script>
""")))})))}
    }
    
    def render(message:String,cliente:Cliente): play.api.templates.HtmlFormat.Appendable = apply(message,cliente)
    
    def f:((String,Cliente) => play.api.templates.HtmlFormat.Appendable) = (message,cliente) => apply(message,cliente)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 27 23:42:13 PET 2016
                    SOURCE: /Users/diegodelfin7/Desktop/proy Tienda virtual/tienda/app/views/tienda/index.scala.html
                    HASH: 02e39b1be14586cb869a4b6d474f0674cd148edb
                    MATRIX: 789->1|952->35|989->74|1022->99|1060->100|1122->135|1150->136|1219->179|1247->180|1295->201|1323->202|1564->416|1593->417|1646->442|1675->443|2088->829|2117->830|2152->847|2190->848|2811->1441|2840->1442|2977->1552|3006->1553|3092->1611|3121->1612|3210->1674|3239->1675|3291->1699|3320->1700|3403->1755|3432->1756|3486->1782|3515->1783|3591->1831|3620->1832|3678->1862|3707->1863|3747->1875|3776->1876|3835->1907|3864->1908|3908->1924|3937->1925|4019->1979|4048->1980|4105->2009|4134->2010|4231->2079|4260->2080|4336->2128|4365->2129|4426->2162|4455->2163|4540->2220|4569->2221|4638->2262|4667->2263|4726->2295|4755->2296|4823->2336|4852->2337|4949->2407|4978->2408|5042->2444|5071->2445|5176->2523|5205->2524|5266->2557|5295->2558|5397->2633|5426->2634|5491->2671|5520->2672|5621->2746|5650->2747|5721->2790|5750->2791|5815->2828|5844->2829|5881->2838|5910->2839|5952->2854|5981->2855|6020->2866|6049->2867|6114->2904|6143->2905|6180->2914|6209->2915|6251->2930|6280->2931
                    LINES: 26->1|30->1|31->3|31->3|31->3|33->5|33->5|35->7|35->7|36->8|36->8|44->16|44->16|45->17|45->17|58->30|58->30|60->32|60->32|77->49|77->49|79->51|79->51|80->52|80->52|82->54|82->54|83->55|83->55|83->55|83->55|84->56|84->56|84->56|84->56|85->57|85->57|85->57|85->57|86->58|86->58|86->58|86->58|88->60|88->60|89->61|89->61|89->61|89->61|90->62|90->62|91->63|91->63|91->63|91->63|93->65|93->65|95->67|95->67|96->68|96->68|98->70|98->70|99->71|99->71|101->73|101->73|102->74|102->74|104->76|104->76|105->77|105->77|107->79|107->79|108->80|108->80|109->81|109->81|109->81|109->81|110->82|110->82|110->82|110->82|111->83|111->83|111->83|111->83|112->84|112->84
                    -- GENERATED --
                */
            