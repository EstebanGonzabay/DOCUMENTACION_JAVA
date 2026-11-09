// Recursividad: un metodo que se llama a si mismo
public class E23_Recursividad {

    static long factorial(int n) {
        if (n <= 1) return 1;              // caso base
        return n * factorial(n - 1);       // caso recursivo
    }

    static int fibonacci(int n) {
        if (n <= 1) return n;              // fib(0)=0, fib(1)=1
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static double potencia(double base, int exp) {
        if (exp == 0) return 1;
        return base * potencia(base, exp - 1);
    }

    public static void main(String[] args) {
        System.out.println("5! = " + factorial(5));
        System.out.print("Fibonacci: ");
        for (int i = 0; i < 10; i++) System.out.print(fibonacci(i) + " ");
        System.out.println();
        System.out.println("2^10 = " + potencia(2, 10));
    }
}
