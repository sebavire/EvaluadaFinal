package Logica;

import Persistencia.EstudianteDAO;
import java.util.ArrayList;

public class Controlador {

    private Estudiante estudiante;
    private EstudianteDAO estudainteDAO;

    public Controlador() {
        estudainteDAO = new EstudianteDAO();
    }

    public ArrayList<Estudiante> obtenerEstudiantes() {
        ArrayList<Estudiante> lista = new ArrayList<>();
        try {
            lista = estudainteDAO.obtenerTodos();
        } catch (Exception e) {
            
        }
        return lista;
    }

    public void guardarEstudiante(String nombre, String telefono, String mail) {
        try {
            estudiante = new Estudiante(0, nombre, telefono, mail);
            estudainteDAO.guardar(estudiante);
        } catch (Exception e) {
            
        }
    }

    
    
    


}
