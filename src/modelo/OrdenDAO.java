
package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class OrdenDAO {
    
     public boolean ingresarOrden (Orden ord,String nom_prove,String nom_prof) throws ClassNotFoundException{
       
        boolean resultado=false;
      
        try { 
            Connection con = Conexion.getConexion();
            
            String sql="select rut from profesional where nombre||' '||p_apellido||' '||s_apellido='"+nom_prof+"'";
            
            PreparedStatement prs=con.prepareStatement(sql);
            ResultSet rs=prs.executeQuery();      
            
            String sqli="select rut from proveedor where nombre='"+nom_prove+"'";
            
            PreparedStatement prs2=con.prepareStatement(sqli);
            ResultSet rs2=prs2.executeQuery();              
             
            while (rs.next() && rs2.next()) {  
                
                String rut_profesional= rs.getString(1);  
                String rut_proveedor= rs2.getString(1); 
                
                String query="insert into orden (id_orden,nom_producto,stock,descripcion,proveedor_rut,profesional_rut) values(?,?,?,?,?,?)";

                PreparedStatement ps=con.prepareStatement(query);

                ps.setString(1,ord.getId_orden());
                ps.setString(2,ord.getNom_product());
                ps.setInt(3,ord.getStock());
                ps.setString(4,ord.getDescripcion());
                ps.setString(5,rut_proveedor);
                ps.setString(6,rut_profesional);
               
                resultado=ps.executeUpdate()==1;
                
               
                ps.close();
            }
        return resultado;
        
        }catch(SQLException s)
        {
            System.out.println("Error SQL al agregar Orden " + s.getMessage());
           return resultado;
        }

    }
   //=====================================================
  public Orden buscarOrden (String id_orden){
        Orden ord= null;
        
        try {
            Connection con= Conexion.getConexion();
                String query = "select \n" +
                                "        o.id_orden,\n" +
                                "        o.nom_producto,\n" +
                                "        o.stock,\n" +
                                "        o.descripcion,\n" +
                                "        p.nombre,\n" +
                                "        pr.nombre||' '||pr.p_apellido||' '||pr.s_apellido         \n" +
                                "from orden o join proveedor p\n" +
                                "on(o.proveedor_rut=p.rut)\n" +
                                "join profesional pr\n" +
                                "on(o.profesional_rut=pr.rut)\n" +
                                "                            where id_orden='"+id_orden+"'";
                
            PreparedStatement ps= con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                ord = new Orden(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(OrdenDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ord;
    }
   //****************************************************************
  public Orden buscarOrden2 (String id_orden){
        Orden ord= null;
        
        try {
            Connection con= Conexion.getConexion();
                String query = "select \n " +
                                "        o.id_orden,\n " +
                                "        o.nom_producto,\n " +
                                "        o.stock,\n " +
                                "        o.descripcion,\n " +
                                "        p.rut,\n " +
                                "        pr.rut\n " +
                                " from orden o join proveedor p\n " +
                                " on(o.proveedor_rut=p.rut)\n " +
                                " join profesional pr\n " +
                                " on(o.profesional_rut=pr.rut)\n " +
                                "                            where id_orden='"+id_orden+"'";
                
            PreparedStatement ps= con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                ord = new Orden(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(OrdenDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ord;
    }
  
 
  public boolean ModificarOrden(Orden ord){
        boolean resultado=false;
        
        try {
            Connection con = Conexion.getConexion();
            String query ="update Orden set nom_producto=?,stock=?,descripcion=?,proveedor_rut=?,profesional_rut=?"+ "where id_orden=? ";
            PreparedStatement ps= con.prepareStatement(query);
            
            
            
            ps.setString(1,ord.getNom_product());
            ps.setInt(2,ord.getStock());
            ps.setString(3,ord.getDescripcion());
            ps.setString(4,ord.getRut_proveedor());
            ps.setString(5,ord.getRut_profesional());
            ps.setString(6,ord.getId_orden());            
            
            resultado=ps.executeUpdate()==1;
            ps.close();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(OrdenDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrdenDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
   public boolean eliminarOrden(String id_orden)
    {
        boolean resultado=false;
        try {
            Connection con = Conexion.getConexion();
            String query="delete from Orden where id_orden='"+id_orden+"'";
            PreparedStatement ps= con.prepareStatement(query);
            resultado= ps.executeUpdate()==1;
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(OrdenDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrdenDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
   
   public ArrayList <Orden> VerificarOrdenCompra( String id_orden){
        ArrayList <Orden> ord=new ArrayList<Orden>();
        
        try {
            Connection con= Conexion.getConexion();
            String query ="select \n" +
                                "        o.id_orden,\n" +
                                "        o.nom_producto,\n" +
                                "        o.stock,\n" +
                                "        o.descripcion,\n" +
                                "        p.nombre,\n" +
                                "        pr.nombre||' '||pr.p_apellido||' '||pr.s_apellido         \n" +
                                "from orden o join proveedor p\n" +
                                "on(o.proveedor_rut=p.rut)\n" +
                                "join profesional pr\n" +
                                "on(o.profesional_rut=pr.rut)\n" +
                                "                            where id_orden='"+id_orden+"'";   
            Orden orden;
            PreparedStatement ps= con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                orden = new Orden(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6));
                ord.add(orden);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(OrdenDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ord;
    }
}
