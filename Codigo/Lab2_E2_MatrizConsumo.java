// Laboratorio 2 - E2: matriz de consumo electrico casas x meses (solucion docente)
public class Lab2_E2_MatrizConsumo {

    static int totalFila(int[][] m, int f) {
        int s = 0;
        for (int j = 0; j < m[f].length; j++) s += m[f][j];
        return s;
    }

    static int totalColumna(int[][] m, int c) {
        int s = 0;
        for (int i = 0; i < m.length; i++) s += m[i][c];
        return s;
    }

    public static void main(String[] args) {
        int[][] kwh = {
            {120, 135, 128, 140, 150, 145},
            { 95, 100,  98, 110, 105, 102},
            {210, 220, 205, 230, 240, 235},
            { 80,  85,  90,  88,  92,  95}
        };
        int mayorCasa = 0;
        for (int i = 0; i < kwh.length; i++) {
            System.out.println("Casa " + (i + 1) + ": " + totalFila(kwh, i) + " kWh");
            if (totalFila(kwh, i) > totalFila(kwh, mayorCasa)) mayorCasa = i;
        }
        for (int j = 0; j < kwh[0].length; j++) {
            System.out.print("Mes " + (j + 1) + ": " + totalColumna(kwh, j) + "  ");
        }
        System.out.println("\nMayor consumo: casa " + (mayorCasa + 1));
    }
}
