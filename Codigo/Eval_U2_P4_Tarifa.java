// Evaluacion de modularidad - P4: tarifa de parqueadero con metodos (solucion docente)
import java.util.Locale;
import java.util.Scanner;

public class Eval_U2_P4_Tarifa {

    static int leerMinutos(Scanner sc) {
        int m;
        do {
            System.out.print("Minutos estacionado (1-1440): ");
            m = sc.nextInt();
        } while (m < 1 || m > 1440);
        return m;
    }

    static int horasCobradas(int minutos) {
        return (minutos + 59) / 60;             // fraccion de hora se cobra completa
    }

    static double tarifa(int horas, char tipo) {
        double precio = (tipo == 'M') ? 0.50 : 1.00;   // M = moto, A = auto
        double total = horas * precio;
        if (horas > 8) total = total * 0.80;            // 20 % de descuento
        return total;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int min = leerMinutos(sc);
        System.out.print("Tipo (A/M): ");
        char tipo = Character.toUpperCase(sc.next().charAt(0));
        int h = horasCobradas(min);
        System.out.printf("Horas: %d  Total: $%.2f%n", h, tarifa(h, tipo));
    }
}
