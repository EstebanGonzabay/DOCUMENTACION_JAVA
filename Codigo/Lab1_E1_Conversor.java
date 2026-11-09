// Laboratorio 1 - E1: conversor de unidades con metodos (solucion docente)
import java.util.Locale;
import java.util.Scanner;

public class Lab1_E1_Conversor {

    static double celsiusAFahrenheit(double c) { return c * 9 / 5 + 32; }
    static double kmAMillas(double km)          { return km * 0.621371; }
    static double kgALibras(double kg)          { return kg * 2.20462; }

    static void mostrarMenu() {
        System.out.println("\n1) C -> F   2) km -> mi   3) kg -> lb   0) Salir");
        System.out.print("Opcion: ");
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            mostrarMenu();
            op = sc.nextInt();
            switch (op) {
                case 1 -> { System.out.print("Celsius: ");  System.out.printf("= %.2f F%n", celsiusAFahrenheit(sc.nextDouble())); }
                case 2 -> { System.out.print("Km: ");       System.out.printf("= %.2f mi%n", kmAMillas(sc.nextDouble())); }
                case 3 -> { System.out.print("Kg: ");       System.out.printf("= %.2f lb%n", kgALibras(sc.nextDouble())); }
                case 0 -> System.out.println("Fin del programa");
                default -> System.out.println("Opcion no valida");
            }
        } while (op != 0);
    }
}
