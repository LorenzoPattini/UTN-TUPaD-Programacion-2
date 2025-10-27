package tp4.poo;

public class Empleado {
    // Atributos con encapsulamiento
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    
    // Constructor que recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; // Incrementa el contador est�tico
    }
    
    // Constructor que recibe solo nombre y puesto
    public Empleado(String nombre, String puesto) {
        this.id = totalEmpleados + 1; // ID autom�tico basado en el contador
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000.0; // Salario por defecto
        totalEmpleados++; // Incrementa el contador est�tico
    }
    
    // M�todos sobrecargados para actualizar salario
    
    // Versi�n 1: Recibe porcentaje de aumento
    public void actualizarSalario(double porcentaje) {
        double aumento = this.salario * (porcentaje / 100);
        this.salario += aumento;
    }
    
    // Versi�n 2: Recibe cantidad fija a aumentar
    public void actualizarSalario(int cantidadFija) {
        this.salario += cantidadFija;
    }
    
    // M�todo toString() para representaci�n legible

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    
    // M�todo est�tico para mostrar total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    // Getters y Setters (encapsulamiento)
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getPuesto() {
        return puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public static int getTotalEmpleados() {
        return totalEmpleados;
    }
}