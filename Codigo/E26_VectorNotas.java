// Arreglo unidimensional: carga, recorrido y estadisticas
import java.util.Locale;
import java.util.Scanner;

public class E26_VectorNotas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        final int N = 5;
        double[] notas = new double[N];          // posiciones 0..4

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        double suma = 0;
        for (int i = 0; i < notas.length; i++) suma += notas[i];
        double promedio = suma / notas.length;

        int sobre = 0;
        for (double n : notas) {                  // for-each: solo lectura
            if (n > promedio) sobre++;
        }
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("Notas sobre el promedio: " + sobre);
    }
}
