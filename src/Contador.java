import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean repetirProceso = true;

        while (repetirProceso) {

            int contadorPrimos = 0;
            int sumaPrimos = 0;

            System.out.println("Ingrese un numero: ");
            int numero_pedido = sc.nextInt();

            for (int i = 1; i <= numero_pedido; i++) {
                System.out.println("Numero: " + i);

                if (esPrimo(i)) {
                    contadorPrimos++;
                    sumaPrimos += i;
                }
            }

            // REPORTE
            System.out.println("\n===== REPORTE FINAL =====");
            System.out.println("Total de numeros analizados: " + numero_pedido);
            System.out.println("Total de primos: " + contadorPrimos);
            System.out.println("Suma de números primos: " + sumaPrimos);
            porcentaje(contadorPrimos, numero_pedido);

            // PROMEDIO
            if (contadorPrimos > 0) {
                double promedio = (double) sumaPrimos / contadorPrimos;
                System.out.println("Promedio de números primos: " + promedio);
            } else {
                System.out.println("Promedio de números primos: N/A (no hay números primos)");
            }

            // MENU DE OPCIONES
            System.out.println("\n¿Qué desea hacer ahora?");
            System.out.println("1. Repetir el contador");
            System.out.println("2. Volver al menú principal");
            System.out.println("3. Salir");

            System.out.print("Ingrese opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    
                    break;

                case 2:
  
                    return;

                case 3:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);

                default:
                    System.out.println("Opción inválida, volviendo al menú del contador...");
                    break;
            }
        }

        sc.close();
    }

    public static void porcentaje(int contadorPrimos, int numero_pedido) {
        double porcentaje = (contadorPrimos * 100.0) / numero_pedido;
        System.out.println("Porcentaje de números que son primos: " + porcentaje + "%");
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
