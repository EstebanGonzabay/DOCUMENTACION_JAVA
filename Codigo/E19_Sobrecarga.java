// Sobrecarga: mismo nombre, distinta lista de parametros
import java.util.Locale;

public class E19_Sobrecarga {

    static double area(double lado) {                 // cuadrado
        return lado * lado;
    }

    static double area(double base, double altura) {  // rectangulo
        return base * altura;
    }

    static double area(double radio, boolean esCirculo) {
        return Math.PI * radio * radio;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.printf("Cuadrado:   %.2f%n", area(4));
        System.out.printf("Rectangulo: %.2f%n", area(4, 2.5));
        System.out.printf("Circulo:    %.2f%n", area(3, true));
    }
}
