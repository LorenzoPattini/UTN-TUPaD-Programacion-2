package tp1_introducci�n_a_java;
import java.util.Scanner;
public class Actividad8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un n�mero: "); int numero1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese otro n�mero: "); int numero2 = Integer.parseInt(input.nextLine());
         
         int divisionInt = numero1 / numero2;
         double divisionDouble = (double) numero1 / numero2;
         
         System.out.println("Divisi�n con valores tipo Int: " + numero1 + " / " + numero2 + " = " + divisionInt);
         System.out.println("Divisi�n con valores tipo Double: " + numero1 + " / " + numero2 + " = " + divisionDouble);
    }
}
