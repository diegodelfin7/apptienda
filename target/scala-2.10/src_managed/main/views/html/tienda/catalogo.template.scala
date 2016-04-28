
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
object catalogo extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,Cliente,Categoria,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String,cliente: Cliente,categoria: Categoria,marca:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.tienda.template


Seq[Any](format.raw/*1.70*/("""
"""),_display_(Seq[Any](/*3.2*/template(message,cliente)/*3.27*/{_display_(Seq[Any](format.raw/*3.28*/("""
    <style>
        #category-navigation """),format.raw/*5.30*/("""{"""),format.raw/*5.31*/("""
            margin-top: 16px;
        """),format.raw/*7.9*/("""}"""),format.raw/*7.10*/("""
        #category-navigation-breadcrumbs """),format.raw/*8.42*/("""{"""),format.raw/*8.43*/("""
            border-bottom: dotted 1px #e5e5e5;
            padding: 0 10px 5px;
        """),format.raw/*11.9*/("""}"""),format.raw/*11.10*/("""
        #category-navigation-breadcrumbs li:first-child """),format.raw/*12.57*/("""{"""),format.raw/*12.58*/("""
            position: relative;
            top: -2px;
        """),format.raw/*15.9*/("""}"""),format.raw/*15.10*/("""
        #category-navigation-breadcrumbs li:first-child:before """),format.raw/*16.64*/("""{"""),format.raw/*16.65*/("""
            content: none;
"""),format.raw/*18.1*/("""}"""),format.raw/*18.2*/("""
        #category-navigation-breadcrumbs li """),format.raw/*19.45*/("""{"""),format.raw/*19.46*/("""
            color: #f98b30;
            display: inline-block;
            font-size: 12px;
            font-size: 1.18rem;
            padding-right: 0.2em;
        """),format.raw/*25.9*/("""}"""),format.raw/*25.10*/("""
        #category-navigation-breadcrumbs li:before """),format.raw/*26.52*/("""{"""),format.raw/*26.53*/("""
            content: '/';
            color: #656565;
            display: inline-block;
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/("""
        #category-navigation-breadcrumbs li:first-child a """),format.raw/*31.59*/("""{"""),format.raw/*31.60*/("""
            background: url(/assets/images/iconset.png) -60px -100px;
            height: 20px;
            width: 20px;
            display: block;
            text-indent: -9999px;
        """),format.raw/*37.9*/("""}"""),format.raw/*37.10*/("""
        #category-navigation-breadcrumbs li>a """),format.raw/*38.47*/("""{"""),format.raw/*38.48*/("""
            padding-left: 0.5em;
        """),format.raw/*40.9*/("""}"""),format.raw/*40.10*/("""
        #category-navigation-breadcrumbs a:hover """),format.raw/*41.50*/("""{"""),format.raw/*41.51*/("""
            text-decoration: underline;
        """),format.raw/*43.9*/("""}"""),format.raw/*43.10*/("""
        #category-navigation-breadcrumbs a """),format.raw/*44.44*/("""{"""),format.raw/*44.45*/("""
            color: #656565;
        """),format.raw/*46.9*/("""}"""),format.raw/*46.10*/("""
        #catalog aside """),format.raw/*47.24*/("""{"""),format.raw/*47.25*/("""
            border-right: 1px dotted #b2b2b2;
            float: left;
            padding: 10px 10px 20px 0;
            width: 240px;
        """),format.raw/*52.9*/("""}"""),format.raw/*52.10*/("""
        body """),format.raw/*53.14*/("""{"""),format.raw/*53.15*/("""
            color: #7f7f7f;
        """),format.raw/*55.9*/("""}"""),format.raw/*55.10*/("""
        #filters .filter-title """),format.raw/*56.32*/("""{"""),format.raw/*56.33*/("""
            font-size: 1.4rem;
            text-transform: uppercase;
            margin-bottom: 5px;
        """),format.raw/*60.9*/("""}"""),format.raw/*60.10*/("""
        #filters ul """),format.raw/*61.21*/("""{"""),format.raw/*61.22*/("""
            font-size: 1.3rem;
        """),format.raw/*63.9*/("""}"""),format.raw/*63.10*/("""
        #filters>li """),format.raw/*64.21*/("""{"""),format.raw/*64.22*/("""
            margin-bottom: 40px;
        """),format.raw/*66.9*/("""}"""),format.raw/*66.10*/("""
        #filters a """),format.raw/*67.20*/("""{"""),format.raw/*67.21*/("""
            color: #4c4c4c;
            display: block;
            text-decoration: none;
        """),format.raw/*71.9*/("""}"""),format.raw/*71.10*/("""
        #filters li.selected>a """),format.raw/*72.32*/("""{"""),format.raw/*72.33*/("""
            color: #3E9BB9;
        """),format.raw/*74.9*/("""}"""),format.raw/*74.10*/("""
        #filters .category-filter>li"""),format.raw/*75.37*/("""{"""),format.raw/*75.38*/("""
            padding-left: 10px;
            text-transform: uppercase;
        """),format.raw/*78.9*/("""}"""),format.raw/*78.10*/("""
        .category-filter ul li"""),format.raw/*79.31*/("""{"""),format.raw/*79.32*/("""
            text-transform: lowercase;
        """),format.raw/*81.9*/("""}"""),format.raw/*81.10*/("""
        #filters .category-filter ul li a """),format.raw/*82.43*/("""{"""),format.raw/*82.44*/("""
            margin-left: 5px;
        """),format.raw/*84.9*/("""}"""),format.raw/*84.10*/("""
        #filters .category-filter ul li a:before """),format.raw/*85.50*/("""{"""),format.raw/*85.51*/("""
            color: #008bff;
            content: '\2022';
            position: relative;
            left: -5px;
        """),format.raw/*90.9*/("""}"""),format.raw/*90.10*/("""
        #filters .category-filter .category-cant """),format.raw/*91.50*/("""{"""),format.raw/*91.51*/("""
            color: #999;
            font-size: 11px;
        """),format.raw/*94.9*/("""}"""),format.raw/*94.10*/("""
        .category-filter li """),format.raw/*95.29*/("""{"""),format.raw/*95.30*/("""
            padding-left: 2px;
            border-top: dotted 1px #e5e5e5;
        """),format.raw/*98.9*/("""}"""),format.raw/*98.10*/("""
        #filters ul a:hover """),format.raw/*99.29*/("""{"""),format.raw/*99.30*/("""
            background: #f3f3f3;
            text-decoration: underline;
        """),format.raw/*102.9*/("""}"""),format.raw/*102.10*/("""
        .category-filter ul a,.category-filter>li a"""),format.raw/*103.52*/("""{"""),format.raw/*103.53*/("""
            padding: 2px 0;
        """),format.raw/*105.9*/("""}"""),format.raw/*105.10*/("""
        #filters #facet_brand """),format.raw/*106.31*/("""{"""),format.raw/*106.32*/("""
            border: dotted #ccc;
            border-width: 1px 0;
            max-height: 114px;
            overflow-y: auto;
        """),format.raw/*111.9*/("""}"""),format.raw/*111.10*/("""
        #filters #facet_brand li:first-child """),format.raw/*112.46*/("""{"""),format.raw/*112.47*/("""
            border: 0;
        """),format.raw/*114.9*/("""}"""),format.raw/*114.10*/("""
        #filters .fct-scroll li, #filters #facet_brand li """),format.raw/*115.59*/("""{"""),format.raw/*115.60*/("""
            border-top: dotted 1px #e5e5e5;
            margin-left: 6px;
            padding-left: 5px;
            position: relative;
        """),format.raw/*120.9*/("""}"""),format.raw/*120.10*/("""
        #filters .fct-scroll a, #filters #facet_brand a """),format.raw/*121.57*/("""{"""),format.raw/*121.58*/("""
            display: block;
            padding: 2px 0;
        """),format.raw/*124.9*/("""}"""),format.raw/*124.10*/("""
        #filters .fct-scroll li:before, #filters #facet_brand li:before """),format.raw/*125.73*/("""{"""),format.raw/*125.74*/("""
            color: #008bff;
            content: "»";
            position: absolute;
            left: -5px;
        """),format.raw/*130.9*/("""}"""),format.raw/*130.10*/("""
        .brands p.brand-filter """),format.raw/*131.32*/("""{"""),format.raw/*131.33*/("""
            font-size: 13px;
            margin: 13px 0;
        """),format.raw/*134.9*/("""}"""),format.raw/*134.10*/("""
        #filters .ui-inputText """),format.raw/*135.32*/("""{"""),format.raw/*135.33*/("""
            width: 73px;
            padding-right: 19px;
        """),format.raw/*138.9*/("""}"""),format.raw/*138.10*/("""
        .priceRange-span """),format.raw/*139.26*/("""{"""),format.raw/*139.27*/("""
            margin-left: -20px;
            margin-right: 3px;
        """),format.raw/*142.9*/("""}"""),format.raw/*142.10*/("""
        #filters input[type=text] """),format.raw/*143.35*/("""{"""),format.raw/*143.36*/("""
            border: solid 1px #bfbfbf;
            border-radius: 5px;
            -webkit-box-shadow: 0 1px 2px rgba(0,0,0,0.2) inset;
            box-shadow: 0 1px 2px rgba(0,0,0,0.2) inset;
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            box-sizing: border-box;
            color: #7f7f7f;
            padding: 2px 5px;
        """),format.raw/*153.9*/("""}"""),format.raw/*153.10*/("""
        #filters .sliderInput """),format.raw/*154.31*/("""{"""),format.raw/*154.32*/("""
            font-size: 12px;
        """),format.raw/*156.9*/("""}"""),format.raw/*156.10*/("""
        .catalogPriceFilterSubmit:hover """),format.raw/*157.41*/("""{"""),format.raw/*157.42*/("""
            background-image: none;
            background-color: #40CBD9;
        """),format.raw/*160.9*/("""}"""),format.raw/*160.10*/("""
        .catalogPriceFilterSubmit """),format.raw/*161.35*/("""{"""),format.raw/*161.36*/("""
            width: 23px;
            height: 23px;
            background-color: #3883A0;
            background-image: -webkit-gradient(linear,left top,left bottom,color-stop(0%,#3EA6C5),color-stop(100%,#3F6F89));
            background-image: -webkit-linear-gradient(top,#3EA6C5,#3F6F89);
            background-image: -moz-linear-gradient(top,#3EA6C5,#3F6F89);
            background-image: -ms-linear-gradient(top,#3EA6C5,#3F6F89);
            background-image: -o-linear-gradient(top,#3EA6C5,#3F6F89);
            background-image: linear-gradient(top,#3EA6C5,#3F6F89);
            border: 0;
            border-radius: 5px;
            -webkit-box-shadow: 0 1px 2px rgba(0,0,0,0.3);
            box-shadow: 0 1px 2px rgba(0,0,0,0.3);
            color: #fff;
            font: 100 18px/20px "function-pro",Helvetiva,Arial,sans-serif;
            padding: 0 0 2px 0;
            text-decoration: none;
            position: relative;
            margin-left: 2px;
        """),format.raw/*181.9*/("""}"""),format.raw/*181.10*/("""
        #catalog-content """),format.raw/*182.26*/("""{"""),format.raw/*182.27*/("""
            border-bottom: dotted 1px #ccc;
            margin-left: 250px;
            padding: 0 0 5px 10px;
        """),format.raw/*186.9*/("""}"""),format.raw/*186.10*/("""
        .paging """),format.raw/*187.17*/("""{"""),format.raw/*187.18*/("""
            padding-bottom: 10px;
            padding-top: 5px;
            position: relative;
        """),format.raw/*191.9*/("""}"""),format.raw/*191.10*/("""
        #catalog-sort """),format.raw/*192.23*/("""{"""),format.raw/*192.24*/("""
            font-size: 12px;
            font-size: 1.2rem;
        """),format.raw/*195.9*/("""}"""),format.raw/*195.10*/("""
        #catalog-sort label """),format.raw/*196.29*/("""{"""),format.raw/*196.30*/("""
            padding-right: 5px;
            font-size: 1.3rem;
            line-height: 18px;
            font-weight: 500;
        """),format.raw/*201.9*/("""}"""),format.raw/*201.10*/("""
        #catalog-sort select """),format.raw/*202.30*/("""{"""),format.raw/*202.31*/("""
            width: 100px;
            color: #333;
            font: 13px/15px Tahoma,Arial,sans-serif;
            font-size: 1.3rem;
        """),format.raw/*207.9*/("""}"""),format.raw/*207.10*/("""
        #items-founds """),format.raw/*208.23*/("""{"""),format.raw/*208.24*/("""
            margin-top: 15px;
        """),format.raw/*210.9*/("""}"""),format.raw/*210.10*/("""
        #items-founds span """),format.raw/*211.28*/("""{"""),format.raw/*211.29*/("""
            padding-left: 5px;
            padding-right: 5px;
            font-size: 12px;
            color: #7f7f7f;
            font: 1.2em/1.6em Tahoma,Arial,sans-serif;
            text-transform: uppercase;
            margin: 8px 0;
        """),format.raw/*219.9*/("""}"""),format.raw/*219.10*/("""
        #catalog-content .product-items """),format.raw/*220.41*/("""{"""),format.raw/*220.42*/("""
            padding-bottom: 10px;
            text-align: left;
        """),format.raw/*223.9*/("""}"""),format.raw/*223.10*/("""
        .product-items """),format.raw/*224.24*/("""{"""),format.raw/*224.25*/("""
            border-top: 1px dotted #e5e5e5;
            margin: 0;
            padding: 0;
            text-align: center;
        """),format.raw/*229.9*/("""}"""),format.raw/*229.10*/("""
        .product-items .product-item """),format.raw/*230.38*/("""{"""),format.raw/*230.39*/("""
            background: #fff;
            border: dotted #e5e5e5;
            border-width: 0 0 1px;
            display: inline-block;
            margin-left: -4px;
            text-align: left;
            vertical-align: top;
            width: 180px;
            position: relative;
        """),format.raw/*240.9*/("""}"""),format.raw/*240.10*/("""
        .product-items .product-item:hover """),format.raw/*241.44*/("""{"""),format.raw/*241.45*/("""
            -webkit-box-shadow: 0 1px 4px rgba(0,0,0,0.45);
            box-shadow: 0 1px 4px rgba(0,0,0,0.45);
            border: 0;
            border-radius: 5px;
            padding: 0;
            margin: -5px -5px -10px -7px;
            z-index: 1;
        """),format.raw/*249.9*/("""}"""),format.raw/*249.10*/("""
        .product-items ul, .product-items li """),format.raw/*250.46*/("""{"""),format.raw/*250.47*/("""
            margin: 0;
            padding: 0;
        """),format.raw/*253.9*/("""}"""),format.raw/*253.10*/("""
        .product-items .product-item a>ul """),format.raw/*254.43*/("""{"""),format.raw/*254.44*/("""
            border: dotted #e5e5e5;
            border-width: 0 1px;
            margin: 9px 0;
            height: 300px;
            padding: 0 9px;
        """),format.raw/*260.9*/("""}"""),format.raw/*260.10*/("""
        .product-items .product-item:hover>a>ul """),format.raw/*261.49*/("""{"""),format.raw/*261.50*/("""
            border: 0;
            padding: 0 10px;
        """),format.raw/*264.9*/("""}"""),format.raw/*264.10*/("""
        .product-items .product-item .product-item-img """),format.raw/*265.56*/("""{"""),format.raw/*265.57*/("""
            height: 160px;
            margin: 0 auto 10px;
            overflow: hidden;
            width: 160px;
        """),format.raw/*270.9*/("""}"""),format.raw/*270.10*/("""
        .product-items .product-item .product-item-brand """),format.raw/*271.58*/("""{"""),format.raw/*271.59*/("""
            font-family: "function-pro",Helvetiva,Arial,sans-serif;
            font-weight: 100;
            text-transform: uppercase;
            color: #7f7f7f;
        """),format.raw/*276.9*/("""}"""),format.raw/*276.10*/("""
        .product-items .product-item .product-item-name """),format.raw/*277.57*/("""{"""),format.raw/*277.58*/("""
            color: #4c4c4c;
            padding-bottom: 5px;
        """),format.raw/*280.9*/("""}"""),format.raw/*280.10*/("""
        .product-items .product-item .product-item-price """),format.raw/*281.58*/("""{"""),format.raw/*281.59*/("""
            text-align: center;
        """),format.raw/*283.9*/("""}"""),format.raw/*283.10*/("""
        .product-items .product-item .product-itm-price-old """),format.raw/*284.61*/("""{"""),format.raw/*284.62*/("""
            color: #999;
            font-family: "function-pro",Helvetiva,Arial,sans-serif;
            text-decoration: line-through;
        """),format.raw/*288.9*/("""}"""),format.raw/*288.10*/("""
        .product-items .product-item .product-itm-price-new """),format.raw/*289.61*/("""{"""),format.raw/*289.62*/("""
            color: #ee2c3b;
            display: block;
            font: 16px/16px "function-pro",Helvetiva,Arial,sans-serif;
            font-size: 1.6rem;
            line-height: 1em;
        """),format.raw/*295.9*/("""}"""),format.raw/*295.10*/("""
        .product-items .product-item .product-itm-discount-percent """),format.raw/*296.68*/("""{"""),format.raw/*296.69*/("""
            background: url(/assets/images/iconset.png) -180px 0;
            display: block;
            color: #fff;
            font-size: 16px;
            font-size: 1.6rem;
            font-weight: bold;
            height: 50px;
            line-height: 50px;
            position: relative;
            left: 120px;
            top: -260px;
            text-shadow: 0 1px 0 black;
            width: 50px;
        """),format.raw/*310.9*/("""}"""),format.raw/*310.10*/("""
        .product-items .product-item button """),format.raw/*311.45*/("""{"""),format.raw/*311.46*/("""
            background-color: #fbaf3a;
            background-image: -webkit-gradient(linear,left top,left bottom,color-stop(0%,#f26823),color-stop(100%,#c23927));
            background-image: -webkit-linear-gradient(top,#f26823,#c23927);
            background-image: -moz-linear-gradient(top,#f26823,#c23927);
            background-image: -ms-linear-gradient(top,#f26823,#c23927);
            background-image: -o-linear-gradient(top,#f26823,#c23927);
            background-image: linear-gradient(top,#f26823,#c23927);
            border: 0;
            border-radius: 5px;
            -webkit-box-shadow: 0 1px 2px rgba(0,0,0,0.3);
            box-shadow: 0 1px 2px rgba(0,0,0,0.3);
            color: #fff;
            font: 100 14px/20px "function-pro",Helvetiva,Arial,sans-serif;
            padding: 3px 10px 3px 30px;
            position: absolute;
            text-decoration: none;
            text-shadow: 0 1px 0 rgba(0,0,0,0.5);
            text-transform: uppercase;
            top: 280px;
        """),format.raw/*331.9*/("""}"""),format.raw/*331.10*/("""
        .product-items .product-item button:hover """),format.raw/*332.51*/("""{"""),format.raw/*332.52*/("""
            background-image:none;
            background-color: #fbaf3a;
        """),format.raw/*335.9*/("""}"""),format.raw/*335.10*/("""
    </style>
""")))}/*337.2*/{_display_(Seq[Any](format.raw/*337.3*/("""
    <div id="category-navigation-catalog">
        <nav id="category-navigation">
            <ul id="category-navigation-breadcrumbs">
            </ul>
        </nav>
    </div>
    <div id="catalog">
        <aside>
            <ul id="filters">
                <li class="category-segment">
                    <div class="filter-title">
                        categoria
                    </div>
                    <div>
                        <ul class="category-filter">

                        </ul>
                    </div>
                    <div>

                    </div>
                </li>
                <li class="brands">
                    <div class="filter-title">
                        marca
                    </div>
                     <div>
                        <ul id="facet_brand" class="fct-scroll" style="height: 110px">
                        </ul>
                    </div>
                </li>
                <li class="price-slider">
                    <div class="filter-title">
                        precio
                    </div>
                    <div>
                        <div class="sliderInput clearfix">
                            <span class="priceRangeFrom">
                                <input id="input-RangeFrom" class="ui-inputText fss" type="text" name="price_from" maxlength="8">
                                <span class="priceRange-span">S/.</span>
                            </span>
                            <span class="priceSeperate">-</span>
                            <span class="priceRangeTo">
                                <input id="input-RangeTo" class="ui-inputText fss" type="text" name="price_to" maxlength="8">
                                <span class="priceRange-span">S/.</span>
                            </span>
                            <input class="catalogPriceFilterSubmit" type="button" value="»">
                        </div>
                    </div>
                </li>

            </ul>
        </aside>
        <div id="catalog-content">
            <div class="paging">
                <div id="catalog-sort">
                    <label for="catalog-sort-order">Ordenar por</label>
                    <select id="ordenar-productos" class="catalog-sort-order">
                        <option value="precio"> Precio</option>
                        <option value="descuento"> Descuento</option>
                    </select>
                </div>
                <div id="items-founds" data-total="0">
                    <span>0 Items encontrados</span>
                </div>
            </div>
            <ul id="catalog-items" class="product-items"></ul>
        </div>
    </div>
    <script>
        var marca=""""),_display_(Seq[Any](/*408.21*/{marca})),format.raw/*408.28*/(""""
        marca=marca.toLowerCase()
        var categoria=""
        var id=""
        """),_display_(Seq[Any](/*412.10*/if(categoria!=null)/*412.29*/{_display_(Seq[Any](format.raw/*412.30*/("""
            categoria=""""),_display_(Seq[Any](/*413.25*/{categoria.nombre})),format.raw/*413.43*/(""""
            categoria=categoria.toLowerCase()
            id="""),_display_(Seq[Any](/*415.17*/categoria/*415.26*/.id)),format.raw/*415.29*/("""
        """)))})),format.raw/*416.10*/("""
        if(categoria!="")"""),format.raw/*417.26*/("""{"""),format.raw/*417.27*/("""
            $.ajax("""),format.raw/*418.20*/("""{"""),format.raw/*418.21*/("""
                type : "POST",
                url : "/home/categoria/ascendentes",
                async : false,
                data : """),format.raw/*422.24*/("""{"""),format.raw/*422.25*/("""nombre:categoria"""),format.raw/*422.41*/("""}"""),format.raw/*422.42*/(""",
                success:function(categorias)"""),format.raw/*423.45*/("""{"""),format.raw/*423.46*/("""
                    $("#category-navigation-breadcrumbs").append('<li><a href="/home" title="Inicio">Inicio</a></li>')
                    var catNav=marca==""?categorias.slice().reverse().slice(0,categorias.length-1):categorias.slice().reverse()
                    for(var i in catNav)"""),format.raw/*426.41*/("""{"""),format.raw/*426.42*/("""
                        var nombre=catNav[i].nombre
                        $("#category-navigation-breadcrumbs").append('<li><a href="/categoria/'+
                            catNav[i].nombre.replace(/ /g,"-")+'" title="'+nombre+'">'+nombre+'</a></li>')
                    """),format.raw/*430.21*/("""}"""),format.raw/*430.22*/("""
                    var span=""
                    if(marca=="")span='<span>'+categoria+'</span>'
                    else span='<span>'+marca+'</span>&nbsp;<span>( más de <a href="/marca/'+marca+'">'+marca+'</a>)</span>'
                    $("#category-navigation-breadcrumbs").append('<li>'+span+'</li>')
                    categorias=categorias.slice(0,Math.min(categorias.length,3)).reverse()
                    for(var i in categorias)"""),format.raw/*436.45*/("""{"""),format.raw/*436.46*/("""
                        if(i==0)"""),format.raw/*437.33*/("""{"""),format.raw/*437.34*/("""
                            //$(".category-filter").append(crearCategoria(categorias[i],marca))
                            subcategorias($(".category-filter"),categorias[i],marca)
                        """),format.raw/*440.25*/("""}"""),format.raw/*440.26*/("""
                        else"""),format.raw/*441.29*/("""{"""),format.raw/*441.30*/("""
                            var li=$(".category-filter li[data-id="+categorias[i].id+"]")
                            subcategorias(li,categorias[i],marca)
                        """),format.raw/*444.25*/("""}"""),format.raw/*444.26*/("""
                    """),format.raw/*445.21*/("""}"""),format.raw/*445.22*/("""
                    $(".category-filter li[data-id="+id+"]").addClass("selected")
                    $(".category-filter .rem").remove()
                """),format.raw/*448.17*/("""}"""),format.raw/*448.18*/("""
            """),format.raw/*449.13*/("""}"""),format.raw/*449.14*/(""")
        """),format.raw/*450.9*/("""}"""),format.raw/*450.10*/("""
        else"""),format.raw/*451.13*/("""{"""),format.raw/*451.14*/("""
            $.ajax("""),format.raw/*452.20*/("""{"""),format.raw/*452.21*/("""
                type : "POST",
                url : "/home/categoria/primerascategorias",
                async : false,
                data : """),format.raw/*456.24*/("""{"""),format.raw/*456.25*/("""}"""),format.raw/*456.26*/(""",
                success:function(categorias)"""),format.raw/*457.45*/("""{"""),format.raw/*457.46*/("""
                    for(var i in categorias)"""),format.raw/*458.45*/("""{"""),format.raw/*458.46*/("""
                        $(".category-filter").append(crearCategoria(categorias[i],marca))
                            subcategorias($(".category-filter>li:last-child"),categorias[i],marca)
                    """),format.raw/*461.21*/("""}"""),format.raw/*461.22*/("""
                    $(".category-filter .rem").remove()
                """),format.raw/*463.17*/("""}"""),format.raw/*463.18*/("""
            """),format.raw/*464.13*/("""}"""),format.raw/*464.14*/(""")
        """),format.raw/*465.9*/("""}"""),format.raw/*465.10*/("""
        function subcategorias(elem,categoria,marca)"""),format.raw/*466.53*/("""{"""),format.raw/*466.54*/("""
            $.ajax("""),format.raw/*467.20*/("""{"""),format.raw/*467.21*/("""
                type : "POST",
                url : "/home/categoria/subcategorias",
                async : false,
                data : """),format.raw/*471.24*/("""{"""),format.raw/*471.25*/("""nombre:categoria.nombre.toLowerCase()"""),format.raw/*471.62*/("""}"""),format.raw/*471.63*/(""",
                success:function(categorias)"""),format.raw/*472.45*/("""{"""),format.raw/*472.46*/("""
                    $(elem).removeClass("rem")
                    var ul;
                    if($(elem).is("ul"))ul=$(elem)
                    if($(elem).is("li"))"""),format.raw/*476.41*/("""{"""),format.raw/*476.42*/("""
                        $(elem).append('<ul></ul>')
                        ul=$(elem).find(">ul")
                    """),format.raw/*479.21*/("""}"""),format.raw/*479.22*/("""
                    for(var i in categorias)"""),format.raw/*480.45*/("""{"""),format.raw/*480.46*/("""
                        var nombre=categorias[i].nombre.toLowerCase()
                        var cantidad=cantidadProductos(nombre,marca)
                        $(ul).append(crearCategoria(categorias[i],marca,cantidad))
                        //if(cantidad==0)$(ul).find("li:last-child").addClass("rem")
                    """),format.raw/*485.21*/("""}"""),format.raw/*485.22*/("""
                """),format.raw/*486.17*/("""}"""),format.raw/*486.18*/("""
            """),format.raw/*487.13*/("""}"""),format.raw/*487.14*/(""")
        """),format.raw/*488.9*/("""}"""),format.raw/*488.10*/("""
        function cantidadProductos(nombre,marca)"""),format.raw/*489.49*/("""{"""),format.raw/*489.50*/("""
            var cantidad=0
            $.ajax("""),format.raw/*491.20*/("""{"""),format.raw/*491.21*/("""
                type : "POST",
                url : "/home/categoria/cantidadproductos",
                async : false,
                data : """),format.raw/*495.24*/("""{"""),format.raw/*495.25*/("""nombre:nombre,marca:marca"""),format.raw/*495.50*/("""}"""),format.raw/*495.51*/(""",
                success:function(cantidadP)"""),format.raw/*496.44*/("""{"""),format.raw/*496.45*/("""
                    cantidad=cantidadP
                """),format.raw/*498.17*/("""}"""),format.raw/*498.18*/("""
            """),format.raw/*499.13*/("""}"""),format.raw/*499.14*/(""")
            return cantidad
        """),format.raw/*501.9*/("""}"""),format.raw/*501.10*/("""
        function crearCategoria(categoria,marca,cant)"""),format.raw/*502.54*/("""{"""),format.raw/*502.55*/("""
            var nombre=categoria.nombre.toLowerCase()
            var cantidad=cant!=undefined?cant:cantidadProductos(nombre,marca)
            var href=marca!=""?'/marca/'+nombre.replace(/ /g,"-")+'/'+marca:'/categoria/'+nombre.replace(/ /g,"-")
            return '<li data-id='+categoria.id+'>' +
                '<a href="'+href+'">' +
                '<span>'+nombre+'</span><span class="category-cant"> ('+cantidad+')</span>' +
                '</a></li>'
        """),format.raw/*510.9*/("""}"""),format.raw/*510.10*/("""
        if(marca=="")"""),format.raw/*511.22*/("""{"""),format.raw/*511.23*/("""
            $.ajax("""),format.raw/*512.20*/("""{"""),format.raw/*512.21*/("""
                type : "POST",
                url : "/home/producto/marcas",
                async : false,
                data : """),format.raw/*516.24*/("""{"""),format.raw/*516.25*/("""}"""),format.raw/*516.26*/(""",
                success:function(marcas)"""),format.raw/*517.41*/("""{"""),format.raw/*517.42*/("""
                    for(var i in marcas)"""),format.raw/*518.41*/("""{"""),format.raw/*518.42*/("""
                        var marca1=marcas[i].toLowerCase()
                        $("#facet_brand").append('<li><a href="/marca/'+categoria.replace(/ /g,"-")+'/'+marca1+'">'+marca1+'</a></li>')
                    """),format.raw/*521.21*/("""}"""),format.raw/*521.22*/("""
                """),format.raw/*522.17*/("""}"""),format.raw/*522.18*/("""
            """),format.raw/*523.13*/("""}"""),format.raw/*523.14*/(""")
        """),format.raw/*524.9*/("""}"""),format.raw/*524.10*/("""
        else"""),format.raw/*525.13*/("""{"""),format.raw/*525.14*/("""
            $("#facet_brand").after('<p class="brand-filter"><b>'+marca+'</b></p>')
            $("#facet_brand").remove()
        """),format.raw/*528.9*/("""}"""),format.raw/*528.10*/("""
        $(".catalogPriceFilterSubmit").click(function()"""),format.raw/*529.56*/("""{"""),format.raw/*529.57*/("""
            filtrarProductos(categoria,marca,"""),format.raw/*530.46*/("""{"""),format.raw/*530.47*/("""min:$("#input-RangeFrom").val(),max:$("#input-RangeTo").val()"""),format.raw/*530.108*/("""}"""),format.raw/*530.109*/(""",$("#ordenar-productos").val())
        """),format.raw/*531.9*/("""}"""),format.raw/*531.10*/(""")
        $("#ordenar-productos").change(function()"""),format.raw/*532.50*/("""{"""),format.raw/*532.51*/("""
            filtrarProductos(categoria,marca,"""),format.raw/*533.46*/("""{"""),format.raw/*533.47*/("""min:$("#input-RangeFrom").val(),max:$("#input-RangeTo").val()"""),format.raw/*533.108*/("""}"""),format.raw/*533.109*/(""",$("#ordenar-productos").val())
        """),format.raw/*534.9*/("""}"""),format.raw/*534.10*/(""")
        $("#ordenar-productos").change()
        function filtrarProductos(nombre,marca,precio,orden)"""),format.raw/*536.61*/("""{"""),format.raw/*536.62*/("""
            $.ajax("""),format.raw/*537.20*/("""{"""),format.raw/*537.21*/("""
                type : "POST",
                url : "/home/producto/filtrarproductos",
                async : false,
                data : """),format.raw/*541.24*/("""{"""),format.raw/*541.25*/("""nombre:nombre,marca:marca,precioMin:precio.min,precioMax:precio.max,orden:orden"""),format.raw/*541.104*/("""}"""),format.raw/*541.105*/(""",
                success:function(productos)"""),format.raw/*542.44*/("""{"""),format.raw/*542.45*/("""
                    $("#items-founds span").attr("data-id",productos.length)
                    $("#items-founds span").text(productos.length+" Items encontrados")
                    $("#catalog-items").text("")
                    for(var i in productos)"""),format.raw/*546.44*/("""{"""),format.raw/*546.45*/("""
                        price=""
                        if(productos[i].descuento==0)"""),format.raw/*548.54*/("""{"""),format.raw/*548.55*/("""
                            price='<span class="product-itm-price-new" itemprop="price">S/. '+productos[i].precio+'</span>'
                        """),format.raw/*550.25*/("""}"""),format.raw/*550.26*/("""
                        else"""),format.raw/*551.29*/("""{"""),format.raw/*551.30*/("""
                             price='<span class="product-itm-price-old">S/. '+productos[i].precio+'</span>'+
                            '<span class="product-itm-price-new" itemprop="price">S/. '+productos[i].precio_actual+'</span>'+
                            '<span class="product-itm-discount-percent"> -'+productos[i].descuento+'<sup>%</sup></span>'
                        """),format.raw/*555.25*/("""}"""),format.raw/*555.26*/("""
                        $("#catalog-items").append('<li class="product-item"><a><ul data-id='+productos[i].id+'>' +
                            '<li class="product-item-img"><img width="160px" height="160px" src="/assets/productos/'+productos[i].image+'"></li>'+
                            '<li class="product-item-brand">'+productos[i].marca+'</li>'+
                            '<li class="product-item-name"><em itemprop="name">'+productos[i].modelo+'</em></li>'+
                            '<li class="product-item-price">'+price+'</li>'+
                            '<li><button id="AddToCart"><strong>Compra Ahora</strong></button></li>'+
                        '</ul></a>'+'</li>')
                    """),format.raw/*563.21*/("""}"""),format.raw/*563.22*/("""
                    $("#catalog-items #AddToCart").click(function()"""),format.raw/*564.68*/("""{"""),format.raw/*564.69*/("""
                        if(typeof(localStorage)!=="undefined")"""),format.raw/*565.63*/("""{"""),format.raw/*565.64*/("""
                            var id=$(this).closest("ul").attr("data-id")
                            if(localStorage.carrito==undefined || localStorage.carrito=="")"""),format.raw/*567.92*/("""{"""),format.raw/*567.93*/("""
                                localStorage.carrito=id+":"+1
                            """),format.raw/*569.29*/("""}"""),format.raw/*569.30*/("""
                            else"""),format.raw/*570.33*/("""{"""),format.raw/*570.34*/("""
                                if(!productoEnCarrito(id))"""),format.raw/*571.59*/("""{"""),format.raw/*571.60*/("""
                                    localStorage.carrito+=","+id+":"+1
                                """),format.raw/*573.33*/("""}"""),format.raw/*573.34*/("""
                                else"""),format.raw/*574.37*/("""{"""),format.raw/*574.38*/("""
                                    incCantCarrito(id)
                                """),format.raw/*576.33*/("""}"""),format.raw/*576.34*/("""
                            """),format.raw/*577.29*/("""}"""),format.raw/*577.30*/("""
                            //window.location.href="/home/carrito"
                            var total=0;
                            var items=0;
                            for(var i in localStorage.carrito.split(","))"""),format.raw/*581.74*/("""{"""),format.raw/*581.75*/("""
                                var id=localStorage.carrito.split(",")[i].split(":")[0]
                                var cant=localStorage.carrito.split(",")[i].split(":")[1]
                                 $.ajax("""),format.raw/*584.41*/("""{"""),format.raw/*584.42*/("""
                                    type : "POST",
                                    url : "/home/producto/ver",
                                    async : false,
                                    data : """),format.raw/*588.44*/("""{"""),format.raw/*588.45*/("""id:id"""),format.raw/*588.50*/("""}"""),format.raw/*588.51*/(""",
                                    success:function(producto)"""),format.raw/*589.63*/("""{"""),format.raw/*589.64*/("""
                                        total+=parseFloat(producto.precio_actual)*cant
                                        items+=parseInt(cant)
                                    """),format.raw/*592.37*/("""}"""),format.raw/*592.38*/("""
                                """),format.raw/*593.33*/("""}"""),format.raw/*593.34*/(""")
                             """),format.raw/*594.30*/("""}"""),format.raw/*594.31*/("""
                            $(".user-nav-cart-items").text(items)
                            $(".user-nav-cart-grand-total").text("S/. "+parseDouble(total))
                        """),format.raw/*597.25*/("""}"""),format.raw/*597.26*/("""
                    """),format.raw/*598.21*/("""}"""),format.raw/*598.22*/(""")
                    function parseDouble(numero)"""),format.raw/*599.49*/("""{"""),format.raw/*599.50*/("""
                        return parseFloat(numero).toFixed(2)
                    """),format.raw/*601.21*/("""}"""),format.raw/*601.22*/("""
                    function productoEnCarrito(id)"""),format.raw/*602.51*/("""{"""),format.raw/*602.52*/("""
                        for(var i in localStorage.carrito.split(","))"""),format.raw/*603.70*/("""{"""),format.raw/*603.71*/("""
                            if(localStorage.carrito.split(",")[i].split(":")[0]==id)return true
                        """),format.raw/*605.25*/("""}"""),format.raw/*605.26*/("""
                        return false
                    """),format.raw/*607.21*/("""}"""),format.raw/*607.22*/("""
                    function incCantCarrito(id)"""),format.raw/*608.48*/("""{"""),format.raw/*608.49*/("""
                        var carrito=""
                        for(var i in localStorage.carrito.split(","))"""),format.raw/*610.70*/("""{"""),format.raw/*610.71*/("""
                            var ID=localStorage.carrito.split(",")[i].split(":")[0]
                            var cant=localStorage.carrito.split(",")[i].split(":")[1]
                            if(ID==id)"""),format.raw/*613.39*/("""{"""),format.raw/*613.40*/("""
                                carrito+=ID+":"+(parseInt(cant)+1)+","
                            """),format.raw/*615.29*/("""}"""),format.raw/*615.30*/("""
                            else"""),format.raw/*616.33*/("""{"""),format.raw/*616.34*/("""
                                carrito+=localStorage.carrito.split(",")[i]+","
                            """),format.raw/*618.29*/("""}"""),format.raw/*618.30*/("""
                        """),format.raw/*619.25*/("""}"""),format.raw/*619.26*/("""
                        localStorage.carrito=carrito.substring(0,carrito.length-1)
                    """),format.raw/*621.21*/("""}"""),format.raw/*621.22*/("""
                """),format.raw/*622.17*/("""}"""),format.raw/*622.18*/("""
            """),format.raw/*623.13*/("""}"""),format.raw/*623.14*/(""")
        """),format.raw/*624.9*/("""}"""),format.raw/*624.10*/("""
    </script>
""")))})),format.raw/*626.2*/("""
"""))}
    }
    
    def render(message:String,cliente:Cliente,categoria:Categoria,marca:String): play.api.templates.HtmlFormat.Appendable = apply(message,cliente,categoria,marca)
    
    def f:((String,Cliente,Categoria,String) => play.api.templates.HtmlFormat.Appendable) = (message,cliente,categoria,marca) => apply(message,cliente,categoria,marca)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 27 23:42:13 PET 2016
                    SOURCE: /Users/diegodelfin7/Desktop/proy Tienda virtual/tienda/app/views/tienda/catalogo.scala.html
                    HASH: c8435701f136ec36b1f7c34ed4da6421769893e0
                    MATRIX: 809->1|1006->69|1043->108|1076->133|1114->134|1185->178|1213->179|1280->220|1308->221|1378->264|1406->265|1525->357|1554->358|1640->416|1669->417|1763->484|1792->485|1885->550|1914->551|1971->581|1999->582|2073->628|2102->629|2302->802|2331->803|2412->856|2441->857|2570->959|2599->960|2687->1020|2716->1021|2941->1219|2970->1220|3046->1268|3075->1269|3146->1313|3175->1314|3254->1365|3283->1366|3361->1417|3390->1418|3463->1463|3492->1464|3558->1503|3587->1504|3640->1529|3669->1530|3846->1680|3875->1681|3918->1696|3947->1697|4013->1736|4042->1737|4103->1770|4132->1771|4274->1886|4303->1887|4353->1909|4382->1910|4451->1952|4480->1953|4530->1975|4559->1976|4630->2020|4659->2021|4708->2042|4737->2043|4868->2147|4897->2148|4958->2181|4987->2182|5053->2221|5082->2222|5148->2260|5177->2261|5287->2344|5316->2345|5376->2377|5405->2378|5482->2428|5511->2429|5583->2473|5612->2474|5680->2515|5709->2516|5788->2567|5817->2568|5972->2696|6001->2697|6080->2748|6109->2749|6202->2815|6231->2816|6289->2846|6318->2847|6432->2934|6461->2935|6519->2965|6548->2966|6661->3051|6691->3052|6773->3105|6803->3106|6870->3145|6900->3146|6961->3178|6991->3179|7160->3320|7190->3321|7266->3368|7296->3369|7358->3403|7388->3404|7477->3464|7507->3465|7686->3616|7716->3617|7803->3675|7833->3676|7929->3744|7959->3745|8062->3819|8092->3820|8244->3944|8274->3945|8336->3978|8366->3979|8463->4048|8493->4049|8555->4082|8585->4083|8683->4153|8713->4154|8769->4181|8799->4182|8902->4257|8932->4258|8997->4294|9027->4295|9446->4686|9476->4687|9537->4719|9567->4720|9635->4760|9665->4761|9736->4803|9766->4804|9881->4891|9911->4892|9976->4928|10006->4929|11032->5927|11062->5928|11118->5955|11148->5956|11300->6080|11330->6081|11377->6099|11407->6100|11544->6209|11574->6210|11627->6234|11657->6235|11757->6307|11787->6308|11846->6338|11876->6339|12042->6477|12072->6478|12132->6509|12162->6510|12339->6659|12369->6660|12422->6684|12452->6685|12521->6726|12551->6727|12609->6756|12639->6757|12925->7015|12955->7016|13026->7058|13056->7059|13160->7135|13190->7136|13244->7161|13274->7162|13439->7299|13469->7300|13537->7339|13567->7340|13902->7647|13932->7648|14006->7693|14036->7694|14338->7968|14368->7969|14444->8016|14474->8017|14561->8076|14591->8077|14664->8121|14694->8122|14888->8288|14918->8289|14997->8339|15027->8340|15119->8404|15149->8405|15235->8462|15265->8463|15423->8593|15453->8594|15541->8653|15571->8654|15778->8833|15808->8834|15895->8892|15925->8893|16026->8966|16056->8967|16144->9026|16174->9027|16245->9070|16275->9071|16366->9133|16396->9134|16573->9283|16603->9284|16694->9346|16724->9347|16955->9550|16985->9551|17083->9620|17113->9621|17578->10058|17608->10059|17683->10105|17713->10106|18779->11144|18809->11145|18890->11197|18920->11198|19034->11284|19064->11285|19100->11302|19139->11303|22009->14136|22039->14143|22168->14235|22197->14254|22237->14255|22300->14281|22341->14299|22444->14365|22463->14374|22489->14377|22533->14388|22589->14415|22619->14416|22669->14437|22699->14438|22871->14581|22901->14582|22946->14598|22976->14599|23052->14646|23082->14647|23402->14938|23432->14939|23742->15220|23772->15221|24252->15672|24282->15673|24345->15707|24375->15708|24613->15917|24643->15918|24702->15948|24732->15949|24945->16133|24975->16134|25026->16156|25056->16157|25243->16315|25273->16316|25316->16330|25346->16331|25385->16342|25415->16343|25458->16357|25488->16358|25538->16379|25568->16380|25747->16530|25777->16531|25807->16532|25883->16579|25913->16580|25988->16626|26018->16627|26260->16840|26290->16841|26394->16916|26424->16917|26467->16931|26497->16932|26536->16943|26566->16944|26649->16998|26679->16999|26729->17020|26759->17021|26933->17166|26963->17167|27029->17204|27059->17205|27135->17252|27165->17253|27365->17424|27395->17425|27547->17548|27577->17549|27652->17595|27682->17596|28044->17929|28074->17930|28121->17948|28151->17949|28194->17963|28224->17964|28263->17975|28293->17976|28372->18026|28402->18027|28480->18076|28510->18077|28688->18226|28718->18227|28772->18252|28802->18253|28877->18299|28907->18300|28994->18358|29024->18359|29067->18373|29097->18374|29165->18414|29195->18415|29279->18470|29309->18471|29816->18950|29846->18951|29898->18974|29928->18975|29978->18996|30008->18997|30174->19134|30204->19135|30234->19136|30306->19179|30336->19180|30407->19222|30437->19223|30685->19442|30715->19443|30762->19461|30792->19462|30835->19476|30865->19477|30904->19488|30934->19489|30977->19503|31007->19504|31170->19639|31200->19640|31286->19697|31316->19698|31392->19745|31422->19746|31513->19807|31544->19808|31613->19849|31643->19850|31724->19902|31754->19903|31830->19950|31860->19951|31951->20012|31982->20013|32051->20054|32081->20055|32215->20160|32245->20161|32295->20182|32325->20183|32501->20330|32531->20331|32640->20410|32671->20411|32746->20457|32776->20458|33067->20720|33097->20721|33215->20810|33245->20811|33425->20962|33455->20963|33514->20993|33544->20994|33958->21379|33988->21380|34738->22101|34768->22102|34866->22171|34896->22172|34989->22236|35019->22237|35215->22404|35245->22405|35367->22498|35397->22499|35460->22533|35490->22534|35579->22594|35609->22595|35744->22701|35774->22702|35841->22740|35871->22741|35990->22831|36020->22832|36079->22862|36109->22863|36365->23090|36395->23091|36646->23313|36676->23314|36919->23528|36949->23529|36983->23534|37013->23535|37107->23600|37137->23601|37355->23790|37385->23791|37448->23825|37478->23826|37539->23858|37569->23859|37784->24045|37814->24046|37865->24068|37895->24069|37975->24120|38005->24121|38118->24205|38148->24206|38229->24258|38259->24259|38359->24330|38389->24331|38541->24454|38571->24455|38660->24515|38690->24516|38768->24565|38798->24566|38938->24677|38968->24678|39209->24890|39239->24891|39370->24993|39400->24994|39463->25028|39493->25029|39633->25140|39663->25141|39718->25167|39748->25168|39883->25274|39913->25275|39960->25293|39990->25294|40033->25308|40063->25309|40102->25320|40132->25321|40182->25339
                    LINES: 26->1|30->1|31->3|31->3|31->3|33->5|33->5|35->7|35->7|36->8|36->8|39->11|39->11|40->12|40->12|43->15|43->15|44->16|44->16|46->18|46->18|47->19|47->19|53->25|53->25|54->26|54->26|58->30|58->30|59->31|59->31|65->37|65->37|66->38|66->38|68->40|68->40|69->41|69->41|71->43|71->43|72->44|72->44|74->46|74->46|75->47|75->47|80->52|80->52|81->53|81->53|83->55|83->55|84->56|84->56|88->60|88->60|89->61|89->61|91->63|91->63|92->64|92->64|94->66|94->66|95->67|95->67|99->71|99->71|100->72|100->72|102->74|102->74|103->75|103->75|106->78|106->78|107->79|107->79|109->81|109->81|110->82|110->82|112->84|112->84|113->85|113->85|118->90|118->90|119->91|119->91|122->94|122->94|123->95|123->95|126->98|126->98|127->99|127->99|130->102|130->102|131->103|131->103|133->105|133->105|134->106|134->106|139->111|139->111|140->112|140->112|142->114|142->114|143->115|143->115|148->120|148->120|149->121|149->121|152->124|152->124|153->125|153->125|158->130|158->130|159->131|159->131|162->134|162->134|163->135|163->135|166->138|166->138|167->139|167->139|170->142|170->142|171->143|171->143|181->153|181->153|182->154|182->154|184->156|184->156|185->157|185->157|188->160|188->160|189->161|189->161|209->181|209->181|210->182|210->182|214->186|214->186|215->187|215->187|219->191|219->191|220->192|220->192|223->195|223->195|224->196|224->196|229->201|229->201|230->202|230->202|235->207|235->207|236->208|236->208|238->210|238->210|239->211|239->211|247->219|247->219|248->220|248->220|251->223|251->223|252->224|252->224|257->229|257->229|258->230|258->230|268->240|268->240|269->241|269->241|277->249|277->249|278->250|278->250|281->253|281->253|282->254|282->254|288->260|288->260|289->261|289->261|292->264|292->264|293->265|293->265|298->270|298->270|299->271|299->271|304->276|304->276|305->277|305->277|308->280|308->280|309->281|309->281|311->283|311->283|312->284|312->284|316->288|316->288|317->289|317->289|323->295|323->295|324->296|324->296|338->310|338->310|339->311|339->311|359->331|359->331|360->332|360->332|363->335|363->335|365->337|365->337|436->408|436->408|440->412|440->412|440->412|441->413|441->413|443->415|443->415|443->415|444->416|445->417|445->417|446->418|446->418|450->422|450->422|450->422|450->422|451->423|451->423|454->426|454->426|458->430|458->430|464->436|464->436|465->437|465->437|468->440|468->440|469->441|469->441|472->444|472->444|473->445|473->445|476->448|476->448|477->449|477->449|478->450|478->450|479->451|479->451|480->452|480->452|484->456|484->456|484->456|485->457|485->457|486->458|486->458|489->461|489->461|491->463|491->463|492->464|492->464|493->465|493->465|494->466|494->466|495->467|495->467|499->471|499->471|499->471|499->471|500->472|500->472|504->476|504->476|507->479|507->479|508->480|508->480|513->485|513->485|514->486|514->486|515->487|515->487|516->488|516->488|517->489|517->489|519->491|519->491|523->495|523->495|523->495|523->495|524->496|524->496|526->498|526->498|527->499|527->499|529->501|529->501|530->502|530->502|538->510|538->510|539->511|539->511|540->512|540->512|544->516|544->516|544->516|545->517|545->517|546->518|546->518|549->521|549->521|550->522|550->522|551->523|551->523|552->524|552->524|553->525|553->525|556->528|556->528|557->529|557->529|558->530|558->530|558->530|558->530|559->531|559->531|560->532|560->532|561->533|561->533|561->533|561->533|562->534|562->534|564->536|564->536|565->537|565->537|569->541|569->541|569->541|569->541|570->542|570->542|574->546|574->546|576->548|576->548|578->550|578->550|579->551|579->551|583->555|583->555|591->563|591->563|592->564|592->564|593->565|593->565|595->567|595->567|597->569|597->569|598->570|598->570|599->571|599->571|601->573|601->573|602->574|602->574|604->576|604->576|605->577|605->577|609->581|609->581|612->584|612->584|616->588|616->588|616->588|616->588|617->589|617->589|620->592|620->592|621->593|621->593|622->594|622->594|625->597|625->597|626->598|626->598|627->599|627->599|629->601|629->601|630->602|630->602|631->603|631->603|633->605|633->605|635->607|635->607|636->608|636->608|638->610|638->610|641->613|641->613|643->615|643->615|644->616|644->616|646->618|646->618|647->619|647->619|649->621|649->621|650->622|650->622|651->623|651->623|652->624|652->624|654->626
                    -- GENERATED --
                */
            