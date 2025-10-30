package Ejercicio09;

public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Profesional profesional;
    
    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }
    
    public void mostrarCita() {
        System.out.println("---Cita Médica---\nFecha: " + fecha + "\nHora: " + hora + "\nPaciente: " + paciente.getNombrePaciente() + "\n(Obra Social: " + paciente.getObraSocial() + ")" + "\nProfesional: " + profesional.getNombreProfesional() + " - " + profesional.getEspecialidad());
    }
    
    // Getters
    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Profesional getProfesional() {
        return profesional;
    }
}