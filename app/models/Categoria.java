package models;

import com.avaje.ebean.*;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.*;

@Entity
public class Categoria extends Model{
    @Id
    public int id;
    @Column(length = 100)
    public String nombre;
    @OneToMany(mappedBy = "sobrecategoria",orphanRemoval = true)
    public List<Categoria> subcategorias;
    @ManyToOne
    @JoinColumn(name="categoria_id")
    public Categoria sobrecategoria;
    public Categoria(String nombre,Integer categoria_id){
        this.nombre=nombre;
        if(categoria_id!=null)sobrecategoria=Categoria.find.byId(categoria_id);
    }
    public static Categoria create(String nombre,Integer categoria_id){
        Categoria categoria=new Categoria(nombre,categoria_id);
        categoria.save();
        return categoria;
    }
    public static Categoria findName(String nombre){
        return Categoria.find.where().eq("nombre",nombre).findUnique();
    }
    public Map getMap(){
        Map<String,String> map=new HashMap<String,String>();
        map.put("id",id+"");
        map.put("nombre",nombre);
        map.put("categoria_nombre",sobrecategoria!=null?sobrecategoria.nombre:"ninguno");
        return map;
    }
    public static Model.Finder<Integer,Categoria> find = new Model.Finder<Integer,Categoria>(Integer.class,Categoria.class);

    public List<Categoria> ascendentes(){
        List<Categoria> categorias=new ArrayList<Categoria>();
        categorias.add(this);
        Categoria categoria=sobrecategoria;
        while(categoria!=null){
            categorias.add(categoria);
            categoria=categoria.sobrecategoria;
        }
        return categorias;
    }
    public static List<Categoria> ultimasCategorias(String nombre){
        Categoria categoria=Categoria.find.where().eq("nombre",nombre).findUnique();
        List<Categoria> categorias=new ArrayList<Categoria>();
        ultimasCategorias(categoria,categorias);
        return categorias;
    }
    private static void ultimasCategorias(Categoria categoria,List<Categoria> categorias){
        if(categoria.subcategorias.isEmpty()){
            categorias.add(categoria);
        }
        else{
            for(Categoria cat:categoria.subcategorias){
                ultimasCategorias(cat,categorias);
            }
        }
    }
    public static List<Categoria> descendientes(String nombre){
        List<Categoria> categorias=new ArrayList<Categoria>();
        for(String nom:descendientesS(nombre).split(",")){
            categorias.add(Categoria.findName(nom.substring(1,nom.length()-1)));
        }
        return categorias;
    }
    public static String descendientesS(String nombre){
        String categorias="'"+nombre+"'";
        for(Categoria categoria:Categoria.findName(nombre).subcategorias){
            categorias+=","+descendientesS(categoria.nombre);
        }
        return categorias;
    }
    public int cantidadProductos(String marca){
       return cantidadProductos(this,marca);
    }
    private int cantidadProductos(Categoria categoria,String marca){
        SqlQuery query = null;
        int cantidad = 0;
        if(!marca.equals("")){
            query = Ebean.createSqlQuery("select count(*) contador from producto p join categoria c " +
                "on(p.categoria_id=c.id and c.id=:id and p.marca like :marca)").setParameter("id",categoria.id).setParameter("marca",marca);
        }
        else{
            query = Ebean.createSqlQuery("select count(*) contador from producto p join categoria c " +
                "on(p.categoria_id=c.id and c.id=:id)").setParameter("id",categoria.id);
        }
        SqlRow row = query.findUnique();
        cantidad = row.getInteger("contador");
        for(Categoria subcategoria:categoria.subcategorias){
            cantidad+=cantidadProductos(subcategoria,marca);
        }
        return cantidad;
    }
    public static List<SqlRow> buscarCategoria(String parse){
        String sql="select c.id c_id from categoria c where ";
        for(int i=0;i<parse.split(" ").length;i++){
            sql+="c.nombre like '%"+parse.split(" ")[i]+"%'";
            if(i<parse.split(" ").length-1)sql+=" and ";
        }
        SqlQuery query = Ebean.createSqlQuery(sql);
        List<SqlRow> rows = query.findList();
        return rows;
    }
    public static List<SqlRow> buscarMarca(String parse){
        String sql="select c.id c_id,p.marca p_marca from producto p join categoria c on p.categoria_id=c.id and ";
        for(int i=0;i<parse.split(" ").length;i++){
            sql+="(p.marca like '%"+parse.split(" ")[i]+"%' or c.nombre like '%"+parse.split(" ")[i]+"%')";
            if(i<parse.split(" ").length-1)sql+=" and ";
        }
        SqlQuery query = Ebean.createSqlQuery(sql);
        List<SqlRow> rows = query.findList();
        return rows;
    }
}
