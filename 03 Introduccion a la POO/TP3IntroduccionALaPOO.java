
package tp3.introduccion.a.la.poo;


public class TP3IntroduccionALaPOO {

    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante("\nJuan", "Perez", "Matematicas", 7.5);
        
        estudiante1.mostrarInfo();
        estudiante1.subirCalificacion(1.5);
        estudiante1.bajarCalificacion(0.5);
        estudiante1.mostrarInfo();
        
        
        Mascotas miMascota = new Mascotas("\nMax", "Perro", 3);
        
        miMascota.mostrarInfo();
        
        miMascota.cumplirAnios();
        miMascota.cumplirAnios();
        
        miMascota.mostrarInfo();
        
        
        Libro libro1 = new Libro("\nCien anios de soledad", "Gabriel Garcia Marquez", 1967);
        
        libro1.mostrarInfo();
        
        System.out.println("Intentando modificar anio con valor invalido:");
        libro1.setAñoPublicacion(-100);
        
        System.out.println("Modificando anio con valor válido:");
        libro1.setAñoPublicacion(1970);
        
        System.out.println("Informacion final del libro:");
        libro1.mostrarInfo();
        
        
        Gallina gallina1 = new Gallina("G001", 1);
        Gallina gallina2 = new Gallina("G002", 0);
        
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        System.out.println("\n=== Simulando acciones ===");
        
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina1.envejecer();
        
        gallina2.ponerHuevo();
        gallina2.envejecer();
        gallina2.ponerHuevo();
        
        System.out.println("\n=== Estado final ===");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        
        NaveEspacial nave = new NaveEspacial("Explorer-1", 50);
        
        nave.mostrarEstado();
        
        System.out.println("\n=== Intentando avanzar sin recargar ===");
        nave.avanzar(100);
        
        System.out.println("\n=== Recargando combustible ===");
        nave.recargarCombustible(30);
        
        System.out.println("\n=== Avanzando despues de recargar ===");
        nave.avanzar(100);
        
        System.out.println("\n=== Estado final ===");
        nave.mostrarEstado();
    }
}