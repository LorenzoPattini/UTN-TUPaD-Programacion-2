package Ejercicio04;

public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Banco banco;
    private Cliente cliente;
    
    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjeta() != this) {
            cliente.setTarjeta(this);
        }
    }
    
    public void mostrarInformacion() {
        System.out.println("Tarjeta: " + numero + "\nVencimiento: " + fechaVencimiento + "\nBanco: " + banco.getNombreBanco());
        if (cliente != null) {
            System.out.println("Cliente: " + cliente.getNombreCliente());
        }
}
    
     // Getters
    public String getNumero() {
        return numero;
    }

    public String getFecha() {
        return fechaVencimiento;
    }

    public Banco getBanco() {
        return banco;
    }

    public Cliente getCliente() {
        return cliente;
    }
}