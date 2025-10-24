package trabajo.practico.programacion.estructurada;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = Integer.parseInt(input.nextLine()); 
        
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = Integer.parseInt(input.nextLine()); 
        
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = Integer.parseInt(input.nextLine()); 
        
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
}
