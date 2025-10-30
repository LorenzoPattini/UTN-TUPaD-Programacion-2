package Ejercicio05;

public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;
    
    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipsetPlaca) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipsetPlaca);
    }
    
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }
    
    public void mostrarEspecificaciones() {
        System.out.println("Computadora: " + marca + "\nN° Serie: " + numeroSerie + "\nPlaca Madre: " + placaMadre.getModelo() + "\nChipset: " + placaMadre.getChipset());
        if (propietario != null) {
            System.out.println("Propietario: " + propietario.getNombre());
        }
    }
    
    // Getters
    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }
}