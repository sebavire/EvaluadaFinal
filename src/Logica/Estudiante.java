package Logica;

public class Estudiante {
    private int id;
    private String nombre;
    private String telefono;
    private String mail;

    public Estudiante(int id, String nombre, String telefono, String mail) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = mail;
    }
    
    public Estudiante(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
