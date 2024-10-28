package Persistencia;

import Logica.Estudiante;
import java.sql.*;
import java.util.ArrayList;

public class EstudianteDAO {

    private String url;
    private String usuario;
    private String contraseña;

    public EstudianteDAO() {
        url = "jdbc:mysql://localhost:3306/escuela";
        //url = "jdbc:mysql://192.168.0.99:3306/escuela";
        usuario = "admin";
        contraseña = "admin";
    }

    public ArrayList<Estudiante> obtenerTodos() {
        ArrayList<Estudiante> lista = new ArrayList<>();
        String sql = "SELECT * FROM estudiantes";
        try {
            Connection conexion
                    = DriverManager.getConnection(url, usuario, contraseña);
            Statement sentencia = conexion.createStatement();
            ResultSet rs = sentencia.executeQuery(sql);
            while (rs.next()) {
                Estudiante unEstudiante = new Estudiante(rs.getInt("Id"), rs.getString("Nombre"), rs.getString("Telefono"), rs.getString("Mail"));
                lista.add(unEstudiante);
            }
            conexion.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    public void guardar(Estudiante estudiante) {
        String sql = "INSERT INTO estudiantes (Nombre, Telefono, Mail) "
                + "VALUES ('" + estudiante.getNombre() + "', '"
                + estudiante.getTelefono() + "', '"
                + estudiante.getMail() + "')";
        try {
            Connection conexion
                    = DriverManager.getConnection(url, usuario, contraseña);
            Statement sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
            conexion.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    
    
    
    
}
