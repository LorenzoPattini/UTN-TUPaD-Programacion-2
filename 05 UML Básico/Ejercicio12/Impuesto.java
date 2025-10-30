package Ejercicio12;

public class Impuesto {
    
    private double monto;
    private Contribuyente contribuyente;
    
    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }
    
    public double calcularImpuestoTotal(double tasa) {
        return monto * tasa;
    }
    
    public double calcularImpuestoConRecargo(double tasa, double recargo) {
        double impuestoBase = calcularImpuestoTotal(tasa);
        return impuestoBase + (impuestoBase * recargo);
    }
    
    // Getters
    public double getMonto() {
        return monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }
    
    public void mostrarInformacion() {
        System.out.println("Impuesto de: " + contribuyente.getNombre() + "\nMonto base: " + monto);
    }
}