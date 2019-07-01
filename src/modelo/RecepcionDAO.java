package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecepcionDAO {
    
     public boolean ingresarRecepcion(Recepcion rec) throws ClassNotFoundException{
       
        boolean resultado=false;
      
        try {
            Connection con = Conexion.getConexion();
            
            String query="insert into recepcion(codigo,fecha,orden_id_orden,orden_proveedor_rut,orden_profesional_rut) values(?,?,?,?,?)";
            
            PreparedStatement ps=con.prepareStatement(query);
            
            ps.setString(1,rec.getCodigo());
            ps.setString(2,rec.getFecha());
            ps.setString(3,rec.getId_orden());
            ps.setString(4,rec.getProveedor());
            ps.setString(5,rec.getProfesional());           
            
            resultado=ps.executeUpdate()==1;
            ps.close();
        return resultado;
        
        }catch(SQLException s)
        {
            System.out.println("Error SQL al agregar Recepcion " + s.getMessage());
           return resultado;
        }

    }
   
  public Recepcion buscarRecepcion(String codigo){
        Recepcion rec= null;
        
        try {
            Connection con= Conexion.getConexion();
                String query = "Select * from recepcion where codigo='"+codigo+"'";
                
            PreparedStatement ps= con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                rec = new Recepcion(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(RecepcionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rec;
    }
     
  
  public boolean ModificarRecepcion(Recepcion rec){
        boolean resultado=false;
        
        try {
            Connection con = Conexion.getConexion();
            String query ="update recepcion set fecha=?,orden_id_orden=?,orden_proveedor_rut=?,orden_profesional_rut=? "+ "where codigo=? ";
            PreparedStatement ps= con.prepareStatement(query);
            
            
            ps.setString(1, rec.getFecha());
            ps.setString(2, rec.getId_orden());
            ps.setString(3, rec.getProveedor());
            ps.setString(4, rec.getProfesional());
            ps.setString(5, rec.getCodigo());
           
            
            resultado=ps.executeUpdate()==1;
            ps.close();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(RecepcionDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RecepcionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
   public boolean eliminarRecepcion(String codigo)
    {
        boolean resultado=false;
        try {
            Connection con = Conexion.getConexion();
            String query="delete from recepcion where codigo='"+codigo+"'";
            PreparedStatement ps= con.prepareStatement(query);
            resultado= ps.executeUpdate()==1;
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(RecepcionDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RecepcionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
}
