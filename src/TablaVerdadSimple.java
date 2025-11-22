import java.util.Scanner;

public class TablaVerdadSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
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

        sc.close();
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
                System.out.println("Operador inválido. Se usará AND por defecto, de malas.");
                return a && b;
        }
    }
}
