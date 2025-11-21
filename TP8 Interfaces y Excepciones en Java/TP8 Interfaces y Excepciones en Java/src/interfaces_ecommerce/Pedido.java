package interfaces_ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos;
    private String estado;
    private Notificable notificable;

    public Pedido(Notificable notificable) {
        this.productos = new ArrayList<>();
        this.estado = "PENDIENTE";
        this.notificable = notificable;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        notificable.notificar("Producto agregado: " + producto.getNombre());
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificable.notificar("Estado del pedido cambiado a: " + nuevoEstado);
    }

    @Override
    public double calcularTotal() {
        return productos.stream()
                .mapToDouble(Producto::calcularTotal)
                .sum();
    }

    // Getters
    public List<Producto> getProductos() { return productos; }
    public String getEstado() { return estado; }
}