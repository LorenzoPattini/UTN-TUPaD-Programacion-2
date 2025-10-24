package trabajo.practico.programacion.estructurada;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] numeros = new int[3];
        int numMayor = 0;
        
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Ingrese el " + (i+1) + " ° numero: ");
                numeros[i] = Integer.parseInt(input.nextLine()); 
                if (numeros[i] >= numMayor) {
                numMayor = numeros[i];
                }
            }
            System.out.println("El numero mayor es: " + numMayor);
    }

}
