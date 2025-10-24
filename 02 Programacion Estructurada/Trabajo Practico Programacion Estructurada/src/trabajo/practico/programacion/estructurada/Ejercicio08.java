package trabajo.practico.programacion.estructurada;
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el precio base del producto: ");
        double precioBase = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese el impuesto: ");
        double impuesto = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese el descuento: ");
        double descuento = Double.parseDouble(input.nextLine());
        System.out.println("El precio final del producto es: " + calcularPrecioFinal(precioBase, impuesto, descuento));
    }

    private static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto / 100) - (precioBase * descuento / 100);
    }
}