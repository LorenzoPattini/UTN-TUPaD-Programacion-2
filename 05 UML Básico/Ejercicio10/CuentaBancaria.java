package Ejercicio10;

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad;
    private Titular titular;
    
    public CuentaBancaria(String cbu, double saldoInicial, String clave, String fechaCreacion) {
        this.cbu = cbu;
        this.saldo = saldoInicial;
        this.claveSeguridad = new ClaveSeguridad(clave, fechaCreacion);
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuenta() != this) {
            titular.setCuenta(this);
        }
    }
    
    public boolean retirar(double monto, String clave) {
        if (claveSeguridad.validarClave(clave) && monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }
    
    public void depositar(double monto) {
        saldo += monto;
    }
    
    public void mostrarInformacion() {
        System.out.println("CBU: " + cbu + "\nSaldo: $" + saldo + "\nTitular: " + titular.getNombre() + "\nÚltima modificación de clave: " + claveSeguridad.getUltimaModificacion());
    }
    
    // Getters
    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    public Titular getTitular() {
        return titular;
    }
}