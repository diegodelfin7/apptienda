package models;

import com.avaje.ebean.*;
import play.Play;
import play.db.ebean.Model;

import javax.persistence.*;
import java.io.File;
import java.util.*;

@Entity
public class Producto extends Model {
    @Id
    public int id;
    @Column(length = 100)
    public String modelo;
    @Column(length = 20)
    public String color;
    @Column(length = 40)
    public String marca;
    @Column(columnDefinition = "Decimal(8,2)")
    public double precio;
    public int descuento;
    @Lob
    @Column(columnDefinition = "TEXT")
    public String caracteristicas;
    @Lob
    @Column(columnDefinition = "TEXT")
    public String especificaciones;
    @Column(length = 50)
    public String image;
    @ManyToOne
    @JoinColumn(name="categoria_id",nullable = false)
    public Categoria categoria;
    public Producto(String modelo,String color,String marca,double precio,String car,String esp,String image,int categoria_id){
        this.modelo=modelo;
        this.color=color;
        this.marca=marca;
        this.precio=precio;
        this.descuento=0;
        this.caracteristicas=car;
        this.especificaciones=esp;
        this.image=image;
        categoria=Categoria.find.byId(categoria_id);
    }
    public static Producto create(String modelo,String color,String marca,double precio,String car,String esp,String image,int categoria_id){
        Producto producto=new Producto(modelo,color,marca,precio,car,esp,image,categoria_id);
        producto.save();
        return producto;
    }
    public Map getMap(){
        Map<String,String> map=new HashMap<String,String>();
        map.put("id",id+"");
        map.put("modelo",modelo);
        map.put("color",color);
        map.put("marca",marca);
        map.put("precio",String.format("%.2f",precio).replace(",","."));
        map.put("descuento",descuento+"");
        map.put("precio_actual",String.format("%.2f",precio*(100-descuento)/100).replace(",","."));
        map.put("categoria_nombre",categoria().nombre);
        map.put("caracteristicas",caracteristicas);
        map.put("especificaciones",especificaciones);
        map.put("image",image);
        return map;
    }
    public void update(String modelo,String color,String marca,Double precio,Integer descuento,String car,String esp,String image,int categoria_id){
        if(modelo!=null)this.modelo=modelo;
        if(color!=null)this.color=color;
        if(marca!=null)this.marca=marca;
        if(precio!=null)this.precio=precio;
        if(descuento!=null)this.descuento=descuento;
        if(car!=null)this.caracteristicas=car;
        if(esp!=null)this.especificaciones=esp;
        if(image!="")this.image=image;
        categoria=Categoria.find.byId(categoria_id);
        update();
    }
    public void updateDescuento(Integer descuento){
        if(descuento!=null)this.descuento=descuento;
        update();
    }
    public void eliminarImage(){
        if(!image.equals("")){
            File file=new File(getImageAbsolutePath());
            if(file.exists())file.delete();
        }
    }
    public static Model.Finder<Integer,Producto> find = new Model.Finder<Integer,Producto>(Integer.class,Producto.class);
    public String getImagePath(){return "assets/productos/"+image;}
    public String getImageAbsolutePath(){return getAbsolutePath()+"/"+image;}
    public static String getAbsolutePath(){
        return Play.application().path().getAbsolutePath().replace("\\","/")+"/public/productos";
    }
    public static String caracteristicas(int id){
        SqlQuery query = Ebean.createSqlQuery("select p.caracteristicas car from producto p where p.id=:id").setParameter("id",id);
        SqlRow row = query.findUnique();
        return row.getString("car"); 
    }
    public static String especificaciones(int id){
        SqlQuery query = Ebean.createSqlQuery("select p.especificaciones esp from producto p where p.id=:id").setParameter("id",id);
        SqlRow row = query.findUnique();
        return row.getString("esp"); 
    }
    public Categoria categoria(){
        SqlQuery query = Ebean.createSqlQuery("select c.id id from categoria c join producto p on(p.categoria_id=c.id and p.id=:id)").setParameter("id",id);
        SqlRow row = query.findUnique();
        Categoria categoria=Categoria.find.byId(row.getInteger("id"));
        return categoria; 
    }
    public static List<String> Marcas(){
        SqlQuery query = Ebean.createSqlQuery("select p.marca p_marca from producto p group by p.marca order by p.marca");
        List<SqlRow> rows = query.findList();
        List<String> marcas=new ArrayList<String>();
        for(SqlRow row : rows){
            marcas.add(row.getString("p_marca"));
        }
        return marcas;
    }
    public static List<SqlRow> buscarMarca(String parse){
        String sql="select p.marca p_marca from producto p where ";
        for(int i=0;i<parse.split(" ").length;i++){
            sql+="p.marca like '%"+parse.split(" ")[i]+"%'";
            if(i<parse.split(" ").length-1)sql+=" and ";
        }
        sql+=" group by p.marca order by p.marca";
        SqlQuery query = Ebean.createSqlQuery(sql);
        List<SqlRow> rows = query.findList();
        return rows;
    }
    public static List<Producto> filtrarProductos(String nombre,String marca,String precioMin,String precioMax,String orden){
        List<Producto> productos=new ArrayList<Producto>();
        String sql="";
         if(!nombre.equals("")){
            sql+="and c.nombre in ("+Categoria.descendientesS(nombre)+")";
         }
        if(!marca.equals(""))sql+=" and p.marca='"+marca+"'";
        if(!precioMin.equals("")&&!precioMax.equals(""))sql+=" and p.precio*(100-p.descuento)/100 between "+precioMin+" and "+precioMax;
        String ob="";
        if(orden.equals("precio"))ob+=" order by pd";
        if(orden.equals("descuento"))ob+=" order by p.descuento desc";

        SqlQuery query = Ebean.createSqlQuery("select p.id id,p.precio*(100-p.descuento)/100 pd from producto p join categoria c "+
            "on(p.categoria_id=c.id "+sql+")"+ob);
        List<SqlRow> rows = query.findList();
        for(SqlRow row : rows){
            productos.add(Producto.find.byId(row.getInteger("id")));
        }
        return productos;
    }
}
