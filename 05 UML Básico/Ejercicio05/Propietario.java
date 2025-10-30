package Ejercicio05;

public class Propietario {
    private String nombre;
    private String DNI;
    private Computadora computadora;
    
    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.DNI = DNI;
    }
    
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
        }
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public Computadora getComputadora() {
        return computadora;
    }
}