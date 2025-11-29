import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Conversor");
            System.out.println("2. Tabla de Verdad Simple");
            System.out.println("3. Contador de numeros primos");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            while (!sc.hasNextInt()) {
                System.out.print("Por favor ingresa un número válido: ");
                sc.next();
            }

            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("\n--- EJECUTANDO CONVERSOR ---\n");
                    Conversor.main(null); 
                    break;

                case 2:
                    System.out.println("\n--- EJECUTANDO TABLA DE VERDAD ---\n");
                    TablaVerdadSimple.main(null); 
                    break;
                case 3:
                    System.out.println("--EJECUTANDO CONTADOR DE PRIMOS--");
                    Contador.main(null);

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
