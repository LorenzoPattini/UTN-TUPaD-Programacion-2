package trabajo.practico.programacion.estructurada;
import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = input.nextLine();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
    }
    
    
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            return 0;
        }
    }
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}