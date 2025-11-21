package excepciones;

public class ValidadorEdad {
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0) {
            throw new EdadInvalidaException("La edad no puede ser negativa: " + edad);
        }
        if (edad > 120) {
            throw new EdadInvalidaException("La edad no puede ser mayor a 120 anios: " + edad);
        }
        System.out.println("Edad valida: " + edad + " anios");
    }
}