package tp3.introduccion.a.la.poo;

public class Mascotas {
    
    private String nombre;
    private String especie;
    private int edad;
    
    public Mascotas(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    public void mostrarInfo() {
        System.out.println("\nMascota: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " anios");
    }
    
    public void cumplirAnios() {
        edad++;
        System.out.println("Feliz cumpleanios " + nombre + "!. Ahora tiene " + edad + " anios");
    }
}