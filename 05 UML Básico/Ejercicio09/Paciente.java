package Ejercicio09;

public class Paciente {
    private String nombrePaciente;
    private String obraSocial;
    
    public Paciente(String nombrePaciente, String obraSocial) {
        this.nombrePaciente = nombrePaciente;
        this.obraSocial = obraSocial;
    }
    
    // Getters
    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public String getObraSocial() {
        return obraSocial;
    }
}