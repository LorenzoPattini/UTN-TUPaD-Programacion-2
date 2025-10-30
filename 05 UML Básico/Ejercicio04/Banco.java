package Ejercicio04;

public class Banco {
    private String nombreBanco;
    private String cuit;
    
    public Banco(String nombreBanco, String cuit) {
        this.nombreBanco = nombreBanco;
        this.cuit = cuit;
    }
    
    // Getters
    public String getNombreBanco() {
        return nombreBanco;
    }

    public String getCuit() {
        return cuit;
    }
}