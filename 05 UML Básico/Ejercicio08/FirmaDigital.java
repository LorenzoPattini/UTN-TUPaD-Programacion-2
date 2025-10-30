package Ejercicio08;

public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario;
    
    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }
    
    public boolean verificarFirma() {
        return codigoHash != null && !codigoHash.isEmpty();
    }
    
    // Getters
    public String getCodigoHash() {
        return codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}