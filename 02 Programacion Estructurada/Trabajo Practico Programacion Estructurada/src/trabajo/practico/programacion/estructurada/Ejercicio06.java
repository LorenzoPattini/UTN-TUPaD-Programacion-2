package trabajo.practico.programacion.estructurada;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int positivos = 0, negativos = 0, ceros = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el  " + i + "° número: ");
            int numero = Integer.parseInt(input.nextLine());
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        System.out.println("Cantidad de Positivos: " + positivos + ". Negativos: " + negativos + ". Y ceros: " + ceros);
    }
}
