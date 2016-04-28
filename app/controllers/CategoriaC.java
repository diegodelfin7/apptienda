package controllers;

import models.*;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.*;

import views.html.categoria.index;
import views.html.categoria.agregar;

import java.util.*;

import static play.data.Form.form;

public class CategoriaC extends Controller{
    public static Result index(){
        return ok(index.render(Administrador.cuenta().usuario));
    }
    public static Result listar(){
        List<Map<String, String>> categorias=new ArrayList<Map<String, String>>();
        for(Categoria categoria: Categoria.find.all()){
            categorias.add(categoria.getMap());
        }
        return ok(Json.toJson(categorias));
    }
    public static Result categoria(){
        return ok(agregar.render(Administrador.cuenta().usuario));
    }
    public static Result agregar(){
        DynamicForm data = form().bindFromRequest();
        Integer categoria_id=data.get("categoria_id")!=""?Integer.parseInt(data.get("categoria_id")):null;
        Categoria categoria= Categoria.create(data.get("nombre"), categoria_id);
        categoria.save();
        return ok(Json.toJson(categoria.getMap()));
    }
    public static Result eliminar(){
        DynamicForm data = form().bindFromRequest();
        int id=Integer.parseInt(data.get("id"));
        Categoria categoria=Categoria.find.byId(id);
        categoria.delete();
        return ok("");
    }
    public static Result existeCategoria(){
        DynamicForm data = form().bindFromRequest();
        Categoria categoria=Categoria.find.where().eq("nombre",data.get("value")).findUnique();
        return ok(categoria!=null?"La categoría "+categoria.nombre+" ya existe":"");
    }
    public static Result ver(){
        DynamicForm data = form().bindFromRequest();
        return ok(Json.toJson(Categoria.findName(data.get("nombre")).getMap()));
    }
    public static Result ascendentes(){
        DynamicForm data = form().bindFromRequest();
        List<Map<String, String>> categorias=new ArrayList<Map<String, String>>();
        for(Categoria categoria: Categoria.findName(data.get("nombre")).ascendentes()){
            categorias.add(categoria.getMap());
        }
        return ok(Json.toJson(categorias));
    }
    public static Result subcategorias(){
        DynamicForm data = form().bindFromRequest();
        List<Map<String, String>> categorias=new ArrayList<Map<String, String>>();
        for(Categoria categoria: Categoria.findName(data.get("nombre")).subcategorias){
            categorias.add(categoria.getMap());
        }
        return ok(Json.toJson(categorias));
    }
    public static Result descendientes(){
        DynamicForm data = form().bindFromRequest();
        List<Map<String, String>> categorias=new ArrayList<Map<String, String>>();
        for(Categoria categoria: Categoria.descendientes(data.get("nombre"))){
            categorias.add(categoria.getMap());
        }
        return ok(Json.toJson(categorias));
    }
    public static Result cantidadProductos(){
        DynamicForm data = form().bindFromRequest();
        int cantidad=Categoria.findName(data.get("nombre")).cantidadProductos(data.get("marca"));
        return ok(cantidad+"");
    }
}
