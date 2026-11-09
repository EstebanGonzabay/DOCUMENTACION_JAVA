// Insercion y eliminacion en un vector con tamano logico
import java.util.Arrays;

public class E29_InsertarEliminar {

    static int insertar(int[] v, int n, int pos, int valor) {
        for (int i = n; i > pos; i--) v[i] = v[i - 1];   // desplaza a la derecha
        v[pos] = valor;
        return n + 1;                                    // nuevo tamano logico
    }

    static int eliminar(int[] v, int n, int pos) {
        for (int i = pos; i < n - 1; i++) v[i] = v[i + 1]; // desplaza a la izquierda
        return n - 1;
    }

    public static void main(String[] args) {
        int[] v = new int[10];
        int n = 0;
        n = insertar(v, n, 0, 10);
        n = insertar(v, n, 1, 30);
        n = insertar(v, n, 1, 20);       // 10 20 30
        System.out.println(Arrays.toString(Arrays.copyOf(v, n)));
        n = eliminar(v, n, 0);           // 20 30
        System.out.println(Arrays.toString(Arrays.copyOf(v, n)));
    }
}
