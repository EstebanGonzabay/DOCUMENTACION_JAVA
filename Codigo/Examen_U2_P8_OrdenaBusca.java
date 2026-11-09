// Examen U2 - P8: ordenar con burbuja y buscar con binaria (solucion docente)
import java.util.Arrays;
import java.util.Scanner;

public class Examen_U2_P8_OrdenaBusca {

    static void burbuja(int[] v) {
        for (int p = 1; p < v.length; p++)
            for (int j = 0; j < v.length - p; j++)
                if (v[j] > v[j + 1]) { int a = v[j]; v[j] = v[j + 1]; v[j + 1] = a; }
    }

    static int binaria(int[] v, int x) {
        int i = 0, f = v.length - 1;
        while (i <= f) {
            int m = (i + f) / 2;
            if (v[m] == x) return m;
            if (x < v[m]) f = m - 1; else i = m + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] codigos = {507, 112, 389, 245, 901, 156, 678, 333};
        burbuja(codigos);
        System.out.println("Ordenado: " + Arrays.toString(codigos));
        Scanner sc = new Scanner(System.in);
        System.out.print("Codigo a buscar: ");
        int pos = binaria(codigos, sc.nextInt());
        System.out.println(pos >= 0 ? "Encontrado en la posicion " + pos : "No existe");
    }
}
