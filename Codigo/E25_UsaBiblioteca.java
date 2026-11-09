// Uso de una biblioteca propia: import del paquete utilidades
import java.util.Locale;
import utilidades.GeometriaUtil;

public class E25_UsaBiblioteca {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.printf("Area del circulo r=2: %.2f%n", GeometriaUtil.areaCirculo(2));
        System.out.printf("Area del terreno 12x8: %.2f%n", GeometriaUtil.areaRectangulo(12, 8));
        System.out.printf("Distancia (0,0)-(3,4): %.2f%n", GeometriaUtil.distancia(0, 0, 3, 4));
    }
}
