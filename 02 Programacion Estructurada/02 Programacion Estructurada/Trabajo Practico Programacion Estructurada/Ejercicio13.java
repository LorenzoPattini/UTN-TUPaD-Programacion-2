package trabajo.practico.programacion.estructurada;

public class Ejercicio13 {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales:");
        mostrarPreciosRecursivo(precios, 0);
        precios[2] = 129.99;
        
        System.out.println("\nPrecios modificados:");
        mostrarPreciosRecursivo(precios, 0);
    }
    
    public static void mostrarPreciosRecursivo(double[] precios, int indice) {
        // Caso base: cuando llegamos al final del array
        if (indice >= precios.length) {
            return;
        }
        
        System.out.println("Precio: $" + precios[indice]);
        
        mostrarPreciosRecursivo(precios, indice + 1);
    }
}