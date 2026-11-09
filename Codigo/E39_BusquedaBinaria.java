// Busqueda binaria: divide el intervalo a la mitad (requiere arreglo ordenado)
public class E39_BusquedaBinaria {

    static int binaria(int[] v, int clave) {
        int ini = 0, fin = v.length - 1, pasos = 0;
        while (ini <= fin) {
            int medio = (ini + fin) / 2;
            pasos++;
            if (v[medio] == clave) {
                System.out.println("Pasos: " + pasos);
                return medio;
            }
            if (clave < v[medio]) fin = medio - 1;
            else ini = medio + 1;
        }
        System.out.println("Pasos: " + pasos);
        return -1;
    }

    public static void main(String[] args) {
        int[] codigos = {3, 8, 15, 21, 34, 42, 57, 63, 78, 90};
        System.out.println("Posicion de 57: " + binaria(codigos, 57));
        System.out.println("Posicion de 10: " + binaria(codigos, 10));
    }
}
