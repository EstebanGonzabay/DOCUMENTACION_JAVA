// Laboratorio 1 - E5: primos y perfectos en un rango con metodos (solucion docente)
import java.util.Scanner;

public class Lab1_E5_PrimosPerfectos {

    static boolean esPrimo(int n) {
        if (n < 2) return false;
        for (int d = 2; d * d <= n; d++) if (n % d == 0) return false;
        return true;
    }

    static int sumaDivisores(int n) {
        int s = 0;
        for (int d = 1; d <= n / 2; d++) if (n % d == 0) s += d;
        return s;
    }

    static boolean esPerfecto(int n) {
        return n > 1 && sumaDivisores(n) == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Desde: "); int a = sc.nextInt();
        System.out.print("Hasta: "); int b = sc.nextInt();
        int primos = 0;
        System.out.print("Primos: ");
        for (int i = a; i <= b; i++) if (esPrimo(i)) { System.out.print(i + " "); primos++; }
        System.out.println("(" + primos + ")");
        System.out.print("Perfectos: ");
        for (int i = a; i <= b; i++) if (esPerfecto(i)) System.out.print(i + " ");
        System.out.println();
    }
}
