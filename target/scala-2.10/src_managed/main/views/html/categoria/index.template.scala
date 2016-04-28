
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(usuario: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.administrador.listarBase


Seq[Any](format.raw/*1.19*/("""
"""),_display_(Seq[Any](/*3.2*/listarBase(usuario)/*3.21*/{_display_(Seq[Any](format.raw/*3.22*/("""

""")))}/*5.2*/{_display_(Seq[Any](format.raw/*5.3*/("""
    > Categorias
""")))}/*7.2*/{_display_(Seq[Any](format.raw/*7.3*/("""
    categorias
""")))}/*9.2*/{_display_(Seq[Any](format.raw/*9.3*/("""
    <a class="addlink" href="/admin/categoria/agregar">Añadir categoria</a>
""")))}/*11.2*/{_display_(Seq[Any](format.raw/*11.3*/("""
    <div class="actions">
        <label for="searchbar">
            <img src="/assets/images/icon_searchbox.png">
        </label>
        <input id="searchbar" type="search">
        <span>Acción:</span>
        <a id="eliminar">Eliminar</a>
        <span id="action_counter">seleccionados</span>
    </div>
    <div class="results">
        <table id="result_list">
            <thead>
                <tr>
                    <th><input id="check_all" type="checkbox"></th>
                    <th>Nombre</th>
                    <th>Categoria</th>
                </tr>
            </thead>
            <tbody>
            </tbody>
        </table>
    </div>
    <script>
        $.ajax("""),format.raw/*35.16*/("""{"""),format.raw/*35.17*/("""
            type : "POST",
            url : "/admin/categoria/listar",
            async : false,
            data : """),format.raw/*39.20*/("""{"""),format.raw/*39.21*/("""}"""),format.raw/*39.22*/(""",
            success:function(categorias)"""),format.raw/*40.41*/("""{"""),format.raw/*40.42*/("""
                for(var i in categorias)"""),format.raw/*41.41*/("""{"""),format.raw/*41.42*/("""
                    categoria=categorias[i]
                    var tr='<tr data-id="'+categoria.id+'">'
                    tr+='<td>'+'<input type="checkbox">'+'</td>'
                    tr+='<td>'+categoria.nombre+'</td>'
                    tr+='<td>'+categoria.categoria_nombre+'</td>'
                    tr+='</tr>'
                    $("#result_list tbody").append(tr)
                """),format.raw/*49.17*/("""}"""),format.raw/*49.18*/("""
            """),format.raw/*50.13*/("""}"""),format.raw/*50.14*/("""
        """),format.raw/*51.9*/("""}"""),format.raw/*51.10*/(""")
        $("#result_list").dataTable("""),format.raw/*52.37*/("""{"""),format.raw/*52.38*/("""bInfo: false,"paging":false,
            columnDefs: ["""),format.raw/*53.26*/("""{"""),format.raw/*53.27*/("""targets:[0],searchable:false,orderable:false"""),format.raw/*53.71*/("""}"""),format.raw/*53.72*/("""]"""),format.raw/*53.73*/("""}"""),format.raw/*53.74*/(""")
        $("#searchbar").on("keyup click",function()"""),format.raw/*54.52*/("""{"""),format.raw/*54.53*/("""
              $("#result_list").DataTable().search($(this).val()).draw()
        """),format.raw/*56.9*/("""}"""),format.raw/*56.10*/(""")
        $("table.dataTable.no-footer").css("""),format.raw/*57.44*/("""{"""),format.raw/*57.45*/(""""border-bottom":"none""""),format.raw/*57.67*/("""}"""),format.raw/*57.68*/(""")
        $("table.dataTable thead th").css("""),format.raw/*58.43*/("""{"""),format.raw/*58.44*/("""color: "#666","font-size": "11px",border:"1px solid #ddd",padding: "2px 5px""""),format.raw/*58.120*/("""}"""),format.raw/*58.121*/(""")
        $("table.dataTable tbody td").css("""),format.raw/*59.43*/("""{"""),format.raw/*59.44*/("""padding: "5px""""),format.raw/*59.58*/("""}"""),format.raw/*59.59*/(""")
        $("table.dataTable tbody tr").css("""),format.raw/*60.43*/("""{"""),format.raw/*60.44*/("""background: "#EDF3FE""""),format.raw/*60.65*/("""}"""),format.raw/*60.66*/(""")
        $("table.dataTable thead th:first-child").css("""),format.raw/*61.55*/("""{"""),format.raw/*61.56*/(""""background-image":"none""""),format.raw/*61.81*/("""}"""),format.raw/*61.82*/(""")
        $(".dataTables_filter").css("""),format.raw/*62.37*/("""{"""),format.raw/*62.38*/("""display:"none""""),format.raw/*62.52*/("""}"""),format.raw/*62.53*/(""")

        var countChecked = function() """),format.raw/*64.39*/("""{"""),format.raw/*64.40*/("""
            var n = $("table.dataTable tbody tr td:first-child input:checked").length
            var m = $("table.dataTable tbody tr td:first-child input:checkbox").length
            $("#action_counter").text("seleccionados "+n+" de "+m)
        """),format.raw/*68.9*/("""}"""),format.raw/*68.10*/("""
        $("#check_all").change(function()"""),format.raw/*69.42*/("""{"""),format.raw/*69.43*/("""
            $("table.dataTable tbody tr td:first-child input:checkbox").prop("checked",$(this).is(":checked"))
            countChecked()
        """),format.raw/*72.9*/("""}"""),format.raw/*72.10*/(""")
        countChecked()
        $("table.dataTable tbody tr td:first-child input:checkbox").on( "click", countChecked)
        $("#eliminar").click(function()"""),format.raw/*75.40*/("""{"""),format.raw/*75.41*/("""
            var count=$("table.dataTable tbody tr td:first-child input:checked").length
            $("table.dataTable tbody tr td:first-child input:checked").each(function()"""),format.raw/*77.87*/("""{"""),format.raw/*77.88*/("""
                //console.log($(this).closest("tr").attr("data-id"))
                var tr=$(this).closest("tr")
                $.ajax("""),format.raw/*80.24*/("""{"""),format.raw/*80.25*/("""
                    type : "POST",
                    url : "/admin/categoria/eliminar",
                    async : false,
                    data : """),format.raw/*84.28*/("""{"""),format.raw/*84.29*/("""id:tr.attr("data-id")"""),format.raw/*84.50*/("""}"""),format.raw/*84.51*/(""",
                    success:function(categoria)"""),format.raw/*85.48*/("""{"""),format.raw/*85.49*/("""
                    """),format.raw/*86.21*/("""}"""),format.raw/*86.22*/("""
                """),format.raw/*87.17*/("""}"""),format.raw/*87.18*/(""")
                $("#result_list").DataTable().row(tr).remove().draw()
            """),format.raw/*89.13*/("""}"""),format.raw/*89.14*/(""")
            if(count==0)"""),format.raw/*90.25*/("""{"""),format.raw/*90.26*/("""
                $("#content h1:first-child").prev("div.alert").remove()
                $("#content h1:first-child").before('<div class="alert alert-danger">Seleccione una categoria</div>')
            """),format.raw/*93.13*/("""}"""),format.raw/*93.14*/("""
            else"""),format.raw/*94.17*/("""{"""),format.raw/*94.18*/("""
                $("#content h1:first-child").prev("div.alert").remove()
                $("#content h1:first-child").before('<div class="alert alert-success">Las categorias fueron eliminadas</div>')
            """),format.raw/*97.13*/("""}"""),format.raw/*97.14*/("""
            countChecked()
        """),format.raw/*99.9*/("""}"""),format.raw/*99.10*/(""")
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
                    SOURCE: /Users/diegodelfin7/Desktop/proy Tienda virtual/tienda/app/views/categoria/index.scala.html
                    HASH: c881111f22b5e95e56aa8f80a5a3825da20fd12b
                    MATRIX: 784->1|939->18|976->66|1003->85|1041->86|1063->91|1100->92|1138->113|1175->114|1211->133|1248->134|1346->214|1384->215|2131->934|2160->935|2311->1058|2340->1059|2369->1060|2440->1103|2469->1104|2539->1146|2568->1147|3000->1551|3029->1552|3071->1566|3100->1567|3137->1577|3166->1578|3233->1617|3262->1618|3345->1673|3374->1674|3446->1718|3475->1719|3504->1720|3533->1721|3615->1775|3644->1776|3755->1860|3784->1861|3858->1907|3887->1908|3937->1930|3966->1931|4039->1976|4068->1977|4173->2053|4203->2054|4276->2099|4305->2100|4347->2114|4376->2115|4449->2160|4478->2161|4527->2182|4556->2183|4641->2240|4670->2241|4723->2266|4752->2267|4819->2306|4848->2307|4890->2321|4919->2322|4990->2365|5019->2366|5299->2619|5328->2620|5399->2663|5428->2664|5605->2814|5634->2815|5824->2977|5853->2978|6058->3155|6087->3156|6256->3297|6285->3298|6470->3455|6499->3456|6548->3477|6577->3478|6655->3528|6684->3529|6734->3551|6763->3552|6809->3570|6838->3571|6952->3657|6981->3658|7036->3685|7065->3686|7299->3892|7328->3893|7374->3911|7403->3912|7646->4127|7675->4128|7740->4166|7769->4167
                    LINES: 26->1|30->1|31->3|31->3|31->3|33->5|33->5|35->7|35->7|37->9|37->9|39->11|39->11|63->35|63->35|67->39|67->39|67->39|68->40|68->40|69->41|69->41|77->49|77->49|78->50|78->50|79->51|79->51|80->52|80->52|81->53|81->53|81->53|81->53|81->53|81->53|82->54|82->54|84->56|84->56|85->57|85->57|85->57|85->57|86->58|86->58|86->58|86->58|87->59|87->59|87->59|87->59|88->60|88->60|88->60|88->60|89->61|89->61|89->61|89->61|90->62|90->62|90->62|90->62|92->64|92->64|96->68|96->68|97->69|97->69|100->72|100->72|103->75|103->75|105->77|105->77|108->80|108->80|112->84|112->84|112->84|112->84|113->85|113->85|114->86|114->86|115->87|115->87|117->89|117->89|118->90|118->90|121->93|121->93|122->94|122->94|125->97|125->97|127->99|127->99
                    -- GENERATED --
                */
            