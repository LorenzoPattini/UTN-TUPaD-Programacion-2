package tp1_introducción_a_java;
import java.util.Scanner;
public class Actividad4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba su nombre: "); String nombre = input.nextLine();
        System.out.println("Ingrese su edad: "); int edad = Integer.parseInt(input.nextLine());
        System.out.println("Hola " + nombre + ", tienes " + edad + " años correcto?");
    }
}
