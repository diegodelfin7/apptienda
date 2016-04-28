
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
object template extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,Cliente,Html,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String,cliente: Cliente)(content1: Html)(content2: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.68*/("""
"""),_display_(Seq[Any](/*2.2*/main(message)/*2.15*/ {_display_(Seq[Any](format.raw/*2.17*/("""
    <style>
        body """),format.raw/*4.14*/("""{"""),format.raw/*4.15*/("""
            font: 1em/1.5em Tahoma,Arial,sans-serif;
        """),format.raw/*6.9*/("""}"""),format.raw/*6.10*/("""
        ul"""),format.raw/*7.11*/("""{"""),format.raw/*7.12*/("""
            margin: 0;
            padding: 0;
        """),format.raw/*10.9*/("""}"""),format.raw/*10.10*/("""
        li """),format.raw/*11.12*/("""{"""),format.raw/*11.13*/("""
            list-style: none;
        """),format.raw/*13.9*/("""}"""),format.raw/*13.10*/("""
        #header """),format.raw/*14.17*/("""{"""),format.raw/*14.18*/("""
            margin: 2px auto;
            width: 940px;
            height: 80px;
        """),format.raw/*18.9*/("""}"""),format.raw/*18.10*/("""
        #header div """),format.raw/*19.21*/("""{"""),format.raw/*19.22*/("""
            display: inline-block;
        """),format.raw/*21.9*/("""}"""),format.raw/*21.10*/("""
        #header-search-bar """),format.raw/*22.28*/("""{"""),format.raw/*22.29*/("""
            width: 560px;
        """),format.raw/*24.9*/("""}"""),format.raw/*24.10*/("""
        #searchInput """),format.raw/*25.22*/("""{"""),format.raw/*25.23*/("""
            width: 530px;
            height: 35px;
            background: #f2f2f2;
            border-radius: 5px 0 0 5px;
            padding: 8px;
            color: #7f7f7f;
            font-size: 1.3rem;
        """),format.raw/*33.9*/("""}"""),format.raw/*33.10*/("""
        #searchBtn """),format.raw/*34.20*/("""{"""),format.raw/*34.21*/("""
            display:none;
            height: 35px;
            border: 1px solid #316C92;
            border-radius: 0 5px 5px 0;
            padding: 7px 10px 6px 25px;
            background-position: left;
            background-color: #3883A0;
            background-image: -webkit-linear-gradient(top,#3EA6C5, #3F6F89);
            font-size: 1.4em;
            color: white;
            text-transform: uppercase;
            text-shadow: 0 1px 0 rgba(0,0,0,0.5);
            position: relative;
            left: -5px;
            top: 31px;
        """),format.raw/*50.9*/("""}"""),format.raw/*50.10*/("""
        #header-search-bar img"""),format.raw/*51.31*/("""{"""),format.raw/*51.32*/("""
            display: none;
            position: relative;
            left: 532px;
            top: 6px;
        """),format.raw/*56.9*/("""}"""),format.raw/*56.10*/("""
        #searchBtn:hover"""),format.raw/*57.25*/("""{"""),format.raw/*57.26*/("""
            background-image: none;
            background-color: #40CBD9;
        """),format.raw/*60.9*/("""}"""),format.raw/*60.10*/("""
        #header-user """),format.raw/*61.22*/("""{"""),format.raw/*61.23*/("""
            font-family: "function-pro",Helvetiva,Arial,sans-serif;
            text-shadow: 0 1px 0 white;
            text-transform: uppercase;
            border-radius: 0;
            box-shadow: 0 0 5px #444;
            height: 70px;
            width: 180px;
        """),format.raw/*69.9*/("""}"""),format.raw/*69.10*/("""
        #header-user a """),format.raw/*70.24*/("""{"""),format.raw/*70.25*/("""
            padding: 2px 9px 2px 35px;
            color: #4386A1;
        """),format.raw/*73.9*/("""}"""),format.raw/*73.10*/("""
        #header-user div """),format.raw/*74.26*/("""{"""),format.raw/*74.27*/("""
            width: 100%;
        """),format.raw/*76.9*/("""}"""),format.raw/*76.10*/("""
        #user-nav-login """),format.raw/*77.25*/("""{"""),format.raw/*77.26*/("""
            border-bottom: solid 1px white;
            background-image: -webkit-linear-gradient(top,#ddd,white);
        """),format.raw/*80.9*/("""}"""),format.raw/*80.10*/("""
        #user-nav-cart """),format.raw/*81.24*/("""{"""),format.raw/*81.25*/("""
            border-top: 1px solid #ccc;
            background: #FFF;
            box-shadow: 0 2px 2px rgba(0,0,0,0.2);
            font-size: 12px;
            height: 25px;
            margin: 0 0 29px 0;
            padding-bottom: 0;
        """),format.raw/*89.9*/("""}"""),format.raw/*89.10*/("""
        #user-nav-cart a """),format.raw/*90.26*/("""{"""),format.raw/*90.27*/("""
            padding: 4px 5px 4px 10px;
            display: block;
        """),format.raw/*93.9*/("""}"""),format.raw/*93.10*/("""
        #user-nav-cart .user-nav-cart-items """),format.raw/*94.45*/("""{"""),format.raw/*94.46*/("""
            border-radius: 22px;
            box-shadow: 0 1px 1px rgba(0,0,0,0.6);
            color: #fff;
            font-weight: 100;
            padding: 1px;
            float: right;
            text-shadow: none;
            background-color: #4386A1;
        """),format.raw/*103.9*/("""}"""),format.raw/*103.10*/("""
        #user-nav-cart img """),format.raw/*104.28*/("""{"""),format.raw/*104.29*/("""
            position: relative;
            left: -5px;
            top: -4px;
        """),format.raw/*108.9*/("""}"""),format.raw/*108.10*/("""
        #user-nav-cart .user-nav-cart-grand-total """),format.raw/*109.51*/("""{"""),format.raw/*109.52*/("""
            font-size: 18px;
        """),format.raw/*111.9*/("""}"""),format.raw/*111.10*/("""
        #header-menu """),format.raw/*112.22*/("""{"""),format.raw/*112.23*/("""
            border-top: 1px solid #ccc;
            box-shadow: 0 0 6px rgba(0,0,0,0.3);
            height: 40px;
            background-image: -webkit-linear-gradient(top,white,#e5e5e5 94%,#ccc 98%,#999);
        """),format.raw/*117.9*/("""}"""),format.raw/*117.10*/("""
        .nav_menu """),format.raw/*118.19*/("""{"""),format.raw/*118.20*/("""
            width: 950px;
            margin: 0 auto;
            padding: 0;
        """),format.raw/*122.9*/("""}"""),format.raw/*122.10*/("""
        .nav_element """),format.raw/*123.22*/("""{"""),format.raw/*123.23*/("""
            display: inline-block;
        """),format.raw/*125.9*/("""}"""),format.raw/*125.10*/("""
        a.nav_element-link """),format.raw/*126.28*/("""{"""),format.raw/*126.29*/("""
            display: table-cell;
            padding: 0 6px;
            width: 88px;
            height: 40px;
            text-align: center;
            vertical-align: middle;
            word-wrap: break-word;
            font: 12px/1em "function-pro",Helvetiva,Arial,sans-serif;
            font-size: 1.2rem;
            color: #444;
            text-transform: uppercase;
            text-decoration: none;
        """),format.raw/*139.9*/("""}"""),format.raw/*139.10*/("""
        .nav_element-link:hover,.is_active .nav_element-link"""),format.raw/*140.61*/("""{"""),format.raw/*140.62*/("""
            color: #fff;
            text-shadow: 0 1px 0 rgba(0,0,0,.5);
            background-color: #458BA5;
            background-image: -webkit-linear-gradient(top,#50B9E0,#1E6283);
            background-image: linear-gradient(to bottom,#50B9E0,#1E6283);
        """),format.raw/*146.9*/("""}"""),format.raw/*146.10*/("""
        .is_active .nav_element-container """),format.raw/*147.43*/("""{"""),format.raw/*147.44*/("""
            display: block;
        """),format.raw/*149.9*/("""}"""),format.raw/*149.10*/("""
        .nav_element-container """),format.raw/*150.32*/("""{"""),format.raw/*150.33*/("""
            display: none;
            position: absolute;
            width: 940px;
            height: 400px;
            min-height: 120px;
            left: 160px;
            margin-top: -1px;
            padding: 10px 0;
            background-color: #fff;
            background-color: rgba(255,255,255,.98);
            box-shadow: 0 0 2px 0 rgba(0,0,0,.4);
            z-index: 50;
        """),format.raw/*163.9*/("""}"""),format.raw/*163.10*/("""
        #content h1 """),format.raw/*164.21*/("""{"""),format.raw/*164.22*/("""
            height: 30px;
            margin: 0 auto;
            max-width: 940px;
        """),format.raw/*168.9*/("""}"""),format.raw/*168.10*/("""
        #searchResult """),format.raw/*169.23*/("""{"""),format.raw/*169.24*/("""
            font-family: "function-pro",Helvetiva,Arial,sans-serif;
            font-weight: 100;
            margin-top: 5px;
            margin-bottom: 5px;
            line-height: 18px;
            color: #666;
            background: #fff;
            -webkit-box-shadow: 0 1px 2px rgba(0,0,0,0.3);
            box-shadow: 0 1px 2px rgba(0,0,0,0.3);
            position: absolute;
            width: 529px;
            border-radius: 0!important;
            left: 26%;
            top: 70px;
            z-index: 100;
        """),format.raw/*185.9*/("""}"""),format.raw/*185.10*/("""
        #searchResult ul h3 """),format.raw/*186.29*/("""{"""),format.raw/*186.30*/("""
            text-transform: uppercase;
            padding-left: 10px;
            font-size: 1.6rem;
        """),format.raw/*190.9*/("""}"""),format.raw/*190.10*/("""
        #searchResult a """),format.raw/*191.25*/("""{"""),format.raw/*191.26*/("""
            display: block;
            padding: 2px 10px;
        """),format.raw/*194.9*/("""}"""),format.raw/*194.10*/("""
        #searchResult a:hover """),format.raw/*195.31*/("""{"""),format.raw/*195.32*/("""
            background-color: #EEE;
        """),format.raw/*197.9*/("""}"""),format.raw/*197.10*/("""
        .search-category span,.search-brand span"""),format.raw/*198.49*/("""{"""),format.raw/*198.50*/("""
            color: #4386A1
        """),format.raw/*200.9*/("""}"""),format.raw/*200.10*/("""
        .search-brand a,span.brand-name """),format.raw/*201.41*/("""{"""),format.raw/*201.42*/("""
            color: #000;
        """),format.raw/*203.9*/("""}"""),format.raw/*203.10*/("""
        #content """),format.raw/*204.18*/("""{"""),format.raw/*204.19*/("""
            margin: 0 auto!important;
            position: relative;
            width: 940px;
            min-height: 300px;
        """),format.raw/*209.9*/("""}"""),format.raw/*209.10*/("""
        #content .unit """),format.raw/*210.24*/("""{"""),format.raw/*210.25*/("""
            float: left;
            margin-top: 60px;
            padding: 10px;
            #width: 449px;
            width: 50%;
        """),format.raw/*216.9*/("""}"""),format.raw/*216.10*/("""
        #content .lastUnit """),format.raw/*217.28*/("""{"""),format.raw/*217.29*/("""
            border-left: 1px dotted #ccc;
        """),format.raw/*219.9*/("""}"""),format.raw/*219.10*/("""
        #content .newcustomer """),format.raw/*220.31*/("""{"""),format.raw/*220.32*/("""
            color: #458BA5;
            font-family: "function-pro",Helvetiva,Arial,sans-serif;
            font-size: 20px;
            line-height: 1.2;
            padding: 0 20px 0 0;
            text-align: center;
            text-transform: uppercase;
        """),format.raw/*228.9*/("""}"""),format.raw/*228.10*/("""
        .ui-formRow label """),format.raw/*229.27*/("""{"""),format.raw/*229.28*/("""
            font-size: 13px;
            font-size: 1.4rem;
            line-height: 18px;
            color: #7f7f7f;
        """),format.raw/*234.9*/("""}"""),format.raw/*234.10*/("""
        .ui-formRow input """),format.raw/*235.27*/("""{"""),format.raw/*235.28*/("""
            font: 13px/15px Tahoma,Arial,sans-serif;
            font-size: 1.3rem;
            width: 60%;
            border: solid 1px #bfbfbf;
            border-radius: 5px;
            -webkit-box-shadow: 0 1px 2px rgba(0,0,0,0.2) inset;
            box-shadow: 0 1px 2px rgba(0,0,0,0.2) inset;
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            box-sizing: border-box;
            color: #7f7f7f;
            padding: 2px 5px;
        """),format.raw/*248.9*/("""}"""),format.raw/*248.10*/("""
        #content .button """),format.raw/*249.26*/("""{"""),format.raw/*249.27*/("""
            background-image: -webkit-linear-gradient(top,#50B9E0,#1E6283);
            border-radius: 5px;
            box-shadow: 0 1px 2px rgba(0,0,0,0.3);
            color: #fff;
            font: 100 18px/20px "function-pro",Helvetiva,Arial,sans-serif;
            float: right;
            padding: 3px 10px 3px 30px;
            position: relative;
            text-decoration: none;
            text-shadow: 0 1px 0 rgba(0,0,0,0.5);
            text-transform: uppercase;
        """),format.raw/*261.9*/("""}"""),format.raw/*261.10*/("""
        #form-account-login .button """),format.raw/*262.37*/("""{"""),format.raw/*262.38*/("""
            float: left;
            margin-left: 100px;
            margin-top: 10px;
        """),format.raw/*266.9*/("""}"""),format.raw/*266.10*/("""
        #content fieldset """),format.raw/*267.27*/("""{"""),format.raw/*267.28*/("""
            border: 0;
        """),format.raw/*269.9*/("""}"""),format.raw/*269.10*/("""
        #content .ui-formRow """),format.raw/*270.30*/("""{"""),format.raw/*270.31*/("""
            margin: 5px 0;
        """),format.raw/*272.9*/("""}"""),format.raw/*272.10*/("""
        .elements-4 .col-3 """),format.raw/*273.28*/("""{"""),format.raw/*273.29*/("""
            padding: 0 10px;
            width: 224px;
        """),format.raw/*276.9*/("""}"""),format.raw/*276.10*/("""
        .elements-2 .col-3 """),format.raw/*277.28*/("""{"""),format.raw/*277.29*/("""
            padding: 0 10px;
            width: 264px;
        """),format.raw/*280.9*/("""}"""),format.raw/*280.10*/("""
        .col-3 """),format.raw/*281.16*/("""{"""),format.raw/*281.17*/("""
            float: left;
            padding: 0 15px 15px;
            width: 206px;
            border-right: 1px solid #e8e8e8;
            height: 375px;
        """),format.raw/*287.9*/("""}"""),format.raw/*287.10*/("""
        .subnav__title, .subnav__category """),format.raw/*288.43*/("""{"""),format.raw/*288.44*/("""
            display: block;
            font-family: "function-pro",Helvetiva,Arial,sans-serif;
            text-decoration: none;
            margin-left: 5px;
        """),format.raw/*293.9*/("""}"""),format.raw/*293.10*/("""
        .subnav__title, .subnav__title:link, .subnav__title:visited """),format.raw/*294.69*/("""{"""),format.raw/*294.70*/("""
            color: #000;
            font-size: 14px;
            text-transform: uppercase;
            line-height: 18px;
            padding-top: 15px;
        """),format.raw/*300.9*/("""}"""),format.raw/*300.10*/("""
        .subnav__category, .subnav__category:link, .subnav__category:visited """),format.raw/*301.78*/("""{"""),format.raw/*301.79*/("""
            margin-top: 5px;
            margin-bottom: 5px;
            font-size: 14px;
            font-weight: 100;
            line-height: 18px;
            color: #666;
        """),format.raw/*308.9*/("""}"""),format.raw/*308.10*/("""
        .subnav__title:hover """),format.raw/*309.30*/("""{"""),format.raw/*309.31*/("""
            color: #4386A1;
        """),format.raw/*311.9*/("""}"""),format.raw/*311.10*/("""
        .subnav__category:hover """),format.raw/*312.33*/("""{"""),format.raw/*312.34*/("""
            text-decoration: underline;
        """),format.raw/*314.9*/("""}"""),format.raw/*314.10*/("""
    </style>
    """),_display_(Seq[Any](/*316.6*/content1)),format.raw/*316.14*/("""
    <div id="header">
        <a href="/home" id="logo">
            <img src="/assets/images/logo.jpg" width="160px" height="66px" style="margin-top: -20px;">
        </a>
        <div id="header-search-bar">
            <input type="text" id="searchInput" placeholder="Buscar por palabras claves, marcas, productos">
            <input type="button" id="searchBtn" value="Buscar"><img src="/assets/images/icon_searchbox.png">
            <div id="searchResult">
            </div>
        </div>
        <div id="header-user">
            <div id="user-nav-login">
                """),_display_(Seq[Any](/*329.18*/if(cliente==null)/*329.35*/{_display_(Seq[Any](format.raw/*329.36*/("""
                    <a href="/home/login">Iniciar Sesión</a>
                """)))})),format.raw/*331.18*/("""
                """),_display_(Seq[Any](/*332.18*/if(cliente!=null)/*332.35*/{_display_(Seq[Any](format.raw/*332.36*/("""
                    <a href="/cliente/editar" style="padding:0;color:inherit;"><strong style="width:90px;overflow: hidden">
                        """),_display_(Seq[Any](/*334.26*/Cliente/*334.33*/.find.byId(cliente.id).nombre)),format.raw/*334.62*/("""
                    </strong></a>
                    <a href="/home/logout" style="padding: 0;float:right">Cerrar sesión</a>
                """)))})),format.raw/*337.18*/("""
            </div>
            <div id="user-nav-cart">
                <a href="/home/carrito">
                    Mi Carrito <span class="user-nav-cart-items">(0)</span>
                    <div style="position: relative;top: 10px;">
                        <img src="/assets/images/carrito.jpg" width="25px" height="25px">
                        <span class="user-nav-cart-grand-total">
                            S/. 0.00
                        </span>
                    </div>
                </a>
            </div>
            <script>
                if(localStorage.carrito!=undefined && localStorage.carrito!="")"""),format.raw/*351.80*/("""{"""),format.raw/*351.81*/("""
                    var total=0;
                    var items=0;
                    for(var i in localStorage.carrito.split(","))"""),format.raw/*354.66*/("""{"""),format.raw/*354.67*/("""
                        var id=localStorage.carrito.split(",")[i].split(":")[0]
                        var cant=localStorage.carrito.split(",")[i].split(":")[1]
                         $.ajax("""),format.raw/*357.33*/("""{"""),format.raw/*357.34*/("""
                            type : "POST",
                            url : "/home/producto/ver",
                            async : false,
                            data : """),format.raw/*361.36*/("""{"""),format.raw/*361.37*/("""id:id"""),format.raw/*361.42*/("""}"""),format.raw/*361.43*/(""",
                            success:function(producto)"""),format.raw/*362.55*/("""{"""),format.raw/*362.56*/("""
                                total+=parseFloat(producto.precio_actual)*cant   
                                items+=parseInt(cant)           
                            """),format.raw/*365.29*/("""}"""),format.raw/*365.30*/("""
                        """),format.raw/*366.25*/("""}"""),format.raw/*366.26*/(""")
                     """),format.raw/*367.22*/("""}"""),format.raw/*367.23*/("""
                    $(".user-nav-cart-items").text(items)
                    $(".user-nav-cart-grand-total").text("S/. "+parseDouble(total))
                """),format.raw/*370.17*/("""}"""),format.raw/*370.18*/("""
                function parseDouble(numero)"""),format.raw/*371.45*/("""{"""),format.raw/*371.46*/("""
                    return parseFloat(numero).toFixed(2)
                """),format.raw/*373.17*/("""}"""),format.raw/*373.18*/("""
            </script>
        </div>
    </div>
    <div id="header-menu">
        <ul class="nav_menu">
            <li class="nav_element">
                <a class="nav_element-link">Ofertas</a>
            </li>
            <li class="nav_element">
                <a class="nav_element-link" href="/categoria/celulares-telefonia-y-gps">Celulares y Tablets</a>
                <div class="nav_element-container">
                    <div class="elements-2">
                        <div class="col-3">
                            <a href="/categoria/celulares" class="subnav__title">Celulares</a>
                            <a href="/categoria/smartphones" class="subnav__category">Smartphones</a>
                            <a href="/categoria/dual-sim" class="subnav__category">Dual Sim</a>
                            <a href="/categoria/basicos" class="subnav__category">Celulares básicos</a>
                            <a href="/categoria/smartwatch" class="subnav__category">Smartwatches</a>

                            <a href="#" class="subnav__title">MÁS VISTOS</a>
                            <a href="/marca/celulares/samsung" class="subnav__category">Samsung Galaxy</a>
                            <a href="/categoria/celulares-iphones" class="subnav__category">iPhone</a>
                            <a href="/marca/celulares/motorola" class="subnav__category">Motorola</a>
                            <a href="/marca/celulares/sony" class="subnav__category">Sony Xperia</a>
                            <a href="/marca/celulares/lg" class="subnav__category">LG</a>
                        </div>
                        <div class="col-3">
                            <a href="/categoria/accesorios-para-celulares" class="subnav__title">ACCESORIOS PARA CELULARES</a>
                            <a href="/categoria/audifonos-celulares" class="subnav__category">Audífonos</a>
                            <a href="/categoria/cases" class="subnav__category">Cases y protectores</a>
                            <a href="/categoria/cargadores" class="subnav__category">Cargadores</a>
                            <a href="/categoria/parlantes" class="subnav__category">Parlantes</a>
                            <a href="/categoria/otros-accesorios" class="subnav__category">Otros accesorios</a>
                        </div>
                        <div class="col-3">
                            <a href="/categoria/tablets-y-accesorios" class="subnav__title">TABLETS Y ACCESORIOS</a>
                            <a href="/categoria/tablets" class="subnav__category">Tablets</a>
                            <a href="/categoria/tablets-ipad" class="subnav__category">iPads</a>
                            <a href="/categoria/accesorios-tablets" class="subnav__category">Accesorios para tablets</a>
                            <a href="/categoria/gps" class="subnav__title">GPS</a>
                            <a href="/categoria/telefonia-fija" class="subnav__title">TELEFONÍA FIJA</a>
                        </div>
                    </div>
                </div>
            </li>
             <li class="nav_element">
                <a class="nav_element-link" href="/categoria/tv-audio-y-video">TV , Audio, y Foto</a>
                <div class="nav_element-container">
                    <div class="elements-2">
                        <div class="col-3">
                            <a href="/categoria/tv-audio-y-video" class="subnav__title">Tv y video</a>
                            <a href="/categoria/televisores" class="subnav__category">Televisores</a>
                            <a href="/categoria/reproductores-de-video" class="subnav__category">DVDs y Blu-Ray</a>
                            <a href="/categoria/cine-en-casa" class="subnav__category">Cine en Casa</a>
                            <a href="/categoria/accesorios-para-tvs" class="subnav__category">Accesorios para TV</a>
                            <a href="#" class="subnav__title">MÁS VISTOS</a>
                            <a href="/categoria/televisores-3d-smart" class="subnav__category">Smart 3D TV</a>
                            <a href="/categoria/led" class="subnav__category">LED TV</a>
                            <a href="/categoria/televisores-ultra-hd-y-4k" class="subnav__category">UHD y 4K</a>
                            <a href="/marca/televisores/samsung" class="subnav__category">Samsung</a>
                            <a href="/marca/televisores/lg" class="subnav__category">LG</a>
                            <a href="/marca/televisores/sony" class="subnav__category">Sony Bravia</a>
                        </div>
                        <div class="col-3">
                            <a href="/categoria/audio" class="subnav__title">Audio</a>
                            <a href="/categoria/audifonos" class="subnav__category">Audífonos</a>
                            <a href="/categoria/docks-y-parlantes" class="subnav__category">Docks y Parlantes</a>
                            <a href="/categoria/ipods-y-reproductores-mp3" class="subnav__category">Reproductores MP3</a>
                            <a href="/categoria/mini-y-microcomponentes" class="subnav__category">Mini y Microcomponentes</a>
                            <a href="/categoria/audio-profesional" class="subnav__category">Audio profesional</a>
                            <a href="/categoria/audio-para-autos" class="subnav__category">Audio para autos</a>
                            <a href="#" class="subnav__title">MÁS VISTOS</a>
                            <a href="/marca/audio/sony" class="subnav__category">Sony</a>
                            <a href="/marca/audio/philips" class="subnav__category">Philips</a>
                            <a href="/marca/audio/beats" class="subnav__category">Beats</a>
                            <a href="/marca/audio/skullcandy" class="subnav__category">Skullcandy</a>
                        </div>
                        <div class="col-3">
                            <a href="/categoria/camaras-y-fotografia" class="subnav__title">FOTOGRAFÍA</a>
                            <a href="/categoria/camaras-digitales" class="subnav__category">Cámaras digitales</a>
                            <a href="/home" class="subnav__category">Cámaras profesionales</a>
                            <a href="/home" class="subnav__category">Cámaras de seguridad</a>
                            <a href="/home" class="subnav__category">Cámaras deportivas</a>
                            <a href="/home" class="subnav__category">Videocámaras</a>
                            <a href="/home" class="subnav__category">Accesorios, lentes y objetivos</a>
                            <a href="#" class="subnav__title">MÁS VISTOS</a>
                            <a href="/home" class="subnav__category">Canon</a>
                            <a href="/home" class="subnav__category">Nikon</a>
                            <a href="/home" class="subnav__category">Go Pro</a>
                        </div>
                    </div>
                </div>
            </li>
            <li class="nav_element">
                <a class="nav_element-link" href="/categoria/computadoras">cómputo y videojuegos</a>
                <div class="nav_element-container">
                    <div class="elements-2">
                        <div class="col-3">
                            <a href="/categoria/computadoras" class="subnav__title">CÓMPUTO</a>
                            <a href="/categoria/laptops-y-notebooks" class="subnav__category">Laptops y Notebooks</a>
                            <a href="/categoria/desktop-y-all-in-ones" class="subnav__category">Desktop</a>
                            <a href="/categoria/memorias-usb" class="subnav__category">Memorias USB</a>
                            <a href="/categoria/discos-duros" class="subnav__category">Discos duros</a>
                            <a href="/categoria/accesorios-para-pc" class="subnav__category">Accesorios para PC</a>
                            <a href="/categoria/impresoras-y-consumibles" class="subnav__category">Impresoras</a>
                            <a href="/categoria/gamers" class="subnav__category">Gamers</a>
                            <a href="/categoria/tablets-y-accesorios" class="subnav__title">TABLETS Y ACCESORIOS</a>
                            <a href="/categoria/tablets" class="subnav__category">Tablets</a>
                            <a href="/categoria/tablets-ipad" class="subnav__category">iPads</a>
                            <a href="/categoria/accesorios-tablets" class="subnav__category">Accesorios para tablets</a>
                        </div>
                        <div class="col-3">
                            <a href="#" class="subnav__title">MÁS VISTOS</a>
                            <a href="/home" class="subnav__category">Samsung Galaxy</a>
                            <a href="/home" class="subnav__category">Apple</a>
                            <a href="/home" class="subnav__category">HP</a>
                            <a href="/home" class="subnav__category">Toshiba</a>
                            <a href="/home" class="subnav__category">Lenovo</a>
                            <a href="/home" class="subnav__category">AOC</a>
                        </div>
                        <div class="col-3">
                            <a href="/home" class="subnav__title">Videojuegos</a>
                            <a href="/home" class="subnav__category">PlayStation 4</a>
                            <a href="/home" class="subnav__category">PlayStation 3</a>
                            <a href="/home" class="subnav__category">Nintendo</a>
                            <a href="/home" class="subnav__category">Xbox One</a>
                            <a href="/home" class="subnav__category">Preventas</a>
                        </div>
                    </div>
                </div>
            </li>
            <li class="nav_element">
                <a class="nav_element-link" href="/categoria/hogar">hogar</a>
                <div class="nav_element-container">
                    <div class="elements-2">
                        <div class="col-3">
                            <a href="/categoria/muebles" class="subnav__title">Muebles</a>
                            <a href="/categoria/muebles-dormitorio" class="subnav__category">Dormitorio</a>
                            <a href="/categoria/salas" class="subnav__category">Sala</a>
                            <a href="/categoria/sala-de-tv" class="subnav__category">Sala de TV</a>
                            <a href="/categoria/muebles-comedor" class="subnav__category">Comedor</a>
                            <a href="/categoria/muebles-para-cocina" class="subnav__category">Cocina</a>
                            <a href="/categoria/estudio-y-oficina" class="subnav__category">Estudio y Oficina</a>
                            <a href="/categoria/exteriores" class="subnav__category">Exteriores</a>
                            <a href="/categoria/muebles-de-bano" class="subnav__category">Baño</a>
                            <a href="/categoria/colchones-box-y-conjuntos/" class="subnav__title">Colchones</a>
                            <a href="/categoria/box-tarima" class="subnav__category">Box Tarima</a>
                            <a href="/categoria/box-spring" class="subnav__category">Box Spring</a>
                            <a href="/categoria/ropa-de-cama" class="subnav__title">Ropa de Cama</a>
                        </div>
                        <div class="col-3">
                            <a href="/home" class="subnav__title">Parrillas</a>
                            <a href="/home" class="subnav__category">Cajas Chinas</a>
                            <a href="/home" class="subnav__category">Parrillas</a>
                            <a href="/home" class="subnav__category">Accesorios</a>
                            <a href="/home" class="subnav__category">Cilindros</a>
                            <a href="/home" class="subnav__title">Decoración</a>
                            <a href="/home" class="subnav__category">Accesorios decoración</a>
                            <a href="/home" class="subnav__category">Viniles y Tapices</a>
                            <a href="/home" class="subnav__category">Cuadros y portaretratos</a>
                            <a href="/home" class="subnav__category">Espejos</a>
                            <a href="/home" class="subnav__title">Limpieza del hogar</a>
                            <a href="/home" class="subnav__category">Organizadores</a>
                            <a href="/home" class="subnav__category">Artículos de limpieza</a>
                        </div>
                        <div class="col-3">
                            <a href="/home" class="subnav__title">Cocina</a>
                            <a href="/home" class="subnav__category">Ollas y Sartenes</a>
                            <a href="/home" class="subnav__category">Utensilios para cocinar</a>
                            <a href="/home" class="subnav__category">Cubiertos y vajillas</a>
                            <a href="/home" class="subnav__category">Moldes y recipientes</a>
                            <a href="/home" class="subnav__category">Cristalería</a>
                            <a href="/home" class="subnav__category">Cuchillos y tablas</a>
                            <a href="/home" class="subnav__category">Utensilios para cocinar</a>
                            <a href="/home" class="subnav__title">Iluminación</a>
                            <a href="/home" class="subnav__category">Iluminación interior</a>
                            <a href="/home" class="subnav__category">Iluminación exterior</a>
                            <a href="/home" class="subnav__category">Focos</a>
                            <a href="/home" class="subnav__title">Ferretería</a>
                        </div>
                    </div>
                </div>
            </li>
            <li class="nav_element">
                <a class="nav_element-link" href="/home">electrodomésticos</a>
                <div class="nav_element-container">
                    <div class="elements-2">
                        <div class="col-3">
                            <a href="/home" class="subnav__title">Refrigeración</a>
                            <a href="/home" class="subnav__category">Refrigeradoras</a>
                            <a href="/home" class="subnav__category">Friobares</a>
                            <a href="/home" class="subnav__category">Congeladoras</a>
                            <a href="/home" class="subnav__category">Vineras</a>
                            <a href="/home" class="subnav__category">Dispensadores de agua</a>
                            <a href="/home" class="subnav__title">Climatización</a>
                            <a href="/home" class="subnav__category">Aire Acondicionado y Ventiladores</a>
                            <a href="/home" class="subnav__category">Deshumedecedores y purificadores</a>
                            <a href="/home" class="subnav__category">Calefactores y Estufas</a>
                            <a href="/home" class="subnav__title">Termas y Rapiduchas</a>
                            <a href="/home" class="subnav__category">Termas Eléctricas</a>
                            <a href="/home" class="subnav__category">Termas a Gas</a>
                        </div>
                        <div class="col-3">
                            <a href="/home" class="subnav__title">Pequeños electrodomésticos</a>
                            <a href="/home" class="subnav__category">Microondas</a>
                            <a href="/home" class="subnav__category">Licuadoras</a>
                            <a href="/home" class="subnav__category">Cafeteras</a>
                            <a href="/home" class="subnav__category">Batidoras</a>
                            <a href="/home" class="subnav__category">Sandwicheras y Waffleras</a>
                            <a href="/home" class="subnav__category">Parrillas Eléctricas</a>
                            <a href="/home" class="subnav__category">Hervidores</a>
                            <a href="/home" class="subnav__category">Sartenes Eléctricas</a>
                            <a href="/home" class="subnav__category">Exprimidores y Extractores</a>
                            <a href="/home" class="subnav__title">Línea Empotrable</a>
                            <a href="/home" class="subnav__category">Cocinas Empotrables</a>
                            <a href="/home" class="subnav__category">Hornos Empotrables</a>
                        </div>
                        <div class="col-3">
                            <a href="/home" class="subnav__title">Lavado y secado</a>
                            <a href="/home" class="subnav__category">Lavadoras</a>
                            <a href="/home" class="subnav__category">Secadoras</a>
                            <a href="/home" class="subnav__category">Lavavajillas</a>
                            <a href="/home" class="subnav__title">Cocinas y campanas</a>
                            <a href="/home" class="subnav__category">Cocinas</a>
                            <a href="/home" class="subnav__category">Campanas extractoras</a>
                            <a href="/home" class="subnav__title">Hogar</a>
                            <a href="/home" class="subnav__category">Aspiradoras y lustradoras</a>
                            <a href="/home" class="subnav__category">Máquinas de coser</a>
                            <a href="/home" class="subnav__category">Planchas</a>
                        </div>
                    </div>
                </div>
            </li>
            <li class="nav_element">
                <a class="nav_element-link" href="/home">salud y belleza</a>
                <div class="nav_element-container">
                    <div class="elements-2">
                        <div class="col-3">
                            <a href="/home" class="subnav__title">Perfumes</a>
                            <a href="/home" class="subnav__category">Mujer</a>
                            <a href="/home" class="subnav__category">Hombre</a>
                            <a href="/home" class="subnav__category">Splash y Fragancias</a>
                            <a href="/home" class="subnav__title">Depiladoras</a>
                            <a href="/home" class="subnav__title">Maquillaje</a>
                            <a href="/home" class="subnav__category">Rostro</a>
                            <a href="/home" class="subnav__category">Ojos y Cejas</a>
                            <a href="/home" class="subnav__category">Labios</a>
                            <a href="/home" class="subnav__category">Uñas</a>
                            <a href="/home" class="subnav__category">Brochas, Aplicadores y Accesorios</a>
                        </div>
                        <div class="col-3">
                            <a href="/home" class="subnav__title">Afeitado</a>
                            <a href="/home" class="subnav__category">Afeitadoras y Rasuradoras</a>
                            <a href="/home" class="subnav__category">Recortador de Vello</a>
                            <a href="/home" class="subnav__category">Cortador de Cabello</a>
                            <a href="/home" class="subnav__title">Cuidado del Cabello</a>
                            <a href="/home" class="subnav__category">Planchas</a>
                            <a href="/home" class="subnav__category">Rizadoras</a>
                            <a href="/home" class="subnav__category">Secadoras</a>
                            <a href="/home" class="subnav__category">Shampoo, Acondicionadores y tratamientos</a>
                            <a href="/home" class="subnav__category">Tintes</a>
                            <a href="/home" class="subnav__category">Cepillos y Accesorios</a>
                            <a href="/home" class="subnav__category">Extensiones de Cabello</a>
                        </div>
                        <div class="col-3">
                            <a href="/home" class="subnav__title">Fajas</a>
                            <a href="/home" class="subnav__title">Salud y bienestar</a>
                            <a href="/home" class="subnav__category">Balanzas</a>
                            <a href="/home" class="subnav__category">Cuidado Dental</a>
                            <a href="/home" class="subnav__category">Cigarros Electrónicos</a>
                            <a href="/home" class="subnav__title">Vitaminas y suplementos</a>
                            <a href="/home" class="subnav__title">Bienestar Sexual</a>
                            <a href="/home" class="subnav__title">Masaje spa</a>
		                </div>
                    </div>
                </div>
            </li>
        </ul>
    </div>
    <div id="content">
        """),_display_(Seq[Any](/*654.10*/content2)),format.raw/*654.18*/("""
    </div>
    <script>
        $(".nav_element").hover(function()"""),format.raw/*657.43*/("""{"""),format.raw/*657.44*/("""
            $(".is_active").removeClass("is_active")
            $(this).addClass("is_active")
        """),format.raw/*660.9*/("""}"""),format.raw/*660.10*/(""",function()"""),format.raw/*660.21*/("""{"""),format.raw/*660.22*/("""
            $(this).removeClass("is_active")
        """),format.raw/*662.9*/("""}"""),format.raw/*662.10*/(""")
        $("#header-menu .nav_element:nth-child(7) a").css("""),format.raw/*663.59*/("""{"""),format.raw/*663.60*/(""""width": "140px""""),format.raw/*663.76*/("""}"""),format.raw/*663.77*/(""")

        $("#searchInput").keyup(function()"""),format.raw/*665.43*/("""{"""),format.raw/*665.44*/("""
            buscarxcategoria()
            buscarxmarca()
            buscarxcategoriamarca()
        """),format.raw/*669.9*/("""}"""),format.raw/*669.10*/(""")
        $("#searchInput").focus(function()"""),format.raw/*670.43*/("""{"""),format.raw/*670.44*/("""
            $("#searchResult").css("display","block")
        """),format.raw/*672.9*/("""}"""),format.raw/*672.10*/(""")
        $("body").click(function(e)"""),format.raw/*673.36*/("""{"""),format.raw/*673.37*/("""
            if(e.target!=$("#searchInput")[0] && $("#searchResult").find($(e.target)).length==0)
                $("#searchResult").css("display","none")
        """),format.raw/*676.9*/("""}"""),format.raw/*676.10*/(""")
        function buscarxcategoria()"""),format.raw/*677.36*/("""{"""),format.raw/*677.37*/("""
            var parse=$("#searchInput").val().toLowerCase()
            $.ajax("""),format.raw/*679.20*/("""{"""),format.raw/*679.21*/("""
                type : "POST",
                url : "/home/buscarxcategoria",
                async : false,
                data : """),format.raw/*683.24*/("""{"""),format.raw/*683.25*/("""parse:parse"""),format.raw/*683.36*/("""}"""),format.raw/*683.37*/(""",
                success:function(categorias)"""),format.raw/*684.45*/("""{"""),format.raw/*684.46*/("""
                    if($(".search-category").length==0)"""),format.raw/*685.56*/("""{"""),format.raw/*685.57*/("""
                        if(categorias.length!=0)"""),format.raw/*686.49*/("""{"""),format.raw/*686.50*/("""
                            $("#searchResult").prepend('<ul class="search-category"><div><h3>categorías</h3></div></ul>')
                        """),format.raw/*688.25*/("""}"""),format.raw/*688.26*/("""
                    """),format.raw/*689.21*/("""}"""),format.raw/*689.22*/("""
                    if(categorias.length==0)"""),format.raw/*690.45*/("""{"""),format.raw/*690.46*/("""
                        $(".search-category").remove()
                    """),format.raw/*692.21*/("""}"""),format.raw/*692.22*/("""
                    else"""),format.raw/*693.25*/("""{"""),format.raw/*693.26*/("""
                        $(".search-category li").remove()
                        for(var i in categorias)"""),format.raw/*695.49*/("""{"""),format.raw/*695.50*/("""
                            if(i>4)return
                            var nombre=categorias[i].nombre.toLowerCase()
                            $(".search-category").append('<li><a href="/categoria/'+nombre.replace(/ /g,"-")+'"><span></span></a></li>')
                            var n=nombre.toLowerCase().indexOf(parse)
                            var m=n+parse.length
                            if(n==-1)n=nombre.length
                            $(".search-category li:last-child span").append(nombre.slice(0,n))
                            if(n!=nombre.length)"""),format.raw/*703.49*/("""{"""),format.raw/*703.50*/("""
                                $(".search-category li:last-child span").append('<span style="color: #000;text-decoration: underline;">'+
                                    nombre.slice(n,m)+'</span>'+nombre.slice(m,nombre.length))
                            """),format.raw/*706.29*/("""}"""),format.raw/*706.30*/("""
                        """),format.raw/*707.25*/("""}"""),format.raw/*707.26*/("""
                    """),format.raw/*708.21*/("""}"""),format.raw/*708.22*/("""
                """),format.raw/*709.17*/("""}"""),format.raw/*709.18*/("""
            """),format.raw/*710.13*/("""}"""),format.raw/*710.14*/(""")
        """),format.raw/*711.9*/("""}"""),format.raw/*711.10*/("""
        function buscarxmarca()"""),format.raw/*712.32*/("""{"""),format.raw/*712.33*/("""
            var parse=$("#searchInput").val().toLowerCase()
            $.ajax("""),format.raw/*714.20*/("""{"""),format.raw/*714.21*/("""
                type : "POST",
                url : "/home/buscarxmarca",
                async : false,
                data : """),format.raw/*718.24*/("""{"""),format.raw/*718.25*/("""parse:$("#searchInput").val()"""),format.raw/*718.54*/("""}"""),format.raw/*718.55*/(""",
                success:function(marcas)"""),format.raw/*719.41*/("""{"""),format.raw/*719.42*/("""
                    if($(".search-brand").length==0)"""),format.raw/*720.53*/("""{"""),format.raw/*720.54*/("""
                        if(marcas.length!=0)"""),format.raw/*721.45*/("""{"""),format.raw/*721.46*/("""
                            if($(".search-category").length==0)$("#searchResult").prepend('<ul class="search-brand"><div><h3>marcas</h3></div></ul>')
                            else $(".search-category").after('<ul class="search-brand"><div><h3>marcas</h3></div></ul>')
                        """),format.raw/*724.25*/("""}"""),format.raw/*724.26*/("""
                    """),format.raw/*725.21*/("""}"""),format.raw/*725.22*/("""
                    if(marcas.length==0)"""),format.raw/*726.41*/("""{"""),format.raw/*726.42*/("""
                        $(".search-brand").remove()
                    """),format.raw/*728.21*/("""}"""),format.raw/*728.22*/("""
                    else"""),format.raw/*729.25*/("""{"""),format.raw/*729.26*/("""
                        $(".search-brand li").remove()
                        for(var i in marcas)"""),format.raw/*731.45*/("""{"""),format.raw/*731.46*/("""
                            if(i>3)return
                            var nombre=marcas[i].toLowerCase()
                            $(".search-brand").append('<li><a href="/marca/'+nombre+'">'+'<span class="brand-name"></span>'+
                                '</a></li>')
                            var n=nombre.toLowerCase().indexOf(parse)
                            var m=n+parse.length
                            if(n==-1)n=nombre.length
                            $(".search-brand li:last-child span.brand-name").append(nombre.slice(0,n))
                            if(n!=nombre.length)"""),format.raw/*740.49*/("""{"""),format.raw/*740.50*/("""
                                $(".search-brand li:last-child span.brand-name").append('<span style="color: #000;text-decoration: underline;">'+
                                    nombre.slice(n,m)+'</span>'+nombre.slice(m,nombre.length))
                            """),format.raw/*743.29*/("""}"""),format.raw/*743.30*/("""
                        """),format.raw/*744.25*/("""}"""),format.raw/*744.26*/("""
                    """),format.raw/*745.21*/("""}"""),format.raw/*745.22*/("""
                """),format.raw/*746.17*/("""}"""),format.raw/*746.18*/("""
            """),format.raw/*747.13*/("""}"""),format.raw/*747.14*/(""")
        """),format.raw/*748.9*/("""}"""),format.raw/*748.10*/("""
        function buscarxcategoriamarca()"""),format.raw/*749.41*/("""{"""),format.raw/*749.42*/("""
            var parse=$("#searchInput").val().toLowerCase()
            $.ajax("""),format.raw/*751.20*/("""{"""),format.raw/*751.21*/("""
                type : "POST",
                url : "/home/buscarxcategoriamarca",
                async : false,
                data : """),format.raw/*755.24*/("""{"""),format.raw/*755.25*/("""parse:$("#searchInput").val()"""),format.raw/*755.54*/("""}"""),format.raw/*755.55*/(""",
                success:function(marcas)"""),format.raw/*756.41*/("""{"""),format.raw/*756.42*/("""
                    if($(".search-brand").length==0)"""),format.raw/*757.53*/("""{"""),format.raw/*757.54*/("""
                        if(marcas.length!=0)"""),format.raw/*758.45*/("""{"""),format.raw/*758.46*/("""
                            if($(".search-category").length==0)$("#searchResult").prepend('<ul class="search-brand"><div><h3>marcas</h3></div></ul>')
                            else $(".search-category").after('<ul class="search-brand"><div><h3>marcas</h3></div></ul>')
                        """),format.raw/*761.25*/("""}"""),format.raw/*761.26*/("""
                    """),format.raw/*762.21*/("""}"""),format.raw/*762.22*/("""
                    for(var i in marcas)"""),format.raw/*763.41*/("""{"""),format.raw/*763.42*/("""
                        if(i>4)return
                        var nombre=marcas[i].nombre.toLowerCase()
                        var categoria=marcas[i].categoria_nombre.toLowerCase()
                        $(".search-brand").append('<li><a href="/marca/'+categoria.replace(/ /g,"-")+'/'+nombre+'">'+'<span class="brand-name"></span>'+' en '+
                            '<span class="brand-category">'+categoria+'</span></a></li>')
                        var n=nombre.toLowerCase().indexOf(parse)
                        var m=n+parse.length
                        if(n==-1)n=nombre.length
                        $(".search-brand li:last-child span.brand-name").append(nombre.slice(0,n))
                        if(n!=nombre.length)"""),format.raw/*773.45*/("""{"""),format.raw/*773.46*/("""
                            $(".search-brand li:last-child span.brand-name").append('<span style="color: #000;text-decoration: underline;">'+
                                nombre.slice(n,m)+'</span>'+nombre.slice(m,nombre.length))
                        """),format.raw/*776.25*/("""}"""),format.raw/*776.26*/("""
                    """),format.raw/*777.21*/("""}"""),format.raw/*777.22*/("""
                """),format.raw/*778.17*/("""}"""),format.raw/*778.18*/("""
            """),format.raw/*779.13*/("""}"""),format.raw/*779.14*/(""")
        """),format.raw/*780.9*/("""}"""),format.raw/*780.10*/("""
    </script>
""")))})))}
    }
    
    def render(message:String,cliente:Cliente,content1:Html,content2:Html): play.api.templates.HtmlFormat.Appendable = apply(message,cliente)(content1)(content2)
    
    def f:((String,Cliente) => (Html) => (Html) => play.api.templates.HtmlFormat.Appendable) = (message,cliente) => (content1) => (content2) => apply(message,cliente)(content1)(content2)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 27 23:42:13 PET 2016
                    SOURCE: /Users/diegodelfin7/Desktop/proy Tienda virtual/tienda/app/views/tienda/template.scala.html
                    HASH: 5bd23f9764e745dc9b50c9cc0e86050916d26db0
                    MATRIX: 802->1|962->67|999->70|1020->83|1059->85|1114->113|1142->114|1232->178|1260->179|1299->191|1327->192|1413->251|1442->252|1483->265|1512->266|1580->307|1609->308|1655->326|1684->327|1806->422|1835->423|1885->445|1914->446|1987->492|2016->493|2073->522|2102->523|2166->560|2195->561|2246->584|2275->585|2529->812|2558->813|2607->834|2636->835|3238->1410|3267->1411|3327->1443|3356->1444|3503->1564|3532->1565|3586->1591|3615->1592|3729->1679|3758->1680|3809->1703|3838->1704|4149->1988|4178->1989|4231->2014|4260->2015|4366->2094|4395->2095|4450->2122|4479->2123|4542->2159|4571->2160|4625->2186|4654->2187|4808->2314|4837->2315|4890->2340|4919->2341|5202->2597|5231->2598|5286->2625|5315->2626|5421->2705|5450->2706|5524->2752|5553->2753|5860->3032|5890->3033|5948->3062|5978->3063|6098->3155|6128->3156|6209->3208|6239->3209|6307->3249|6337->3250|6389->3273|6419->3274|6668->3495|6698->3496|6747->3516|6777->3517|6896->3608|6926->3609|6978->3632|7008->3633|7082->3679|7112->3680|7170->3709|7200->3710|7665->4147|7695->4148|7786->4210|7816->4211|8122->4489|8152->4490|8225->4534|8255->4535|8322->4574|8352->4575|8414->4608|8444->4609|8885->5022|8915->5023|8966->5045|8996->5046|9121->5143|9151->5144|9204->5168|9234->5169|9812->5719|9842->5720|9901->5750|9931->5751|10074->5866|10104->5867|10159->5893|10189->5894|10288->5965|10318->5966|10379->5998|10409->5999|10484->6046|10514->6047|10593->6097|10623->6098|10689->6136|10719->6137|10790->6179|10820->6180|10884->6216|10914->6217|10962->6236|10992->6237|11161->6378|11191->6379|11245->6404|11275->6405|11451->6553|11481->6554|11539->6583|11569->6584|11650->6637|11680->6638|11741->6670|11771->6671|12075->6947|12105->6948|12162->6976|12192->6977|12353->7110|12383->7111|12440->7139|12470->7140|13000->7642|13030->7643|13086->7670|13116->7671|13646->8173|13676->8174|13743->8212|13773->8213|13901->8313|13931->8314|13988->8342|14018->8343|14080->8377|14110->8378|14170->8409|14200->8410|14266->8448|14296->8449|14354->8478|14384->8479|14479->8546|14509->8547|14567->8576|14597->8577|14692->8644|14722->8645|14768->8662|14798->8663|14998->8835|15028->8836|15101->8880|15131->8881|15334->9056|15364->9057|15463->9127|15493->9128|15691->9298|15721->9299|15829->9378|15859->9379|16079->9571|16109->9572|16169->9603|16199->9604|16266->9643|16296->9644|16359->9678|16389->9679|16468->9730|16498->9731|16555->9752|16586->9760|17221->10358|17248->10375|17288->10376|17402->10457|17458->10476|17485->10493|17525->10494|17714->10646|17731->10653|17783->10682|17963->10829|18635->11472|18665->11473|18829->11608|18859->11609|19086->11807|19116->11808|19327->11990|19357->11991|19391->11996|19421->11997|19507->12054|19537->12055|19745->12234|19775->12235|19830->12261|19860->12262|19913->12286|19943->12287|20134->12449|20164->12450|20239->12496|20269->12497|20374->12573|20404->12574|41867->34000|41898->34008|41997->34078|42027->34079|42162->34186|42192->34187|42232->34198|42262->34199|42346->34255|42376->34256|42466->34317|42496->34318|42541->34334|42571->34335|42647->34382|42677->34383|42812->34490|42842->34491|42916->34536|42946->34537|43039->34602|43069->34603|43136->34641|43166->34642|43360->34808|43390->34809|43457->34847|43487->34848|43598->34930|43628->34931|43795->35069|43825->35070|43865->35081|43895->35082|43971->35129|44001->35130|44087->35187|44117->35188|44196->35238|44226->35239|44404->35388|44434->35389|44485->35411|44515->35412|44590->35458|44620->35459|44727->35537|44757->35538|44812->35564|44842->35565|44980->35674|45010->35675|45616->36252|45646->36253|45940->36518|45970->36519|46025->36545|46055->36546|46106->36568|46136->36569|46183->36587|46213->36588|46256->36602|46286->36603|46325->36614|46355->36615|46417->36648|46447->36649|46558->36731|46588->36732|46751->36866|46781->36867|46839->36896|46869->36897|46941->36940|46971->36941|47054->36995|47084->36996|47159->37042|47189->37043|47517->37342|47547->37343|47598->37365|47628->37366|47699->37408|47729->37409|47833->37484|47863->37485|47918->37511|47948->37512|48079->37614|48109->37615|48746->38223|48776->38224|49078->38497|49108->38498|49163->38524|49193->38525|49244->38547|49274->38548|49321->38566|49351->38567|49394->38581|49424->38582|49463->38593|49493->38594|49564->38636|49594->38637|49705->38719|49735->38720|49907->38863|49937->38864|49995->38893|50025->38894|50097->38937|50127->38938|50210->38992|50240->38993|50315->39039|50345->39040|50673->39339|50703->39340|50754->39362|50784->39363|50855->39405|50885->39406|51661->40153|51691->40154|51981->40415|52011->40416|52062->40438|52092->40439|52139->40457|52169->40458|52212->40472|52242->40473|52281->40484|52311->40485
                    LINES: 26->1|29->1|30->2|30->2|30->2|32->4|32->4|34->6|34->6|35->7|35->7|38->10|38->10|39->11|39->11|41->13|41->13|42->14|42->14|46->18|46->18|47->19|47->19|49->21|49->21|50->22|50->22|52->24|52->24|53->25|53->25|61->33|61->33|62->34|62->34|78->50|78->50|79->51|79->51|84->56|84->56|85->57|85->57|88->60|88->60|89->61|89->61|97->69|97->69|98->70|98->70|101->73|101->73|102->74|102->74|104->76|104->76|105->77|105->77|108->80|108->80|109->81|109->81|117->89|117->89|118->90|118->90|121->93|121->93|122->94|122->94|131->103|131->103|132->104|132->104|136->108|136->108|137->109|137->109|139->111|139->111|140->112|140->112|145->117|145->117|146->118|146->118|150->122|150->122|151->123|151->123|153->125|153->125|154->126|154->126|167->139|167->139|168->140|168->140|174->146|174->146|175->147|175->147|177->149|177->149|178->150|178->150|191->163|191->163|192->164|192->164|196->168|196->168|197->169|197->169|213->185|213->185|214->186|214->186|218->190|218->190|219->191|219->191|222->194|222->194|223->195|223->195|225->197|225->197|226->198|226->198|228->200|228->200|229->201|229->201|231->203|231->203|232->204|232->204|237->209|237->209|238->210|238->210|244->216|244->216|245->217|245->217|247->219|247->219|248->220|248->220|256->228|256->228|257->229|257->229|262->234|262->234|263->235|263->235|276->248|276->248|277->249|277->249|289->261|289->261|290->262|290->262|294->266|294->266|295->267|295->267|297->269|297->269|298->270|298->270|300->272|300->272|301->273|301->273|304->276|304->276|305->277|305->277|308->280|308->280|309->281|309->281|315->287|315->287|316->288|316->288|321->293|321->293|322->294|322->294|328->300|328->300|329->301|329->301|336->308|336->308|337->309|337->309|339->311|339->311|340->312|340->312|342->314|342->314|344->316|344->316|357->329|357->329|357->329|359->331|360->332|360->332|360->332|362->334|362->334|362->334|365->337|379->351|379->351|382->354|382->354|385->357|385->357|389->361|389->361|389->361|389->361|390->362|390->362|393->365|393->365|394->366|394->366|395->367|395->367|398->370|398->370|399->371|399->371|401->373|401->373|682->654|682->654|685->657|685->657|688->660|688->660|688->660|688->660|690->662|690->662|691->663|691->663|691->663|691->663|693->665|693->665|697->669|697->669|698->670|698->670|700->672|700->672|701->673|701->673|704->676|704->676|705->677|705->677|707->679|707->679|711->683|711->683|711->683|711->683|712->684|712->684|713->685|713->685|714->686|714->686|716->688|716->688|717->689|717->689|718->690|718->690|720->692|720->692|721->693|721->693|723->695|723->695|731->703|731->703|734->706|734->706|735->707|735->707|736->708|736->708|737->709|737->709|738->710|738->710|739->711|739->711|740->712|740->712|742->714|742->714|746->718|746->718|746->718|746->718|747->719|747->719|748->720|748->720|749->721|749->721|752->724|752->724|753->725|753->725|754->726|754->726|756->728|756->728|757->729|757->729|759->731|759->731|768->740|768->740|771->743|771->743|772->744|772->744|773->745|773->745|774->746|774->746|775->747|775->747|776->748|776->748|777->749|777->749|779->751|779->751|783->755|783->755|783->755|783->755|784->756|784->756|785->757|785->757|786->758|786->758|789->761|789->761|790->762|790->762|791->763|791->763|801->773|801->773|804->776|804->776|805->777|805->777|806->778|806->778|807->779|807->779|808->780|808->780
                    -- GENERATED --
                */
            