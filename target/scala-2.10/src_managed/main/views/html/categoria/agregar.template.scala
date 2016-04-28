
package views.html.categoria

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
object agregar extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(usuario: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.administrador.agregarBase


Seq[Any](format.raw/*1.19*/("""
"""),_display_(Seq[Any](/*3.2*/agregarBase(usuario)/*3.22*/{_display_(Seq[Any](format.raw/*3.23*/("""
    <style>

    </style>
""")))}/*7.2*/{_display_(Seq[Any](format.raw/*7.3*/("""
    > <a href="/admin/categoria">Categorias</a>
""")))}/*9.2*/{_display_(Seq[Any](format.raw/*9.3*/("""
    categoria
""")))}/*11.2*/{_display_(Seq[Any](format.raw/*11.3*/("""
    <div id="categoria">
        <form id="categoriaForm">
            <div class="form-group">
                <label>Nombre</label>
                <input class="vTextField" type="text" id="categoria_nombre" name="nombre">
            </div>
            <div class="form-group">
                <label>Elija categoria padre</label>
                <select id="categoria_lista" name="categorias">
                    <option value>ninguna</option>
                </select>
            </div>
            <input class="vButton" type="button" id="categoria_plus" value="agregar">
        </form>
    </div>
    <script>
        $.ajax("""),format.raw/*28.16*/("""{"""),format.raw/*28.17*/("""
            type : "POST",
            url : "/admin/categoria/listar",
            async : false,
            data : """),format.raw/*32.20*/("""{"""),format.raw/*32.21*/("""}"""),format.raw/*32.22*/(""",
            success:function(categorias)"""),format.raw/*33.41*/("""{"""),format.raw/*33.42*/("""
                $("#categoria_lista").text("")
                $("#categoria_lista").append('<option value>ninguna</option>')
                for(var i in categorias)"""),format.raw/*36.41*/("""{"""),format.raw/*36.42*/("""
                    var categoria=categorias[i]
                    $("#categoria_lista").append('<option value="'+categoria.id+'">'+categoria.nombre+'</option>')
                """),format.raw/*39.17*/("""}"""),format.raw/*39.18*/("""
            """),format.raw/*40.13*/("""}"""),format.raw/*40.14*/("""
        """),format.raw/*41.9*/("""}"""),format.raw/*41.10*/(""")
        $.validator.addMethod(
            "existeCat",
            function(value,element,params) """),format.raw/*44.44*/("""{"""),format.raw/*44.45*/("""
                var error="";
                if(params==true)"""),format.raw/*46.33*/("""{"""),format.raw/*46.34*/("""
                    $.ajax("""),format.raw/*47.28*/("""{"""),format.raw/*47.29*/("""
                        type: "POST",
                        async: false,
                        url: "/admin/categoria/existecategoria",
                        data: """),format.raw/*51.31*/("""{"""),format.raw/*51.32*/("""value:value"""),format.raw/*51.43*/("""}"""),format.raw/*51.44*/(""",
                        success: function(msg)"""),format.raw/*52.47*/("""{"""),format.raw/*52.48*/("""
                            error=msg
                        """),format.raw/*54.25*/("""}"""),format.raw/*54.26*/("""
                    """),format.raw/*55.21*/("""}"""),format.raw/*55.22*/(""")
                """),format.raw/*56.17*/("""}"""),format.raw/*56.18*/("""
                if(error!="")$.validator.messages.existeCat=error
                return error=="";
            """),format.raw/*59.13*/("""}"""),format.raw/*59.14*/("""
        )
        $("#categoriaForm").validate("""),format.raw/*61.38*/("""{"""),format.raw/*61.39*/("""
            rules : """),format.raw/*62.21*/("""{"""),format.raw/*62.22*/("""nombre:"""),format.raw/*62.29*/("""{"""),format.raw/*62.30*/("""required:true,existeCat:true"""),format.raw/*62.58*/("""}"""),format.raw/*62.59*/("""}"""),format.raw/*62.60*/(""",
            errorElement:'div',
            errorPlacement : function ( error, element ) """),format.raw/*64.58*/("""{"""),format.raw/*64.59*/("""
                $ (error).addClass('alert alert-danger').css("""),format.raw/*65.62*/("""{"""),format.raw/*65.63*/("""width: "25em""""),format.raw/*65.76*/("""}"""),format.raw/*65.77*/(""")
                $(element).after(error)
            """),format.raw/*67.13*/("""}"""),format.raw/*67.14*/("""
        """),format.raw/*68.9*/("""}"""),format.raw/*68.10*/(""")
        $("#categoria_plus").click(function()"""),format.raw/*69.46*/("""{"""),format.raw/*69.47*/("""
            if(!$("#categoriaForm").valid())return false
            $.ajax("""),format.raw/*71.20*/("""{"""),format.raw/*71.21*/("""
                type : "POST",
                url : "/admin/categoria/agregar",
                async : false,
                data : """),format.raw/*75.24*/("""{"""),format.raw/*75.25*/("""nombre:$("#categoria_nombre").val(),categoria_id:$("#categoria_lista").val()"""),format.raw/*75.101*/("""}"""),format.raw/*75.102*/(""",
                success:function(categoria)"""),format.raw/*76.44*/("""{"""),format.raw/*76.45*/("""
                    $("#content h1:first-child").prev("div.alert").remove()
                    $("#content h1:first-child").before('<div class="alert alert-success">Se agrego la categoria '+categoria.nombre+'</div>')
                    setTimeout(function()"""),format.raw/*79.42*/("""{"""),format.raw/*79.43*/("""location.href = "/admin/categoria""""),format.raw/*79.77*/("""}"""),format.raw/*79.78*/(""",1000)
                """),format.raw/*80.17*/("""}"""),format.raw/*80.18*/("""
            """),format.raw/*81.13*/("""}"""),format.raw/*81.14*/(""")
        """),format.raw/*82.9*/("""}"""),format.raw/*82.10*/(""")
    </script>
""")))})))}
    }
    
    def render(usuario:String): play.api.templates.HtmlFormat.Appendable = apply(usuario)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (usuario) => apply(usuario)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 27 23:42:11 PET 2016
                    SOURCE: /Users/diegodelfin7/Desktop/proy Tienda virtual/tienda/app/views/categoria/agregar.scala.html
                    HASH: 8cb60fc7b92410a213b17c97005f12c26e58aace
                    MATRIX: 786->1|942->18|979->67|1007->87|1045->88|1094->120|1131->121|1200->173|1237->174|1273->192|1311->193|1992->846|2021->847|2172->970|2201->971|2230->972|2301->1015|2330->1016|2528->1186|2557->1187|2768->1370|2797->1371|2839->1385|2868->1386|2905->1396|2934->1397|3066->1501|3095->1502|3188->1567|3217->1568|3274->1597|3303->1598|3507->1774|3536->1775|3575->1786|3604->1787|3681->1836|3710->1837|3803->1902|3832->1903|3882->1925|3911->1926|3958->1945|3987->1946|4131->2062|4160->2063|4238->2113|4267->2114|4317->2136|4346->2137|4381->2144|4410->2145|4466->2173|4495->2174|4524->2175|4645->2268|4674->2269|4765->2332|4794->2333|4835->2346|4864->2347|4948->2403|4977->2404|5014->2414|5043->2415|5119->2463|5148->2464|5255->2543|5284->2544|5452->2684|5481->2685|5586->2761|5616->2762|5690->2808|5719->2809|6010->3072|6039->3073|6101->3107|6130->3108|6182->3132|6211->3133|6253->3147|6282->3148|6320->3159|6349->3160
                    LINES: 26->1|30->1|31->3|31->3|31->3|35->7|35->7|37->9|37->9|39->11|39->11|56->28|56->28|60->32|60->32|60->32|61->33|61->33|64->36|64->36|67->39|67->39|68->40|68->40|69->41|69->41|72->44|72->44|74->46|74->46|75->47|75->47|79->51|79->51|79->51|79->51|80->52|80->52|82->54|82->54|83->55|83->55|84->56|84->56|87->59|87->59|89->61|89->61|90->62|90->62|90->62|90->62|90->62|90->62|90->62|92->64|92->64|93->65|93->65|93->65|93->65|95->67|95->67|96->68|96->68|97->69|97->69|99->71|99->71|103->75|103->75|103->75|103->75|104->76|104->76|107->79|107->79|107->79|107->79|108->80|108->80|109->81|109->81|110->82|110->82
                    -- GENERATED --
                */
            