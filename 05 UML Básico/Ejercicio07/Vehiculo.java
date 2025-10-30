package Ejercicio07;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;
    
    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }
    
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }
    
    public void mostrarInformacion() {
        System.out.println("Vehículo: " + modelo + "\nPatente: " + patente + "\nMotor: " + motor.getTipo() + "\n(Serie: " + motor.getNumeroSerie() + ")");
        if (conductor != null) {
            System.out.println("Conductor: " + conductor.getNombre() + "\n(Licencia: " + conductor.getLicencia() + ")");
        }
    }
    
    // Getters
    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public Conductor getConductor() {
        return conductor;
    }
}