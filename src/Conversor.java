import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {

           Scanner sc = new Scanner(System.in);

        int eleccion;
        do {

            System.out.println("\n=== CONVERSOR ===");
            System.out.println("0. Longitud");
            System.out.println("1. Masa");
            System.out.println("2. Tiempo");
            System.out.println("3. Velocidad");
            System.out.println("4. Temperatura");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            eleccion = sc.nextInt();
            sc.nextLine(); 

            switch (eleccion) {

                case 0:
                    repetirConversion(sc, "longitud");
                    break;

                case 1:
                    repetirConversion(sc, "masa");
                    break;

                case 2:
                    repetirConversion(sc, "tiempo");
                    break;

                case 3:
                    repetirConversion(sc, "velocidad");
                    break;

                case 4:
                    repetirConversion(sc, "temperatura");
                    break;

                case 5:
                    System.out.println("Volviendo al menú principal...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (eleccion != 5);
    }

    // =============================================
    // ================================
    public static void repetirConversion(Scanner sc, String tipo) {
        int continuar;

        do {
            switch (tipo) {
                case "longitud":
                    convertirLongitud(sc);
                    break;
                case "masa":
                    convertirMasa(sc);
                    break;
                case "tiempo":
                    convertirTiempo(sc);
                    break;
                case "velocidad":
                    convertirVelocidad(sc);
                    break;
                case "temperatura":
                    convertirTemperatura(sc);
                    break;
            }

            System.out.println("\n¿Deseas hacer otra conversión de " + tipo + "?");
            System.out.println("1. Sí");
            System.out.println("0. Volver al menú del conversor");
            System.out.print("Elige: ");

            continuar = sc.nextInt();
            sc.nextLine();

        } while (continuar == 1);
    

    }

    public static void convertirLongitud(Scanner sc) {

        String[] unidades = { "Metro (m)", "Kilómetro (km)", "Centímetro (cm)", "Milímetro (mm)", "Milla (mi)" };

        double[] factor = { 1.0, 1000.0, 0.01, 0.001, 1609.34 };

        System.out.println("\n=== CONVERSOR DE LONGITUD ===");

        System.out.println("Unidades disponibles:");
        for (int i = 0; i < unidades.length; i++) {
            System.out.println(i + ". " + unidades[i]);
        }

        System.out.print("\nElige la unidad de origen: ");
        int origen = sc.nextInt();

        System.out.print("Elige la unidad de destino: ");
        int destino = sc.nextInt();

        System.out.print("Ingresa el valor: ");
        double valor = sc.nextDouble();

        double resultado = valor * factor[origen] / factor[destino];

        System.out.println("\n" + valor + " " + unidades[origen] +
                " equivalen a " + resultado + " " + unidades[destino]);
    }

    // this humble thing here is nasa
    public static void convertirMasa(Scanner sc) {
        String[] unidades = { "Toneladas (T)", "Kilogramso (Kg)", "Gramos (g)", "Miligramo (Mg)", "Libra (Lb)" };
        double[] factor = { 1000.0, 1.0, 0.001, 0.000001, 0.453592 };
        System.out.println("Unidades disponibles:");

        for (int i = 0; i < unidades.length; i++) {
            System.out.println(i + ". " + unidades[i]);
        }

        System.out.print("\nElige la unidad de origen: ");
        int origen = sc.nextInt();

        System.out.print("Elige la unidad de destino: ");
        int destino = sc.nextInt();

        System.out.print("Ingresa el valor: ");
        double valor = sc.nextDouble();

        double resultado = valor * factor[origen] / factor[destino];

        System.out.println("\n" + valor + " " + unidades[origen] +
                " equivalen a " + resultado + " " + unidades[destino]);
    }

    public static void convertirTiempo(Scanner sc) {

        String[] unidades = {
                "Segundo (s)",
                "Minuto (min)",
                "Hora (h)",
                "Día (d)",
                "Milisegundo (ms)"
        };

        double[] factor = {
                1.0, 60.0, 3600.0, 86400.0, 0.001 };

        System.out.println("\n=== CONVERSOR DE TIEMPO ===");
        for (int i = 0; i < unidades.length; i++) {
            System.out.println(i + ". " + unidades[i]);
        }

        System.out.print("\nElige la unidad de origen: ");
        int origen = sc.nextInt();

        System.out.print("Elige la unidad de destino: ");
        int destino = sc.nextInt();

        System.out.print("Ingresa el valor: ");
        double valor = sc.nextDouble();

        double resultado = valor * factor[origen] / factor[destino];

        System.out.println("\n" + valor + " " + unidades[origen] +
                " equivalen a " + resultado + " " + unidades[destino]);
    }

    public static void convertirVelocidad(Scanner sc) {

        String[] unidades = {
                "Metros/seg (m/s)",
                "Kilómetros/h (km/h)",
                "Millas/h (mph)",
                "Nudos (kn)",
                "Pies/seg (ft/s)"
        };

        double[] factor = {
                1.0, 0.277778, 0.44704, 0.514444, 0.3048
        };

        System.out.println("\n=== CONVERSOR DE VELOCIDAD ===");
        for (int i = 0; i < unidades.length; i++) {
            System.out.println(i + ". " + unidades[i]);
        }

        System.out.print("\nElige la unidad de origen: ");
        int origen = sc.nextInt();

        System.out.print("Elige la unidad de destino: ");
        int destino = sc.nextInt();

        System.out.print("Ingresa el valor: ");
        double valor = sc.nextDouble();

        double resultado = valor * factor[origen] / factor[destino];

        System.out.println("\n" + valor + " " + unidades[origen] +
                " equivalen a " + resultado + " " + unidades[destino]);
    }

   public static void convertirTemperatura(Scanner sc) {

    String[] unidades = {
        "Celsius (°C)",
        "Fahrenheit (°F)",
        "Kelvin (K)",
        "Rankine (°R)",
        "Reaumur (°Re)"
    };

    System.out.println("\n=== CONVERSOR DE TEMPERATURA ===");
    for (int i = 0; i < unidades.length; i++) {
        System.out.println(i + ". " + unidades[i]);
    }

    System.out.print("\nElige la unidad de origen: ");
    int origen = sc.nextInt();

    System.out.print("Elige la unidad de destino: ");
    int destino = sc.nextInt();

    System.out.print("Ingresa el valor: ");
    double valor = sc.nextDouble();


    double celsius;

    switch (origen) {
        case 0: celsius = valor; break;                             
        case 1: celsius = (valor - 32) * 5/9; break;                  
        case 2: celsius = valor - 273.15; break;                      
        case 3: celsius = (valor - 491.67) * 5/9; break;              
        case 4: celsius = valor * 1.25; break;                        
        default: System.out.println("Opción inválida."); return;
    }

    double resultado = 0;
    switch (destino) {
        case 0: resultado = celsius; break;                          
        case 1: resultado = celsius * 9/5 + 32; break;               
        case 2: resultado = celsius + 273.15; break;                
        case 3: resultado = (celsius + 273.15) * 9/5; break;         
        case 4: resultado = celsius * 0.8; break;                     
        default: System.out.println("Opción inválida."); return;
    }

    System.out.println("\n" + valor + " " + unidades[origen] +
                       " equivalen a " + resultado + " " + unidades[destino]);
}

}
