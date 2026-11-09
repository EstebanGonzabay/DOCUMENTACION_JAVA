// Matriz de ventas: sucursales (filas) x meses (columnas)
public class E31_MatrizVentas {
    public static void main(String[] args) {
        String[] sucursales = {"Centro", "Norte", "Sur"};
        String[] meses = {"Ene", "Feb", "Mar"};
        double[][] ventas = {
            {1200, 1350, 980},
            { 870,  920, 1100},
            {1500, 1420, 1610}
        };
        System.out.printf("%-8s", "");
        for (String mes : meses) System.out.printf("%8s", mes);
        System.out.printf("%9s%n", "Total");
        for (int i = 0; i < ventas.length; i++) {
            double total = 0;
            System.out.printf("%-8s", sucursales[i]);
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.printf("%8.0f", ventas[i][j]);
                total += ventas[i][j];
            }
            System.out.printf("%9.0f%n", total);
        }
    }
}
