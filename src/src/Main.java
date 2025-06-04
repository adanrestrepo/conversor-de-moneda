import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();
        int option = 0;

        System.out.println("""
                -------------------------------
                📌 Monedas disponibles para conversión 🤑
                "USD":Usa,
                "AED": United Arab Emirates,
                "AFN":Afghanistan,
                "ALL":Albania,
                "AMD": Armenia,
                "ANG": Curacao y Saint Maarten,
                "AOA":Angola,
                "ARS":Argentina,
                "AUD":Australia,
                "AWG":Aruba,
                "AZN":Azerbaijan,
                "BAM":Bosnia y Herzegovina,
                "BBD":Barbados,
                "BDT":Bangladesh,
                "BGN":Bulgaria,
                "BHD": Baréin,
                "BIF":Burundi,
                "BMD":Bermudas,
                "BND":Brunéi,
                "BOB":Bolivia,
                "BRL":Brazil,
                "BSD":Bahamas,
                "BTN":Bután,
                "BWP":Botswana,
                "BYN":Bielorrusia,
                "BZD":Belize,
                "CAD":Canadá,
                "CDF":República Democrática del Congo,
                "CHF":Suiza y Liechtenstein,
                "CLP":Chile,
                "CNY": China,
                "COP": Colombia,
                "CRC":Costa Rica,
                "CUP":Cuba,
                "CVE":Cabo Verde,
                "PAB":Panamá,
                "PEN":Perú,
                "PGK":Papúa Nueva Guinea,
                """);

        do {
            System.out.println("-------------------------------");
            System.out.println("Selecciona una opción:");
            System.out.println("1. Convertir moneda");
            System.out.println("9. Salir");

            try {
                System.out.print("Opción: ");
                option = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer después de `nextInt()`

                switch (option) {
                    case 1:
                        ConvertirMoneda.convertirMoneda(consulta, scanner);
                        break;
                    case 9:
                        System.out.println("Gracias por utilizar ExchangeRateAPI 👍");
                        break;
                    default:
                        System.out.println("❌ Opción inválida. Inténtalo nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Error: Ingresa un número válido para la opción del menú.");
                scanner.nextLine(); // Limpiar buffer en caso de error
            }
        } while (option != 9);

        scanner.close();
    }
}

