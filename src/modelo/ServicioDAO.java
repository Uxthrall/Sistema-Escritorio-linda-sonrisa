
package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServicioDAO {
    public boolean ingresarServicio(Servicio serv, String nom_prof) throws ClassNotFoundException{
       
        boolean resultado=false;
      
        try { 
            Connection con = Conexion.getConexion();
            
            String sql="select rut from profesional where nombre||' '||p_apellido||' '||s_apellido='"+nom_prof+"'";
            
            PreparedStatement prs=con.prepareStatement(sql);
            ResultSet rs=prs.executeQuery();
            
            
            while (rs.next()) {           
                String rut_profesional= rs.getString(1);                                 
                String query="insert into servicio(id_servicio,descripcion,profesional_rut) values(?,?,?)";

                PreparedStatement ps=con.prepareStatement(query);

                ps.setString(1,serv.getId_servicio());
                ps.setString(2,serv.getDescripcion());
                ps.setString(3,rut_profesional);
               
                resultado=ps.executeUpdate()==1;
                
                prs.close();
                ps.close();
            }
        return resultado;
        
        }catch(SQLException s)
        {
            System.out.println("Error SQL al agregar Servicio " + s.getMessage());
           return resultado;
        }

    }
   //=====================================================
  public Servicio buscarServicio (String id_servicio, String Descripcion){
        Servicio serv= null;
        
        try {
            Connection con= Conexion.getConexion();
                String query = "Select \n" +
                                "        s.id_servicio,\n" +
                                "        s.descripcion,\n" +
                                "        p.nombre||' '||p.p_apellido||' '||p.s_apellido\n" +
                                "from Servicio s join profesional p\n" +
                                "on(s.profesional_rut=p.rut)\n" +
                                "                    where id_servicio='"+id_servicio+"' or descripcion='"+Descripcion+"'";
                
            PreparedStatement ps= con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                serv =new Servicio(rs.getString(1), rs.getString(2), rs.getString(3));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ServicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return serv;
    }
   //****************************************************************
  
  
 
  public boolean ModificarServicio(Servicio serv, String nom_prof){
        boolean resultado=false;
        
        try {
            
            Connection con = Conexion.getConexion();
            
            String sql="select rut from profesional where nombre||' '||p_apellido||' '||s_apellido='"+nom_prof+"'";
            
            PreparedStatement prs=con.prepareStatement(sql);
            ResultSet rs=prs.executeQuery();
            
            
            while (rs.next()) {           
                String rut_profesional= rs.getString(1); 
            String query ="update servicio set descripcion=?,profesional_rut=?"+ "where id_servicio=? ";
            PreparedStatement ps= con.prepareStatement(query);
            
            
            
            ps.setString(1,serv.getDescripcion());
            ps.setString(2,rut_profesional);
            ps.setString(3,serv.getId_servicio());
            
            
            resultado=ps.executeUpdate()==1;
            ps.close();
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ServicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
   public boolean eliminarServicio(String id_servicio)
    {
        boolean resultado=false;
        try {
            Connection con = Conexion.getConexion();
            String query="delete from servicio where id_servicio='"+id_servicio+"'";
            PreparedStatement ps= con.prepareStatement(query);
            resultado= ps.executeUpdate()==1;
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ServicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
   public ArrayList <Servicio> buscartodoSer(){
        ArrayList <Servicio> serv=new ArrayList<Servicio>();
        
        try {
            Connection con= Conexion.getConexion();
            String query ="select \n" +
                            "        s.id_servicio,\n" +
                            "        s.descripcion,\n" +
                            "        p.rut,\n" +
                            "        p.nombre||' '||p.p_apellido||' '||p.s_apellido\n" +
                            "from Servicio s join profesional p\n" +
                            "on(s.profesional_rut=p.rut)";    
            Servicio ser;
            PreparedStatement ps= con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                ser =new  Servicio(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4));
                
                serv.add(ser);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ProfesionalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return serv;
   }
  

}
