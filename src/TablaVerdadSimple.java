import java.util.Scanner;

public class TablaVerdadSimple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int continuar;

        do {
            System.out.println("Introduce el operador entre p y q (AND, OR, XOR, ->, <->): ");
            String op1 = sc.nextLine().toUpperCase();

            System.out.println("Introduce el operador entre (p " + op1 + " q) y r (AND, OR, XOR, ->, <->): ");
            String op2 = sc.nextLine().toUpperCase();

            System.out.println("\nTabla de verdad para la expresión: (p " + op1 + " q) " + op2 + " r");
            System.out.println("p\tq\tr\t(p " + op1 + " q)\tResultado");

            boolean[] valores = {true, false};
            for (boolean p : valores) {
                for (boolean q : valores) {
                    for (boolean r : valores) {
                        boolean resultadoPQ = aplicarOperador(p, q, op1);
                        boolean resultadoFinal = aplicarOperador(resultadoPQ, r, op2);

                        System.out.println(p + "\t" + q + "\t" + r + "\t" + resultadoPQ + "\t\t" + resultadoFinal);
                    }
                }
            }

            // Preguntar si desea repetir
            System.out.println("\n¿Deseas hacer otra tabla de verdad?");
            System.out.println("1. Sí");
            System.out.println("0. Volver al menú principal");
            System.out.print("Elige: ");
            
            while (!sc.hasNextInt()) {
                System.out.print("Ingresa 0 o 1: ");
                sc.next();
            }
            continuar = sc.nextInt();
            sc.nextLine(); // limpiar buffer

        } while (continuar == 1);

        System.out.println("Volviendo al menú principal...");
        // No cerramos el Scanner si lo usamos desde MenuPrincipal
    }

    public static boolean aplicarOperador(boolean a, boolean b, String op) {
        switch (op) {
            case "AND":
                return a && b;
            case "OR":
                return a || b;
            case "XOR":
                return a ^ b;
            case "->": 
                return !a || b;
            case "<->": 
                return a == b;
            default:
                System.out.println("Operador inválido. Se usará AND por defecto.");
                return a && b;
        }
    }
}
