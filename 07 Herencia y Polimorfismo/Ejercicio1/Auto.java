package Ejercicio1;


public class Auto extends Vehiculos{
    private int cantidadDePuertas;

    public Auto(int cantidadDePuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadDePuertas = cantidadDePuertas;
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("Modelo: " + this.modelo + ". Marca: " + this.marca + ". Cantidad de puertas: " + cantidadDePuertas);
    }
}