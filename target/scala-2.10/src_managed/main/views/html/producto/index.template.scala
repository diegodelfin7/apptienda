
package views.html.producto

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
    <style>
        thead th, tfoot td """),format.raw/*5.28*/("""{"""),format.raw/*5.29*/("""
            #background: #e1e1e1 url(../img/nav-bg.gif) top left repeat-x;
        """),format.raw/*7.9*/("""}"""),format.raw/*7.10*/("""
        td, th """),format.raw/*8.16*/("""{"""),format.raw/*8.17*/("""
            font-size: 11px;
            line-height: 13px;
            border-bottom: 1px solid #eee;
            vertical-align: top;
            padding: 5px;
            font-family: "Lucida Grande", Verdana, Arial, sans-serif;
        """),format.raw/*15.9*/("""}"""),format.raw/*15.10*/("""
        table tbody td """),format.raw/*16.24*/("""{"""),format.raw/*16.25*/("""
            border-left: 1px solid #ddd;
        """),format.raw/*18.9*/("""}"""),format.raw/*18.10*/("""
        .actions """),format.raw/*19.18*/("""{"""),format.raw/*19.19*/("""
            padding: 3px;
            border-top: 1px solid #ddd;
            border-left: 1px solid #ddd;
            border-right: 1px solid #ddd;
            #background: white url(../img/nav-bg-reverse.gif) 0 -10px repeat-x;
        """),format.raw/*25.9*/("""}"""),format.raw/*25.10*/("""
        .actions span"""),format.raw/*26.22*/("""{"""),format.raw/*26.23*/("""
            color: #999;
            font-size: 11px;
            margin: 0 0.5em;
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/("""
        .actions a"""),format.raw/*31.19*/("""{"""),format.raw/*31.20*/("""
            font-size: 12px;
        """),format.raw/*33.9*/("""}"""),format.raw/*33.10*/("""
        #searchbar"""),format.raw/*34.19*/("""{"""),format.raw/*34.20*/("""
            height: 20px;
            vertical-align: middle;
        """),format.raw/*37.9*/("""}"""),format.raw/*37.10*/("""
    </style>
""")))}/*39.2*/{_display_(Seq[Any](format.raw/*39.3*/("""
    > Productos
""")))}/*41.2*/{_display_(Seq[Any](format.raw/*41.3*/("""
    productos
""")))}/*43.2*/{_display_(Seq[Any](format.raw/*43.3*/("""
    <a class="addlink" href="/admin/producto/agregar">Añadir producto</a>
""")))}/*45.2*/{_display_(Seq[Any](format.raw/*45.3*/("""
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
                    <th>Modelo</th>
                    <th>Color</th>
                    <th>Marca</th>
                    <th>Precio</th>
                    <th>Descuento</th>
                    <th>Precio actual</th>
                    <th>Categoria</th>
                    <th>Caracteristicas</th>
                    <th>Especificaciones</th>
                    <th>Imagen</th>
                </tr>
            </thead>
            <tbody>
            </tbody>
        </table>
    </div>
    <script>
        $.ajax("""),format.raw/*77.16*/("""{"""),format.raw/*77.17*/("""
            type : "POST",
            url : "/admin/producto/listar",
            async : false,
            data : """),format.raw/*81.20*/("""{"""),format.raw/*81.21*/("""}"""),format.raw/*81.22*/(""",
            success:function(productos)"""),format.raw/*82.40*/("""{"""),format.raw/*82.41*/("""
                for(var i in productos)"""),format.raw/*83.40*/("""{"""),format.raw/*83.41*/("""
                    producto=productos[i]
                    var tr='<tr data-id="'+producto.id+'">'
                    tr+='<td>'+'<input type="checkbox">'+'</td>'
                    tr+='<td>'+'<a href="/admin/producto/'+producto.id+'">'+producto.modelo+'</a>'+'</td>'
                    tr+='<td>'+producto.color+'</td>'
                    tr+='<td>'+producto.marca+'</td>'
                    tr+='<td>'+producto.precio+'</td>'
                    tr+='<td>'+producto.descuento+'%</td>'
                    tr+='<td>'+producto.precio_actual+'</td>'
                    tr+='<td>'+producto.categoria_nombre+'</td>'
                    tr+='<td>'+producto.caracteristicas.split(",")[0]+'</td>'
                    tr+='<td>'+producto.especificaciones.split(",")[0]+'</td>'
                    tr+='<td>'+producto.image+'</td>'
                    tr+='</tr>'
                    $("#result_list tbody").append(tr)
                    $("#result_list tbody tr:last-child td:nth-child(9)").data("car",producto.caracteristicas)
                    $("#result_list tbody tr:last-child td:nth-child(10)").data("esp",producto.especificaciones)
                """),format.raw/*101.17*/("""}"""),format.raw/*101.18*/("""
            """),format.raw/*102.13*/("""}"""),format.raw/*102.14*/("""
        """),format.raw/*103.9*/("""}"""),format.raw/*103.10*/(""")
        $("#result_list").dataTable("""),format.raw/*104.37*/("""{"""),format.raw/*104.38*/("""bInfo: false,"paging":false,
            columnDefs: ["""),format.raw/*105.26*/("""{"""),format.raw/*105.27*/("""targets:[0],searchable:false,orderable:false"""),format.raw/*105.71*/("""}"""),format.raw/*105.72*/("""]"""),format.raw/*105.73*/("""}"""),format.raw/*105.74*/(""")
        $("#searchbar").on("keyup click",function()"""),format.raw/*106.52*/("""{"""),format.raw/*106.53*/("""
              $("#result_list").DataTable().search($(this).val()).draw()
        """),format.raw/*108.9*/("""}"""),format.raw/*108.10*/(""")
        $("table.dataTable.no-footer").css("""),format.raw/*109.44*/("""{"""),format.raw/*109.45*/(""""border-bottom":"none""""),format.raw/*109.67*/("""}"""),format.raw/*109.68*/(""")
        $("table.dataTable thead th").css("""),format.raw/*110.43*/("""{"""),format.raw/*110.44*/("""color: "#666","font-size": "11px",border:"1px solid #ddd",padding: "2px 5px""""),format.raw/*110.120*/("""}"""),format.raw/*110.121*/(""")
        $("table.dataTable tbody td").css("""),format.raw/*111.43*/("""{"""),format.raw/*111.44*/("""padding: "5px""""),format.raw/*111.58*/("""}"""),format.raw/*111.59*/(""")
        $("table.dataTable tbody tr").css("""),format.raw/*112.43*/("""{"""),format.raw/*112.44*/("""background: "#EDF3FE""""),format.raw/*112.65*/("""}"""),format.raw/*112.66*/(""")
        $("table.dataTable thead th:first-child").css("""),format.raw/*113.55*/("""{"""),format.raw/*113.56*/(""""background-image":"none""""),format.raw/*113.81*/("""}"""),format.raw/*113.82*/(""")
        $(".dataTables_filter").css("""),format.raw/*114.37*/("""{"""),format.raw/*114.38*/("""display:"none""""),format.raw/*114.52*/("""}"""),format.raw/*114.53*/(""")

        $("table.dataTable tbody tr td:nth-child(9),table.dataTable tbody tr td:nth-child(10)," +
            "table.dataTable tbody tr td:nth-child(11)").css("""),format.raw/*117.62*/("""{"""),format.raw/*117.63*/("""cursor: "pointer""""),format.raw/*117.80*/("""}"""),format.raw/*117.81*/(""")
        $("table.dataTable tbody tr td:nth-child(9)").hover(function()"""),format.raw/*118.71*/("""{"""),format.raw/*118.72*/("""
            if($(this).find("div").length==0)"""),format.raw/*119.46*/("""{"""),format.raw/*119.47*/("""
                 var div='<div style="position:absolute;margin-top: 6px;background: rgb(237, 243, 254);' +
                 'border-left: 1px solid #ddd;border-right: 1px solid #ddd;border-bottom: 1px solid #ddd;"></div>'
                $(this).append(div)
                //$(this).find("div").width($(this).width())
                for(var i in $(this).data("car").split(","))"""),format.raw/*124.61*/("""{"""),format.raw/*124.62*/("""
                    if(i!=0)$(this).find(">div").append('<div>'+$(this).data("car").split(",")[i]+'</div>')
                """),format.raw/*126.17*/("""}"""),format.raw/*126.18*/("""
            """),format.raw/*127.13*/("""}"""),format.raw/*127.14*/("""
        """),format.raw/*128.9*/("""}"""),format.raw/*128.10*/(""",function()"""),format.raw/*128.21*/("""{"""),format.raw/*128.22*/("""
            $(this).find("div").remove()
        """),format.raw/*130.9*/("""}"""),format.raw/*130.10*/(""")
        $("table.dataTable tbody tr td:nth-child(10)").hover(function()"""),format.raw/*131.72*/("""{"""),format.raw/*131.73*/("""
            if($(this).find("div").length==0)"""),format.raw/*132.46*/("""{"""),format.raw/*132.47*/("""
                var div='<div style="position:absolute;margin-top: 6px;background: rgb(237, 243, 254);' +
                'border-left: 1px solid #ddd;border-right: 1px solid #ddd;border-bottom: 1px solid #ddd;"></div>'
                $(this).append(div)
                //$(this).find("div").width($(this).width())
                for(var i in $(this).data("esp").split(","))"""),format.raw/*137.61*/("""{"""),format.raw/*137.62*/("""
                    if(i!=0)$(this).find(">div").append('<div>'+$(this).data("esp").split(",")[i]+'</div>')
                """),format.raw/*139.17*/("""}"""),format.raw/*139.18*/("""
            """),format.raw/*140.13*/("""}"""),format.raw/*140.14*/("""
        """),format.raw/*141.9*/("""}"""),format.raw/*141.10*/(""",function()"""),format.raw/*141.21*/("""{"""),format.raw/*141.22*/("""
            $(this).find("div").remove()
        """),format.raw/*143.9*/("""}"""),format.raw/*143.10*/(""")
        $("table.dataTable tbody tr td:nth-child(11)").hover(function()"""),format.raw/*144.72*/("""{"""),format.raw/*144.73*/("""
            if($(this).find("div").length==0 && $(this).text()!="")"""),format.raw/*145.68*/("""{"""),format.raw/*145.69*/("""
                var div='<div style="position:absolute;margin-top: 30px;"></div>'
                var img='<img width=100 src="/assets/productos/'+$(this).text()+'">'
                $(this).append(div)
                $(this).find("div").append(img)
            """),format.raw/*150.13*/("""}"""),format.raw/*150.14*/("""
        """),format.raw/*151.9*/("""}"""),format.raw/*151.10*/(""",function()"""),format.raw/*151.21*/("""{"""),format.raw/*151.22*/("""
            $(this).find("div").remove()
        """),format.raw/*153.9*/("""}"""),format.raw/*153.10*/(""")
        var countChecked = function() """),format.raw/*154.39*/("""{"""),format.raw/*154.40*/("""
            var n = $("table.dataTable tbody tr td:first-child input:checked").length
            var m = $("table.dataTable tbody tr td:first-child input:checkbox").length
            $("#action_counter").text("seleccionados "+n+" de "+m)
        """),format.raw/*158.9*/("""}"""),format.raw/*158.10*/("""
        $("#check_all").change(function()"""),format.raw/*159.42*/("""{"""),format.raw/*159.43*/("""
            $("table.dataTable tbody tr td:first-child input:checkbox").prop("checked",$(this).is(":checked"))
            countChecked()
        """),format.raw/*162.9*/("""}"""),format.raw/*162.10*/(""")
        countChecked()
        $("table.dataTable tbody tr td:first-child input:checkbox").on( "click", countChecked)
        $("#eliminar").click(function()"""),format.raw/*165.40*/("""{"""),format.raw/*165.41*/("""
            var count=$("table.dataTable tbody tr td:first-child input:checked").length
            $("table.dataTable tbody tr td:first-child input:checked").each(function()"""),format.raw/*167.87*/("""{"""),format.raw/*167.88*/("""
                //console.log($(this).closest("tr").attr("data-id"))
                var tr=$(this).closest("tr")
                $.ajax("""),format.raw/*170.24*/("""{"""),format.raw/*170.25*/("""
                    type : "POST",
                    url : "/admin/producto/eliminar",
                    async : false,
                    data : """),format.raw/*174.28*/("""{"""),format.raw/*174.29*/("""id:tr.attr("data-id")"""),format.raw/*174.50*/("""}"""),format.raw/*174.51*/(""",
                    success:function(producto)"""),format.raw/*175.47*/("""{"""),format.raw/*175.48*/("""
                    """),format.raw/*176.21*/("""}"""),format.raw/*176.22*/("""
                """),format.raw/*177.17*/("""}"""),format.raw/*177.18*/(""")
                $("#result_list").DataTable().row(tr).remove().draw()
            """),format.raw/*179.13*/("""}"""),format.raw/*179.14*/(""")
            if(count==0)"""),format.raw/*180.25*/("""{"""),format.raw/*180.26*/("""
                $("#content h1:first-child").prev("div.alert").remove()
                $("#content h1:first-child").before('<div class="alert alert-danger">Seleccione un producto</div>')
            """),format.raw/*183.13*/("""}"""),format.raw/*183.14*/("""
            else"""),format.raw/*184.17*/("""{"""),format.raw/*184.18*/("""
                $("#content h1:first-child").prev("div.alert").remove()
                $("#content h1:first-child").before('<div class="alert alert-success">Los productos fueron eliminados</div>')
            """),format.raw/*187.13*/("""}"""),format.raw/*187.14*/("""
            countChecked()
        """),format.raw/*189.9*/("""}"""),format.raw/*189.10*/(""")
    </script>
""")))})))}
    }
    
    def render(usuario:String): play.api.templates.HtmlFormat.Appendable = apply(usuario)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (usuario) => apply(usuario)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 27 23:42:12 PET 2016
                    SOURCE: /Users/diegodelfin7/Desktop/proy Tienda virtual/tienda/app/views/producto/index.scala.html
                    HASH: e0477f1da9db9cfe303ca24e37fa7065b41fee5d
                    MATRIX: 783->1|938->18|975->66|1002->85|1040->86|1109->128|1137->129|1249->215|1277->216|1321->233|1349->234|1624->482|1653->483|1706->508|1735->509|1814->561|1843->562|1890->581|1919->582|2190->826|2219->827|2270->850|2299->851|2422->947|2451->948|2499->968|2528->969|2595->1009|2624->1010|2672->1030|2701->1031|2802->1105|2831->1106|2866->1123|2904->1124|2942->1144|2980->1145|3016->1163|3054->1164|3150->1242|3188->1243|4258->2285|4287->2286|4437->2408|4466->2409|4495->2410|4565->2452|4594->2453|4663->2494|4692->2495|5901->3675|5931->3676|5974->3690|6004->3691|6042->3701|6072->3702|6140->3741|6170->3742|6254->3797|6284->3798|6357->3842|6387->3843|6417->3844|6447->3845|6530->3899|6560->3900|6672->3984|6702->3985|6777->4031|6807->4032|6858->4054|6888->4055|6962->4100|6992->4101|7098->4177|7129->4178|7203->4223|7233->4224|7276->4238|7306->4239|7380->4284|7410->4285|7460->4306|7490->4307|7576->4364|7606->4365|7660->4390|7690->4391|7758->4430|7788->4431|7831->4445|7861->4446|8055->4611|8085->4612|8131->4629|8161->4630|8263->4703|8293->4704|8369->4751|8399->4752|8813->5137|8843->5138|8999->5265|9029->5266|9072->5280|9102->5281|9140->5291|9170->5292|9210->5303|9240->5304|9320->5356|9350->5357|9453->5431|9483->5432|9559->5479|9589->5480|10001->5863|10031->5864|10187->5991|10217->5992|10260->6006|10290->6007|10328->6017|10358->6018|10398->6029|10428->6030|10508->6082|10538->6083|10641->6157|10671->6158|10769->6227|10799->6228|11097->6497|11127->6498|11165->6508|11195->6509|11235->6520|11265->6521|11345->6573|11375->6574|11445->6615|11475->6616|11756->6869|11786->6870|11858->6913|11888->6914|12066->7064|12096->7065|12287->7227|12317->7228|12523->7405|12553->7406|12723->7547|12753->7548|12938->7704|12968->7705|13018->7726|13048->7727|13126->7776|13156->7777|13207->7799|13237->7800|13284->7818|13314->7819|13429->7905|13459->7906|13515->7933|13545->7934|13778->8138|13808->8139|13855->8157|13885->8158|14128->8372|14158->8373|14224->8411|14254->8412
                    LINES: 26->1|30->1|31->3|31->3|31->3|33->5|33->5|35->7|35->7|36->8|36->8|43->15|43->15|44->16|44->16|46->18|46->18|47->19|47->19|53->25|53->25|54->26|54->26|58->30|58->30|59->31|59->31|61->33|61->33|62->34|62->34|65->37|65->37|67->39|67->39|69->41|69->41|71->43|71->43|73->45|73->45|105->77|105->77|109->81|109->81|109->81|110->82|110->82|111->83|111->83|129->101|129->101|130->102|130->102|131->103|131->103|132->104|132->104|133->105|133->105|133->105|133->105|133->105|133->105|134->106|134->106|136->108|136->108|137->109|137->109|137->109|137->109|138->110|138->110|138->110|138->110|139->111|139->111|139->111|139->111|140->112|140->112|140->112|140->112|141->113|141->113|141->113|141->113|142->114|142->114|142->114|142->114|145->117|145->117|145->117|145->117|146->118|146->118|147->119|147->119|152->124|152->124|154->126|154->126|155->127|155->127|156->128|156->128|156->128|156->128|158->130|158->130|159->131|159->131|160->132|160->132|165->137|165->137|167->139|167->139|168->140|168->140|169->141|169->141|169->141|169->141|171->143|171->143|172->144|172->144|173->145|173->145|178->150|178->150|179->151|179->151|179->151|179->151|181->153|181->153|182->154|182->154|186->158|186->158|187->159|187->159|190->162|190->162|193->165|193->165|195->167|195->167|198->170|198->170|202->174|202->174|202->174|202->174|203->175|203->175|204->176|204->176|205->177|205->177|207->179|207->179|208->180|208->180|211->183|211->183|212->184|212->184|215->187|215->187|217->189|217->189
                    -- GENERATED --
                */
            