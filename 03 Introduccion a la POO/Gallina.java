package tp3.introduccion.a.la.poo;

public class Gallina {

    private String idGallina;
    private int edad;
    private int huevosPuestos;
    
    public Gallina(String idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;
    }
    
    public void ponerHuevo() {
        if (edad >= 1) {
            huevosPuestos++;
            System.out.println(idGallina + " puso un huevo. Total: " + huevosPuestos);
        } else {
            System.out.println(idGallina + " es demasiado joven para poner huevos");
        }
    }
    
    public void envejecer() {
        edad++;
        System.out.println(idGallina + " ahora tiene " + edad + " anios");
    }
    
    public void mostrarEstado() {
        System.out.println(" ");
        System.out.println("=== Estado de " + idGallina + " ===");
        System.out.println("Edad: " + edad + " anios");
        System.out.println("Huevos puestos: " + huevosPuestos);
    }
    
    public String getIdGallina() { return idGallina; }
    public int getEdad() { return edad; }
    public int getHuevosPuestos() { return huevosPuestos; }
}