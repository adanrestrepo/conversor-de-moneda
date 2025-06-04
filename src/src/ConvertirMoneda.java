import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class ConvertirMoneda {

    public static void convertir(String from, String to, ConsultarMoneda consulta, Scanner scanner) {
        double cantidad;
        double cantidadConvertida;

        try {
            Moneda moneda;
            moneda = consulta.buscarMoneda(from, to);
            if (moneda == null) {
                System.out.println("Error: No se pudo encontrar información para la conversión de " + from + " a " + to + ".");
                return;
            }

            System.out.println("Ingrese la cantidad de " + from + ": ");
            try {
                cantidad = scanner.nextDouble();
                if (cantidad <= 0) {
                    System.out.println("---Error: La cantidad debe ser mayor que cero---❌");
                    return;
                }
            } catch (InputMismatchException e) {
                System.out.println("---Error: La cantidad ingresada no es un número válido---❌");
                scanner.nextLine(); // Limpiar el buffer
                return;
            }

            cantidadConvertida = cantidad * moneda.conversionRate();
            System.out.println("\n📈 La tasa de conversión de hoy para " + to + ":");
            System.out.println(" 1 " + from + " = " + moneda.conversionRate());
            System.out.println(cantidad + " " + from + " = " + cantidadConvertida + " " + to);

        } catch (RuntimeException e) {
            System.out.println("❌ Error: Ocurrió un problema al obtener la información de la moneda.");
            System.out.println("Detalles: Asegúrese de ingresar un código de moneda válido.");
        }
    }

    public static void convertirMoneda(ConsultarMoneda consulta, Scanner scanner) {
        String from, to;

        do {
            System.out.println("Ingrese el código de la moneda a convertir (ej: USD):");
            from = scanner.nextLine().toUpperCase();
            if (from.isEmpty()) {
                System.out.println("---Error: El código de la moneda no puede estar vacío!---❌");
            }
        } while (from.isEmpty());

        do {
            System.out.println("Ingrese la moneda destino (ej: EUR):");
            to = scanner.nextLine().toUpperCase();
            if (to.isEmpty()) {
                System.out.println("---Error: El código de la moneda destino no puede estar vacío!---❌");
            }
        } while (to.isEmpty());

        convertir(from, to, consulta, scanner);
    }
}

