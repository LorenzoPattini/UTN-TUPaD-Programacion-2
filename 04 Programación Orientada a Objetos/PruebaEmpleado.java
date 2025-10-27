package tp4.poo;

public class PruebaEmpleado {

public static void main(String[] args) {
        // Instanciar objetos usando ambos constructores
        
        // Constructor con todos los atributos
        Empleado empleado1 = new Empleado(1, "Juan Pérez", "Desarrollador", 2500.0);
        Empleado empleado2 = new Empleado(2, "María García", "Gerente", 4000.0);
        
        // Constructor con solo nombre y puesto (id automático y salario por defecto)
        Empleado empleado3 = new Empleado("Carlos López", "Analista");
        Empleado empleado4 = new Empleado("Ana Martínez", "Diseñadora");
        
        // Aplicar métodos actualizarSalario() sobre distintos empleados
        
        // Aumento por porcentaje
        System.out.println("=== Aplicando aumento por porcentaje ===");
        System.out.println("Salario anterior de " + empleado1.getNombre() + ": $" + empleado1.getSalario());
        empleado1.actualizarSalario(10.0); // 10% de aumento
        System.out.println("Salario actualizado: $" + empleado1.getSalario());
        
        // Aumento por cantidad fija
        System.out.println("\n=== Aplicando aumento por cantidad fija ===");
        System.out.println("Salario anterior de " + empleado3.getNombre() + ": $" + empleado3.getSalario());
        empleado3.actualizarSalario(500); // $500 de aumento
        System.out.println("Salario actualizado: $" + empleado3.getSalario());
        
        // Imprimir información de cada empleado con toString()
        System.out.println("\n=== INFORMACIÓN DE EMPLEADOS ===");
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        System.out.println(empleado4.toString());
        
        // Mostrar el total de empleados creados
        System.out.println("\n=== TOTAL DE EMPLEADOS ===");
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
        
        // Probar otros escenarios
        System.out.println("\n=== PRUEBAS ADICIONALES ===");
        
        // Aplicar ambos tipos de aumento a un empleado
        System.out.println("Salario de " + empleado4.getNombre() + " antes de aumentos: $" + empleado4.getSalario());
        empleado4.actualizarSalario(15.0); // 15% de aumento
        empleado4.actualizarSalario(200);  // $200 de aumento adicional
        System.out.println("Salario después de ambos aumentos: $" + empleado4.getSalario());
        
        // Verificar que el contador estático funciona correctamente
        Empleado empleado5 = new Empleado("Pedro Sánchez", "Tester");
        System.out.println("\nNuevo empleado creado: " + empleado5.toString());
        System.out.println("Total de empleados actualizado: " + Empleado.mostrarTotalEmpleados());
        }
}