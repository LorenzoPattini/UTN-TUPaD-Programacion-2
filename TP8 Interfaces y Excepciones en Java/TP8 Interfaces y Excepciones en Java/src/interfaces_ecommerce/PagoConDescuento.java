
package interfaces_ecommerce;

public interface PagoConDescuento extends Pago {
    double aplicarDescuento(double monto);
}