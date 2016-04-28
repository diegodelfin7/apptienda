package models;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.*;

@Entity
public class Cliente extends Model{
    @Id
    public Integer id;
    @Column(length = 30)
    public String nombre;
    @Column(length = 20)
    public String paterno;
    @Column(length = 20)
    public String materno;
    @Column(columnDefinition="char(8)")
    public String dni;
    @Column(columnDefinition="char(11)")
    public String ruc;
    @OneToOne
    @JoinColumn(name="cuenta_id")
    public Cuenta cuenta;
    public Cliente(String nombre,String paterno,String materno,String dni,String ruc,int cuenta_id){
        this.nombre=nombre;
        this.paterno=paterno;
        this.materno=materno;
        if(!dni.equals(""))this.dni=dni;
        if(!ruc.equals(""))this.ruc=ruc;
        cuenta=Cuenta.find.byId(cuenta_id);
    }
    public static Cliente create(String nombre,String paterno,String materno,String dni,String ruc,int cuenta_id){
        Cliente cliente=new Cliente(nombre,paterno,materno,dni,ruc,cuenta_id);
        cliente.save();
        return cliente;
    }
    public void update(String nombre,String paterno,String materno,String dni,String ruc){
        if(nombre!=null)this.nombre=nombre;
        if(paterno!=null)this.paterno=paterno;
        if(materno!=null)this.materno=materno;
        if(dni!=null)this.dni=dni;
        if(ruc!=null)this.ruc=ruc;
        update();
    }
    public static Model.Finder<Integer,Cliente> find = new Model.Finder<Integer,Cliente>(Integer.class,Cliente.class);
}
