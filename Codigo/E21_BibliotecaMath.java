// Metodos de biblioteca: Math y Random
import java.util.Locale;
import java.util.Random;

public class E21_BibliotecaMath {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double a = 3, b = 4;
        double hip = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.printf("Hipotenusa: %.2f%n", hip);
        System.out.println("Redondeo de 7.65: " + Math.round(7.65));
        System.out.println("Techo de 7.1: " + Math.ceil(7.1));
        System.out.println("Valor absoluto de -12: " + Math.abs(-12));
        System.out.println("Maximo entre 8 y 13: " + Math.max(8, 13));

        Random azar = new Random(42);            // semilla fija: mismo resultado
        int dado = azar.nextInt(6) + 1;          // 1..6
        double prob = Math.random();             // [0, 1)
        System.out.println("Dado: " + dado);
        System.out.println("Probabilidad en [0,1): " + (prob >= 0 && prob < 1));
    }
}
