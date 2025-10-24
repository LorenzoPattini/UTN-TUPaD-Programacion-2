package trabajo.practico.programacion.estructurada;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sumatoria = 0;
        while (true) {
            System.out.print("Ingrese un número o cero para terminar: ");
            int numero = Integer.parseInt(input.nextLine()); 
            if (numero == 0) {
                break;
            } else if (numero % 2 != 0) {
                System.out.println("No se realizan sumas con numeros impares.");
            }
            if (numero % 2 == 0) {
                sumatoria += numero;
            }
        }
        System.out.println("La suma de los números pares es: " + sumatoria);
    }
}
