
package TP6_Colecciones_Sistema_Stock;

public class Principal {
    
    public static void main(String[] args) {
        
        Inventario inventario = new Inventario();
        
        System.out.println("=== CREANDO PRODUCTOS ===");
        Producto p1 = new Producto("P001", "Arroz", 2.50, 100, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Smartphone", 1500.00, 25, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Camiseta", 25.99, 50, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Silla", 89.99, 30, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Laptop", 2500.00, 15, CategoriaProducto.ELECTRONICA);
        Producto p6 = new Producto("P006", "Pantalón", 45.50, 40, CategoriaProducto.ROPA);
        
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        inventario.agregarProducto(p6);
        
        System.out.println("\n=== LISTANDO TODOS LOS PRODUCTOS ===");
        inventario.listarProductos();
        
        System.out.println("\n=== BUSCANDO PRODUCTO POR ID ===");
        Producto productoEncontrado = inventario.buscarProductoPorId("P003");
        if (productoEncontrado != null) {
            System.out.println("Producto encontrado:");
            productoEncontrado.mostrarInfo();
        }
        
        System.out.println("\n=== FILTRANDO POR ELECTRÓNICA ===");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        
        System.out.println("\n=== ELIMINANDO PRODUCTO P004 ===");
        inventario.eliminarProducto("P004");
        System.out.println("Productos restantes:");
        inventario.listarProductos();
        
        System.out.println("\n=== ACTUALIZANDO STOCK ===");
        inventario.actualizarStock("P001", 150);
        
        System.out.println("\n=== TOTAL DE STOCK DISPONIBLE ===");
        int totalStock = inventario.obtenerTotalStock();
        System.out.println("Total de stock: " + totalStock + " unidades");
        
        System.out.println("\n=== PRODUCTO CON MAYOR STOCK ===");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.println("Producto con mayor stock:");
            mayorStock.mostrarInfo();
        }
        
        System.out.println("\n=== PRODUCTOS ENTRE $1000 Y $3000 ===");
        inventario.filtrarProductosPorPrecio(1000, 3000);
        
        System.out.println("\n=== CATEGORÍAS DISPONIBLES ===");
        inventario.mostrarCategoriasDisponibles();
    }
}