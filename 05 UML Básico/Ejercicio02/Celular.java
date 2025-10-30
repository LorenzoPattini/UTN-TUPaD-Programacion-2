package Ejercicio02;

public class Celular {
    
    private String imei;
    private String marca;
    private String modeloCelular;
    private Bateria bateria;
    private Usuario usuario;
    
    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modeloCelular = modelo;
        this.bateria = bateria; // Agregación
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
}

    // Getters
    public String getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modeloCelular;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}