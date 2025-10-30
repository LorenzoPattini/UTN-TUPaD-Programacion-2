package Ejercicio04;

public class Cliente {
    private String nombreCliente;
    private String DNI;
    private TarjetaDeCredito tarjeta;
    
    public Cliente(String nombreCliente, String DNI) {
        this.nombreCliente = nombreCliente;
        this.DNI = DNI;
    }
    
    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
        if (tarjeta != null && tarjeta.getCliente() != this) {
            tarjeta.setCliente(this);
        }
    }
    
    // Getters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }
}