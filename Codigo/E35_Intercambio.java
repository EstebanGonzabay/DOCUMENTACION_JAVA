// Ordenacion por intercambio: compara v[i] con cada v[j] posterior
import java.util.Arrays;

public class E35_Intercambio {

    static int intercambio(int[] v) {
        int cambios = 0;
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[i]) {
                    int aux = v[i]; v[i] = v[j]; v[j] = aux;
                    cambios++;
                }
            }
        }
        return cambios;
    }

    public static void main(String[] args) {
        int[] v = {29, 10, 14, 37, 13};
        int c = intercambio(v);
        System.out.println(Arrays.toString(v) + " con " + c + " intercambios");
    }
}
