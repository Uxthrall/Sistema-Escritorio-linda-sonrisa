package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AgendaDAO 
{
    public boolean ingresarAgenda (Agenda age, String nom_prof) throws ClassNotFoundException{
       
        boolean resultado=false;
      
        try { 
            Connection con = Conexion.getConexion();
            
            String sql="select rut from profesional where nombre||' '||p_apellido||' '||s_apellido='"+nom_prof+"'";
            
            PreparedStatement prs=con.prepareStatement(sql);
            ResultSet rs=prs.executeQuery();      
             
            while (rs.next() ) {  
                
                String rut_profesional= rs.getString(1);  
                
                String query="insert into turno (dia,hora,reservada,profesional_rut) values (?,?,?,?)";

                PreparedStatement ps=con.prepareStatement(query);

                ps.setDate(1,new java.sql.Date(age.getFecha().getTime()));
                ps.setString(2,age.getHora());
                ps.setInt(3,age.getReservado());
                ps.setString(4,rut_profesional);
               
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
    public Agenda VerificarTurno (String dia,String hora,String profesional_rut)
    {
        Agenda age= null;
        
        try {
            Connection con= Conexion.getConexion();
            String sql="select rut from profesional where nombre||' '||p_apellido||' '||s_apellido='"+profesional_rut+"'";
            
            PreparedStatement prs=con.prepareStatement(sql);
            ResultSet rset=prs.executeQuery();  
            
              String rut_profesional="";
              
            while (rset.next() ) 
            {                  
                rut_profesional= rset.getString(1);  
            
                String query = "Select dia,hora,reservada,profesional_rut  from turno where dia='"+dia+"' and hora='"+hora+"' and profesional_rut='"+rut_profesional+"'";
                
                PreparedStatement ps= con.prepareStatement(query);
                ResultSet rs=ps.executeQuery();
             
                while(rs.next()){
                    age =new Agenda(rs.getDate(1), rs.getString(2), rs.getInt(3), rs.getString(4));
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return age;
    }
    
    public ArrayList <Agenda> buscarTurno(){
        ArrayList <Agenda> age=new ArrayList<Agenda>();
        
        try {
            Connection con= Conexion.getConexion();
            String query ="SELECT \n" +
                            "    dia,\n" +
                            "    hora,\n" +
                            "    reservada,\n" +
                            "    profesional_rut\n" +
                            "FROM turno\n" +
                                    " where dia >= (select  to_char(sysdate, 'dd/mm/yyyy') from dual)";    
            Agenda agen;
            PreparedStatement ps= con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                agen = new Agenda(rs.getDate(1), rs.getString(2), rs.getInt(3), rs.getString(4));
                
                age.add(agen);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ProfesionalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return age;
   }
}
