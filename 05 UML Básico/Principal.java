import Ejercicio12.Calculadora;
public class Principal {
    
    public static void main(String[] args) {
        
        // Ejercicio 1: Pasaporte - Foto - Titular
        
        System.out.println("=== EJERCICIO 1: Pasaporte - Foto - Titular ===");
        Ejercicio01.Titular titular = new Ejercicio01.Titular("Juan Perez", "12345678");
        Ejercicio01.Pasaporte pasaporte = new Ejercicio01.Pasaporte("A123456", "2024-01-15", "foto.jpg", "JPEG");
        
        System.out.println("Titular: " + titular.getNombre() + "\nPasaporte: " +  pasaporte.getNumero() + "\nFecha Emisi�n: " + pasaporte.getFechaEmision() + "\nFoto: " + pasaporte.getFoto().getImagen());
        
        
        // Ejercicio 2: Celular - Bater�a - Usuario
        
        System.out.println("\n=== EJERCICIO 2: Celular - Bater�a - Usuario ===");
        Ejercicio02.Bateria bateria = new Ejercicio02.Bateria("Li-ion", "4000mAh");
        Ejercicio02.Usuario usuario = new Ejercicio02.Usuario("Mar�a Garc�a", "87654321");
        Ejercicio02.Celular celular = new Ejercicio02.Celular("123456789012345", "Samsung", "Galaxy S21", bateria);
        usuario.setCelular(celular);
        
        System.out.println("Usuario: " + usuario.getNombre() + "\nCelular: " + celular.getMarca() + " " + celular.getModelo() + "\nBater�a: " + bateria.getModelo() + " - " + bateria.getCapacidad());
        
        // Ejercicio 3: Libro - Autor - Editorial
        
        System.out.println("\n=== EJERCICIO 3: Libro - Autor - Editorial ===");
        Ejercicio03.Autor autor = new Ejercicio03.Autor("Gabriel Garc�a M�rquez", "Colombiana");
        Ejercicio03.Editorial editorial = new Ejercicio03.Editorial("Sudamericana", "Av. Corrientes 1234");
        Ejercicio03.Libro libro = new Ejercicio03.Libro("Cien a�os de soledad", "978-8437604947", autor, editorial);
        
        libro.mostrarInformacion();
        
        // Ejercicio 4: TarjetaDeCr�dito - Cliente - Banco
        
        System.out.println("\n=== EJERCICIO 4: TarjetaDeCr�dito - Cliente - Banco ===");
        Ejercicio04.Banco banco = new Ejercicio04.Banco("Banco Naci�n", "30-12345678-9");
        Ejercicio04.Cliente cliente = new Ejercicio04.Cliente("Carlos L�pez", "30123456");
        Ejercicio04.TarjetaDeCredito tarjeta = new Ejercicio04.TarjetaDeCredito("1234-5678-9012-3456", "12/25", banco);
        cliente.setTarjeta(tarjeta);
        
        tarjeta.mostrarInformacion();
        
        // Ejercicio 5: Computadora - PlacaMadre - Propietario
        
        System.out.println("\n=== EJERCICIO 5: Computadora - PlacaMadre - Propietario ===");
        Ejercicio05.Propietario propietario = new Ejercicio05.Propietario("Ana Torres", "34123456");
        Ejercicio05.Computadora compu = new Ejercicio05.Computadora("Dell", "SN123456", "ASUS B450", "AMD B450");
        propietario.setComputadora(compu);
        
        compu.mostrarEspecificaciones();
        
        // Ejercicio 6: Reserva - Cliente - Mesa
        
        System.out.println("\n=== EJERCICIO 6: Reserva - Cliente - Mesa ===");
        Ejercicio06.Cliente clienteResto = new Ejercicio06.Cliente("Mar�a Gonzalez", "1156781234");
        Ejercicio06.Mesa mesa = new Ejercicio06.Mesa(5, 4);
        Ejercicio06.Reserva reserva = new Ejercicio06.Reserva("2024-06-15", "20:30", clienteResto, mesa);
        
        reserva.mostrarReserva();
        
        // Ejercicio 7: Veh�culo - Motor - Conductor
        
        System.out.println("\n=== EJERCICIO 7: Veh�culo - Motor - Conductor ===");
        Ejercicio07.Motor motor = new Ejercicio07.Motor("V6", "MTR123456");
        Ejercicio07.Conductor conductor = new Ejercicio07.Conductor("Roberto D�az", "B12345678");
        Ejercicio07.Vehiculo auto = new Ejercicio07.Vehiculo("ABC123", "Toyota Corolla", motor);
        conductor.setVehiculo(auto);
        
        auto.mostrarInformacion();
        
        // Ejercicio 8: Documento - FirmaDigital - Usuario
        
        System.out.println("\n=== EJERCICIO 8: Documento - FirmaDigital - Usuario ===");
        Ejercicio08.Usuario usuarioFirma = new Ejercicio08.Usuario("Dr. Juan Perez", "juan.perez@hospital.com");
        Ejercicio08.Documento documento = new Ejercicio08.Documento("Informe M�dico", 
                                          "Paciente en buen estado de salud...",
                                          "a1b2c3d4e5f6", "2024-06-10", usuarioFirma);
        
        documento.mostrarDocumento();
        
        // Ejercicio 9: CitaM�dica - Paciente - Profesional
        
        System.out.println("\n=== EJERCICIO 9: CitaM�dica - Paciente - Profesional ===");
        Ejercicio09.Paciente paciente = new Ejercicio09.Paciente("Laura Martinez", "OSDE");
        Ejercicio09.Profesional medico = new Ejercicio09.Profesional("Dra. Silvia Ruiz", "Cardiolog�a");
        Ejercicio09.CitaMedica cita = new Ejercicio09.CitaMedica("2024-06-20", "10:00", paciente, medico);
        
        cita.mostrarCita();
        
        // Ejercicio 10: CuentaBancaria - ClaveSeguridad - Titular
        
        System.out.println("\n=== EJERCICIO 10: CuentaBancaria - ClaveSeguridad - Titular ===");
        Ejercicio10.Titular titularCuenta = new Ejercicio10.Titular("Pedro S�nchez", "35123456");
        Ejercicio10.CuentaBancaria cuenta = new Ejercicio10.CuentaBancaria("1234567890123456789012", 50000.0, "1234", "2024-01-15");
        titularCuenta.setCuenta(cuenta);
        
        cuenta.mostrarInformacion();
        
        boolean retiroExitoso = cuenta.retirar(1000, "1234");
        System.out.println("Retiro exitoso: " + retiroExitoso);
        System.out.println("Nuevo saldo: $" + cuenta.getSaldo());
        
        // Ejercicio 11: Reproductor - Canci�n - Artista
        
        System.out.println("\n=== EJERCICIO 11: Reproductor - Canci�n - Artista (Dependencia de Uso) ===");
        Ejercicio11.Artista artista = new Ejercicio11.Artista("Coldplay", "Rock");
        Ejercicio11.Cancion cancion = new Ejercicio11.Cancion("Yellow", artista);
        Ejercicio11.Reproductor reproductor = new Ejercicio11.Reproductor();
        
        reproductor.reproducir(cancion);
        
        // Ejercicio 12: Impuesto - Contribuyente - Calculadora
        
        System.out.println("\n=== EJERCICIO 12: Impuesto - Contribuyente - Calculadora (Dependencia de Uso) ===");
        Ejercicio12.Contribuyente contribuyente = new Ejercicio12.Contribuyente("Empresa XYZ S.A.", "30-12345678-9");
        Ejercicio12.Impuesto impuesto = new Ejercicio12.Impuesto(100000.0, contribuyente);
        Ejercicio12.Calculadora calculadora = new Ejercicio12.Calculadora();
        calculadora.calcular(impuesto);
        
        // Ejercicio 13: GeneradorQR - Usuario - C�digoQR
        
        System.out.println("\n=== EJERCICIO 13: GeneradorQR - Usuario - C�digoQR (Dependencia de Creaci�n) ===");
        Ejercicio13.Usuario usuarioQR = new Ejercicio13.Usuario("Carlos Rodr�guez", "carlos@empresa.com");
        Ejercicio13.GeneradorQR generador = new Ejercicio13.GeneradorQR();
        
        generador.generar("'https://www.ejemplo.com/perfil/carlos'", usuarioQR);
        
        System.out.println("\n=== TODOS LOS EJERCICIOS COMPLETADOS ===");
    }
}