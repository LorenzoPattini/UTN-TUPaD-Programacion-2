package Ejercicio08;

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;
    
    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(codigoHash, fecha, usuario);
    }
    
    public void mostrarDocumento() {
        System.out.println("Título: " + titulo + "\nContenido: " + contenido + "\nFirmado por: " + firmaDigital.getUsuario().getNombre() + "\nFecha de firma: " + firmaDigital.getFecha() + "\nFirma válida: " + firmaDigital.verificarFirma());
    }
    
    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }
}