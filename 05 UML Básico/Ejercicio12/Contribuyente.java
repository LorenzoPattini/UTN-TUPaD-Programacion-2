package Ejercicio12;

public class Contribuyente {
    
    private String nombre;
    private String cuit;
    
    public Contribuyente(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCuit() {
        return cuit;
    }

    @Override
    public String toString() {
        return "Contribuyente{" + "nombre=" + nombre + ", cuit=" + cuit + '}';
    }
}