package Ejercicio1;


public class Vehiculos {
    
    protected String marca;
    protected String modelo;

    public Vehiculos(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void mostrarInfo() {
        System.out.println("Modelo: " + modelo + ". Marca: " + marca);
    }
    
}