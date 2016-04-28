package controllers;

import models.*;
import play.data.DynamicForm;
import play.libs.Json;
import play.mvc.*;

import views.html.administrador.login;
import views.html.administrador.index;

import java.util.*;

import static play.data.Form.form;

public class Administrador extends Controller {
    public static Result index() {
        if(esRol("admin")){
            return ok(index.render(cuenta().usuario));
        }
        return ok(login.render());
    }
    public static Result autenticar() {
        DynamicForm data = form().bindFromRequest();
        Cuenta cuenta=Cuenta.autenticar(data.get("usuario"),data.get("clave"));
        if(cuenta==null || !cuenta.rol.equals("admin")) {
            flash("type","danger");
            flash("danger","El usuario o la contraseña son incorrectos");
        }
        /*else if(cuenta.activo==0){
            flash("type","info");
            flash("info","Su cuenta de usuario está desactivada");
        }*/
        else{
            session("usuario",cuenta.usuario);
        }
        return redirect(routes.Administrador.index());
    }
    public static Result logout() {
        session().clear();
        flash("type", "info");
        flash("info", "La sesión ha sido cerrada");
        return redirect(routes.Administrador.index());
    }
    public static Cuenta cuenta(){
        return Cuenta.findByUser(session("usuario"));
    }
    public static boolean esRol(String rol){
        return session("usuario")!=null && cuenta().rol.equals(rol);
    }
}
