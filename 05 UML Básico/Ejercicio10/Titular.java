package Ejercicio10;

public class Titular {
    private String nombre;
    private String DNI;
    private CuentaBancaria cuenta;
    
    public Titular(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }
    
    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
        if (cuenta != null && cuenta.getTitular() != this) {
            cuenta.setTitular(this);
        }
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }
}