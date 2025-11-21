package interfaces_ecommerce;

public class PayPal implements PagoConDescuento {
    private String email;
    private double porcentajeDescuento;

    public PayPal(String email, double porcentajeDescuento) {
        this.email = email;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double aplicarDescuento(double monto) {
        double descuento = monto * (porcentajeDescuento / 100);
        System.out.println("Descuento aplicado: $" + descuento);
        return monto - descuento;
    }

    @Override
    public boolean procesarPago(double monto) {
        double montoConDescuento = aplicarDescuento(monto);
        
        System.out.println("Procesando pago con PayPal...");
        System.out.println("Email: " + email);
        System.out.println("Monto original: $" + monto);
        System.out.println("Monto con descuento: $" + montoConDescuento);
        
        // Simulación de procesamiento
        boolean exito = montoConDescuento > 0;
        if (exito) {
            System.out.println("Pago aprobado via PayPal");
        } else {
            System.out.println("Pago rechazado");
        }
        return exito;
    }
}