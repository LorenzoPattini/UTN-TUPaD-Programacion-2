package Ejercicio12;

public class Calculadora {
    
    public void calcular(Impuesto impuesto) {
        System.out.println("\n=== CÁLCULO DE IMPUESTO ===");
        impuesto.mostrarInformacion();
        
        double tasaBasica = 0.21;
        double tasaReducida = 0.105;
        double recargo = 0.05;
        
        double impuestoBasico = impuesto.calcularImpuestoTotal(tasaBasica);
        double impuestoReducido = impuesto.calcularImpuestoTotal(tasaReducida);
        double impuestoConRecargo = impuesto.calcularImpuestoConRecargo(tasaBasica, recargo);
        
        System.out.println("\nRESULTADOS:" + "\nImpuesto basico: " + impuestoBasico +"\nImpuesto reducido: " + impuestoReducido + "\nImpuesto con recargo: " + impuestoConRecargo + "\nTotal a pagar (base + impuesto básico): " + impuesto.getMonto() + impuestoBasico);
        
    }
}