package trabajo.practico.programacion.estructurada;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(input.nextLine()); 
        
        if (edad < 0) {
            System.out.println("Error, no ingreso una edad válida.");
        } else if (edad >= 0 && edad < 4) {
            System.out.println("Eres un Bebe.");
        } else if (edad >= 4 && edad < 12) {
            System.out.println("Eres un Niño.");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Eres un Adolescente.");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un Adulto.");
        } else {
            System.out.println("Eres un Adulto mayor.");
        }
    }

}
