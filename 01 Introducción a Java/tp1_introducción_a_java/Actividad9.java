package tp1_introducción_a_java;
import java.util.Scanner;
public class Actividad9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.next(); // Solución
        System.out.println("Hola, " + nombre);
    }
}