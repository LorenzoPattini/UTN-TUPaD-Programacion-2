package trabajo.practico.programacion.estructurada;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese si la categoria del producto es 'A', 'B' o 'C': ");
        String categoria = input.nextLine();
        
        double descuento;
        switch (categoria.toUpperCase()) {
            case "A":
                descuento = 0.10;
                break;
            case "B":
                descuento = 0.15;
                break;
            case "C":
                descuento = 0.20;
                break;
            default:
                System.out.println("Categoría no válida");
                return;
        }
        double precioFinal = precio - (precio * descuento);
        
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }

}
