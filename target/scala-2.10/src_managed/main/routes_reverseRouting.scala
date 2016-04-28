// @SOURCE:/Users/diegodelfin7/Desktop/proy Tienda virtual/tienda/conf/routes
// @HASH:8ba600ac49bddc3dba21ec15f38614120df3ffcc
// @DATE:Wed Apr 27 23:42:10 PET 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:55
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:55
class ReverseAssets {
    

// @LINE:55
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:16
class ReverseProductoC {
    

// @LINE:50
def ultimasCategorias(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "admin/producto/ultimascategorias")
}
                                                

// @LINE:53
def editar(id:Integer): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "admin/producto/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                                                

// @LINE:48
def producto(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin/producto/agregar")
}
                                                

// @LINE:16
def primerasCategorias(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "home/categoria/primerascategorias")
}
                                                

// @LINE:24
def ver(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "home/producto/ver")
}
                                                

// @LINE:49
def agregar(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "admin/producto/agregar")
}
                                                

// @LINE:52
def mostrar(id:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin/producto/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                                                

// @LINE:51
def eliminar(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "admin/producto/eliminar")
}
                                                

// @LINE:25
def marcas(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "home/producto/marcas")
}
                                                

// @LINE:47
def listar(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "admin/producto/listar")
}
                                                

// @LINE:46
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin/producto")
}
                                                

// @LINE:26
def filtrarProductos(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "home/producto/filtrarproductos")
}
                                                
    
}
                          

// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:27
// @LINE:23
// @LINE:22
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
class ReverseTiendaC {
    

// @LINE:23
def catalogoM(marca:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "marca/" + implicitly[PathBindable[String]].unbind("marca", dynamicString(marca)))
}
                                                

// @LINE:15
def catalogoC(categoria:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "categoria/" + implicitly[PathBindable[String]].unbind("categoria", dynamicString(categoria)))
}
                                                

// @LINE:33
def modificar(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "cliente/editar")
}
                                                

// @LINE:32
def editar(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "cliente/editar")
}
                                                

// @LINE:12
def buscarCategoria(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "home/buscarxcategoria")
}
                                                

// @LINE:30
def agregar(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "cliente/registro")
}
                                                

// @LINE:11
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "home/logout")
}
                                                

// @LINE:22
def catalogoCM(categoria:String, marca:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "marca/" + implicitly[PathBindable[String]].unbind("categoria", dynamicString(categoria)) + "/" + implicitly[PathBindable[String]].unbind("marca", dynamicString(marca)))
}
                                                

// @LINE:27
def carrito(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "home/carrito")
}
                                                

// @LINE:8
def home(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "home")
}
                                                

// @LINE:13
def buscarMarca(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "home/buscarxmarca")
}
                                                

// @LINE:10
def autenticar(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "home/login")
}
                                                

// @LINE:14
def buscarCategoriaMarca(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "home/buscarxcategoriamarca")
}
                                                

// @LINE:31
def existeCuenta(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "cliente/existecuenta")
}
                                                

// @LINE:29
def registrar(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "cliente/registro")
}
                                                

// @LINE:9
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "home/login")
}
                                                
    
}
                          

// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
class ReverseCategoriaC {
    

// @LINE:44
def existeCategoria(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "admin/categoria/existecategoria")
}
                                                

// @LINE:19
def subcategorias(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "home/categoria/subcategorias")
}
                                                

// @LINE:21
def cantidadProductos(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "home/categoria/cantidadproductos")
}
                                                

// @LINE:40
def categoria(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin/categoria/agregar")
}
                                                

// @LINE:17
def ver(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "home/categoria/ver")
}
                                                

// @LINE:20
def descendientes(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "home/categoria/descendientes")
}
                                                

// @LINE:42
def agregar(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "admin/categoria/agregar")
}
                                                

// @LINE:18
def ascendentes(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "home/categoria/ascendentes")
}
                                                

// @LINE:43
def eliminar(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "admin/categoria/eliminar")
}
                                                

// @LINE:41
def listar(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "admin/categoria/listar")
}
                                                

// @LINE:39
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin/categoria")
}
                                                
    
}
                          

// @LINE:37
// @LINE:36
// @LINE:35
class ReverseAdministrador {
    

// @LINE:36
def autenticar(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:37
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin/logout")
}
                                                

// @LINE:35
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin")
}
                                                
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:55
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:55
class ReverseAssets {
    

// @LINE:55
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:16
class ReverseProductoC {
    

// @LINE:50
def ultimasCategorias : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductoC.ultimasCategorias",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/producto/ultimascategorias"})
      }
   """
)
                        

// @LINE:53
def editar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductoC.editar",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/producto/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:48
def producto : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductoC.producto",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/producto/agregar"})
      }
   """
)
                        

// @LINE:16
def primerasCategorias : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductoC.primerasCategorias",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "home/categoria/primerascategorias"})
      }
   """
)
                        

// @LINE:24
def ver : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductoC.ver",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "home/producto/ver"})
      }
   """
)
                        

// @LINE:49
def agregar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductoC.agregar",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/producto/agregar"})
      }
   """
)
                        

// @LINE:52
def mostrar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductoC.mostrar",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/producto/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:51
def eliminar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductoC.eliminar",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/producto/eliminar"})
      }
   """
)
                        

// @LINE:25
def marcas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductoC.marcas",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "home/producto/marcas"})
      }
   """
)
                        

// @LINE:47
def listar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductoC.listar",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/producto/listar"})
      }
   """
)
                        

// @LINE:46
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductoC.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/producto"})
      }
   """
)
                        

// @LINE:26
def filtrarProductos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductoC.filtrarProductos",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "home/producto/filtrarproductos"})
      }
   """
)
                        
    
}
              

// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:27
// @LINE:23
// @LINE:22
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
class ReverseTiendaC {
    

// @LINE:23
def catalogoM : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TiendaC.catalogoM",
   """
      function(marca) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "marca/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("marca", encodeURIComponent(marca))})
      }
   """
)
                        

// @LINE:15
def catalogoC : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TiendaC.catalogoC",
   """
      function(categoria) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categoria/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("categoria", encodeURIComponent(categoria))})
      }
   """
)
                        

// @LINE:33
def modificar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TiendaC.modificar",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cliente/editar"})
      }
   """
)
                        

// @LINE:32
def editar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TiendaC.editar",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cliente/editar"})
      }
   """
)
                        

// @LINE:12
def buscarCategoria : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TiendaC.buscarCategoria",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "home/buscarxcategoria"})
      }
   """
)
                        

// @LINE:30
def agregar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TiendaC.agregar",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cliente/registro"})
      }
   """
)
                        

// @LINE:11
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TiendaC.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home/logout"})
      }
   """
)
                        

// @LINE:22
def catalogoCM : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TiendaC.catalogoCM",
   """
      function(categoria,marca) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "marca/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("categoria", encodeURIComponent(categoria)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("marca", encodeURIComponent(marca))})
      }
   """
)
                        

// @LINE:27
def carrito : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TiendaC.carrito",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home/carrito"})
      }
   """
)
                        

// @LINE:8
def home : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TiendaC.home",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
      }
   """
)
                        

// @LINE:13
def buscarMarca : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TiendaC.buscarMarca",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "home/buscarxmarca"})
      }
   """
)
                        

// @LINE:10
def autenticar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TiendaC.autenticar",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "home/login"})
      }
   """
)
                        

// @LINE:14
def buscarCategoriaMarca : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TiendaC.buscarCategoriaMarca",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "home/buscarxcategoriamarca"})
      }
   """
)
                        

// @LINE:31
def existeCuenta : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TiendaC.existeCuenta",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cliente/existecuenta"})
      }
   """
)
                        

// @LINE:29
def registrar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TiendaC.registrar",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cliente/registro"})
      }
   """
)
                        

// @LINE:9
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TiendaC.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home/login"})
      }
   """
)
                        
    
}
              

// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
class ReverseCategoriaC {
    

// @LINE:44
def existeCategoria : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoriaC.existeCategoria",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/categoria/existecategoria"})
      }
   """
)
                        

// @LINE:19
def subcategorias : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoriaC.subcategorias",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "home/categoria/subcategorias"})
      }
   """
)
                        

// @LINE:21
def cantidadProductos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoriaC.cantidadProductos",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "home/categoria/cantidadproductos"})
      }
   """
)
                        

// @LINE:40
def categoria : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoriaC.categoria",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/categoria/agregar"})
      }
   """
)
                        

// @LINE:17
def ver : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoriaC.ver",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "home/categoria/ver"})
      }
   """
)
                        

// @LINE:20
def descendientes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoriaC.descendientes",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "home/categoria/descendientes"})
      }
   """
)
                        

// @LINE:42
def agregar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoriaC.agregar",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/categoria/agregar"})
      }
   """
)
                        

// @LINE:18
def ascendentes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoriaC.ascendentes",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "home/categoria/ascendentes"})
      }
   """
)
                        

// @LINE:43
def eliminar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoriaC.eliminar",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/categoria/eliminar"})
      }
   """
)
                        

// @LINE:41
def listar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoriaC.listar",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/categoria/listar"})
      }
   """
)
                        

// @LINE:39
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoriaC.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/categoria"})
      }
   """
)
                        
    
}
              

// @LINE:37
// @LINE:36
// @LINE:35
class ReverseAdministrador {
    

// @LINE:36
def autenticar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Administrador.autenticar",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:37
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Administrador.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/logout"})
      }
   """
)
                        

// @LINE:35
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Administrador.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
      }
   """
)
                        
    
}
              

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:55
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:55
class ReverseAssets {
    

// @LINE:55
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:16
class ReverseProductoC {
    

// @LINE:50
def ultimasCategorias(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductoC.ultimasCategorias(), HandlerDef(this, "controllers.ProductoC", "ultimasCategorias", Seq(), "POST", """""", _prefix + """admin/producto/ultimascategorias""")
)
                      

// @LINE:53
def editar(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductoC.editar(id), HandlerDef(this, "controllers.ProductoC", "editar", Seq(classOf[Integer]), "POST", """""", _prefix + """admin/producto/$id<[^/]+>""")
)
                      

// @LINE:48
def producto(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductoC.producto(), HandlerDef(this, "controllers.ProductoC", "producto", Seq(), "GET", """""", _prefix + """admin/producto/agregar""")
)
                      

// @LINE:16
def primerasCategorias(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductoC.primerasCategorias(), HandlerDef(this, "controllers.ProductoC", "primerasCategorias", Seq(), "POST", """""", _prefix + """home/categoria/primerascategorias""")
)
                      

// @LINE:24
def ver(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductoC.ver(), HandlerDef(this, "controllers.ProductoC", "ver", Seq(), "POST", """""", _prefix + """home/producto/ver""")
)
                      

// @LINE:49
def agregar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductoC.agregar(), HandlerDef(this, "controllers.ProductoC", "agregar", Seq(), "POST", """""", _prefix + """admin/producto/agregar""")
)
                      

// @LINE:52
def mostrar(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductoC.mostrar(id), HandlerDef(this, "controllers.ProductoC", "mostrar", Seq(classOf[Integer]), "GET", """""", _prefix + """admin/producto/$id<[^/]+>""")
)
                      

// @LINE:51
def eliminar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductoC.eliminar(), HandlerDef(this, "controllers.ProductoC", "eliminar", Seq(), "POST", """""", _prefix + """admin/producto/eliminar""")
)
                      

// @LINE:25
def marcas(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductoC.marcas(), HandlerDef(this, "controllers.ProductoC", "marcas", Seq(), "POST", """""", _prefix + """home/producto/marcas""")
)
                      

// @LINE:47
def listar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductoC.listar(), HandlerDef(this, "controllers.ProductoC", "listar", Seq(), "POST", """""", _prefix + """admin/producto/listar""")
)
                      

// @LINE:46
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductoC.index(), HandlerDef(this, "controllers.ProductoC", "index", Seq(), "GET", """""", _prefix + """admin/producto""")
)
                      

// @LINE:26
def filtrarProductos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductoC.filtrarProductos(), HandlerDef(this, "controllers.ProductoC", "filtrarProductos", Seq(), "POST", """""", _prefix + """home/producto/filtrarproductos""")
)
                      
    
}
                          

// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:27
// @LINE:23
// @LINE:22
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
class ReverseTiendaC {
    

// @LINE:23
def catalogoM(marca:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TiendaC.catalogoM(marca), HandlerDef(this, "controllers.TiendaC", "catalogoM", Seq(classOf[String]), "GET", """""", _prefix + """marca/$marca<[^/]+>""")
)
                      

// @LINE:15
def catalogoC(categoria:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TiendaC.catalogoC(categoria), HandlerDef(this, "controllers.TiendaC", "catalogoC", Seq(classOf[String]), "GET", """""", _prefix + """categoria/$categoria<[^/]+>""")
)
                      

// @LINE:33
def modificar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TiendaC.modificar(), HandlerDef(this, "controllers.TiendaC", "modificar", Seq(), "POST", """""", _prefix + """cliente/editar""")
)
                      

// @LINE:32
def editar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TiendaC.editar(), HandlerDef(this, "controllers.TiendaC", "editar", Seq(), "GET", """""", _prefix + """cliente/editar""")
)
                      

// @LINE:12
def buscarCategoria(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TiendaC.buscarCategoria(), HandlerDef(this, "controllers.TiendaC", "buscarCategoria", Seq(), "POST", """""", _prefix + """home/buscarxcategoria""")
)
                      

// @LINE:30
def agregar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TiendaC.agregar(), HandlerDef(this, "controllers.TiendaC", "agregar", Seq(), "POST", """""", _prefix + """cliente/registro""")
)
                      

// @LINE:11
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TiendaC.logout(), HandlerDef(this, "controllers.TiendaC", "logout", Seq(), "GET", """""", _prefix + """home/logout""")
)
                      

// @LINE:22
def catalogoCM(categoria:String, marca:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TiendaC.catalogoCM(categoria, marca), HandlerDef(this, "controllers.TiendaC", "catalogoCM", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """marca/$categoria<[^/]+>/$marca<[^/]+>""")
)
                      

// @LINE:27
def carrito(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TiendaC.carrito(), HandlerDef(this, "controllers.TiendaC", "carrito", Seq(), "GET", """""", _prefix + """home/carrito""")
)
                      

// @LINE:8
def home(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TiendaC.home(), HandlerDef(this, "controllers.TiendaC", "home", Seq(), "GET", """""", _prefix + """home""")
)
                      

// @LINE:13
def buscarMarca(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TiendaC.buscarMarca(), HandlerDef(this, "controllers.TiendaC", "buscarMarca", Seq(), "POST", """""", _prefix + """home/buscarxmarca""")
)
                      

// @LINE:10
def autenticar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TiendaC.autenticar(), HandlerDef(this, "controllers.TiendaC", "autenticar", Seq(), "POST", """""", _prefix + """home/login""")
)
                      

// @LINE:14
def buscarCategoriaMarca(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TiendaC.buscarCategoriaMarca(), HandlerDef(this, "controllers.TiendaC", "buscarCategoriaMarca", Seq(), "POST", """""", _prefix + """home/buscarxcategoriamarca""")
)
                      

// @LINE:31
def existeCuenta(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TiendaC.existeCuenta(), HandlerDef(this, "controllers.TiendaC", "existeCuenta", Seq(), "POST", """""", _prefix + """cliente/existecuenta""")
)
                      

// @LINE:29
def registrar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TiendaC.registrar(), HandlerDef(this, "controllers.TiendaC", "registrar", Seq(), "GET", """""", _prefix + """cliente/registro""")
)
                      

// @LINE:9
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TiendaC.login(), HandlerDef(this, "controllers.TiendaC", "login", Seq(), "GET", """""", _prefix + """home/login""")
)
                      
    
}
                          

// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
class ReverseCategoriaC {
    

// @LINE:44
def existeCategoria(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaC.existeCategoria(), HandlerDef(this, "controllers.CategoriaC", "existeCategoria", Seq(), "POST", """""", _prefix + """admin/categoria/existecategoria""")
)
                      

// @LINE:19
def subcategorias(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaC.subcategorias(), HandlerDef(this, "controllers.CategoriaC", "subcategorias", Seq(), "POST", """""", _prefix + """home/categoria/subcategorias""")
)
                      

// @LINE:21
def cantidadProductos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaC.cantidadProductos(), HandlerDef(this, "controllers.CategoriaC", "cantidadProductos", Seq(), "POST", """""", _prefix + """home/categoria/cantidadproductos""")
)
                      

// @LINE:40
def categoria(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaC.categoria(), HandlerDef(this, "controllers.CategoriaC", "categoria", Seq(), "GET", """""", _prefix + """admin/categoria/agregar""")
)
                      

// @LINE:17
def ver(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaC.ver(), HandlerDef(this, "controllers.CategoriaC", "ver", Seq(), "POST", """""", _prefix + """home/categoria/ver""")
)
                      

// @LINE:20
def descendientes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaC.descendientes(), HandlerDef(this, "controllers.CategoriaC", "descendientes", Seq(), "POST", """""", _prefix + """home/categoria/descendientes""")
)
                      

// @LINE:42
def agregar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaC.agregar(), HandlerDef(this, "controllers.CategoriaC", "agregar", Seq(), "POST", """""", _prefix + """admin/categoria/agregar""")
)
                      

// @LINE:18
def ascendentes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaC.ascendentes(), HandlerDef(this, "controllers.CategoriaC", "ascendentes", Seq(), "POST", """""", _prefix + """home/categoria/ascendentes""")
)
                      

// @LINE:43
def eliminar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaC.eliminar(), HandlerDef(this, "controllers.CategoriaC", "eliminar", Seq(), "POST", """""", _prefix + """admin/categoria/eliminar""")
)
                      

// @LINE:41
def listar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaC.listar(), HandlerDef(this, "controllers.CategoriaC", "listar", Seq(), "POST", """""", _prefix + """admin/categoria/listar""")
)
                      

// @LINE:39
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaC.index(), HandlerDef(this, "controllers.CategoriaC", "index", Seq(), "GET", """""", _prefix + """admin/categoria""")
)
                      
    
}
                          

// @LINE:37
// @LINE:36
// @LINE:35
class ReverseAdministrador {
    

// @LINE:36
def autenticar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Administrador.autenticar(), HandlerDef(this, "controllers.Administrador", "autenticar", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:37
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Administrador.logout(), HandlerDef(this, "controllers.Administrador", "logout", Seq(), "GET", """""", _prefix + """admin/logout""")
)
                      

// @LINE:35
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Administrador.index(), HandlerDef(this, "controllers.Administrador", "index", Seq(), "GET", """""", _prefix + """admin""")
)
                      
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    