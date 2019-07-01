
package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ApoderadoDAO {
    
   public boolean ingresarCuenta(Apoderado apo) throws ClassNotFoundException{
       
        boolean resultado=false;
      
        try {
            Connection con = Conexion.getConexion();
            
            String query="insert into apoderado(RUT,DV_RUT,CONTRASENA,NOMBRE,P_APELLIDO,S_APELLIDO,CELULAR,EMAIL,DIRECCION,TIPO_USUARIO,N_DIRECCION,COMUNA,"
                          + "CIUDAD) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement ps=con.prepareStatement(query);
            
            ps.setString(1,apo.getRut());
            ps.setString(2,apo.getDvRut());
            ps.setString(3,apo.getContra());
            ps.setString(4,apo.getNombre());
            ps.setString(5,apo.getP_apellido());
            ps.setString(6,apo.getS_apelledio());
            ps.setInt(7,apo.getCelular());
            ps.setString(8,apo.getEmail()); 
            ps.setString(9,apo.getDireccion());
            ps.setInt(10,apo.getTipo_usuario());
            ps.setInt(11,apo.getN_direccion());
            ps.setString(12,apo.getComuna());
            ps.setString(13,apo.getCiudad());
            
            
            
            resultado=ps.executeUpdate()==1;
            ps.close();
        return resultado;
        
        }catch(SQLException s)
        {
            System.out.println("Error SQL al agregar Apoderado " + s.getMessage());
           return resultado;
        }

    }
   
  public Apoderado buscarApoderado (String Run){
        Apoderado apo= null;
        
        try {
            Connection con= Conexion.getConexion();
                String query = "Select rut,dv_rut,contrasena,nombre,p_apellido,s_apellido,celular,email,direccion,tipo_usuario,n_direccion,comuna,ciudad  from apoderado where rut='"+Run+"'";
                
            PreparedStatement ps= con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                apo =new Apoderado(rs.getString(1), rs.getString(2),  rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
                                rs.getInt(7), rs.getString(8), rs.getString(9), rs.getInt(10), rs.getInt(11), rs.getString(12), rs.getString(13));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ApoderadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return apo;
    }
     
  
  public boolean ModificarApoderado(Apoderado apo){
        boolean resultado=false;
        
        try {
            Connection con = Conexion.getConexion();
            String query ="update apoderado set contrasena=?,nombre=?,p_apellido=?,s_apellido=?,celular=?,email=?,direccion=?,n_direccion=?,comuna=?,ciudad=? "+ "where rut=? ";
            PreparedStatement ps= con.prepareStatement(query);
            
            
           
            ps.setString(1, apo.getContra());
            ps.setString(2, apo.getNombre());
            ps.setString(3, apo.getP_apellido());
            ps.setString(4, apo.getS_apelledio());
            ps.setInt(5, apo.getCelular());
            ps.setString(6, apo.getEmail());
            ps.setString(7, apo.getDireccion());            
            ps.setInt(8, apo.getN_direccion());
            ps.setString(9, apo.getComuna());
            ps.setString(10, apo.getCiudad());        
            
            ps.setString (11,apo.getRut());
            
            resultado=ps.executeUpdate()==1;
            ps.close();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ApoderadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ApoderadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
   public boolean eliminarApoderado(String run)
    {
        boolean resultado=false;
        try {
            Connection con = Conexion.getConexion();
            String query="delete from apoderado where rut='"+run+"'";
            PreparedStatement ps= con.prepareStatement(query);
            resultado= ps.executeUpdate()==1;
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ApoderadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ApoderadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
}

