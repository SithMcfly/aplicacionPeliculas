
package com.mycompany.peliculaapp;

import java.sql.*;

public class Conexion {
    public static final String URL = "jdbc:mysql://localhost:3306/peliculas?serverTimezone=UTC";
    public static final String USER = "root";
    public static final String PASS = System.getenv("DB_PASS");
    
    public static Connection getConexion() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASS);
    }
    
    public static void cerrar(ResultSet rs) throws SQLException {
        if (rs != null)
        rs.close();
    }
    public static void cerrar(PreparedStatement ps) throws SQLException{
        if (ps !=null)
        ps.close();
    }
    public static void cerrar(Connection con) throws SQLException {
        if (con !=null)
        con.close();
    }
    
}
