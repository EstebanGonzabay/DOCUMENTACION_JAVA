// Evaluacion de modularidad - P5: metodos recursivos (solucion docente)
public class Eval_U2_P5_Recursivo {

    static int sumaPares(int n) {             // 2 + 4 + ... hasta n
        if (n <= 0) return 0;
        if (n % 2 != 0) return sumaPares(n - 1);
        return n + sumaPares(n - 2);
    }

    static boolean esCapicua(String s) {
        if (s.length() <= 1) return true;
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        return esCapicua(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println("sumaPares(10) = " + sumaPares(10));
        System.out.println("sumaPares(7) = " + sumaPares(7));
        System.out.println("12321 capicua? " + esCapicua("12321"));
        System.out.println("1231 capicua? " + esCapicua("1231"));
    }
}
