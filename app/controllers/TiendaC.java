package controllers;

import com.avaje.ebean.SqlRow;
import models.*;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.*;

import views.html.tienda.index;
import views.html.tienda.login;
import views.html.tienda.registro;
import views.html.tienda.catalogo;
import views.html.tienda.carrito;

import java.io.*;
import java.util.*;

import static play.data.Form.form;


public class TiendaC extends Controller{
    public static Result home(){
        if(Administrador.esRol("cliente")){
            return ok(index.render("Tienda virtual", Cuenta.cliente(session("usuario"))));
        }
        return ok(index.render("Tienda virtual",null));
    }
    public static Result autenticar() {
        DynamicForm data = form().bindFromRequest();
        Cuenta cuenta=Cuenta.autenticar(data.get("email"),data.get("clave"));
        if(cuenta==null || !cuenta.rol.equals("cliente")) {
            flash("type","danger");
            flash("danger","El usuario o la contraseña son incorrectos");
            return redirect(routes.TiendaC.login());
        }
        /*else if(cuenta.activo==0){
            flash("type","info");
            flash("info","Su cuenta de cliente está desactivada");
        }*/
        else{
            session("usuario",cuenta.usuario);
        }
        return redirect(routes.TiendaC.home());
    }
    public static Result logout() {
        session().clear();
        //flash("type", "info");
        //flash("info", "La sesión ha sido cerrada");
        return redirect(routes.TiendaC.home());
    }
    public static Result login(){
        return ok(login.render("Iniciar sesión"));
    }
    public static Result registrar(){
        return ok(registro.render("Crear una nueva cuenta",null));
    }
    public static Result agregar(){
        DynamicForm data = form().bindFromRequest();
        Cuenta cuenta=Cuenta.create(data.get("email"),data.get("password"),"cliente");
        Cliente cliente=null;
        if(cuenta!=null){
            cliente=Cliente.create(data.get("nombre"),data.get("paterno"),data.get("materno"),data.get("dni"),data.get("ruc"),cuenta.id);
            session("usuario",cuenta.usuario);
        }
        return redirect(routes.TiendaC.home());
    }
    public static Result editar(){
        DynamicForm data = form().bindFromRequest();
        return ok(registro.render("Editar cuenta",Cuenta.cliente(session("usuario"))));
    }
    public static Result modificar(){
        DynamicForm data = form().bindFromRequest();
        Cliente cliente=Cuenta.cliente(session("usuario"));
        if(!Cuenta.find.byId(cliente.cuenta.id).clave.equals(data.get("password")))Cuenta.find.byId(cliente.cuenta.id).updateClave(data.get("password"));
        cliente.update(data.get("nombre"),data.get("paterno"),data.get("materno"),data.get("dni"),data.get("ruc"));
        return redirect(routes.TiendaC.home());
    }
    public static Result existeCuenta(){
        DynamicForm data = form().bindFromRequest();
        Cuenta cuenta=Cuenta.find.where().eq("usuario",data.get("usuario")).eq("rol","cliente").findUnique();
        return ok(cuenta!=null?"El usuario "+cuenta.usuario+" ya existe":"");
    }
    public static Result buscarCategoria(){
        DynamicForm data = form().bindFromRequest();
        List<Map<String, String>> categorias=new ArrayList<Map<String, String>>();
        if(!data.get("parse").equals("")){
            for(SqlRow row : Categoria.buscarCategoria(data.get("parse"))){
                categorias.add(Categoria.find.byId(row.getInteger("c_id")).getMap());
            }
        }
        return ok(Json.toJson(categorias));
    }
    public static Result buscarMarca(){
        DynamicForm data = form().bindFromRequest();
        List<String> marcas=new ArrayList<String>();
        if(!data.get("parse").equals("")){
            for(SqlRow row : Producto.buscarMarca(data.get("parse"))){
                marcas.add(row.getString("p_marca"));
            }
        }
        return ok(Json.toJson(marcas));
    }
    public static Result buscarCategoriaMarca(){
        DynamicForm data = form().bindFromRequest();
        List<Map<String, String>> marcas=new ArrayList<Map<String, String>>();
        if(!data.get("parse").equals("")){
            for(SqlRow row : Categoria.buscarMarca(data.get("parse"))){
                Map<String, String> marca=new HashMap<String, String>();
                marca.put("nombre",row.getString("p_marca"));
                marca.put("categoria_id",Categoria.find.byId(row.getInteger("c_id")).id+"");
                marca.put("categoria_nombre",Categoria.find.byId(row.getInteger("c_id")).nombre);
                marcas.add(marca);
            }
        }
        return ok(Json.toJson(marcas));
    }
    public static Result catalogoCM(String categoria,String marca){
        Cliente cliente=Administrador.esRol("cliente")?Administrador.cuenta().cliente:null;
        Categoria cat=Categoria.find.where().eq("nombre",categoria.replace("-"," ")).findUnique();
        return ok(catalogo.render("Tienda virtual",cliente,cat,marca));
    }
    public static Result catalogoM(String marca){
        Cliente cliente=Administrador.esRol("cliente")?Administrador.cuenta().cliente:null;
        return ok(catalogo.render("Tienda virtual",cliente,null,marca));
    }
    public static Result catalogoC(String categoria){
        Cliente cliente=Administrador.esRol("cliente")?Administrador.cuenta().cliente:null;
        Categoria cat=Categoria.find.where().eq("nombre",categoria.replace("-"," ")).findUnique();
        return ok(catalogo.render("Tienda virtual",cliente,cat,null));
    }
    public static Result carrito(){
        List<Producto> productos=new ArrayList<Producto>();
        return ok(carrito.render("Carrito de compra",null));
    }
}
