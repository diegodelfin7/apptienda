
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
object editar extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Producto,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(usuario: String,producto: Producto):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.administrador.editarBase


Seq[Any](format.raw/*1.38*/("""
"""),_display_(Seq[Any](/*3.2*/editarBase(usuario)/*3.21*/{_display_(Seq[Any](format.raw/*3.22*/("""

""")))}/*5.2*/{_display_(Seq[Any](format.raw/*5.3*/("""
    > <a href="/admin/producto">Productos</a>
""")))}/*7.2*/{_display_(Seq[Any](format.raw/*7.3*/("""
    producto
""")))}/*9.2*/{_display_(Seq[Any](format.raw/*9.3*/("""
    <div id="producto">
        <form id="productoForm">
            <div class="form-group">
                <label>Modelo</label>
                <input type="text" id="producto_modelo" name="modelo" value=""""),_display_(Seq[Any](/*14.79*/{producto.modelo})),format.raw/*14.96*/("""" maxlength="100">
            </div>
             <div class="form-group">
                <label>Color</label>
                <input type="text" id="producto_color" name="color" value=""""),_display_(Seq[Any](/*18.77*/{producto.color})),format.raw/*18.93*/("""" maxlength="20">
            </div>
            <div class="form-group">
                <label>Marca</label>
                <input type="text" id="producto_marca" name="marca" value=""""),_display_(Seq[Any](/*22.77*/{producto.marca})),format.raw/*22.93*/("""" maxlength="40">
            </div>
            <div class="form-group">
                <label>Precio</label>
                <input type="text" id="producto_precio" name="precio" value=""""),_display_(Seq[Any](/*26.79*/{producto.precio})),format.raw/*26.96*/("""" maxlength="10">
            </div>
            <div class="form-group">
                <label>Descuento</label>
                <input type="text" id="producto_descuento" name="descuento" value=""""),_display_(Seq[Any](/*30.85*/{producto.descuento})),format.raw/*30.105*/("""" maxlength="2">
            </div>
            <div class="form-group">
                <table id="caracteristicas">
                    <thead>
                        <tr>
                            <th>Caracteristicas principales</th>
                        </tr>
                        <tr>
                            <th style="font-size: 11px">caracteristica</th>
                        </tr>
                    </thead>
                    <tbody>
                        """),_display_(Seq[Any](/*43.26*/if(Producto.caracteristicas(producto.id)!="")/*43.71*/{_display_(Seq[Any](format.raw/*43.72*/("""
                            """),_display_(Seq[Any](/*44.30*/for(caracteristica <- Producto.caracteristicas(producto.id).split(",")) yield /*44.101*/{_display_(Seq[Any](format.raw/*44.102*/("""
                                <tr><td class="padd"><input type="text" value=""""),_display_(Seq[Any](/*45.81*/{caracteristica})),format.raw/*45.97*/(""""><a class="inline-deletelink">Eliminar</a></td></tr>
                            """)))})),format.raw/*46.30*/("""
                        """)))})),format.raw/*47.26*/("""
                        <tr class="add-row">
                            <td><a href="javascript:void(0)">Agregar caracteristica adicional</a></td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <div class="form-group">
                <table id="especificaciones">
                    <thead>
                        <tr>
                            <th>Especificaciones</th>
                        </tr>
                        <tr>
                            <th style="font-size: 11px">nombre</th>
                            <th style="font-size: 11px">descripcion</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr class="add-row">
                            <td><a href="javascript:void(0)">Agregar especificacion adicional</a></td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <div class="form-group">
                <label>Elija la categoria</label>
                <select id="producto_cat_lista" name="categorias">
                    """),_display_(Seq[Any](/*75.22*/for(categoria <- Categoria.find.all()) yield /*75.60*/{_display_(Seq[Any](format.raw/*75.61*/("""
                        """),_display_(Seq[Any](/*76.26*/if(categoria.id==producto.categoria().id)/*76.67*/{_display_(Seq[Any](format.raw/*76.68*/("""
                            <option value=""""),_display_(Seq[Any](/*77.45*/{categoria.id})),format.raw/*77.59*/("""" selected>"""),_display_(Seq[Any](/*77.71*/categoria/*77.80*/.nombre)),format.raw/*77.87*/("""</option>    
                        """)))})),format.raw/*78.26*/("""
                        else"""),format.raw/*79.29*/("""{"""),format.raw/*79.30*/("""
                            <option value=""""),_display_(Seq[Any](/*80.45*/{categoria.id})),format.raw/*80.59*/("""">"""),_display_(Seq[Any](/*80.62*/categoria/*80.71*/.nombre)),format.raw/*80.78*/("""</option>
                        """),format.raw/*81.25*/("""}"""),format.raw/*81.26*/("""
                    """)))})),format.raw/*82.22*/("""
                </select>
            </div>          
            <div class="form-group">
                <label>Imagen</label>
                <input type="file" id="imagenFile" value="abrir">
                <div class="well">
                    <div id="draganddrop">Arrastre y suelte la imagen</div>
                    <img id="imagen">
                </div>
                <input class="vButton" type="button" id="producto_edit" value="editar">
            </div>
        </form>
    </div>
    <script>
        var modelo=""""),_display_(Seq[Any](/*97.22*/{producto.modelo})),format.raw/*97.39*/(""""
        $("a:contains('Productos')").after("> "+modelo)
        $("#content>h1:first-child").css("margin-left","2em")//.css("text-align","center").css("margin-left","-10%")
        $("#producto").css("margin-left","2em")
        $("#producto div.form-group label").width("10em")
        $("#producto input[type='text']").width("15em")
        $("#caracteristicas tbody,#especificaciones tbody").click(function(e)"""),format.raw/*103.78*/("""{"""),format.raw/*103.79*/("""
            if($(e.target).is("a"))"""),format.raw/*104.36*/("""{"""),format.raw/*104.37*/("""
                var tr=$(e.target).closest("tr")
                $(tr).not(".add-row").remove()
            """),format.raw/*107.13*/("""}"""),format.raw/*107.14*/("""
        """),format.raw/*108.9*/("""}"""),format.raw/*108.10*/(""")
        $("#caracteristicas tr.add-row a").click(function()"""),format.raw/*109.60*/("""{"""),format.raw/*109.61*/("""
            var tr=$(this).closest("tr")
            $(tr).before('<tr><td class="padd"><input type="text"><a class="inline-deletelink">Eliminar</a></td></tr>')
        """),format.raw/*112.9*/("""}"""),format.raw/*112.10*/(""")
        $("#especificaciones tr.add-row a").click(function()"""),format.raw/*113.61*/("""{"""),format.raw/*113.62*/("""
            var tr=$(this).closest("tr")
            $(tr).before('<tr><td class="padd"><input type="text"></td><td class="padd"><input type="text"><a class="inline-deletelink">Eliminar</a></td></tr>')
        """),format.raw/*116.9*/("""}"""),format.raw/*116.10*/(""")
        var especificaciones=""""),_display_(Seq[Any](/*117.32*/{Producto.especificaciones(producto.id)})),format.raw/*117.72*/(""""
        if(especificaciones!="")"""),format.raw/*118.33*/("""{"""),format.raw/*118.34*/("""
            for(var i in especificaciones.split(","))"""),format.raw/*119.54*/("""{"""),format.raw/*119.55*/("""
                $("#especificaciones tr.add-row").before('<tr>' +
                '<td class="padd"><input type="text" value="'+especificaciones.split(",")[i].split(":")[0]+'">'+'</td>' +
                '<td class="padd"><input type="text" value="'+especificaciones.split(",")[i].split(":")[1]+'">'+'<a class="inline-deletelink">Eliminar</a></td></tr>')
            """),format.raw/*123.13*/("""}"""),format.raw/*123.14*/("""
        """),format.raw/*124.9*/("""}"""),format.raw/*124.10*/("""
        $("#draganddrop").on("dragenter",function(e)"""),format.raw/*125.53*/("""{"""),format.raw/*125.54*/("""
            e.stopPropagation()
            e.preventDefault()
            $(this).css("""),format.raw/*128.25*/("""{"""),format.raw/*128.26*/("""border:"2px solid #0B85A1""""),format.raw/*128.52*/("""}"""),format.raw/*128.53*/(""")
        """),format.raw/*129.9*/("""}"""),format.raw/*129.10*/(""")
        $("#draganddrop").on("dragleave",function(e)"""),format.raw/*130.53*/("""{"""),format.raw/*130.54*/("""
            e.stopPropagation()
            e.preventDefault()
            $(this).css("""),format.raw/*133.25*/("""{"""),format.raw/*133.26*/("""border:"2px dashed #0B85A1""""),format.raw/*133.53*/("""}"""),format.raw/*133.54*/(""")
        """),format.raw/*134.9*/("""}"""),format.raw/*134.10*/(""")
        var file=null
        $("#draganddrop").on("drop",function(e)"""),format.raw/*136.48*/("""{"""),format.raw/*136.49*/("""
            e.stopPropagation()
            e.preventDefault()
            $(this).css("""),format.raw/*139.25*/("""{"""),format.raw/*139.26*/("""border:"2px dashed #0B85A1""""),format.raw/*139.53*/("""}"""),format.raw/*139.54*/(""")
            //file = e.target.files[0]
            file = e.originalEvent.dataTransfer.files[0]
            imageType = /image.*/;
            if (file==undefined || !file.type.match(imageType))
                return;

            var reader = new FileReader();
            cargarImagen(reader)
            reader.readAsDataURL(file)
        """),format.raw/*149.9*/("""}"""),format.raw/*149.10*/(""")
        $(document).on('dragenter dragover drop', function (e)"""),format.raw/*150.63*/("""{"""),format.raw/*150.64*/("""
            e.stopPropagation()
            e.preventDefault()
        """),format.raw/*153.9*/("""}"""),format.raw/*153.10*/(""")
        $("#imagenFile").change(function()"""),format.raw/*154.43*/("""{"""),format.raw/*154.44*/("""
            if (this.files && this.files[0]) """),format.raw/*155.46*/("""{"""),format.raw/*155.47*/("""
                file=this.files[0]
                var reader = new FileReader();
                cargarImagen(reader)
                reader.readAsDataURL(file);
            """),format.raw/*160.13*/("""}"""),format.raw/*160.14*/("""
        """),format.raw/*161.9*/("""}"""),format.raw/*161.10*/(""")
        function cargarImagen(reader)"""),format.raw/*162.38*/("""{"""),format.raw/*162.39*/("""
            reader.onload = function (e) """),format.raw/*163.42*/("""{"""),format.raw/*163.43*/("""
                dimensionarImagen(e.target.result)
            """),format.raw/*165.13*/("""}"""),format.raw/*165.14*/("""
        """),format.raw/*166.9*/("""}"""),format.raw/*166.10*/("""
        function dimensionarImagen(src)"""),format.raw/*167.40*/("""{"""),format.raw/*167.41*/("""
            var parent=$("#imagen").parent();
            $("#imagen").remove()
            parent.append('<img id="imagen">')
            $("#imagen").attr("src",src);
            parent.width($("#imagen").width()>parent.width()?$("#imagen").width():$("#imagen").width()<150?150:$("#imagen").width())
            $("#draganddrop").css("""),format.raw/*173.35*/("""{"""),format.raw/*173.36*/(""""max-width":200,"height":60,margin:"auto""""),format.raw/*173.77*/("""}"""),format.raw/*173.78*/(""")
        """),format.raw/*174.9*/("""}"""),format.raw/*174.10*/("""
        $("#productoForm").validate("""),format.raw/*175.37*/("""{"""),format.raw/*175.38*/("""
            rules : """),format.raw/*176.21*/("""{"""),format.raw/*176.22*/("""modelo:"""),format.raw/*176.29*/("""{"""),format.raw/*176.30*/("""required:true"""),format.raw/*176.43*/("""}"""),format.raw/*176.44*/(""",color:"""),format.raw/*176.51*/("""{"""),format.raw/*176.52*/("""required:true"""),format.raw/*176.65*/("""}"""),format.raw/*176.66*/(""",marca:"""),format.raw/*176.73*/("""{"""),format.raw/*176.74*/("""required:true"""),format.raw/*176.87*/("""}"""),format.raw/*176.88*/(""",precio:"""),format.raw/*176.96*/("""{"""),format.raw/*176.97*/("""required:true,number:true"""),format.raw/*176.122*/("""}"""),format.raw/*176.123*/(""",descuento:"""),format.raw/*176.134*/("""{"""),format.raw/*176.135*/("""required:true,number:true"""),format.raw/*176.160*/("""}"""),format.raw/*176.161*/("""}"""),format.raw/*176.162*/(""",
            errorElement:'div',
            errorPlacement : function ( error, element ) """),format.raw/*178.58*/("""{"""),format.raw/*178.59*/("""
                $ (error).addClass('alert alert-danger').css("""),format.raw/*179.62*/("""{"""),format.raw/*179.63*/("""width: "17em""""),format.raw/*179.76*/("""}"""),format.raw/*179.77*/(""")
                $(element).after(error)
            """),format.raw/*181.13*/("""}"""),format.raw/*181.14*/("""
        """),format.raw/*182.9*/("""}"""),format.raw/*182.10*/(""")
        var Imagepath="/"""),_display_(Seq[Any](/*183.26*/{producto.getImagePath()})),format.raw/*183.51*/(""""
        var FileName=""""),_display_(Seq[Any](/*184.24*/{producto.image})),format.raw/*184.40*/(""""
        if(FileName!="")dimensionarImagen(Imagepath)
        $("#producto_edit").click(function()"""),format.raw/*186.45*/("""{"""),format.raw/*186.46*/("""
            if(!$("#productoForm").valid())return false
            var caracteristicas=""
            $("#caracteristicas tbody tr:not('.add-row')").each(function()"""),format.raw/*189.75*/("""{"""),format.raw/*189.76*/("""
                val=$(this).find("input").val()
                if(val!="")caracteristicas+=val+","
            """),format.raw/*192.13*/("""}"""),format.raw/*192.14*/(""")
            caracteristicas=caracteristicas.slice(0,caracteristicas.length-1)
            var especificaciones=""
            $("#especificaciones tbody tr:not('.add-row')").each(function()"""),format.raw/*195.76*/("""{"""),format.raw/*195.77*/("""
                nombre=$(this).find("td:nth-child(1) input").val()
                descripcion=$(this).find("td:nth-child(2) input").val()
                if(nombre!="" && descripcion!="")especificaciones+=nombre+":"+descripcion+","
            """),format.raw/*199.13*/("""}"""),format.raw/*199.14*/(""")
            especificaciones=especificaciones.slice(0,especificaciones.length-1)
            function FileName(file)"""),format.raw/*201.36*/("""{"""),format.raw/*201.37*/("""
                if(file==null)return ""
                else if('name' in file)return file.name
                else if('value' in file)return file.value
            """),format.raw/*205.13*/("""}"""),format.raw/*205.14*/("""
            var dataurl=$("#imagen").attr("src")==undefined?"":$("#imagen").attr("src")
            var productoId=""""),_display_(Seq[Any](/*207.30*/{producto.id})),format.raw/*207.43*/(""""
            $.ajax("""),format.raw/*208.20*/("""{"""),format.raw/*208.21*/("""
                type : "POST",
                url : "/admin/producto/"+productoId,
                async : false,
                data : """),format.raw/*212.24*/("""{"""),format.raw/*212.25*/("""modelo:$("#producto_modelo").val(),color:$("#producto_color").val(),
                    marca:$("#producto_marca").val(),precio:$("#producto_precio").val(),descuento:$("#producto_descuento").val(),categoria_id:$("#producto_cat_lista").val(),
                    caracteristicas:caracteristicas,especificaciones:especificaciones,dataurl:dataurl,image:FileName(file)"""),format.raw/*214.123*/("""}"""),format.raw/*214.124*/(""",
                success:function(producto)"""),format.raw/*215.43*/("""{"""),format.raw/*215.44*/("""
                    $("#content h1:first-child").prev("div.alert").remove()
                    $("#content h1:first-child").before('<div class="alert alert-success">Se editó el producto '+producto.categoria_nombre+'</div>')
                    setTimeout(function()"""),format.raw/*218.42*/("""{"""),format.raw/*218.43*/("""location.href = "/admin/producto""""),format.raw/*218.76*/("""}"""),format.raw/*218.77*/(""",500)
                """),format.raw/*219.17*/("""}"""),format.raw/*219.18*/("""
            """),format.raw/*220.13*/("""}"""),format.raw/*220.14*/(""")
        """),format.raw/*221.9*/("""}"""),format.raw/*221.10*/(""")
    </script>
""")))})))}
    }
    
    def render(usuario:String,producto:Producto): play.api.templates.HtmlFormat.Appendable = apply(usuario,producto)
    
    def f:((String,Producto) => play.api.templates.HtmlFormat.Appendable) = (usuario,producto) => apply(usuario,producto)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 27 23:42:12 PET 2016
                    SOURCE: /Users/diegodelfin7/Desktop/proy Tienda virtual/tienda/app/views/producto/editar.scala.html
                    HASH: 6e733f7f14cd93baac2b3ed9f222ac42fed79f8b
                    MATRIX: 793->1|967->37|1004->85|1031->104|1069->105|1091->110|1128->111|1195->161|1232->162|1266->179|1303->180|1555->396|1594->413|1823->606|1861->622|2088->813|2126->829|2356->1023|2395->1040|2634->1243|2677->1263|3213->1763|3267->1808|3306->1809|3373->1840|3461->1911|3501->1912|3619->1994|3657->2010|3773->2094|3832->2121|5055->3308|5109->3346|5148->3347|5211->3374|5261->3415|5300->3416|5382->3462|5418->3476|5466->3488|5484->3497|5513->3504|5585->3544|5643->3574|5672->3575|5754->3621|5790->3635|5829->3638|5847->3647|5876->3654|5939->3689|5968->3690|6023->3713|6611->4265|6650->4282|7099->4702|7129->4703|7195->4740|7225->4741|7366->4853|7396->4854|7434->4864|7464->4865|7555->4927|7585->4928|7786->5101|7816->5102|7908->5165|7938->5166|8180->5380|8210->5381|8281->5415|8344->5455|8408->5490|8438->5491|8522->5546|8552->5547|8953->5919|8983->5920|9021->5930|9051->5931|9134->5985|9164->5986|9284->6077|9314->6078|9369->6104|9399->6105|9438->6116|9468->6117|9552->6172|9582->6173|9702->6264|9732->6265|9788->6292|9818->6293|9857->6304|9887->6305|9989->6378|10019->6379|10139->6470|10169->6471|10225->6498|10255->6499|10638->6854|10668->6855|10762->6920|10792->6921|10895->6996|10925->6997|10999->7042|11029->7043|11105->7090|11135->7091|11345->7272|11375->7273|11413->7283|11443->7284|11512->7324|11542->7325|11614->7368|11644->7369|11739->7435|11769->7436|11807->7446|11837->7447|11907->7488|11937->7489|12309->7832|12339->7833|12409->7874|12439->7875|12478->7886|12508->7887|12575->7925|12605->7926|12656->7948|12686->7949|12722->7956|12752->7957|12794->7970|12824->7971|12860->7978|12890->7979|12932->7992|12962->7993|12998->8000|13028->8001|13070->8014|13100->8015|13137->8023|13167->8024|13222->8049|13253->8050|13294->8061|13325->8062|13380->8087|13411->8088|13442->8089|13564->8182|13594->8183|13686->8246|13716->8247|13758->8260|13788->8261|13873->8317|13903->8318|13941->8328|13971->8329|14036->8357|14084->8382|14147->8408|14186->8424|14316->8525|14346->8526|14544->8695|14574->8696|14719->8812|14749->8813|14972->9007|15002->9008|15281->9258|15311->9259|15460->9379|15490->9380|15690->9551|15720->9552|15877->9672|15913->9685|15964->9707|15994->9708|16166->9851|16196->9852|16593->10219|16624->10220|16698->10265|16728->10266|17027->10536|17057->10537|17119->10570|17149->10571|17201->10594|17231->10595|17274->10609|17304->10610|17343->10621|17373->10622
                    LINES: 26->1|30->1|31->3|31->3|31->3|33->5|33->5|35->7|35->7|37->9|37->9|42->14|42->14|46->18|46->18|50->22|50->22|54->26|54->26|58->30|58->30|71->43|71->43|71->43|72->44|72->44|72->44|73->45|73->45|74->46|75->47|103->75|103->75|103->75|104->76|104->76|104->76|105->77|105->77|105->77|105->77|105->77|106->78|107->79|107->79|108->80|108->80|108->80|108->80|108->80|109->81|109->81|110->82|125->97|125->97|131->103|131->103|132->104|132->104|135->107|135->107|136->108|136->108|137->109|137->109|140->112|140->112|141->113|141->113|144->116|144->116|145->117|145->117|146->118|146->118|147->119|147->119|151->123|151->123|152->124|152->124|153->125|153->125|156->128|156->128|156->128|156->128|157->129|157->129|158->130|158->130|161->133|161->133|161->133|161->133|162->134|162->134|164->136|164->136|167->139|167->139|167->139|167->139|177->149|177->149|178->150|178->150|181->153|181->153|182->154|182->154|183->155|183->155|188->160|188->160|189->161|189->161|190->162|190->162|191->163|191->163|193->165|193->165|194->166|194->166|195->167|195->167|201->173|201->173|201->173|201->173|202->174|202->174|203->175|203->175|204->176|204->176|204->176|204->176|204->176|204->176|204->176|204->176|204->176|204->176|204->176|204->176|204->176|204->176|204->176|204->176|204->176|204->176|204->176|204->176|204->176|204->176|204->176|206->178|206->178|207->179|207->179|207->179|207->179|209->181|209->181|210->182|210->182|211->183|211->183|212->184|212->184|214->186|214->186|217->189|217->189|220->192|220->192|223->195|223->195|227->199|227->199|229->201|229->201|233->205|233->205|235->207|235->207|236->208|236->208|240->212|240->212|242->214|242->214|243->215|243->215|246->218|246->218|246->218|246->218|247->219|247->219|248->220|248->220|249->221|249->221
                    -- GENERATED --
                */
            