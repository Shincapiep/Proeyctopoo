package Data;

import java.sql.*;

public class Conexion {
    
   // Connection conectar=null;
        
       /* static String usuario = "usercine";
        static String contrasena="1234";
        static String database="Cine";
        static String ip = "localhost";
        static String puerto = "1433";
        static String cadena ="jdbc:sqlserver://"+ip+":"+puerto;*/

    public static Connection ObtenerConeccion() {
        
       // Connection conectar=null;
        
       String url = "jdbc:sqlserver://localhost:1433;"
                + "user=usercine;"
                + "password=cine123;"
                + "database=Cine;"
                + "encrypt=false;"; 
        try {
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           //cadena ="jdbc:sqlserver://localhost:"+puerto+";"+"Cine"+database;
            //conectar=DriverManager.getConnection(cadena,usuario,contrasena);
            Connection con = DriverManager.getConnection(url);
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
            //return conectar;
    }

}
