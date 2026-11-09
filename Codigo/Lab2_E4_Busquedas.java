// Laboratorio 2 - E4: busqueda secuencial vs binaria contando pasos (solucion docente)
public class Lab2_E4_Busquedas {

    static int pasosSec, pasosBin;

    static int secuencial(int[] v, int x) {
        pasosSec = 0;
        for (int i = 0; i < v.length; i++) { pasosSec++; if (v[i] == x) return i; }
        return -1;
    }

    static int binaria(int[] v, int x) {
        pasosBin = 0;
        int ini = 0, fin = v.length - 1;
        while (ini <= fin) {
            pasosBin++;
            int m = (ini + fin) / 2;
            if (v[m] == x) return m;
            if (x < v[m]) fin = m - 1; else ini = m + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] codigos = new int[1000];
        for (int i = 0; i < codigos.length; i++) codigos[i] = 1000 + i * 3;   // ordenado
        int[] pruebas = {1000, 2500, 3997, 1001};
        for (int x : pruebas) {
            int p1 = secuencial(codigos, x), p2 = binaria(codigos, x);
            System.out.printf("%5d -> pos %4d | secuencial %4d pasos | binaria %2d pasos%n", x, p1, pasosSec, pasosBin);
            if (p1 != p2) System.out.println("ERROR: resultados distintos");
        }
    }
}
