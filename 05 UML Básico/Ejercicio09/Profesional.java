package Ejercicio09;

public class Profesional {
    private String nombreProfesional;
    private String especialidad;
    
    public Profesional(String nombreProfesional, String especialidad) {
        this.nombreProfesional = nombreProfesional;
        this.especialidad = especialidad;
    }
    
    // Getters
    public String getNombreProfesional() {
        return nombreProfesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}