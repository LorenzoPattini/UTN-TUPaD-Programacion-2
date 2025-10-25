package tp3.introduccion.a.la.poo;

public class NaveEspacial {

    private String nombre;
    private double combustible;
    private final double COMBUSTIBLE_MAXIMO = 100.0;
    
    public NaveEspacial (String nombre, double combustible) {
        this.nombre = nombre;
        setCombustible(combustible);
    }
    
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para despegar");
        }
    }
    
    public void avanzar(double distancia) {
        double combustibleNecesario = distancia * 0.5;
        
        if (combustible >= combustibleNecesario) {
            combustible -= combustibleNecesario;
            System.out.println(nombre + " avanzo " + distancia + " unidades. Combustible restante: " + combustible);
        } else {
            System.out.println("Combustible insuficiente para avanzar " + distancia + " unidades");
        }
    }
    
    public void recargarCombustible(double cantidad) {
        double nuevoCombustible = combustible + cantidad;
        
        if (nuevoCombustible <= COMBUSTIBLE_MAXIMO) {
            combustible = nuevoCombustible;
            System.out.println("Combustible recargado. Total: " + combustible);
        } else {
            combustible = COMBUSTIBLE_MAXIMO;
            System.out.println("Combustible máximo alcanzado: " + COMBUSTIBLE_MAXIMO);
        }
    }
    
    public void mostrarEstado() {
        System.out.println("=== Estado de " + nombre + " ===");
        System.out.println("Combustible actual: " + combustible + "/" + COMBUSTIBLE_MAXIMO);
    }
    
    public String getNombre() { return nombre; }
    public double getCombustible() { return combustible; }
    
    private void setCombustible(double combustible) {
        if (combustible >= 0 && combustible <= COMBUSTIBLE_MAXIMO) {
            this.combustible = combustible;
        } else if (combustible > COMBUSTIBLE_MAXIMO) {
            this.combustible = COMBUSTIBLE_MAXIMO;
        }
    }
}