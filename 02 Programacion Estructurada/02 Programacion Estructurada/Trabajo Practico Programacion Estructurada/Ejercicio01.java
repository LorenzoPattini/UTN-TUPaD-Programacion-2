package trabajo.practico.programacion.estructurada;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un año: ");
        int año = Integer.parseInt(input.nextLine());
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("El año " + año + " es bisiesto.");
        } else {
            System.out.println("El año " + año + " no es bisiesto.");
        }
    }
}
