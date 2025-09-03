package tp1_introducción_a_java;
import java.util.Scanner;
public class Actividad8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un número: "); int numero1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese otro número: "); int numero2 = Integer.parseInt(input.nextLine());
         
         int divisionInt = numero1 / numero2;
         double divisionDouble = (double) numero1 / numero2;
         
         System.out.println("División con valores tipo Int: " + numero1 + " / " + numero2 + " = " + divisionInt);
         System.out.println("División con valores tipo Double: " + numero1 + " / " + numero2 + " = " + divisionDouble);
    }
}
