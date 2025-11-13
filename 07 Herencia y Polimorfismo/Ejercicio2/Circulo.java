
package Ejercicio2;

public class Circulo extends Figura{
    
    private double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }
    
    @Override
    public void calcularArea() {
        System.out.println("El area del circulo " + nombre + " es: " + (radio * 3.14));
    }
}