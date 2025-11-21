package interfaces_ecommerce;

public class TarjetaCredito implements Pago {
    private String numeroTarjeta;
    private String titular;

    public TarjetaCredito(String numeroTarjeta, String titular) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
    }

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago con Tarjeta de Credito...");
        System.out.println("Titular: " + titular);
        System.out.println("Monto: $" + monto);
        
        // Simulación de procesamiento
        boolean exito = monto > 0;
        if (exito) {
            System.out.println("Pago aprobado");
        } else {
            System.out.println("Pago rechazado");
        }
        return exito;
    }
}