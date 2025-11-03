
package TP6_Colecciones_Sistema_Stock;

public class Producto {
    
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;
    
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    public void mostrarInfo() {
        System.out.println("ID: " + id + "\nNombre: " + nombre + "\nPrecio: $" + precio + "\nCantidad: " + cantidad + "\nCategoría: " + categoria + " - " + categoria.getDescripcion() + "\n-----------------------------------");
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}