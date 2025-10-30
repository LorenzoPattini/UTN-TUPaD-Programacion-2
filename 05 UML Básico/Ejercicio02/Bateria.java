package Ejercicio02;

public class Bateria {
    
    private String modeloBateria;
    private String capacidad;
    
    public Bateria(String modelo, String capacidad) {
        this.modeloBateria = modelo;
        this.capacidad = capacidad;
    }
    
    // Getters

    public String getModelo() {
        return modeloBateria;
    }
    
    public String getCapacidad() {
        return capacidad;
    }
}