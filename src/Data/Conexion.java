package Data;

import java.sql.*;

public class Conexion {

    public static Connection ObtenerConeccion() {

        String url = "jdbc:sqlserver://localhost:1433;"
                + "database=CINE;"
                + "user=sa;"
                + "pasword=1025525548;";
        try {
            Connection con = DriverManager.getConnection(url);
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }

    }

}
