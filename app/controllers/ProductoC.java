package controllers;

import models.*;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.*;

import views.html.producto.index;
import views.html.producto.agregar;
import views.html.producto.editar;

import java.io.File;
import java.util.*;

import static play.data.Form.form;

public class ProductoC extends Controller{
    public static Result index(){
        return ok(index.render(Administrador.cuenta().usuario));
    }
    public static Result producto(){
        return ok(agregar.render(Administrador.cuenta().usuario));
    }
    public static Result listar(){
        List<Map<String, String>> productos=new ArrayList<Map<String, String>>();
        for(Producto producto: Producto.find.all()){
            Map<String, String> prod=producto.getMap();
            productos.add(prod); 
        }
        return ok(Json.toJson(productos));
    }
    public static Result agregar(){
        DynamicForm data = form().bindFromRequest();
        double precio=data.get("precio")!=""?Double.parseDouble(data.get("precio")):0;
        int categoria_id=Integer.parseInt(data.get("categoria_id"));
        Producto producto= Producto.create(data.get("modelo"), data.get("color"), data.get("marca"),
                precio, data.get("caracteristicas"), data.get("especificaciones"),data.get("image"),categoria_id);
        producto.save();
        String path=Producto.getAbsolutePath();
        if(!new File(path).exists())new File(path).mkdirs();
        if(!data.get("image").equals("") && !data.get("dataurl").equals("")){
            String base=data.get("dataurl").split(",")[1];
            Application.B64ToFile(base,path,data.get("image"));
        }
        return ok(Json.toJson(producto.getMap()));
    }
    public static Result primerasCategorias(){
        List<Map<String, String>> categorias=new ArrayList<Map<String, String>>();
        for(Categoria categoria: Categoria.find.all()){
            if(categoria.sobrecategoria==null)categorias.add(categoria.getMap());
        }
        return ok(Json.toJson(categorias));
    }
    public static Result ultimasCategorias(){
        List<Map<String, String>> categorias=new ArrayList<Map<String, String>>();
        for(Categoria categoria: Categoria.find.all()){
            if(categoria.subcategorias.isEmpty())categorias.add(categoria.getMap());
        }
        return ok(Json.toJson(categorias));
    }
    public static Result eliminar(){
        DynamicForm data = form().bindFromRequest();
        int id=Integer.parseInt(data.get("id"));
        Producto producto=Producto.find.byId(id);
        producto.eliminarImage();
        producto.delete();
        return ok("");
    }
    public static Result mostrar(Integer id){
        return ok(editar.render(Administrador.cuenta().usuario,Producto.find.byId(id)));
    }
    public static Result editar(Integer id){
        DynamicForm data = form().bindFromRequest();
        double precio=Double.parseDouble(data.get("precio"));
        int descuento=Integer.parseInt(data.get("descuento"));
        int categoria_id=Integer.parseInt(data.get("categoria_id"));
        Producto producto= Producto.find.byId(id);
        boolean diferenteImage=producto.image.equals(data.get("image"));
        if(diferenteImage)producto.eliminarImage();
        producto.update(data.get("modelo"), data.get("color"), data.get("marca"),precio,descuento,
                data.get("caracteristicas"), data.get("especificaciones"),data.get("image"),categoria_id);
        String path=Producto.getAbsolutePath();
        if(!new File(path).exists())new File(path).mkdirs();
        if(!data.get("image").equals("") && !data.get("dataurl").equals("") && diferenteImage){
            String base=data.get("dataurl").split(",")[1];
            Application.B64ToFile(base,path,data.get("image"));
        }
        return ok(Json.toJson(producto.getMap()));
    }
    public static Result ver(){
        DynamicForm data = form().bindFromRequest();
        return ok(Json.toJson(Producto.find.byId(Integer.parseInt(data.get("id"))).getMap()));
    }
    public static Result marcas(){
        return ok(Json.toJson(Producto.Marcas()));
    }
    public static Result filtrarProductos(){
        DynamicForm data = form().bindFromRequest();
        List<Map<String, String>> productos=new ArrayList<Map<String, String>>();
        for(Producto producto:Producto.filtrarProductos(data.get("nombre"),data.get("marca"),
                data.get("precioMin"),data.get("precioMax"),data.get("orden"))){
            productos.add(producto.getMap());
        }
        return ok(Json.toJson(productos));
    }
}
