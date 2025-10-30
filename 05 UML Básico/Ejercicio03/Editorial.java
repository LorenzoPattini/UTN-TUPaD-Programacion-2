package Ejercicio03;

public class Editorial {
    private String nombreEditorial;
    private String direccion;
    
    public Editorial(String nombreEditorial, String direccion) {
        this.nombreEditorial = nombreEditorial;
        this.direccion = direccion;
    }
    
    // Getters
    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public String getDireccion() {
        return direccion;
    }
}