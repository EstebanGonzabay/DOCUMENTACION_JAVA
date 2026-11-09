// Paso de arreglos a metodos y metodos que devuelven arreglos
import java.util.Arrays;

public class E33_ArreglosMetodos {

    static double promedio(int[] v) {
        int suma = 0;
        for (int x : v) suma += x;
        return (double) suma / v.length;
    }

    static int[] filtrarMayores(int[] v, int limite) {
        int cuenta = 0;
        for (int x : v) if (x > limite) cuenta++;
        int[] res = new int[cuenta];
        int k = 0;
        for (int x : v) if (x > limite) res[k++] = x;
        return res;
    }

    static int sumaMatriz(int[][] m) {
        int s = 0;
        for (int[] fila : m) for (int x : fila) s += x;
        return s;
    }

    public static void main(String[] args) {
        int[] consumo = {120, 95, 180, 210, 75};
        System.out.println("Promedio: " + promedio(consumo));
        System.out.println("Mayores a 100: " + Arrays.toString(filtrarMayores(consumo, 100)));
        System.out.println("Suma matriz: " + sumaMatriz(new int[][]{{1, 2}, {3, 4}}));
    }
}
