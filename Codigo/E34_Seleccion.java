// Ordenacion por seleccion: busca el minimo y lo coloca al inicio
import java.util.Arrays;

public class E34_Seleccion {

    static void seleccion(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            int posMin = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[posMin]) posMin = j;
            }
            int aux = v[i];          // un solo intercambio por pasada
            v[i] = v[posMin];
            v[posMin] = aux;
            System.out.println("Pasada " + (i + 1) + ": " + Arrays.toString(v));
        }
    }

    public static void main(String[] args) {
        int[] v = {29, 10, 14, 37, 13};
        seleccion(v);
    }
}
