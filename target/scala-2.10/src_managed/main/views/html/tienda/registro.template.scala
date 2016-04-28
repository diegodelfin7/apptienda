
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
object registro extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Cliente,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String,cliente: Cliente):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.tienda.template


Seq[Any](format.raw/*1.36*/("""
"""),_display_(Seq[Any](/*3.2*/template(message,cliente)/*3.27*/{_display_(Seq[Any](format.raw/*3.28*/("""
    <style>
        h3 """),format.raw/*5.12*/("""{"""),format.raw/*5.13*/("""
            color: #333;
            font-family: "function-pro",Helvetiva,Arial,sans-serif;
            font-weight: normal;
            line-height: 1.1em;
            text-transform: uppercase;
            margin: 16px 0;
        """),format.raw/*12.9*/("""}"""),format.raw/*12.10*/("""
        #content #createAccount .ui-formRow """),format.raw/*13.45*/("""{"""),format.raw/*13.46*/("""
            float: left;
            margin: 10px;
            position: relative;
            width: 440px;
        """),format.raw/*18.9*/("""}"""),format.raw/*18.10*/("""
        #form-account-create .button """),format.raw/*19.38*/("""{"""),format.raw/*19.39*/("""
            margin-top: 20px;
            width: 150px;
            position: relative;
            left: -320px;
        """),format.raw/*24.9*/("""}"""),format.raw/*24.10*/("""
    </style>
""")))}/*26.2*/{_display_(Seq[Any](format.raw/*26.3*/("""
    <div id="createAccount">
        """),_display_(Seq[Any](/*28.10*/if(cliente==null)/*28.27*/{_display_(Seq[Any](format.raw/*28.28*/("""<h3>Crear una nueva cuenta</h3>""")))}/*28.60*/else/*28.64*/{_display_(Seq[Any](format.raw/*28.65*/("""<h3>Editar cuenta</h3>""")))})),format.raw/*28.88*/("""
        <div>
            <form id="form-account-create" """),_display_(Seq[Any](/*30.45*/if(cliente==null)/*30.62*/{_display_(Seq[Any](format.raw/*30.63*/("""action="/cliente/registro"""")))}/*30.90*/else/*30.94*/{_display_(Seq[Any](format.raw/*30.95*/("""action="/cliente/editar"""")))})),format.raw/*30.120*/(""" method="post">
                <fieldset class="ui-fieldset">
                    <div class="ui-formRow">
                        <label>Email</label>
                        <div>
                            <input type="text" id="email" name="email" """),_display_(Seq[Any](/*35.73*/if(cliente!=null)/*35.90*/{_display_(Seq[Any](format.raw/*35.91*/("""value=""""),_display_(Seq[Any](/*35.99*/{Cuenta.find.byId(cliente.cuenta.id).usuario})),format.raw/*35.144*/("""" disabled="disabled"""")))})),format.raw/*35.166*/(""" maxlength="30">
                        </div>
                    </div>
                    <div class="ui-formRow">
                        <label>Contraseña</label>
                        <div>
                            <input type="password" id="password" name="password" """),_display_(Seq[Any](/*41.83*/if(cliente!=null)/*41.100*/{_display_(Seq[Any](format.raw/*41.101*/("""value=""""),_display_(Seq[Any](/*41.109*/{Cuenta.find.byId(cliente.cuenta.id).clave})),format.raw/*41.152*/(""""""")))})),format.raw/*41.154*/(""" maxlength="30">
                        </div>
                    </div>
                    <div class="ui-formRow">
                        <label>Confirmar contraseña</label>
                        <div>
                            <input type="password" id="repassword" name="repassword" """),_display_(Seq[Any](/*47.87*/if(cliente!=null)/*47.104*/{_display_(Seq[Any](format.raw/*47.105*/("""value=""""),_display_(Seq[Any](/*47.113*/{Cuenta.find.byId(cliente.cuenta.id).clave})),format.raw/*47.156*/(""""""")))})),format.raw/*47.158*/(""" maxlength="30">
                        </div>
                    </div>
                    <div class="ui-formRow">
                        <label>Nombre(s)</label>
                        <div>
                            <input type="text" id="nombre" name="nombre" """),_display_(Seq[Any](/*53.75*/if(cliente!=null)/*53.92*/{_display_(Seq[Any](format.raw/*53.93*/("""value=""""),_display_(Seq[Any](/*53.101*/{cliente.nombre})),format.raw/*53.117*/(""""""")))})),format.raw/*53.119*/(""" maxlength="30">
                        </div>
                    </div>
                    <div class="ui-formRow">
                        <label>Apellido Paterno</label>
                        <div>
                            <input type="text" id="paterno" name="paterno" """),_display_(Seq[Any](/*59.77*/if(cliente!=null)/*59.94*/{_display_(Seq[Any](format.raw/*59.95*/("""value=""""),_display_(Seq[Any](/*59.103*/{cliente.paterno})),format.raw/*59.120*/(""""""")))})),format.raw/*59.122*/(""" maxlength="20">
                        </div>
                    </div>
                    <div class="ui-formRow">
                        <label>Apellido Materno</label>
                        <div>
                            <input type="text" id="materno" name="materno" """),_display_(Seq[Any](/*65.77*/if(cliente!=null)/*65.94*/{_display_(Seq[Any](format.raw/*65.95*/("""value=""""),_display_(Seq[Any](/*65.103*/{cliente.materno})),format.raw/*65.120*/(""""""")))})),format.raw/*65.122*/(""" maxlength="20">
                        </div>
                    </div>
                    <div class="ui-formRow" style="width: 100%;margin-bottom: -10px">
                        <label>Número de identificación</label>
                    </div>
                    <div class="ui-formRow">
                        <label>DNI (para personas y organizaciones)</label>
                        <div>
                            <input type="text" id="dni" name="dni" """),_display_(Seq[Any](/*74.69*/if(cliente!=null)/*74.86*/{_display_(Seq[Any](format.raw/*74.87*/("""value=""""),_display_(Seq[Any](/*74.95*/{cliente.dni})),format.raw/*74.108*/(""""""")))})),format.raw/*74.110*/(""" maxlength="8">
                        </div>
                    </div>
                    <div class="ui-formRow">
                        <label>RUC (solo para organizaciones)</label>
                        <div>
                            <input type="text" id="ruc" name="ruc" """),_display_(Seq[Any](/*80.69*/if(cliente!=null)/*80.86*/{_display_(Seq[Any](format.raw/*80.87*/("""value=""""),_display_(Seq[Any](/*80.95*/{cliente.ruc})),format.raw/*80.108*/(""""""")))})),format.raw/*80.110*/(""" maxlength="11">
                        </div>
                    </div>
                    <input class="button" """),_display_(Seq[Any](/*83.44*/if(cliente==null)/*83.61*/{_display_(Seq[Any](format.raw/*83.62*/("""id="registrar" value="Registrar"""")))}/*83.95*/else/*83.99*/{_display_(Seq[Any](format.raw/*83.100*/("""id="editar" value="Editar"""")))})),format.raw/*83.127*/(""" type="button">
                </fieldset>
            </form>
        </div>
    </div>
    <script>
        $.validator.addMethod(
            "existeEmail",
            function(value,element,params) """),format.raw/*91.44*/("""{"""),format.raw/*91.45*/("""
                var error="";
                if(params==true)"""),format.raw/*93.33*/("""{"""),format.raw/*93.34*/("""
                    $.ajax("""),format.raw/*94.28*/("""{"""),format.raw/*94.29*/("""
                        type: "POST",
                        async: false,
                        url: "/cliente/existecuenta",
                        data: """),format.raw/*98.31*/("""{"""),format.raw/*98.32*/("""usuario:value"""),format.raw/*98.45*/("""}"""),format.raw/*98.46*/(""",
                        success: function(msg)"""),format.raw/*99.47*/("""{"""),format.raw/*99.48*/("""
                            error=msg
                        """),format.raw/*101.25*/("""}"""),format.raw/*101.26*/("""
                    """),format.raw/*102.21*/("""}"""),format.raw/*102.22*/(""")
                """),format.raw/*103.17*/("""}"""),format.raw/*103.18*/("""
                if(error!="")$.validator.messages.existeEmail=error
                return error=="";
            """),format.raw/*106.13*/("""}"""),format.raw/*106.14*/("""
        )
        $("#form-account-create").validate("""),format.raw/*108.44*/("""{"""),format.raw/*108.45*/("""
            rules : """),format.raw/*109.21*/("""{"""),format.raw/*109.22*/("""email:"""),format.raw/*109.28*/("""{"""),format.raw/*109.29*/("""required:true,email:true"""),format.raw/*109.53*/("""}"""),format.raw/*109.54*/(""",password:"""),format.raw/*109.64*/("""{"""),format.raw/*109.65*/("""required:true"""),format.raw/*109.78*/("""}"""),format.raw/*109.79*/(""",repassword:"""),format.raw/*109.91*/("""{"""),format.raw/*109.92*/("""required:true,equalTo:"#password""""),format.raw/*109.125*/("""}"""),format.raw/*109.126*/(""",
            nombre:"""),format.raw/*110.20*/("""{"""),format.raw/*110.21*/("""required:true"""),format.raw/*110.34*/("""}"""),format.raw/*110.35*/(""",paterno:"""),format.raw/*110.44*/("""{"""),format.raw/*110.45*/("""required:true"""),format.raw/*110.58*/("""}"""),format.raw/*110.59*/(""",materno:"""),format.raw/*110.68*/("""{"""),format.raw/*110.69*/("""required:true"""),format.raw/*110.82*/("""}"""),format.raw/*110.83*/("""}"""),format.raw/*110.84*/(""",
            errorElement:'div',
            errorPlacement : function ( error, element ) """),format.raw/*112.58*/("""{"""),format.raw/*112.59*/("""
                $ (error).addClass('alert alert-danger').css("""),format.raw/*113.62*/("""{"""),format.raw/*113.63*/("""width: "60%","font-size": "1.3rem""""),format.raw/*113.97*/("""}"""),format.raw/*113.98*/(""")
                $(element).after(error)
            """),format.raw/*115.13*/("""}"""),format.raw/*115.14*/("""
        """),format.raw/*116.9*/("""}"""),format.raw/*116.10*/(""")
        $("#registrar,#editar").click(function()"""),format.raw/*117.49*/("""{"""),format.raw/*117.50*/("""
            if(!$("#form-account-create").valid())return false
            else $("#form-account-create").submit()
        """),format.raw/*120.9*/("""}"""),format.raw/*120.10*/(""")
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
                    SOURCE: /Users/diegodelfin7/Desktop/proy Tienda virtual/tienda/app/views/tienda/registro.scala.html
                    HASH: a65a272aaaa95a89834cc834cff26057ad2975ca
                    MATRIX: 792->1|955->35|992->74|1025->99|1063->100|1116->126|1144->127|1412->368|1441->369|1515->415|1544->416|1694->539|1723->540|1790->579|1819->580|1974->708|2003->709|2038->726|2076->727|2153->768|2179->785|2218->786|2269->818|2282->822|2321->823|2376->846|2473->907|2499->924|2538->925|2584->952|2597->956|2636->957|2694->982|2990->1242|3016->1259|3055->1260|3099->1268|3167->1313|3222->1335|3546->1623|3573->1640|3613->1641|3658->1649|3724->1692|3759->1694|4097->1996|4124->2013|4164->2014|4209->2022|4275->2065|4310->2067|4625->2346|4651->2363|4690->2364|4735->2372|4774->2388|4809->2390|5133->2678|5159->2695|5198->2696|5243->2704|5283->2721|5318->2723|5642->3011|5668->3028|5707->3029|5752->3037|5792->3054|5827->3056|6343->3536|6369->3553|6408->3554|6452->3562|6488->3575|6523->3577|6852->3870|6878->3887|6917->3888|6961->3896|6997->3909|7032->3911|7189->4032|7215->4049|7254->4050|7306->4083|7319->4087|7359->4088|7419->4115|7659->4327|7688->4328|7781->4393|7810->4394|7867->4423|7896->4424|8089->4589|8118->4590|8159->4603|8188->4604|8265->4653|8294->4654|8388->4719|8418->4720|8469->4742|8499->4743|8547->4762|8577->4763|8724->4881|8754->4882|8839->4938|8869->4939|8920->4961|8950->4962|8985->4968|9015->4969|9068->4993|9098->4994|9137->5004|9167->5005|9209->5018|9239->5019|9280->5031|9310->5032|9373->5065|9404->5066|9455->5088|9485->5089|9527->5102|9557->5103|9595->5112|9625->5113|9667->5126|9697->5127|9735->5136|9765->5137|9807->5150|9837->5151|9867->5152|9989->5245|10019->5246|10111->5309|10141->5310|10204->5344|10234->5345|10319->5401|10349->5402|10387->5412|10417->5413|10497->5464|10527->5465|10682->5592|10712->5593
                    LINES: 26->1|30->1|31->3|31->3|31->3|33->5|33->5|40->12|40->12|41->13|41->13|46->18|46->18|47->19|47->19|52->24|52->24|54->26|54->26|56->28|56->28|56->28|56->28|56->28|56->28|56->28|58->30|58->30|58->30|58->30|58->30|58->30|58->30|63->35|63->35|63->35|63->35|63->35|63->35|69->41|69->41|69->41|69->41|69->41|69->41|75->47|75->47|75->47|75->47|75->47|75->47|81->53|81->53|81->53|81->53|81->53|81->53|87->59|87->59|87->59|87->59|87->59|87->59|93->65|93->65|93->65|93->65|93->65|93->65|102->74|102->74|102->74|102->74|102->74|102->74|108->80|108->80|108->80|108->80|108->80|108->80|111->83|111->83|111->83|111->83|111->83|111->83|111->83|119->91|119->91|121->93|121->93|122->94|122->94|126->98|126->98|126->98|126->98|127->99|127->99|129->101|129->101|130->102|130->102|131->103|131->103|134->106|134->106|136->108|136->108|137->109|137->109|137->109|137->109|137->109|137->109|137->109|137->109|137->109|137->109|137->109|137->109|137->109|137->109|138->110|138->110|138->110|138->110|138->110|138->110|138->110|138->110|138->110|138->110|138->110|138->110|138->110|140->112|140->112|141->113|141->113|141->113|141->113|143->115|143->115|144->116|144->116|145->117|145->117|148->120|148->120
                    -- GENERATED --
                */
            