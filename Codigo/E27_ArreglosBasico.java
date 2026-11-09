// Declaracion, inicializacion y errores comunes con arreglos
import java.util.Arrays;

public class E27_ArreglosBasico {
    public static void main(String[] args) {
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] meses = new String[3];          // {null, null, null}
        meses[0] = "Enero";

        System.out.println("Meses en el arreglo dias: " + dias.length);
        System.out.println("Dias de marzo: " + dias[2]);   // indice 2
        System.out.println("Ultimo: " + dias[dias.length - 1]);
        System.out.println(Arrays.toString(meses));

        int total = 0;
        for (int d : dias) total += d;
        System.out.println("Dias del anio: " + total);
        // System.out.println(dias[12]);  // ArrayIndexOutOfBoundsException
    }
}
