// Comparacion: burbuja propia vs Arrays.sort de la biblioteca
import java.util.Arrays;
import java.util.Random;

public class E37_ArraysSort {

    static void burbuja(int[] v) {
        for (int p = 1; p < v.length; p++)
            for (int j = 0; j < v.length - p; j++)
                if (v[j] > v[j + 1]) { int a = v[j]; v[j] = v[j + 1]; v[j + 1] = a; }
    }

    public static void main(String[] args) {
        int n = 20000;
        int[] a = new int[n];
        Random r = new Random(1);
        for (int i = 0; i < n; i++) a[i] = r.nextInt(100000);
        int[] b = Arrays.copyOf(a, n);

        long t0 = System.nanoTime(); burbuja(a);     long t1 = System.nanoTime();
        Arrays.sort(b);                              long t2 = System.nanoTime();
        System.out.println("Iguales: " + Arrays.equals(a, b));
        System.out.printf("Burbuja: %d ms%n", (t1 - t0) / 1_000_000);
        System.out.printf("Arrays.sort: %d ms%n", (t2 - t1) / 1_000_000);
    }
}
