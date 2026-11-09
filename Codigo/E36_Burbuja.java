// Ordenacion burbuja con bandera: termina si una pasada no hace cambios
import java.util.Arrays;

public class E36_Burbuja {

    static void burbuja(int[] v) {
        boolean huboCambio = true;
        for (int pasada = 1; pasada < v.length && huboCambio; pasada++) {
            huboCambio = false;
            for (int j = 0; j < v.length - pasada; j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j]; v[j] = v[j + 1]; v[j + 1] = aux;
                    huboCambio = true;
                }
            }
            System.out.println("Pasada " + pasada + ": " + Arrays.toString(v));
        }
    }

    public static void main(String[] args) {
        burbuja(new int[]{5, 1, 4, 2, 8});
    }
}
