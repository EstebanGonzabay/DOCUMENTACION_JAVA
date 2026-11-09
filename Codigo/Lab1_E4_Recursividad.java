// Laboratorio 1 - E4: metodos recursivos (solucion docente)
public class Lab1_E4_Recursividad {

    static int mcd(int a, int b) {                 // algoritmo de Euclides
        if (b == 0) return a;
        return mcd(b, a % b);
    }

    static int contarDigitos(int n) {
        if (n < 10) return 1;
        return 1 + contarDigitos(n / 10);
    }

    static int invertir(int n, int acumulado) {
        if (n == 0) return acumulado;
        return invertir(n / 10, acumulado * 10 + n % 10);
    }

    static long sumaHasta(int n) {
        if (n == 0) return 0;
        return n + sumaHasta(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("mcd(84, 36) = " + mcd(84, 36));
        System.out.println("Digitos de 90210 = " + contarDigitos(90210));
        System.out.println("Invertir 1234 = " + invertir(1234, 0));
        System.out.println("Suma 1..100 = " + sumaHasta(100));
    }
}
