// Arreglos bidimensionales: recorrido por filas y columnas
public class E30_Matriz {
    public static void main(String[] args) {
        int[][] m = {
            {4, 7, 1},
            {2, 9, 5},
            {8, 3, 6}
        };
        int filas = m.length, cols = m[0].length;

        for (int i = 0; i < filas; i++) {
            int sumaFila = 0;
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", m[i][j]);
                sumaFila += m[i][j];
            }
            System.out.printf("  | %d%n", sumaFila);
        }
        int diagonal = 0;
        for (int i = 0; i < filas; i++) diagonal += m[i][i];
        System.out.println("Suma diagonal principal: " + diagonal);
    }
}
