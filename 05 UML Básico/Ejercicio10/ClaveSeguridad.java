package Ejercicio10;

public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;
    
    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }
    
    public boolean validarClave(String claveIngresada) {
        return this.codigo.equals(claveIngresada);
    }
    
    public void cambiarClave(String nuevaClave, String fecha) {
        this.codigo = nuevaClave;
        this.ultimaModificacion = fecha;
    }
    
    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }
}