// Biblioteca propia: clase utilitaria dentro del paquete utilidades
package utilidades;

public class GeometriaUtil {

    private GeometriaUtil() { }          // no se crean objetos de esta clase

    public static final double PI = 3.141592653589793;

    public static double areaCirculo(double r) {
        return PI * r * r;
    }

    public static double areaRectangulo(double b, double h) {
        return b * h;
    }

    public static double distancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
