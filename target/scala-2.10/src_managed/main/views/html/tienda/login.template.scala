
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.tienda.template


Seq[Any](format.raw/*1.19*/("""
"""),_display_(Seq[Any](/*3.2*/template(message,null)/*3.24*/{_display_(Seq[Any](format.raw/*3.25*/("""
    <style>
        h3 """),format.raw/*5.12*/("""{"""),format.raw/*5.13*/("""
            color: #333;
            font-family: "function-pro",Helvetiva,Arial,sans-serif;
            font-weight: normal;
            line-height: 1.1em;
            text-transform: uppercase;
            margin: 16px 0;
        """),format.raw/*12.9*/("""}"""),format.raw/*12.10*/("""
        .alert """),format.raw/*13.16*/("""{"""),format.raw/*13.17*/("""
            font-size: 1.5rem;
            width: 70%;
            margin-top: 20px;
        """),format.raw/*17.9*/("""}"""),format.raw/*17.10*/("""
    </style>
""")))}/*19.2*/{_display_(Seq[Any](format.raw/*19.3*/("""
    <div class="unit">
        <h3>cliente nuevo</h3>
        <p class="newcustomer">le invitamos a registrarse como nuevo cliente</p>
        <a class="button" href="/cliente/registro">Continuar</a>
    </div>
    <div class="unit lastUnit">
        <h3>clientes registrados</h3>
        <form id="form-account-login" action="/home/login" method="post">
            <fieldset class="ui-fieldset">
                <div class="ui-formRow">
                    <label>Email</label>
                    <div>
                        <input type="text" id="email" name="email" maxlength="70">
                    </div>
                </div>
                <div class="ui-formRow">
                    <label>Contraseña</label>
                    <div>
                        <input type="password" id="clave" name="clave" maxlength="70">
                    </div>
                </div>
                """),_display_(Seq[Any](/*41.18*/if(flash.contains("type"))/*41.44*/{_display_(Seq[Any](format.raw/*41.45*/("""
                    <div class="alert alert-"""),_display_(Seq[Any](/*42.46*/{flash.get("type")})),format.raw/*42.65*/("""">
                    """),_display_(Seq[Any](/*43.22*/flash/*43.27*/.get(flash.get("type")))),format.raw/*43.50*/("""
                    </div>
                """)))})),format.raw/*45.18*/("""
            </fieldset>
            <input class="button" type="submit" value="iniciar sesión">
        </form>
    </div>
""")))})))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 27 23:42:13 PET 2016
                    SOURCE: /Users/diegodelfin7/Desktop/proy Tienda virtual/tienda/app/views/tienda/login.scala.html
                    HASH: f160c0fb30f0ed193b84f87a59ce6fc0074d6ac0
                    MATRIX: 781->1|927->18|964->57|994->79|1032->80|1085->106|1113->107|1381->348|1410->349|1455->366|1484->367|1609->465|1638->466|1673->483|1711->484|2676->1413|2711->1439|2750->1440|2833->1487|2874->1506|2935->1531|2949->1536|2994->1559|3073->1606
                    LINES: 26->1|30->1|31->3|31->3|31->3|33->5|33->5|40->12|40->12|41->13|41->13|45->17|45->17|47->19|47->19|69->41|69->41|69->41|70->42|70->42|71->43|71->43|71->43|73->45
                    -- GENERATED --
                */
            