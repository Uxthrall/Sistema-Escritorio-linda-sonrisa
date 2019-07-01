
package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProfesionalDAO {
    public boolean ingresarCuenta(Profesional prof) throws ClassNotFoundException{
       
        boolean resultado=false;
      
        try {
            Connection con = Conexion.getConexion();
            
            String query="insert into Profesional(RUT,DV_RUT,NOMBRE,P_APELLIDO,S_APELLIDO,password,TIPO_USUARIO,EMAIL,CELULAR) values(?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement ps=con.prepareStatement(query);
            
            ps.setString(1,prof.getRut());
            ps.setString(2,prof.getDv_rut());
            ps.setString(3,prof.getNombre());
            ps.setString(4,prof.getP_apellido());
            ps.setString(5,prof.getS_apellido());
            ps.setString(6,prof.getPassword());
            ps.setInt(7,prof.getTipo_usuario());
            ps.setString(8,prof.getEmail()); 
            ps.setInt(9,prof.getCelular());  
            
            
            
            resultado=ps.executeUpdate()==1;
            ps.close();
        return resultado;
        
        }catch(SQLException s)
        {
            System.out.println("Error SQL al agregar Profesional " + s.getMessage());
           return resultado;
        }

    }
   
  public Profesional buscarProfesional (String Run){
        Profesional prof= null;
        
        try {
            Connection con= Conexion.getConexion();
                String query = "Select * from Profesional where rut='"+Run+"'";
                
            PreparedStatement ps= con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                prof =new Profesional(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(7), rs.getInt(8), rs.getString(9), rs.getInt(10));
               
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ProfesionalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prof;
    }
     
  
  public boolean ModificarProfesional(Profesional prof){
        boolean resultado=false;
        
        try {
            Connection con = Conexion.getConexion();
            String query ="update Profesional set NOMBRE=?,P_APELLIDO=?,S_APELLIDO=?,password=?,EMAIL=?,CELULAR=? "+ "where rut=? ";
            PreparedStatement ps= con.prepareStatement(query);
            
            
            
            ps.setString(1, prof.getNombre());
            ps.setString(2, prof.getP_apellido());
            ps.setString(3, prof.getS_apellido());
            ps.setString(5, prof.getPassword());
            ps.setString(6, prof.getEmail());
            ps.setInt(7, prof.getCelular());        
            
            ps.setString(9,prof.getRut());
            
            resultado=ps.executeUpdate()==1;
            ps.close();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ProfesionalDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProfesionalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
   public boolean eliminarProfesional(String run)
    {
        boolean resultado=false;
        try {
            Connection con = Conexion.getConexion();
            String query="delete from Profesional where rut='"+run+"'";
            PreparedStatement ps= con.prepareStatement(query);
            resultado= ps.executeUpdate()==1;
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProfesionalDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProfesionalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    public ArrayList <Profesional> buscarNomProf(){
        ArrayList <Profesional> prof=new ArrayList<Profesional>();
        
        try {
            Connection con= Conexion.getConexion();
            String query ="select rut,dv_rut,nombre,p_apellido,s_apellido,password,tipo_usuario,email,celular from profesional";    
            Profesional profes;
            PreparedStatement ps= con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                profes =new Profesional (rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getInt(9));
                
                prof.add(profes);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ProfesionalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prof;
    }
    
    public Login buscarUsuario (String contrasenia, String correo){
        Login log= null;
        
        try {
            Connection con= Conexion.getConexion();
                String query;
                 query = "Select email,password,tipo_usuario from Profesional where email='"+correo+"'and password='"+contrasenia+"'";
                
            PreparedStatement ps= con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                log =new Login(rs.getString(1), rs.getString(2), rs.getInt(3));
               
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ProfesionalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return log;
    }
    
}
