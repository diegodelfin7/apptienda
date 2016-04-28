package models;

import com.avaje.ebean.*;
import play.Play;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.*;

@Entity
public class Cuenta extends Model{
    @Id
    public Integer id;
    @Column(length = 30)
    public String usuario;
    @Column(length = 30)
    public String clave;
    @Column(columnDefinition = "int default 1")
    public int activo;
    @Column(length = 20)
    public String rol;
    @OneToOne(mappedBy = "cuenta")
    public Cliente cliente;

    public Cuenta(String usuario,String clave,String rol){
        this.usuario=usuario;
        this.clave=clave;
        this.rol=rol;
        this.activo=1;
    }
    public static Cuenta create(String usuario,String clave,String rol){
        Cuenta cuenta=new Cuenta(usuario, clave, rol);
        cuenta.save();
        return cuenta;
    }
    public void updateClave(String clave){
        if(clave!=null)this.clave=clave;
        update();
    }
    public void updateActivo(Integer activo){
        if(activo!=null)this.activo=activo;
        update();
    }
    public static Model.Finder<Integer,Cuenta> find = new Model.Finder<Integer,Cuenta>(Integer.class,Cuenta.class);

    public static Cuenta findByUser(String usuario){
        return find.where().eq("usuario",usuario).findUnique();
    }
    public static Cuenta autenticar(String usuario,String clave){
        return find.where().eq("usuario",usuario).eq("clave",clave).findUnique();
    }
    public  static Cliente cliente(String usuario){
        SqlQuery query = Ebean.createSqlQuery("select c.id id from cliente c join cuenta cu on(c.cuenta_id=cu.id and cu.usuario=:usuario)").setParameter("usuario",usuario);
        SqlRow row = query.findUnique();
        Cliente cliente=Cliente.find.byId(row.getInteger("id"));
        return cliente;
    }
}



