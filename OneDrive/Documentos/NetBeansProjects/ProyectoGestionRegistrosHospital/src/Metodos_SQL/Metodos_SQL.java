
package Metodos_SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Metodos_SQL {
    public static PreparedStatement sentencia_preparada;
   
    
    public int guardar(String nombre, String apellidos, String servicio,String usuario, String contraseña) throws SQLException {
        int resultado = 0;
        Connection conexion = null;

       String sentencia_guardar = ("INSERT INTO login (Nombre,Apellido,Servicio,Usuario,Contraseña)VALUES(?,?,?,?,?)");

        try {
            conexion = ConexionBD.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, apellidos);
            sentencia_preparada.setString(3, servicio);
            sentencia_preparada.setString(4, usuario);
            sentencia_preparada.setString(5, contraseña);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
}