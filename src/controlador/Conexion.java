package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

   private static Connection con=null;
    public static Connection getConexion() throws SQLException,ClassNotFoundException{
       if(con==null)
       {
          Class.forName("oracle.jdbc.OracleDriver");
          con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","alej_ux","ux2734a");
        }
        return con;
    }
}
