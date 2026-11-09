// Paso de parametros: Java siempre copia el valor del argumento
import java.util.Arrays;

public class E18_PasoPorValor {

    static void incrementar(int x) {
        x = x + 10;                 // modifica la copia
        System.out.println("Dentro del metodo x = " + x);
    }

    static void duplicar(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = v[i] * 2;        // la copia apunta al MISMO arreglo
        }
    }

    public static void main(String[] args) {
        int n = 5;
        incrementar(n);
        System.out.println("En main n = " + n);

        int[] datos = {1, 2, 3};
        duplicar(datos);
        System.out.println("En main datos = " + Arrays.toString(datos));
    }
}
