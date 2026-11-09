// Metodos con retorno: calculan y devuelven un valor
import java.util.Locale;

public class E17_MetodosRetorno {

    static double areaTriangulo(double base, double altura) {
        return base * altura / 2;
    }

    static boolean esPar(int n) {
        return n % 2 == 0;
    }

    static int mayor(int a, int b, int c) {
        int m = a;
        if (b > m) m = b;
        if (c > m) m = c;
        return m;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.printf("Area: %.2f%n", areaTriangulo(6, 4.5));
        System.out.println("8 es par? " + esPar(8));
        System.out.println("Mayor: " + mayor(7, 15, 9));
    }
}
