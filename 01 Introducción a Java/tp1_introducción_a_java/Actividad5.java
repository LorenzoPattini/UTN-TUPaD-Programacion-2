package tp1_introducción_a_java;
import java.util.Scanner;
public class Actividad5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese número: "); int numero1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese otro número: "); int numero2 = Integer.parseInt(input.nextLine());
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        double division = (double) numero1 / numero2;
        System.out.println(numero1 + " + " + numero2 + " = " + suma);
        System.out.println(numero1 + " - " + numero2 + " = " + resta);
        System.out.println(numero1 + " * " + numero2 + " = " + multiplicacion);
        System.out.println(numero1 + " / " + numero2 + " = " + division);
    }
}
