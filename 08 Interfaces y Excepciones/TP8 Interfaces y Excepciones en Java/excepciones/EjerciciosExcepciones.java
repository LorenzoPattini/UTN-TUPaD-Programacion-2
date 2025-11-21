package excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjerciciosExcepciones {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("EJERCICIOS DE MANEJO DE EXCEPCIONES\n");

        // Ejercicio 1
        ejercicio1_DivisionSegura();
        
        // Ejercicio 2
        ejercicio2_ConversionCadena();
        
        // Ejercicio 3
        ejercicio3_LecturaArchivo();
        
        // Ejercicio 4
        ejercicio4_ExcepcionPersonalizada();
        
        // Ejercicio 5
        ejercicio5_TryWithResources();

        scanner.close();
        System.out.println("\nTodos los ejercicios completados!");
    }

    // EJERCICIO 1
    public static void ejercicio1_DivisionSegura() {
        System.out.println("=== DIVISION SEGURA ===");
        
        try {
            System.out.print("Ingrese el numerador: ");
            int numerador = scanner.nextInt();
            
            System.out.print("Ingrese el denominador: ");
            int denominador = scanner.nextInt();
            
            int resultado = numerador / denominador;
            System.out.println("Resultado: " + numerador + " / " + denominador + " = " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero!");
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar números enteros validos!");
            scanner.nextLine(); // Limpiar buffer
        }
        System.out.println();
    }

    // EJERCICIO 2
    public static void ejercicio2_ConversionCadena() {
        System.out.println("=== CONVERSION DE CADENA A NUMERO ===");
        
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Ingrese un numero entero: ");
        String entrada = scanner.nextLine();
        
        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Numero convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + entrada + "' no es un numero entero valido!");
        }
        System.out.println();
    }

    // EJERCICIO 3
    public static void ejercicio3_LecturaArchivo() {
        System.out.println("=== LECTURA DE ARCHIVO ===");
        
        System.out.print("Ingrese la ruta del archivo: ");
        scanner.nextLine(); // Limpiar buffer
        String rutaArchivo = scanner.nextLine();
        
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(rutaArchivo));
            String linea;
            System.out.println("Contenido del archivo:");
            
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado - " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        } finally {
            // Cerrar recursos en bloque finally
            if (reader != null) {
                try {
                    reader.close();
                    System.out.println("Archivo cerrado correctamente");
                } catch (IOException e) {
                    System.out.println("Error al cerrar el archivo: " + e.getMessage());
                }
            }
        }
        System.out.println();
    }

    // EJERCICIO 4
    public static void ejercicio4_ExcepcionPersonalizada() {
        System.out.println("=== EXCEPCION PERSONALIZADA ===");
        
        try {
            System.out.print("Ingrese una edad para validar: ");
            int edad = scanner.nextInt();
            
            ValidadorEdad.validarEdad(edad);
            
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un numero entero!");
            scanner.nextLine(); // Limpiar buffer
        }
        System.out.println();
    }

    // EJERCICIO 5
    public static void ejercicio5_TryWithResources() {
        System.out.println("=== TRY-WITH-RESOURCES ===");
        
        System.out.print("Ingrese la ruta del archivo: ");
        scanner.nextLine(); // Limpiar buffer
        String rutaArchivo = scanner.nextLine();
        
        // Usando try-with-resources (se cierra automáticamente)
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            System.out.println("Contenido del archivo (con try-with-resources):");
            int contador = 0;
            
            while ((linea = reader.readLine()) != null) {
                System.out.println(++contador + ": " + linea);
            }
            
            System.out.println("Archivo leido completamente. Se cerro automaticamente.");
            
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado - " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        }
        System.out.println();
    }
}