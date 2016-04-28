
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
object carrito extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Cliente,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String,cliente: Cliente):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.tienda.template


Seq[Any](format.raw/*1.36*/("""
"""),_display_(Seq[Any](/*3.2*/template(message,cliente)/*3.27*/{_display_(Seq[Any](format.raw/*3.28*/("""
    <style>
        .empty-cart """),format.raw/*5.21*/("""{"""),format.raw/*5.22*/("""
            background: transparent url(/assets/images/empty_cart.png) no-repeat 180px 0;
            margin: 0 auto;
            min-height: 100px;
            width: 940px;
            color: #7f7f7f;
        """),format.raw/*11.9*/("""}"""),format.raw/*11.10*/("""
        .empty-cart a:link """),format.raw/*12.28*/("""{"""),format.raw/*12.29*/("""
            color: #4386A1;
            text-decoration: underline;
        """),format.raw/*15.9*/("""}"""),format.raw/*15.10*/("""
        .empty-cart p:first-child """),format.raw/*16.35*/("""{"""),format.raw/*16.36*/("""
            font-family: "function-pro",Helvetiva,Arial,sans-serif;
            font-size: 24px;
            margin: 0 0 0 300px;
            padding: 0;
            text-transform: uppercase;
        """),format.raw/*22.9*/("""}"""),format.raw/*22.10*/("""
        .empty-cart p:last-child """),format.raw/*23.34*/("""{"""),format.raw/*23.35*/("""
            font-size: 16px;
            margin: 10px 0 0 300px;
        """),format.raw/*26.9*/("""}"""),format.raw/*26.10*/("""
        .title-cart """),format.raw/*27.21*/("""{"""),format.raw/*27.22*/("""
            color: #333;
            font-family: "function-pro",Helvetiva,Arial,sans-serif;
            font-weight: normal;
            line-height: 1.1em;
            text-transform: uppercase;
            font-size: 28px;
            font-weight: 100;
        """),format.raw/*35.9*/("""}"""),format.raw/*35.10*/("""
        table.table-product-cart """),format.raw/*36.34*/("""{"""),format.raw/*36.35*/("""
            color: #7f7f7f;
            margin:auto;
            margin-top:30px;
            width: 700px;
        """),format.raw/*41.9*/("""}"""),format.raw/*41.10*/("""
        table.table-product-cart th.name-product """),format.raw/*42.50*/("""{"""),format.raw/*42.51*/("""
            width: 10px;
        """),format.raw/*44.9*/("""}"""),format.raw/*44.10*/("""
        table.table-product-cart th.description-product """),format.raw/*45.57*/("""{"""),format.raw/*45.58*/("""
            width: 250px;
        """),format.raw/*47.9*/("""}"""),format.raw/*47.10*/("""
        table.table-product-cart thead th """),format.raw/*48.43*/("""{"""),format.raw/*48.44*/("""
            font-size: 14px;
            font-size: 1.4rem;
            font-weight: 100;
            padding: 5px;
        """),format.raw/*53.9*/("""}"""),format.raw/*53.10*/("""
        table.table-product-cart thead th, thead td """),format.raw/*54.53*/("""{"""),format.raw/*54.54*/("""
            background-color: #4c4c4c;
            background-image: -webkit-gradient(linear,left top,left bottom,color-stop(0%,#4c4c4c),color-stop(100%,#333));
            background-image: -webkit-linear-gradient(top,#4c4c4c,#333);
            background-image: -moz-linear-gradient(top,#4c4c4c,#333);
            background-image: -ms-linear-gradient(top,#4c4c4c,#333);
            background-image: -o-linear-gradient(top,#4c4c4c,#333);
            background-image: linear-gradient(top,#4c4c4c,#333);
            color: #fff;
            font-family: "function-pro",Helvetiva,Arial,sans-serif;
            font-size: 14px;
            font-size: 1.4rem;
            font-weight: normal;
            text-align: left;
            text-transform: uppercase;
        """),format.raw/*69.9*/("""}"""),format.raw/*69.10*/("""
        table.table-product-cart tbody td """),format.raw/*70.43*/("""{"""),format.raw/*70.44*/("""
            font-size: 13px;
            font-size: 1.3rem;
            font-weight: 100;
            line-height: 20px;
            padding: 10px 5px 5px;
            vertical-align: top;
            border-bottom: dotted 1px #ccc;
        """),format.raw/*78.9*/("""}"""),format.raw/*78.10*/("""
        li.cart-item-name, li.cart-item-brand, li.cart-item-sku """),format.raw/*79.65*/("""{"""),format.raw/*79.66*/("""
            line-height: 1.3rem;
            line-height: 16px;
        """),format.raw/*82.9*/("""}"""),format.raw/*82.10*/("""
        table.table-product-cart td span.cart_last_price """),format.raw/*83.58*/("""{"""),format.raw/*83.59*/("""
            text-decoration: line-through;
            font-size: 10px;
            color: gray;
        """),format.raw/*87.9*/("""}"""),format.raw/*87.10*/("""
        table.table-product-cart td span.cart_discount """),format.raw/*88.56*/("""{"""),format.raw/*88.57*/("""
            color: red;
        """),format.raw/*90.9*/("""}"""),format.raw/*90.10*/("""
        table.table-product-cart th.delete-product-element """),format.raw/*91.60*/("""{"""),format.raw/*91.61*/("""
            width: 20px;
        """),format.raw/*93.9*/("""}"""),format.raw/*93.10*/("""
        .delete-product """),format.raw/*94.25*/("""{"""),format.raw/*94.26*/("""
            background: url(/assets/images/iconset.png) 0 -80px;
            display: block;
            overflow: hidden;
            text-align: left;
            text-indent: -9999px;
            height: 20px;
            width: 20px;
        """),format.raw/*102.9*/("""}"""),format.raw/*102.10*/("""
        div#cart-cms-help """),format.raw/*103.27*/("""{"""),format.raw/*103.28*/("""
            width: 520px;
            height: 71px;
            float: left;
        """),format.raw/*107.9*/("""}"""),format.raw/*107.10*/("""
        div#payment-product-cart """),format.raw/*108.34*/("""{"""),format.raw/*108.35*/("""
            display: block;
            float: left;
            width: 300px;
        """),format.raw/*112.9*/("""}"""),format.raw/*112.10*/("""
        .payment-product-cart """),format.raw/*113.31*/("""{"""),format.raw/*113.32*/("""
            border-left: 1px dotted #ccc;
            border-bottom: 1px dotted #ccc;
            color: #000;
            margin-bottom: 0;
            width: 300px;
        """),format.raw/*119.9*/("""}"""),format.raw/*119.10*/("""
        div#payment-product-cart th """),format.raw/*120.37*/("""{"""),format.raw/*120.38*/("""
            padding: 10px;
            text-align: right;
            width: 210px;
            font: 13px/15px Tahoma,Arial,sans-serif;
        """),format.raw/*125.9*/("""}"""),format.raw/*125.10*/("""
        #button-checkout.button """),format.raw/*126.33*/("""{"""),format.raw/*126.34*/("""
            height: 39px;
            margin-right: 120px;
            margin-top: 10px;
        """),format.raw/*130.9*/("""}"""),format.raw/*130.10*/("""
        #button-checkout.button:hover"""),format.raw/*131.38*/("""{"""),format.raw/*131.39*/("""
            background-color: #75bff4 ;
            background-image:none;
        """),format.raw/*134.9*/("""}"""),format.raw/*134.10*/("""
        #button-checkout.button:after """),format.raw/*135.39*/("""{"""),format.raw/*135.40*/("""
            top: 12px;
            background: url(/assets/images/iconset.png) 0 -60px;
            content: '';
            display: block;
            height: 20px;
            left: 5px;
            position: absolute;
            width: 20px;
        """),format.raw/*144.9*/("""}"""),format.raw/*144.10*/("""
        #button-checkout.button span """),format.raw/*145.38*/("""{"""),format.raw/*145.39*/("""
            display: block;
            font-size: 2rem;
            margin-top: 7px;
        """),format.raw/*149.9*/("""}"""),format.raw/*149.10*/("""
    </style>
""")))}/*151.2*/{_display_(Seq[Any](format.raw/*151.3*/("""
    <script>
        if(typeof(localStorage)!=="undefined")"""),format.raw/*153.47*/("""{"""),format.raw/*153.48*/("""
            //console.log(localStorage.carrito)
            if(localStorage.carrito==undefined || localStorage.carrito=="")"""),format.raw/*155.76*/("""{"""),format.raw/*155.77*/("""
                $("#content").append('<h1 style="margin: 60px auto .5em;" class="title-cart">Carrito de compras</h1>'+
                '<div class="empty-cart">'+
                    '<p>Tu carrito de compras está vacío</p>'+
                    '<p>Click <a href="/home">aquí</a> para retornar al catálogo.</p>'+
                '</div>')
            """),format.raw/*161.13*/("""}"""),format.raw/*161.14*/("""
            else"""),format.raw/*162.17*/("""{"""),format.raw/*162.18*/("""
                $("#content").append('<table class="table-product-cart">'+
                '<thead>'+
                '<tr>'+
                    '<th class="name-product" scope="col">Producto</th>'+
                    '<th class="description-product"></th>'+
                    '<th class="price-product">Precio</th>'+
                    '<th class="price-product">Cantidad</th>'+
                    '<th class="price-product">Subtotal</th>'+
                    '<th class="delete-product-element"></th>'+
                '</tr>'+
                '</thead>'+
                '<tbody>'+
                '</tbody></table>')
                for(var i in localStorage.carrito.split(","))"""),format.raw/*176.62*/("""{"""),format.raw/*176.63*/("""
                    var id=localStorage.carrito.split(",")[i].split(":")[0]
                    var cant=localStorage.carrito.split(",")[i].split(":")[1]
                     $.ajax("""),format.raw/*179.29*/("""{"""),format.raw/*179.30*/("""
                        type : "POST",
                        url : "/home/producto/ver",
                        async : false,
                        data : """),format.raw/*183.32*/("""{"""),format.raw/*183.33*/("""id:id"""),format.raw/*183.38*/("""}"""),format.raw/*183.39*/(""",
                        success:function(producto)"""),format.raw/*184.51*/("""{"""),format.raw/*184.52*/("""
                            price=""
                            if(producto.descuento==0)"""),format.raw/*186.54*/("""{"""),format.raw/*186.55*/("""
                                price='<span data-price='+producto.precio+' class="cart_special_price">S/. '+producto.precio+'</span><br>'
                            """),format.raw/*188.29*/("""}"""),format.raw/*188.30*/("""
                            else"""),format.raw/*189.33*/("""{"""),format.raw/*189.34*/("""
                                price='<span data-price='+producto.precio_actual+' class="cart_special_price">S/. '+producto.precio_actual+'</span><br>'+
                                    '<span class="cart_last_price">S/. '+producto.precio+'</span><br>'+
                                    '<span class="cart_discount">Descuento '+producto.descuento+'%</span>'
                            """),format.raw/*193.29*/("""}"""),format.raw/*193.30*/("""
                            cantidad='<div class="mount"><select title="Cantidad">'
                            for(var j=1;j<=Math.max(cant,6);j++)"""),format.raw/*195.65*/("""{"""),format.raw/*195.66*/("""
                                cantidad+='<option '+(j==cant?'selected':'')+'>'+j+'</option>'
                            """),format.raw/*197.29*/("""}"""),format.raw/*197.30*/("""
                            cantidad+='</select></div>'
                            $(".table-product-cart").append('<tr data-id="'+id+'">'+
                                '<th>'+
                                    '<a title="'+producto.modelo+'"><img width=77 src="/assets/productos/'+producto.image+'">'+'</a>'+
                                '</th>'+
                                '<td>'+
                                    '<ul>'+
                                        '<li class="cart-item-name"><b>'+producto.modelo+'-'+producto.color+'</b></li>'+
                                        '<li class="cart-item-brand">'+producto.marca+'</li>'+
                                        '<li class="cart-item-sku">'+
                                            '<b style="display:inline;">SKU:</b>'+
                                            '<span style="font-size: 0.9em;">'+producto.especificaciones.split(",")[0].split(":")[1]+'</span>'+
                                            '<div><br><b>Producto agregado</b></div>'+
                                        '</li>'+
                                    '</ul>'+
                                '</td>'+
                                '<td>'+price+'</td>'+
                                '<td>'+cantidad+'</td>'+
                                '<td><span class="cart_subtotal"><span></td>'+
                                '<td><a class="delete-product" title="Eliminar del carrito">Quitar objeto</a></td>'+
                            '</tr>')
                        """),format.raw/*219.25*/("""}"""),format.raw/*219.26*/("""
                     """),format.raw/*220.22*/("""}"""),format.raw/*220.23*/(""")
                """),format.raw/*221.17*/("""}"""),format.raw/*221.18*/("""
                var total=0
                $("#content").append('<div id="cart-cms-help"></div>'+
                    '<div id="payment-product-cart">'+
                    '<table class="payment-product-cart">'+
                        '<tbody>'+
                            '<tr>'+
                                '<th scope="row">Subtotal</th>'+
                                '<td><strong>S/. '+total+'</strong></td>'+
                            '</tr>'+
                            '<tr>'+
                                '<th scope="row">Un solo pago de</th>'+
                                '<td><b>S/. '+total+'</b></td>'+
                            '</tr>'+
                        '</tbody>'+
                    '</table>'+'</div>')
                $(".table-product-cart .mount select").change(function()"""),format.raw/*237.73*/("""{"""),format.raw/*237.74*/("""
                    var price=parseFloat($(this).closest("td").prev().find(".cart_special_price").attr("data-price"))
                    var subtotal=parseDouble(price*$(this).val())
                    $(this).closest("td").next().find("span").text('S/. '+subtotal)
                    $(this).closest("td").next().find("span").attr("data-subtotal",subtotal)
                    incCantCarrito($(this).closest("tr").attr("data-id"),$(this).val())
                    actualizarSubTotal()
                """),format.raw/*244.17*/("""}"""),format.raw/*244.18*/(""")
                $(".table-product-cart .mount select").change()
                $(".table-product-cart .delete-product").click(function()"""),format.raw/*246.74*/("""{"""),format.raw/*246.75*/("""
                    remProdCarrito($(this).closest("tr").attr("data-id"))
                    $(this).closest("tr").remove()
                    actualizarSubTotal()
                    if($(".table-product-cart tbody tr").length==0)"""),format.raw/*250.68*/("""{"""),format.raw/*250.69*/("""
                        $(".table-product-cart").remove()
                        $("#cart-cms-help").remove()
                        $("#payment-product-cart").remove()
                        //$("#button-checkout").remove()
                        $("#content").append('<h1 style="margin: 60px auto .5em;" class="title-cart">Carrito de compras</h1>'+
                            '<div class="empty-cart">'+
                                '<p>Tu carrito de compras está vacío</p>'+
                                '<p>Click <a href="/home">aquí</a> para retornar al catálogo.</p>'+
                            '</div>')
                    """),format.raw/*260.21*/("""}"""),format.raw/*260.22*/("""
                """),format.raw/*261.17*/("""}"""),format.raw/*261.18*/(""")
                function parseDouble(numero)"""),format.raw/*262.45*/("""{"""),format.raw/*262.46*/("""
                    return parseFloat(numero).toFixed(2)
                """),format.raw/*264.17*/("""}"""),format.raw/*264.18*/("""
                function actualizarSubTotal()"""),format.raw/*265.46*/("""{"""),format.raw/*265.47*/("""
                    total=0
                    $(".table-product-cart tr .cart_subtotal").each(function()"""),format.raw/*267.79*/("""{"""),format.raw/*267.80*/("""
                        total+=parseFloat($(this).attr("data-subtotal"))
                    """),format.raw/*269.21*/("""}"""),format.raw/*269.22*/(""")
                    total=parseDouble(total)
                    $(".payment-product-cart td strong,.payment-product-cart td b").text("S/. "+total)
                    items=0
                    $(".table-product-cart .mount select").each(function()"""),format.raw/*273.75*/("""{"""),format.raw/*273.76*/("""
                        items+=parseInt($(this).val())        
                    """),format.raw/*275.21*/("""}"""),format.raw/*275.22*/(""")
                    $(".user-nav-cart-items").text(items)
                    $(".user-nav-cart-grand-total").text("S/. "+total)
                """),format.raw/*278.17*/("""}"""),format.raw/*278.18*/("""
                function incCantCarrito(id,cantidad)"""),format.raw/*279.53*/("""{"""),format.raw/*279.54*/("""
                    var carrito=""
                    for(var i in localStorage.carrito.split(","))"""),format.raw/*281.66*/("""{"""),format.raw/*281.67*/("""
                        var ID=localStorage.carrito.split(",")[i].split(":")[0]
                        var cant=localStorage.carrito.split(",")[i].split(":")[1]
                        if(ID==id)"""),format.raw/*284.35*/("""{"""),format.raw/*284.36*/("""
                            carrito+=ID+":"+cantidad+","
                        """),format.raw/*286.25*/("""}"""),format.raw/*286.26*/("""
                        else"""),format.raw/*287.29*/("""{"""),format.raw/*287.30*/("""
                            carrito+=localStorage.carrito.split(",")[i]+","
                        """),format.raw/*289.25*/("""}"""),format.raw/*289.26*/("""
                    """),format.raw/*290.21*/("""}"""),format.raw/*290.22*/("""
                    localStorage.carrito=carrito.substring(0,carrito.length-1)
                """),format.raw/*292.17*/("""}"""),format.raw/*292.18*/("""
                function remProdCarrito(id)"""),format.raw/*293.44*/("""{"""),format.raw/*293.45*/("""
                    var carrito=""
                    for(var i in localStorage.carrito.split(","))"""),format.raw/*295.66*/("""{"""),format.raw/*295.67*/("""
                        var ID=localStorage.carrito.split(",")[i].split(":")[0]
                        if(ID==id)"""),format.raw/*297.35*/("""{"""),format.raw/*297.36*/("""
                            carrito+=""
                        """),format.raw/*299.25*/("""}"""),format.raw/*299.26*/("""
                        else"""),format.raw/*300.29*/("""{"""),format.raw/*300.30*/("""
                            carrito+=localStorage.carrito.split(",")[i]+","
                        """),format.raw/*302.25*/("""}"""),format.raw/*302.26*/("""
                    """),format.raw/*303.21*/("""}"""),format.raw/*303.22*/("""
                    localStorage.carrito=carrito.substring(0,carrito.length-1)
                """),format.raw/*305.17*/("""}"""),format.raw/*305.18*/("""
                //$("#content").append('<a id="button-checkout" class="button second-btn">'+
                //    '<span>Pagar</span></a>')
            """),format.raw/*308.13*/("""}"""),format.raw/*308.14*/("""
        """),format.raw/*309.9*/("""}"""),format.raw/*309.10*/("""
    </script>
""")))})))}
    }
    
    def render(message:String,cliente:Cliente): play.api.templates.HtmlFormat.Appendable = apply(message,cliente)
    
    def f:((String,Cliente) => play.api.templates.HtmlFormat.Appendable) = (message,cliente) => apply(message,cliente)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 27 23:42:12 PET 2016
                    SOURCE: /Users/diegodelfin7/Desktop/proy Tienda virtual/tienda/app/views/tienda/carrito.scala.html
                    HASH: d15189178b01af2c1e5b45dc96edbee222671e04
                    MATRIX: 791->1|954->35|991->74|1024->99|1062->100|1124->135|1152->136|1397->354|1426->355|1483->384|1512->385|1619->465|1648->466|1712->502|1741->503|1976->711|2005->712|2068->747|2097->748|2201->825|2230->826|2280->848|2309->849|2609->1122|2638->1123|2701->1158|2730->1159|2879->1281|2908->1282|2987->1333|3016->1334|3079->1370|3108->1371|3194->1429|3223->1430|3287->1467|3316->1468|3388->1512|3417->1513|3574->1643|3603->1644|3685->1698|3714->1699|4526->2484|4555->2485|4627->2529|4656->2530|4933->2780|4962->2781|5056->2847|5085->2848|5188->2924|5217->2925|5304->2984|5333->2985|5470->3095|5499->3096|5584->3153|5613->3154|5675->3189|5704->3190|5793->3251|5822->3252|5885->3288|5914->3289|5968->3315|5997->3316|6280->3571|6310->3572|6367->3600|6397->3601|6515->3691|6545->3692|6609->3727|6639->3728|6759->3820|6789->3821|6850->3853|6880->3854|7090->4036|7120->4037|7187->4075|7217->4076|7396->4227|7426->4228|7489->4262|7519->4263|7649->4365|7679->4366|7747->4405|7777->4406|7892->4493|7922->4494|7991->4534|8021->4535|8314->4800|8344->4801|8412->4840|8442->4841|8569->4940|8599->4941|8635->4958|8674->4959|8765->5021|8795->5022|8950->5148|8980->5149|9368->5508|9398->5509|9445->5527|9475->5528|10208->6232|10238->6233|10453->6419|10483->6420|10678->6586|10708->6587|10742->6592|10772->6593|10854->6646|10884->6647|11006->6740|11036->6741|11235->6911|11265->6912|11328->6946|11358->6947|11785->7345|11815->7346|11995->7497|12025->7498|12180->7624|12210->7625|13806->9192|13836->9193|13888->9216|13918->9217|13966->9236|13996->9237|14863->10075|14893->10076|15436->10590|15466->10591|15636->10732|15666->10733|15933->10971|15963->10972|16647->11627|16677->11628|16724->11646|16754->11647|16830->11694|16860->11695|16965->11771|16995->11772|17071->11819|17101->11820|17239->11929|17269->11930|17394->12026|17424->12027|17709->12283|17739->12284|17854->12370|17884->12371|18063->12521|18093->12522|18176->12576|18206->12577|18338->12680|18368->12681|18597->12881|18627->12882|18740->12966|18770->12967|18829->12997|18859->12998|18991->13101|19021->13102|19072->13124|19102->13125|19229->13223|19259->13224|19333->13269|19363->13270|19495->13373|19525->13374|19671->13491|19701->13492|19797->13559|19827->13560|19886->13590|19916->13591|20048->13694|20078->13695|20129->13717|20159->13718|20286->13816|20316->13817|20502->13974|20532->13975|20570->13985|20600->13986
                    LINES: 26->1|30->1|31->3|31->3|31->3|33->5|33->5|39->11|39->11|40->12|40->12|43->15|43->15|44->16|44->16|50->22|50->22|51->23|51->23|54->26|54->26|55->27|55->27|63->35|63->35|64->36|64->36|69->41|69->41|70->42|70->42|72->44|72->44|73->45|73->45|75->47|75->47|76->48|76->48|81->53|81->53|82->54|82->54|97->69|97->69|98->70|98->70|106->78|106->78|107->79|107->79|110->82|110->82|111->83|111->83|115->87|115->87|116->88|116->88|118->90|118->90|119->91|119->91|121->93|121->93|122->94|122->94|130->102|130->102|131->103|131->103|135->107|135->107|136->108|136->108|140->112|140->112|141->113|141->113|147->119|147->119|148->120|148->120|153->125|153->125|154->126|154->126|158->130|158->130|159->131|159->131|162->134|162->134|163->135|163->135|172->144|172->144|173->145|173->145|177->149|177->149|179->151|179->151|181->153|181->153|183->155|183->155|189->161|189->161|190->162|190->162|204->176|204->176|207->179|207->179|211->183|211->183|211->183|211->183|212->184|212->184|214->186|214->186|216->188|216->188|217->189|217->189|221->193|221->193|223->195|223->195|225->197|225->197|247->219|247->219|248->220|248->220|249->221|249->221|265->237|265->237|272->244|272->244|274->246|274->246|278->250|278->250|288->260|288->260|289->261|289->261|290->262|290->262|292->264|292->264|293->265|293->265|295->267|295->267|297->269|297->269|301->273|301->273|303->275|303->275|306->278|306->278|307->279|307->279|309->281|309->281|312->284|312->284|314->286|314->286|315->287|315->287|317->289|317->289|318->290|318->290|320->292|320->292|321->293|321->293|323->295|323->295|325->297|325->297|327->299|327->299|328->300|328->300|330->302|330->302|331->303|331->303|333->305|333->305|336->308|336->308|337->309|337->309
                    -- GENERATED --
                */
            