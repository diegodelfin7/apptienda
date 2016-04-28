
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
object agregar extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(usuario: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.administrador.agregarBase


Seq[Any](format.raw/*1.19*/("""
"""),_display_(Seq[Any](/*3.2*/agregarBase(usuario)/*3.22*/{_display_(Seq[Any](format.raw/*3.23*/("""

""")))}/*5.2*/{_display_(Seq[Any](format.raw/*5.3*/("""
    > <a href="/admin/producto">Producto</a>
""")))}/*7.2*/{_display_(Seq[Any](format.raw/*7.3*/("""
    producto
""")))}/*9.2*/{_display_(Seq[Any](format.raw/*9.3*/("""
    <div id="producto">
        <form id="productoForm">
            <div class="form-group">
                <label>Modelo</label>
                <input type="text" id="producto_modelo" name="modelo" maxlength="100">
            </div>
             <div class="form-group">
                <label>Color</label>
                <input type="text" id="producto_color" name="color" maxlength="20">
            </div>
            <div class="form-group">
                <label>Marca</label>
                <input type="text" id="producto_marca" name="marca" maxlength="40">
            </div>
            <div class="form-group">
                <label>Precio</label>
                <input type="text" id="producto_precio" name="precio" maxlength="10">
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
                        <tr>
                            <td class="padd">
                                <input type="text" name="caracteristica">
                            </td>
                        </tr>
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
                        <tr>
                            <td class="padd">
                                <input type="text" name="espNombre">
                            </td>
                            <td class="padd">
                                <input type="text" name="espDescripcion">
                            </td>
                        </tr>
                        <tr class="add-row">
                            <td><a href="javascript:void(0)">Agregar especificacion adicional</a></td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <div class="form-group">
                <label>Elija la categoria</label>
                <select id="producto_cat_lista" name="categorias">
                </select>
            </div>
            <div class="form-group">
                <label>Imagen</label>
                <input type="file" id="imagenFile" value="abrir">
                <div class="well">
                    <div id="draganddrop">Arrastre y suelte la imagen</div>
                    <img id="imagen">
                </div>
                <input class="vButton" type="button" id="producto_plus" value="agregar">
            </div>
        </form>
    </div>
    <script>
        $("#content>h1:first-child").css("margin-left","2em")//.css("text-align","center").css("margin-left","-10%")
        $("#producto").css("margin-left","2em")
        $("#producto div.form-group label").width("10em")
        $("#producto input[type='text']").width("15em")
        $("#caracteristicas tbody,#especificaciones tbody").click(function(e)"""),format.raw/*97.78*/("""{"""),format.raw/*97.79*/("""
            if($(e.target).is("a"))"""),format.raw/*98.36*/("""{"""),format.raw/*98.37*/("""
                var tr=$(e.target).closest("tr")
                $(tr).not(".add-row").remove()
            """),format.raw/*101.13*/("""}"""),format.raw/*101.14*/("""
        """),format.raw/*102.9*/("""}"""),format.raw/*102.10*/(""")
        $("#caracteristicas tr.add-row a").click(function()"""),format.raw/*103.60*/("""{"""),format.raw/*103.61*/("""
            var tr=$(this).closest("tr")
            $(tr).before('<tr><td class="padd"><input type="text"><a class="inline-deletelink">Eliminar</a></td></tr>')
        """),format.raw/*106.9*/("""}"""),format.raw/*106.10*/(""")
        $("#especificaciones tr.add-row a").click(function()"""),format.raw/*107.61*/("""{"""),format.raw/*107.62*/("""
            var tr=$(this).closest("tr")
            $(tr).before('<tr><td class="padd"><input type="text"></td><td class="padd"><input type="text"><a class="inline-deletelink">Eliminar</a></td></tr>')
        """),format.raw/*110.9*/("""}"""),format.raw/*110.10*/(""")
        $("#draganddrop").on("dragenter",function(e)"""),format.raw/*111.53*/("""{"""),format.raw/*111.54*/("""
            e.stopPropagation()
            e.preventDefault()
            $(this).css("""),format.raw/*114.25*/("""{"""),format.raw/*114.26*/("""border:"2px solid #0B85A1""""),format.raw/*114.52*/("""}"""),format.raw/*114.53*/(""")
        """),format.raw/*115.9*/("""}"""),format.raw/*115.10*/(""")
        $("#draganddrop").on("dragleave",function(e)"""),format.raw/*116.53*/("""{"""),format.raw/*116.54*/("""
            e.stopPropagation()
            e.preventDefault()
            $(this).css("""),format.raw/*119.25*/("""{"""),format.raw/*119.26*/("""border:"2px dashed #0B85A1""""),format.raw/*119.53*/("""}"""),format.raw/*119.54*/(""")
        """),format.raw/*120.9*/("""}"""),format.raw/*120.10*/(""")
        var file=null
        $("#draganddrop").on("drop",function(e)"""),format.raw/*122.48*/("""{"""),format.raw/*122.49*/("""
            e.stopPropagation()
            e.preventDefault()
            $(this).css("""),format.raw/*125.25*/("""{"""),format.raw/*125.26*/("""border:"2px dashed #0B85A1""""),format.raw/*125.53*/("""}"""),format.raw/*125.54*/(""")
            //file = e.target.files[0]
            file = e.originalEvent.dataTransfer.files[0]
            imageType = /image.*/;
            if (file==undefined || !file.type.match(imageType))
                return;

            var reader = new FileReader();
            cargarImagen(reader)
            reader.readAsDataURL(file)
        """),format.raw/*135.9*/("""}"""),format.raw/*135.10*/(""")
        $(document).on('dragenter dragover drop', function (e)"""),format.raw/*136.63*/("""{"""),format.raw/*136.64*/("""
            e.stopPropagation()
            e.preventDefault()
        """),format.raw/*139.9*/("""}"""),format.raw/*139.10*/(""")
        $("#imagenFile").change(function()"""),format.raw/*140.43*/("""{"""),format.raw/*140.44*/("""
            if (this.files && this.files[0]) """),format.raw/*141.46*/("""{"""),format.raw/*141.47*/("""
                file=this.files[0]
                var reader = new FileReader();
                cargarImagen(reader)
                reader.readAsDataURL(file);
            """),format.raw/*146.13*/("""}"""),format.raw/*146.14*/("""
        """),format.raw/*147.9*/("""}"""),format.raw/*147.10*/(""")
        function cargarImagen(reader)"""),format.raw/*148.38*/("""{"""),format.raw/*148.39*/("""
            reader.onload = function (e) """),format.raw/*149.42*/("""{"""),format.raw/*149.43*/("""
                var parent=$("#imagen").parent();
                $("#imagen").remove()
                parent.append('<img id="imagen">')
                $("#imagen").attr("src", e.target.result);
                parent.width($("#imagen").width()>parent.width()?$("#imagen").width():$("#imagen").width()<150?150:$("#imagen").width())
                $("#draganddrop").css("""),format.raw/*155.39*/("""{"""),format.raw/*155.40*/(""""max-width":200,"height":60,margin:"auto""""),format.raw/*155.81*/("""}"""),format.raw/*155.82*/(""")
            """),format.raw/*156.13*/("""}"""),format.raw/*156.14*/("""
        """),format.raw/*157.9*/("""}"""),format.raw/*157.10*/("""
        $.ajax("""),format.raw/*158.16*/("""{"""),format.raw/*158.17*/("""
            type : "POST",
            url : "/admin/producto/ultimascategorias",
            async : false,
            data : """),format.raw/*162.20*/("""{"""),format.raw/*162.21*/("""}"""),format.raw/*162.22*/(""",
            success:function(categorias)"""),format.raw/*163.41*/("""{"""),format.raw/*163.42*/("""
                $("#producto_cat_lista").text("")
                for(var i in categorias)"""),format.raw/*165.41*/("""{"""),format.raw/*165.42*/("""
                    var categoria=categorias[i]
                    $("#producto_cat_lista").append('<option value="'+categoria.id+'">'+categoria.nombre+'</option>')
                """),format.raw/*168.17*/("""}"""),format.raw/*168.18*/("""
            """),format.raw/*169.13*/("""}"""),format.raw/*169.14*/("""
        """),format.raw/*170.9*/("""}"""),format.raw/*170.10*/(""")
        $("#productoForm").validate("""),format.raw/*171.37*/("""{"""),format.raw/*171.38*/("""
            rules : """),format.raw/*172.21*/("""{"""),format.raw/*172.22*/("""modelo:"""),format.raw/*172.29*/("""{"""),format.raw/*172.30*/("""required:true"""),format.raw/*172.43*/("""}"""),format.raw/*172.44*/(""",color:"""),format.raw/*172.51*/("""{"""),format.raw/*172.52*/("""required:true"""),format.raw/*172.65*/("""}"""),format.raw/*172.66*/(""",marca:"""),format.raw/*172.73*/("""{"""),format.raw/*172.74*/("""required:true"""),format.raw/*172.87*/("""}"""),format.raw/*172.88*/(""",precio:"""),format.raw/*172.96*/("""{"""),format.raw/*172.97*/("""required:true,number:true"""),format.raw/*172.122*/("""}"""),format.raw/*172.123*/(""",
                caracteristica:"""),format.raw/*173.32*/("""{"""),format.raw/*173.33*/("""required:true"""),format.raw/*173.46*/("""}"""),format.raw/*173.47*/(""",espNombre:"""),format.raw/*173.58*/("""{"""),format.raw/*173.59*/("""required:true"""),format.raw/*173.72*/("""}"""),format.raw/*173.73*/(""",espDescripcion:"""),format.raw/*173.89*/("""{"""),format.raw/*173.90*/("""required:true"""),format.raw/*173.103*/("""}"""),format.raw/*173.104*/("""}"""),format.raw/*173.105*/(""",
            errorElement:'div',
            errorPlacement : function ( error, element ) """),format.raw/*175.58*/("""{"""),format.raw/*175.59*/("""
                $ (error).addClass('alert alert-danger').css("""),format.raw/*176.62*/("""{"""),format.raw/*176.63*/("""width: "17em""""),format.raw/*176.76*/("""}"""),format.raw/*176.77*/(""")
                $(element).after(error)
            """),format.raw/*178.13*/("""}"""),format.raw/*178.14*/("""
        """),format.raw/*179.9*/("""}"""),format.raw/*179.10*/(""")
        $("#producto_plus").click(function()"""),format.raw/*180.45*/("""{"""),format.raw/*180.46*/("""
            if(!$("#productoForm").valid())return false
            if($("#producto_cat_lista").val()==null)"""),format.raw/*182.53*/("""{"""),format.raw/*182.54*/("""
                $("#producto_plus").next("div").remove()
                $("#producto_plus").after('<div class="alert alert-danger">Primero debe crear una categoria</div>')
                return false
            """),format.raw/*186.13*/("""}"""),format.raw/*186.14*/("""
            var caracteristicas=""
            $("#caracteristicas tbody tr:not('.add-row')").each(function()"""),format.raw/*188.75*/("""{"""),format.raw/*188.76*/("""
                val=$(this).find("input").val()
                if(val!="")caracteristicas+=val+","
            """),format.raw/*191.13*/("""}"""),format.raw/*191.14*/(""")
            caracteristicas=caracteristicas.slice(0,caracteristicas.length-1)
            var especificaciones=""
            $("#especificaciones tbody tr:not('.add-row')").each(function()"""),format.raw/*194.76*/("""{"""),format.raw/*194.77*/("""
                nombre=$(this).find("td:nth-child(1) input").val()
                descripcion=$(this).find("td:nth-child(2) input").val()
                if(nombre!="" && descripcion!="")especificaciones+=nombre+":"+descripcion+","
            """),format.raw/*198.13*/("""}"""),format.raw/*198.14*/(""")
            especificaciones=especificaciones.slice(0,especificaciones.length-1)
            function FileName(file)"""),format.raw/*200.36*/("""{"""),format.raw/*200.37*/("""
                if(file==null)return ""
                else if('name' in file)return file.name
                else if('value' in file)return file.value
            """),format.raw/*204.13*/("""}"""),format.raw/*204.14*/("""
            var dataurl=$("#imagen").attr("src")==undefined?"":$("#imagen").attr("src")
            $.ajax("""),format.raw/*206.20*/("""{"""),format.raw/*206.21*/("""
                type : "POST",
                url : "/admin/producto/agregar",
                async : false,
                data : """),format.raw/*210.24*/("""{"""),format.raw/*210.25*/("""modelo:$("#producto_modelo").val(),color:$("#producto_color").val(),
                    marca:$("#producto_marca").val(),precio:$("#producto_precio").val(),categoria_id:$("#producto_cat_lista").val(),
                    caracteristicas:caracteristicas,especificaciones:especificaciones,dataurl:dataurl,image:FileName(file)"""),format.raw/*212.123*/("""}"""),format.raw/*212.124*/(""",
                success:function(producto)"""),format.raw/*213.43*/("""{"""),format.raw/*213.44*/("""
                    $("#content h1:first-child").prev("div.alert").remove()
                    $("#content h1:first-child").before('<div class="alert alert-success">Se agrego un producto '+producto.categoria_nombre+'</div>')
                    setTimeout(function()"""),format.raw/*216.42*/("""{"""),format.raw/*216.43*/("""location.href = "/admin/producto""""),format.raw/*216.76*/("""}"""),format.raw/*216.77*/(""",1000)
                """),format.raw/*217.17*/("""}"""),format.raw/*217.18*/("""
            """),format.raw/*218.13*/("""}"""),format.raw/*218.14*/(""")/**/
        """),format.raw/*219.9*/("""}"""),format.raw/*219.10*/(""")
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
                    SOURCE: /Users/diegodelfin7/Desktop/proy Tienda virtual/tienda/app/views/producto/agregar.scala.html
                    HASH: 5108bc7d979265b42203313102aa276a4fefb7c6
                    MATRIX: 785->1|941->18|978->67|1006->87|1044->88|1066->93|1103->94|1169->143|1206->144|1240->161|1277->162|5167->4024|5196->4025|5261->4062|5290->4063|5431->4175|5461->4176|5499->4186|5529->4187|5620->4249|5650->4250|5851->4423|5881->4424|5973->4487|6003->4488|6245->4702|6275->4703|6359->4758|6389->4759|6509->4850|6539->4851|6594->4877|6624->4878|6663->4889|6693->4890|6777->4945|6807->4946|6927->5037|6957->5038|7013->5065|7043->5066|7082->5077|7112->5078|7214->5151|7244->5152|7364->5243|7394->5244|7450->5271|7480->5272|7863->5627|7893->5628|7987->5693|8017->5694|8120->5769|8150->5770|8224->5815|8254->5816|8330->5863|8360->5864|8570->6045|8600->6046|8638->6056|8668->6057|8737->6097|8767->6098|8839->6141|8869->6142|9278->6522|9308->6523|9378->6564|9408->6565|9452->6580|9482->6581|9520->6591|9550->6592|9596->6609|9626->6610|9788->6743|9818->6744|9848->6745|9920->6788|9950->6789|10072->6882|10102->6883|10317->7069|10347->7070|10390->7084|10420->7085|10458->7095|10488->7096|10556->7135|10586->7136|10637->7158|10667->7159|10703->7166|10733->7167|10775->7180|10805->7181|10841->7188|10871->7189|10913->7202|10943->7203|10979->7210|11009->7211|11051->7224|11081->7225|11118->7233|11148->7234|11203->7259|11234->7260|11297->7294|11327->7295|11369->7308|11399->7309|11439->7320|11469->7321|11511->7334|11541->7335|11586->7351|11616->7352|11659->7365|11690->7366|11721->7367|11843->7460|11873->7461|11965->7524|11995->7525|12037->7538|12067->7539|12152->7595|12182->7596|12220->7606|12250->7607|12326->7654|12356->7655|12496->7766|12526->7767|12774->7986|12804->7987|12945->8099|12975->8100|13120->8216|13150->8217|13373->8411|13403->8412|13682->8662|13712->8663|13861->8783|13891->8784|14091->8955|14121->8956|14260->9066|14290->9067|14458->9206|14488->9207|14844->9533|14875->9534|14949->9579|14979->9580|15279->9851|15309->9852|15371->9885|15401->9886|15454->9910|15484->9911|15527->9925|15557->9926|15600->9941|15630->9942
                    LINES: 26->1|30->1|31->3|31->3|31->3|33->5|33->5|35->7|35->7|37->9|37->9|125->97|125->97|126->98|126->98|129->101|129->101|130->102|130->102|131->103|131->103|134->106|134->106|135->107|135->107|138->110|138->110|139->111|139->111|142->114|142->114|142->114|142->114|143->115|143->115|144->116|144->116|147->119|147->119|147->119|147->119|148->120|148->120|150->122|150->122|153->125|153->125|153->125|153->125|163->135|163->135|164->136|164->136|167->139|167->139|168->140|168->140|169->141|169->141|174->146|174->146|175->147|175->147|176->148|176->148|177->149|177->149|183->155|183->155|183->155|183->155|184->156|184->156|185->157|185->157|186->158|186->158|190->162|190->162|190->162|191->163|191->163|193->165|193->165|196->168|196->168|197->169|197->169|198->170|198->170|199->171|199->171|200->172|200->172|200->172|200->172|200->172|200->172|200->172|200->172|200->172|200->172|200->172|200->172|200->172|200->172|200->172|200->172|200->172|200->172|201->173|201->173|201->173|201->173|201->173|201->173|201->173|201->173|201->173|201->173|201->173|201->173|201->173|203->175|203->175|204->176|204->176|204->176|204->176|206->178|206->178|207->179|207->179|208->180|208->180|210->182|210->182|214->186|214->186|216->188|216->188|219->191|219->191|222->194|222->194|226->198|226->198|228->200|228->200|232->204|232->204|234->206|234->206|238->210|238->210|240->212|240->212|241->213|241->213|244->216|244->216|244->216|244->216|245->217|245->217|246->218|246->218|247->219|247->219
                    -- GENERATED --
                */
            