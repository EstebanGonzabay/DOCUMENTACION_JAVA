// Examen U2 - P6: lluvias diarias de un mes con metodos (solucion docente)
import java.util.Locale;
import java.util.Scanner;

public class Examen_U2_P6_Lluvias {

    static double total(double[] v) { double s = 0; for (double x : v) s += x; return s; }

    static int diasSinLluvia(double[] v) { int c = 0; for (double x : v) if (x == 0) c++; return c; }

    static int diaMaximo(double[] v) {
        int p = 0;
        for (int i = 1; i < v.length; i++) if (v[i] > v[p]) p = i;
        return p + 1;                                   // numero de dia (1..n)
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n;
        do { System.out.print("Dias del mes (28-31): "); n = sc.nextInt(); } while (n < 28 || n > 31);
        double[] mm = new double[n];
        for (int i = 0; i < n; i++) {
            do { System.out.print("Dia " + (i + 1) + " (mm): "); mm[i] = sc.nextDouble(); } while (mm[i] < 0);
        }
        System.out.printf("Total: %.1f mm  Promedio: %.2f mm%n", total(mm), total(mm) / n);
        System.out.println("Dias sin lluvia: " + diasSinLluvia(mm));
        System.out.println("Dia mas lluvioso: " + diaMaximo(mm));
    }
}
