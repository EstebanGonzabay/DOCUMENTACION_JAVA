// Laboratorio 1 - E2: metodos reutilizables de lectura validada (solucion docente)
import java.util.Locale;
import java.util.Scanner;

public class Lab1_E2_Validaciones {

    static double leerRango(Scanner sc, String msg, double min, double max) {
        double x;
        do {
            System.out.print(msg + " [" + min + " - " + max + "]: ");
            x = sc.nextDouble();
            if (x < min || x > max) System.out.println("  Fuera de rango");
        } while (x < min || x > max);
        return x;
    }

    static double notaFinal(double p1, double p2, double p3) {
        return (p1 + p2 + p3) / 3;
    }

    static String estado(double nota) {
        if (nota >= 14) return "Aprobado";
        if (nota >= 9)  return "Supletorio";
        return "Reprobado";
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double p1 = leerRango(sc, "Parcial 1", 0, 20);
        double p2 = leerRango(sc, "Parcial 2", 0, 20);
        double p3 = leerRango(sc, "Parcial 3", 0, 20);
        double nf = notaFinal(p1, p2, p3);
        System.out.printf("Nota final: %.2f -> %s%n", nf, estado(nf));
    }
}
