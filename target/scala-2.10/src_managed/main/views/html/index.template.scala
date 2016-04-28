
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""
"""),_display_(Seq[Any](/*2.2*/main(message)/*2.15*/ {_display_(Seq[Any](format.raw/*2.17*/("""
    <style>
        div.maq"""),format.raw/*4.16*/("""{"""),format.raw/*4.17*/("""
            display:inline-block;
            margin: 10px 5px;
            #padding: 0.5em 10px;
            #border: 2px solid #234b78;
            #width: 180px;
            #height: 200px;
            #text-align: center;
            #font-size: 550%;
            #font-weight: bold;
            #color: #4853C9;
            background-color: #d8d8d8;
        """),format.raw/*16.9*/("""}"""),format.raw/*16.10*/("""
    </style>
    <div id="prueba">

    </div>
    <script>
        function isInView(elem)"""),format.raw/*22.32*/("""{"""),format.raw/*22.33*/("""
            var docViewTop = $(window).scrollTop();
            var docViewBottom = docViewTop + $(window).height();
            var elemTop = $(elem).offset().top;
            var elemBottom = elemTop + $(elem).height();
            //return ((elemBottom <= docViewBottom) && (elemTop >= docViewTop));
            return ((elemTop <= docViewBottom) && (elemTop >= docViewTop))||((elemBottom <= docViewBottom) && (elemBottom >= docViewTop));
        """),format.raw/*29.9*/("""}"""),format.raw/*29.10*/("""
        function isDownView(elem)"""),format.raw/*30.34*/("""{"""),format.raw/*30.35*/("""
            var docViewTop = $(window).scrollTop();
            var docViewBottom = docViewTop + $(window).height();
            var elemTop = $(elem).offset().top;
            var elemBottom = elemTop + $(elem).height();
            return (elemBottom >= docViewBottom)
        """),format.raw/*36.9*/("""}"""),format.raw/*36.10*/("""
        var div='<div class="maq"><img></div>'
        var dim="""),format.raw/*38.17*/("""{"""),format.raw/*38.18*/("""1:"261x170",
            2:"261x113",
            3:"259x194",
            4:"206x214",
            5:"261x194",
            6:"225x225",
            8:"261x176",
            7:"128x223",
            9:"250x190",
            10:"225x225",
            11:"275x183",
            12:"246x204",
            14:"480x480",
            15:"259x194",
            16:"225x225",
            17:"180x153",
            18:"229x225",
            19:"261x146",
            20:"198x225",
            21:"400x400",
            22:"225x225",
            23:"232x225",
            24:"225x225",
            25:"232x200",
            26:"261x189",
            27:"180x162",
            28:"225x225",
            29:"193x225",
            30:"261x194",
            31:"160x214",
            32:"225x225",
            38:"200x210",
            33:"261x172",
            34:"225x225",
            37:"235x211",
            35:"158x225",
            39:"260x200",
            40:"235x223",
            44:"260x195",
            45:"128x212",
            41:"180x210",
            42:"261x156",
            43:"261x166",
            36:"225x224",
            50:"160x160",
            46:"222x225",
            47:"400x255",
            48:"261x201",
            49:"261x192""""),format.raw/*86.25*/("""}"""),format.raw/*86.26*/("""
        var num=1
        function agregar()"""),format.raw/*88.27*/("""{"""),format.raw/*88.28*/("""
            var last=$("#prueba div:last-child")
            while(total>=num && (last[0]==undefined || isInView(last)))"""),format.raw/*90.72*/("""{"""),format.raw/*90.73*/("""
                $("#prueba").append(div)
                last=$("#prueba div:last-child")
                last.width(dim[num].split("x")[0]).height(dim[num].split("x")[1])
                last.find("img").attr("src","/assets/images/memes/"+num+".jpg")
                /*last.find("img").data("num",num)
                last.find("img").load(function()"""),format.raw/*96.49*/("""{"""),format.raw/*96.50*/("""
                    console.log($(this).data("num")+":"+$(this).width()+"x"+$(this).height()+",")
                """),format.raw/*98.17*/("""}"""),format.raw/*98.18*/(""")*/
                num++
                if(num==13)num++
            """),format.raw/*101.13*/("""}"""),format.raw/*101.14*/("""
        """),format.raw/*102.9*/("""}"""),format.raw/*102.10*/("""
        var total=49
        agregar()
        $(window).scroll(function()"""),format.raw/*105.36*/("""{"""),format.raw/*105.37*/("""
            agregar()
        """),format.raw/*107.9*/("""}"""),format.raw/*107.10*/(""")
    </script>
""")))})),format.raw/*109.2*/("""

"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 27 23:42:11 PET 2016
                    SOURCE: /Users/diegodelfin7/Desktop/proy Tienda virtual/tienda/app/views/index.scala.html
                    HASH: def87e4d5527f956adf2fa990bf03ef75c74be7d
                    MATRIX: 774->1|885->18|921->20|942->33|981->35|1036->63|1064->64|1456->429|1485->430|1605->522|1634->523|2112->974|2141->975|2203->1009|2232->1010|2539->1290|2568->1291|2660->1355|2689->1356|3968->2607|3997->2608|4070->2653|4099->2654|4248->2775|4277->2776|4657->3128|4686->3129|4829->3244|4858->3245|4958->3316|4988->3317|5025->3326|5055->3327|5159->3402|5189->3403|5248->3434|5278->3435|5327->3452
                    LINES: 26->1|29->1|30->2|30->2|30->2|32->4|32->4|44->16|44->16|50->22|50->22|57->29|57->29|58->30|58->30|64->36|64->36|66->38|66->38|114->86|114->86|116->88|116->88|118->90|118->90|124->96|124->96|126->98|126->98|129->101|129->101|130->102|130->102|133->105|133->105|135->107|135->107|137->109
                    -- GENERATED --
                */
            