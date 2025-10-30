package Ejercicio03;

public class Autor {
    private String nombreAutor;
    private String nacionalidad;
    
    public Autor(String nombreAutor, String nacionalidad) {
        this.nombreAutor = nombreAutor;
        this.nacionalidad = nacionalidad;
    }
    
    // Getters
    public String getNombreAutor() {
        return nombreAutor;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
}