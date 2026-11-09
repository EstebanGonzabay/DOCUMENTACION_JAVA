// Laboratorio 2 - E1: registro de notas en un vector (solucion docente)
import java.util.Locale;
import java.util.Scanner;

public class Lab2_E1_RegistroNotas {

    static void cargar(Scanner sc, double[] v) {
        for (int i = 0; i < v.length; i++) {
            do {
                System.out.print("Nota " + (i + 1) + ": ");
                v[i] = sc.nextDouble();
            } while (v[i] < 0 || v[i] > 20);
        }
    }

    static double promedio(double[] v) {
        double s = 0;
        for (double x : v) s += x;
        return s / v.length;
    }

    static int posMayor(double[] v) {
        int p = 0;
        for (int i = 1; i < v.length; i++) if (v[i] > v[p]) p = i;
        return p;
    }

    static int contarAprobados(double[] v, double minimo) {
        int c = 0;
        for (double x : v) if (x >= minimo) c++;
        return c;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero de estudiantes: ");
        double[] notas = new double[sc.nextInt()];
        cargar(sc, notas);
        int p = posMayor(notas);
        System.out.printf("Promedio: %.2f%n", promedio(notas));
        System.out.printf("Mejor nota: %.2f (estudiante %d)%n", notas[p], p + 1);
        System.out.println("Aprobados (>= 14): " + contarAprobados(notas, 14));
    }
}
