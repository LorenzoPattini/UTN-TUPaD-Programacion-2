package trabajo.practico.programacion.estructurada;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un a�o: ");
        int a�o = Integer.parseInt(input.nextLine());
        if ((a�o % 4 == 0 && a�o % 100 != 0) || (a�o % 400 == 0)) {
            System.out.println("El a�o " + a�o + " es bisiesto.");
        } else {
            System.out.println("El a�o " + a�o + " no es bisiesto.");
        }
    }
}
