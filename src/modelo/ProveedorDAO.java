package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProveedorDAO {
    
   public boolean ingresarProveedor(Proveedor prov) throws ClassNotFoundException{
       
        boolean resultado=false;
      
        try {
            Connection con = Conexion.getConexion();
            
            String query="insert into proveedor(RUT,DV_RUT,NOMBRE,DESCRIPCION,DIRECCION,COMUNA,CIUDAD,EMAIL,CELULAR,N_DIRECCION)"
                          + "values(?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement ps=con.prepareStatement(query);
            
            ps.setString(1,prov.getRun());
            ps.setString(2,prov.getDv_run());
            ps.setString(3,prov.getNombre());
            ps.setString(4,prov.getDescripcion());
            ps.setString(5,prov.getDireccion());
            ps.setString(6,prov.getComuna());
            ps.setString(7,prov.getCiudad());
            ps.setString(8,prov.getEmail()); 
            ps.setInt(9,prov.getCelular());
            ps.setInt(10,prov.getN_direccion());
          
            
            
            resultado=ps.executeUpdate()==1;
            ps.close();
        return resultado;
        
        }catch(SQLException s)
        {
            System.out.println("Error SQL al agregar Proveedor " + s.getMessage());
            
           return resultado;
        }

    }
   
  public Proveedor buscarProveedor (String Run){
        Proveedor prov= null;
        
        try {
            Connection con= Conexion.getConexion();
                String query = "Select * from proveedor where rut='"+Run+"'";
                
            PreparedStatement ps= con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                prov = new Proveedor(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9), rs.getInt(10));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ApoderadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prov;
    }
     
  
  public boolean ModificarProveedor(Proveedor prov){
        boolean resultado=false;
        
        try {
            Connection con = Conexion.getConexion();
            String query ="update proveedor set NOMBRE=?,DESCRIPCION=?,DIRECCION=?,COMUNA=?,CIUDAD=?,EMAIL=?,CELULAR=?,N_DIRECCION=?"+ "where rut=? ";
            PreparedStatement ps= con.prepareStatement(query);
            
            ps.setString(1, prov.getNombre());
            ps.setString(2, prov.getDescripcion());
            ps.setString(3, prov.getDireccion());
            ps.setString(4, prov.getComuna());
            ps.setString(5, prov.getCiudad());
            ps.setString(6, prov.getEmail());          
            ps.setInt(7, prov.getCelular());
            ps.setInt(8, prov.getN_direccion());
            
            ps.setString (9,prov.getRun());
            
            resultado=ps.executeUpdate()==1;
            ps.close();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
   public boolean eliminarProveedor(String run)
    {
        boolean resultado=false;
        try {
            Connection con = Conexion.getConexion();
            String query="delete from proveedor where rut='"+run+"'";
            PreparedStatement ps= con.prepareStatement(query);
            resultado= ps.executeUpdate()==1;
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
   public ArrayList <Proveedor> buscarNomProov(){
        ArrayList <Proveedor> prov=new ArrayList<Proveedor>();
        
        try {
            Connection con= Conexion.getConexion();
            String query ="select nombre from proveedor";    
            
            Proveedor proo;
            
            PreparedStatement ps= con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                
                proo = new Proveedor(rs.getString(1));
                //proo = new Proveedor(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9), rs.getInt(10), rs.getInt(11));
                prov.add(proo);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prov;
    }
   public Proveedor buscarNomProv (String nom_pro){
        Proveedor prov= null;
        
        try {
            Connection con= Conexion.getConexion();
                String query = "Select rut,email from proveedor where nombre='"+nom_pro+"'";
                
            PreparedStatement ps= con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                prov = new Proveedor(rs.getString(1), rs.getString(2));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ApoderadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prov;
    }
}

