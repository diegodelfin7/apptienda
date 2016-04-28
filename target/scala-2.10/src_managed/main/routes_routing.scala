// @SOURCE:/Users/diegodelfin7/Desktop/proy Tienda virtual/tienda/conf/routes
// @HASH:8ba600ac49bddc3dba21ec15f38614120df3ffcc
// @DATE:Wed Apr 27 23:42:10 PET 2016


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_TiendaC_home1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home"))))
        

// @LINE:9
private[this] lazy val controllers_TiendaC_login2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home/login"))))
        

// @LINE:10
private[this] lazy val controllers_TiendaC_autenticar3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home/login"))))
        

// @LINE:11
private[this] lazy val controllers_TiendaC_logout4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home/logout"))))
        

// @LINE:12
private[this] lazy val controllers_TiendaC_buscarCategoria5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home/buscarxcategoria"))))
        

// @LINE:13
private[this] lazy val controllers_TiendaC_buscarMarca6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home/buscarxmarca"))))
        

// @LINE:14
private[this] lazy val controllers_TiendaC_buscarCategoriaMarca7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home/buscarxcategoriamarca"))))
        

// @LINE:15
private[this] lazy val controllers_TiendaC_catalogoC8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("categoria/"),DynamicPart("categoria", """[^/]+""",true))))
        

// @LINE:16
private[this] lazy val controllers_ProductoC_primerasCategorias9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home/categoria/primerascategorias"))))
        

// @LINE:17
private[this] lazy val controllers_CategoriaC_ver10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home/categoria/ver"))))
        

// @LINE:18
private[this] lazy val controllers_CategoriaC_ascendentes11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home/categoria/ascendentes"))))
        

// @LINE:19
private[this] lazy val controllers_CategoriaC_subcategorias12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home/categoria/subcategorias"))))
        

// @LINE:20
private[this] lazy val controllers_CategoriaC_descendientes13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home/categoria/descendientes"))))
        

// @LINE:21
private[this] lazy val controllers_CategoriaC_cantidadProductos14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home/categoria/cantidadproductos"))))
        

// @LINE:22
private[this] lazy val controllers_TiendaC_catalogoCM15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("marca/"),DynamicPart("categoria", """[^/]+""",true),StaticPart("/"),DynamicPart("marca", """[^/]+""",true))))
        

// @LINE:23
private[this] lazy val controllers_TiendaC_catalogoM16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("marca/"),DynamicPart("marca", """[^/]+""",true))))
        

// @LINE:24
private[this] lazy val controllers_ProductoC_ver17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home/producto/ver"))))
        

// @LINE:25
private[this] lazy val controllers_ProductoC_marcas18 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home/producto/marcas"))))
        

// @LINE:26
private[this] lazy val controllers_ProductoC_filtrarProductos19 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home/producto/filtrarproductos"))))
        

// @LINE:27
private[this] lazy val controllers_TiendaC_carrito20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home/carrito"))))
        

// @LINE:29
private[this] lazy val controllers_TiendaC_registrar21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cliente/registro"))))
        

// @LINE:30
private[this] lazy val controllers_TiendaC_agregar22 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cliente/registro"))))
        

// @LINE:31
private[this] lazy val controllers_TiendaC_existeCuenta23 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cliente/existecuenta"))))
        

// @LINE:32
private[this] lazy val controllers_TiendaC_editar24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cliente/editar"))))
        

// @LINE:33
private[this] lazy val controllers_TiendaC_modificar25 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cliente/editar"))))
        

// @LINE:35
private[this] lazy val controllers_Administrador_index26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin"))))
        

// @LINE:36
private[this] lazy val controllers_Administrador_autenticar27 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:37
private[this] lazy val controllers_Administrador_logout28 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/logout"))))
        

// @LINE:39
private[this] lazy val controllers_CategoriaC_index29 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/categoria"))))
        

// @LINE:40
private[this] lazy val controllers_CategoriaC_categoria30 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/categoria/agregar"))))
        

// @LINE:41
private[this] lazy val controllers_CategoriaC_listar31 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/categoria/listar"))))
        

// @LINE:42
private[this] lazy val controllers_CategoriaC_agregar32 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/categoria/agregar"))))
        

// @LINE:43
private[this] lazy val controllers_CategoriaC_eliminar33 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/categoria/eliminar"))))
        

// @LINE:44
private[this] lazy val controllers_CategoriaC_existeCategoria34 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/categoria/existecategoria"))))
        

// @LINE:46
private[this] lazy val controllers_ProductoC_index35 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/producto"))))
        

// @LINE:47
private[this] lazy val controllers_ProductoC_listar36 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/producto/listar"))))
        

// @LINE:48
private[this] lazy val controllers_ProductoC_producto37 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/producto/agregar"))))
        

// @LINE:49
private[this] lazy val controllers_ProductoC_agregar38 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/producto/agregar"))))
        

// @LINE:50
private[this] lazy val controllers_ProductoC_ultimasCategorias39 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/producto/ultimascategorias"))))
        

// @LINE:51
private[this] lazy val controllers_ProductoC_eliminar40 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/producto/eliminar"))))
        

// @LINE:52
private[this] lazy val controllers_ProductoC_mostrar41 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/producto/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:53
private[this] lazy val controllers_ProductoC_editar42 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/producto/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:55
private[this] lazy val controllers_Assets_at43 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home""","""controllers.TiendaC.home()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home/login""","""controllers.TiendaC.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home/login""","""controllers.TiendaC.autenticar()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home/logout""","""controllers.TiendaC.logout()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home/buscarxcategoria""","""controllers.TiendaC.buscarCategoria()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home/buscarxmarca""","""controllers.TiendaC.buscarMarca()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home/buscarxcategoriamarca""","""controllers.TiendaC.buscarCategoriaMarca()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """categoria/$categoria<[^/]+>""","""controllers.TiendaC.catalogoC(categoria:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home/categoria/primerascategorias""","""controllers.ProductoC.primerasCategorias()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home/categoria/ver""","""controllers.CategoriaC.ver()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home/categoria/ascendentes""","""controllers.CategoriaC.ascendentes()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home/categoria/subcategorias""","""controllers.CategoriaC.subcategorias()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home/categoria/descendientes""","""controllers.CategoriaC.descendientes()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home/categoria/cantidadproductos""","""controllers.CategoriaC.cantidadProductos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """marca/$categoria<[^/]+>/$marca<[^/]+>""","""controllers.TiendaC.catalogoCM(categoria:String, marca:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """marca/$marca<[^/]+>""","""controllers.TiendaC.catalogoM(marca:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home/producto/ver""","""controllers.ProductoC.ver()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home/producto/marcas""","""controllers.ProductoC.marcas()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home/producto/filtrarproductos""","""controllers.ProductoC.filtrarProductos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home/carrito""","""controllers.TiendaC.carrito()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cliente/registro""","""controllers.TiendaC.registrar()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cliente/registro""","""controllers.TiendaC.agregar()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cliente/existecuenta""","""controllers.TiendaC.existeCuenta()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cliente/editar""","""controllers.TiendaC.editar()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cliente/editar""","""controllers.TiendaC.modificar()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin""","""controllers.Administrador.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Administrador.autenticar()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/logout""","""controllers.Administrador.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/categoria""","""controllers.CategoriaC.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/categoria/agregar""","""controllers.CategoriaC.categoria()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/categoria/listar""","""controllers.CategoriaC.listar()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/categoria/agregar""","""controllers.CategoriaC.agregar()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/categoria/eliminar""","""controllers.CategoriaC.eliminar()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/categoria/existecategoria""","""controllers.CategoriaC.existeCategoria()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/producto""","""controllers.ProductoC.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/producto/listar""","""controllers.ProductoC.listar()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/producto/agregar""","""controllers.ProductoC.producto()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/producto/agregar""","""controllers.ProductoC.agregar()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/producto/ultimascategorias""","""controllers.ProductoC.ultimasCategorias()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/producto/eliminar""","""controllers.ProductoC.eliminar()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/producto/$id<[^/]+>""","""controllers.ProductoC.mostrar(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/producto/$id<[^/]+>""","""controllers.ProductoC.editar(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_TiendaC_home1(params) => {
   call { 
        invokeHandler(controllers.TiendaC.home(), HandlerDef(this, "controllers.TiendaC", "home", Nil,"GET", """""", Routes.prefix + """home"""))
   }
}
        

// @LINE:9
case controllers_TiendaC_login2(params) => {
   call { 
        invokeHandler(controllers.TiendaC.login(), HandlerDef(this, "controllers.TiendaC", "login", Nil,"GET", """""", Routes.prefix + """home/login"""))
   }
}
        

// @LINE:10
case controllers_TiendaC_autenticar3(params) => {
   call { 
        invokeHandler(controllers.TiendaC.autenticar(), HandlerDef(this, "controllers.TiendaC", "autenticar", Nil,"POST", """""", Routes.prefix + """home/login"""))
   }
}
        

// @LINE:11
case controllers_TiendaC_logout4(params) => {
   call { 
        invokeHandler(controllers.TiendaC.logout(), HandlerDef(this, "controllers.TiendaC", "logout", Nil,"GET", """""", Routes.prefix + """home/logout"""))
   }
}
        

// @LINE:12
case controllers_TiendaC_buscarCategoria5(params) => {
   call { 
        invokeHandler(controllers.TiendaC.buscarCategoria(), HandlerDef(this, "controllers.TiendaC", "buscarCategoria", Nil,"POST", """""", Routes.prefix + """home/buscarxcategoria"""))
   }
}
        

// @LINE:13
case controllers_TiendaC_buscarMarca6(params) => {
   call { 
        invokeHandler(controllers.TiendaC.buscarMarca(), HandlerDef(this, "controllers.TiendaC", "buscarMarca", Nil,"POST", """""", Routes.prefix + """home/buscarxmarca"""))
   }
}
        

// @LINE:14
case controllers_TiendaC_buscarCategoriaMarca7(params) => {
   call { 
        invokeHandler(controllers.TiendaC.buscarCategoriaMarca(), HandlerDef(this, "controllers.TiendaC", "buscarCategoriaMarca", Nil,"POST", """""", Routes.prefix + """home/buscarxcategoriamarca"""))
   }
}
        

// @LINE:15
case controllers_TiendaC_catalogoC8(params) => {
   call(params.fromPath[String]("categoria", None)) { (categoria) =>
        invokeHandler(controllers.TiendaC.catalogoC(categoria), HandlerDef(this, "controllers.TiendaC", "catalogoC", Seq(classOf[String]),"GET", """""", Routes.prefix + """categoria/$categoria<[^/]+>"""))
   }
}
        

// @LINE:16
case controllers_ProductoC_primerasCategorias9(params) => {
   call { 
        invokeHandler(controllers.ProductoC.primerasCategorias(), HandlerDef(this, "controllers.ProductoC", "primerasCategorias", Nil,"POST", """""", Routes.prefix + """home/categoria/primerascategorias"""))
   }
}
        

// @LINE:17
case controllers_CategoriaC_ver10(params) => {
   call { 
        invokeHandler(controllers.CategoriaC.ver(), HandlerDef(this, "controllers.CategoriaC", "ver", Nil,"POST", """""", Routes.prefix + """home/categoria/ver"""))
   }
}
        

// @LINE:18
case controllers_CategoriaC_ascendentes11(params) => {
   call { 
        invokeHandler(controllers.CategoriaC.ascendentes(), HandlerDef(this, "controllers.CategoriaC", "ascendentes", Nil,"POST", """""", Routes.prefix + """home/categoria/ascendentes"""))
   }
}
        

// @LINE:19
case controllers_CategoriaC_subcategorias12(params) => {
   call { 
        invokeHandler(controllers.CategoriaC.subcategorias(), HandlerDef(this, "controllers.CategoriaC", "subcategorias", Nil,"POST", """""", Routes.prefix + """home/categoria/subcategorias"""))
   }
}
        

// @LINE:20
case controllers_CategoriaC_descendientes13(params) => {
   call { 
        invokeHandler(controllers.CategoriaC.descendientes(), HandlerDef(this, "controllers.CategoriaC", "descendientes", Nil,"POST", """""", Routes.prefix + """home/categoria/descendientes"""))
   }
}
        

// @LINE:21
case controllers_CategoriaC_cantidadProductos14(params) => {
   call { 
        invokeHandler(controllers.CategoriaC.cantidadProductos(), HandlerDef(this, "controllers.CategoriaC", "cantidadProductos", Nil,"POST", """""", Routes.prefix + """home/categoria/cantidadproductos"""))
   }
}
        

// @LINE:22
case controllers_TiendaC_catalogoCM15(params) => {
   call(params.fromPath[String]("categoria", None), params.fromPath[String]("marca", None)) { (categoria, marca) =>
        invokeHandler(controllers.TiendaC.catalogoCM(categoria, marca), HandlerDef(this, "controllers.TiendaC", "catalogoCM", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """marca/$categoria<[^/]+>/$marca<[^/]+>"""))
   }
}
        

// @LINE:23
case controllers_TiendaC_catalogoM16(params) => {
   call(params.fromPath[String]("marca", None)) { (marca) =>
        invokeHandler(controllers.TiendaC.catalogoM(marca), HandlerDef(this, "controllers.TiendaC", "catalogoM", Seq(classOf[String]),"GET", """""", Routes.prefix + """marca/$marca<[^/]+>"""))
   }
}
        

// @LINE:24
case controllers_ProductoC_ver17(params) => {
   call { 
        invokeHandler(controllers.ProductoC.ver(), HandlerDef(this, "controllers.ProductoC", "ver", Nil,"POST", """""", Routes.prefix + """home/producto/ver"""))
   }
}
        

// @LINE:25
case controllers_ProductoC_marcas18(params) => {
   call { 
        invokeHandler(controllers.ProductoC.marcas(), HandlerDef(this, "controllers.ProductoC", "marcas", Nil,"POST", """""", Routes.prefix + """home/producto/marcas"""))
   }
}
        

// @LINE:26
case controllers_ProductoC_filtrarProductos19(params) => {
   call { 
        invokeHandler(controllers.ProductoC.filtrarProductos(), HandlerDef(this, "controllers.ProductoC", "filtrarProductos", Nil,"POST", """""", Routes.prefix + """home/producto/filtrarproductos"""))
   }
}
        

// @LINE:27
case controllers_TiendaC_carrito20(params) => {
   call { 
        invokeHandler(controllers.TiendaC.carrito(), HandlerDef(this, "controllers.TiendaC", "carrito", Nil,"GET", """""", Routes.prefix + """home/carrito"""))
   }
}
        

// @LINE:29
case controllers_TiendaC_registrar21(params) => {
   call { 
        invokeHandler(controllers.TiendaC.registrar(), HandlerDef(this, "controllers.TiendaC", "registrar", Nil,"GET", """""", Routes.prefix + """cliente/registro"""))
   }
}
        

// @LINE:30
case controllers_TiendaC_agregar22(params) => {
   call { 
        invokeHandler(controllers.TiendaC.agregar(), HandlerDef(this, "controllers.TiendaC", "agregar", Nil,"POST", """""", Routes.prefix + """cliente/registro"""))
   }
}
        

// @LINE:31
case controllers_TiendaC_existeCuenta23(params) => {
   call { 
        invokeHandler(controllers.TiendaC.existeCuenta(), HandlerDef(this, "controllers.TiendaC", "existeCuenta", Nil,"POST", """""", Routes.prefix + """cliente/existecuenta"""))
   }
}
        

// @LINE:32
case controllers_TiendaC_editar24(params) => {
   call { 
        invokeHandler(controllers.TiendaC.editar(), HandlerDef(this, "controllers.TiendaC", "editar", Nil,"GET", """""", Routes.prefix + """cliente/editar"""))
   }
}
        

// @LINE:33
case controllers_TiendaC_modificar25(params) => {
   call { 
        invokeHandler(controllers.TiendaC.modificar(), HandlerDef(this, "controllers.TiendaC", "modificar", Nil,"POST", """""", Routes.prefix + """cliente/editar"""))
   }
}
        

// @LINE:35
case controllers_Administrador_index26(params) => {
   call { 
        invokeHandler(controllers.Administrador.index(), HandlerDef(this, "controllers.Administrador", "index", Nil,"GET", """""", Routes.prefix + """admin"""))
   }
}
        

// @LINE:36
case controllers_Administrador_autenticar27(params) => {
   call { 
        invokeHandler(controllers.Administrador.autenticar(), HandlerDef(this, "controllers.Administrador", "autenticar", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:37
case controllers_Administrador_logout28(params) => {
   call { 
        invokeHandler(controllers.Administrador.logout(), HandlerDef(this, "controllers.Administrador", "logout", Nil,"GET", """""", Routes.prefix + """admin/logout"""))
   }
}
        

// @LINE:39
case controllers_CategoriaC_index29(params) => {
   call { 
        invokeHandler(controllers.CategoriaC.index(), HandlerDef(this, "controllers.CategoriaC", "index", Nil,"GET", """""", Routes.prefix + """admin/categoria"""))
   }
}
        

// @LINE:40
case controllers_CategoriaC_categoria30(params) => {
   call { 
        invokeHandler(controllers.CategoriaC.categoria(), HandlerDef(this, "controllers.CategoriaC", "categoria", Nil,"GET", """""", Routes.prefix + """admin/categoria/agregar"""))
   }
}
        

// @LINE:41
case controllers_CategoriaC_listar31(params) => {
   call { 
        invokeHandler(controllers.CategoriaC.listar(), HandlerDef(this, "controllers.CategoriaC", "listar", Nil,"POST", """""", Routes.prefix + """admin/categoria/listar"""))
   }
}
        

// @LINE:42
case controllers_CategoriaC_agregar32(params) => {
   call { 
        invokeHandler(controllers.CategoriaC.agregar(), HandlerDef(this, "controllers.CategoriaC", "agregar", Nil,"POST", """""", Routes.prefix + """admin/categoria/agregar"""))
   }
}
        

// @LINE:43
case controllers_CategoriaC_eliminar33(params) => {
   call { 
        invokeHandler(controllers.CategoriaC.eliminar(), HandlerDef(this, "controllers.CategoriaC", "eliminar", Nil,"POST", """""", Routes.prefix + """admin/categoria/eliminar"""))
   }
}
        

// @LINE:44
case controllers_CategoriaC_existeCategoria34(params) => {
   call { 
        invokeHandler(controllers.CategoriaC.existeCategoria(), HandlerDef(this, "controllers.CategoriaC", "existeCategoria", Nil,"POST", """""", Routes.prefix + """admin/categoria/existecategoria"""))
   }
}
        

// @LINE:46
case controllers_ProductoC_index35(params) => {
   call { 
        invokeHandler(controllers.ProductoC.index(), HandlerDef(this, "controllers.ProductoC", "index", Nil,"GET", """""", Routes.prefix + """admin/producto"""))
   }
}
        

// @LINE:47
case controllers_ProductoC_listar36(params) => {
   call { 
        invokeHandler(controllers.ProductoC.listar(), HandlerDef(this, "controllers.ProductoC", "listar", Nil,"POST", """""", Routes.prefix + """admin/producto/listar"""))
   }
}
        

// @LINE:48
case controllers_ProductoC_producto37(params) => {
   call { 
        invokeHandler(controllers.ProductoC.producto(), HandlerDef(this, "controllers.ProductoC", "producto", Nil,"GET", """""", Routes.prefix + """admin/producto/agregar"""))
   }
}
        

// @LINE:49
case controllers_ProductoC_agregar38(params) => {
   call { 
        invokeHandler(controllers.ProductoC.agregar(), HandlerDef(this, "controllers.ProductoC", "agregar", Nil,"POST", """""", Routes.prefix + """admin/producto/agregar"""))
   }
}
        

// @LINE:50
case controllers_ProductoC_ultimasCategorias39(params) => {
   call { 
        invokeHandler(controllers.ProductoC.ultimasCategorias(), HandlerDef(this, "controllers.ProductoC", "ultimasCategorias", Nil,"POST", """""", Routes.prefix + """admin/producto/ultimascategorias"""))
   }
}
        

// @LINE:51
case controllers_ProductoC_eliminar40(params) => {
   call { 
        invokeHandler(controllers.ProductoC.eliminar(), HandlerDef(this, "controllers.ProductoC", "eliminar", Nil,"POST", """""", Routes.prefix + """admin/producto/eliminar"""))
   }
}
        

// @LINE:52
case controllers_ProductoC_mostrar41(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        invokeHandler(controllers.ProductoC.mostrar(id), HandlerDef(this, "controllers.ProductoC", "mostrar", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """admin/producto/$id<[^/]+>"""))
   }
}
        

// @LINE:53
case controllers_ProductoC_editar42(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        invokeHandler(controllers.ProductoC.editar(id), HandlerDef(this, "controllers.ProductoC", "editar", Seq(classOf[Integer]),"POST", """""", Routes.prefix + """admin/producto/$id<[^/]+>"""))
   }
}
        

// @LINE:55
case controllers_Assets_at43(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     