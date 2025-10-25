package tp3.introduccion.a.la.poo;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    
    public void mostrarInfo() {
        System.out.println("\nEstudiante: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }
    
    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        System.out.println("Calificacion aumentada a: " + calificacion);
    }
    
    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        System.out.println("Calificacion reducida a: " + calificacion);
    }
}