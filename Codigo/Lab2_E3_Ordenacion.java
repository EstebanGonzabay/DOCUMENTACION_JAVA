// Laboratorio 2 - E3: seleccion vs burbuja contando comparaciones (solucion docente)
import java.util.Arrays;

public class Lab2_E3_Ordenacion {

    static int seleccion(int[] v) {
        int comp = 0;
        for (int i = 0; i < v.length - 1; i++) {
            int pm = i;
            for (int j = i + 1; j < v.length; j++) { comp++; if (v[j] < v[pm]) pm = j; }
            int a = v[i]; v[i] = v[pm]; v[pm] = a;
        }
        return comp;
    }

    static int burbuja(int[] v) {
        int comp = 0;
        boolean cambio = true;
        for (int p = 1; p < v.length && cambio; p++) {
            cambio = false;
            for (int j = 0; j < v.length - p; j++) {
                comp++;
                if (v[j] > v[j + 1]) { int a = v[j]; v[j] = v[j + 1]; v[j + 1] = a; cambio = true; }
            }
        }
        return comp;
    }

    public static void main(String[] args) {
        int[] datos = {45, 12, 78, 3, 56, 23, 89, 34};
        int[] a = Arrays.copyOf(datos, datos.length);
        int[] b = Arrays.copyOf(datos, datos.length);
        System.out.println("Seleccion: " + seleccion(a) + " comparaciones " + Arrays.toString(a));
        System.out.println("Burbuja:   " + burbuja(b) + " comparaciones " + Arrays.toString(b));
        int[] ordenado = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Burbuja con datos ya ordenados: " + burbuja(ordenado) + " comparaciones");
    }
}
