// Examen U2 - P7: matriz estudiantes x parciales (solucion docente)
import java.util.Locale;

public class Examen_U2_P7_MatrizNotas {

    static double promedioFila(double[][] m, int f) {
        double s = 0;
        for (double x : m[f]) s += x;
        return s / m[f].length;
    }

    static double promedioColumna(double[][] m, int c) {
        double s = 0;
        for (double[] fila : m) s += fila[c];
        return s / m.length;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String[] est = {"Ana", "Luis", "Maria", "Jorge"};
        double[][] notas = {{16, 18, 15}, {12, 10, 14}, {19, 17, 18}, {9, 13, 11}};
        int mejor = 0;
        for (int i = 0; i < notas.length; i++) {
            double p = promedioFila(notas, i);
            System.out.printf("%-6s %.2f %s%n", est[i], p, p >= 14 ? "Aprobado" : "No aprobado");
            if (p > promedioFila(notas, mejor)) mejor = i;
        }
        for (int j = 0; j < notas[0].length; j++) System.out.printf("Parcial %d: %.2f%n", j + 1, promedioColumna(notas, j));
        System.out.println("Mejor promedio: " + est[mejor]);
    }
}
