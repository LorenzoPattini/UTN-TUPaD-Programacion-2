package trabajo.practico.programacion.estructurada;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int nota;
        do {
            System.out.print("Ingrese una nota entre 0 y 10: ");
            nota = input.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Nota guardada correctamente.");
    }
}
