
package modelo;

import controlador.Conexion;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CertificadosDAO {
       public boolean ingresarSituacion(String finiquito, String afp,String afp2,String run) throws ClassNotFoundException, FileNotFoundException{
       
        boolean resultado=false;
      
        try {
            Connection con = Conexion.getConexion();
            
            String query="insert into situacion_economica(AFP2,AFP,FINIQUITO,APODERADO_RUT) values(?,?,?,?)";
            
            try (PreparedStatement ps = con.prepareStatement(query)) {
                
                FileInputStream archivofotoFiniquito = null;
                FileInputStream archivoAFP2  = null;
                FileInputStream archivoAFP = null;
                
               
                if (finiquito.isEmpty() && afp.isEmpty() && afp2.length()!=0 ) 
                {
                    archivoAFP2= new FileInputStream(afp2);
                }
                else if (finiquito.isEmpty() && afp.length()!=0 && afp2.length()!=0) 
                {
                    archivoAFP2= new FileInputStream(afp2);
                    archivoAFP =new FileInputStream(afp);
                }
                else if(finiquito.isEmpty() && afp.isEmpty() && afp2.isEmpty())
                {
                     
                }
                else if (afp.isEmpty() && afp2.isEmpty() && finiquito.length()!=0) 
                {
                    archivofotoFiniquito= new FileInputStream(finiquito);
                }
                else if(afp.isEmpty() && afp2.length()!=0 && finiquito.length()!=0) 
                {
                    archivofotoFiniquito= new FileInputStream(finiquito);
                    archivoAFP2= new FileInputStream(afp2);
                }
                else
                {
                    archivofotoFiniquito= new FileInputStream(finiquito);
                    archivoAFP = new FileInputStream(afp);
                    archivoAFP2= new FileInputStream(afp2);
                }
               
                
                ps.setBinaryStream(1, archivoAFP2);
                ps.setBinaryStream(2, archivoAFP);
                ps.setBinaryStream(3, archivofotoFiniquito);
                ps.setString(4,run);
                
                resultado=ps.executeUpdate()==1;
            }
        return resultado;
        
        }catch(SQLException s)
        {
            System.out.println("Error SQL al agregar Situacion Economica " + s.getMessage());
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
                apo =new Apoderado(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
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
