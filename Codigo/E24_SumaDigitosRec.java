// Recursividad sobre los digitos de un numero
public class E24_SumaDigitosRec {

    static int sumaDigitos(int n) {
        if (n < 10) return n;                     // un solo digito
        return n % 10 + sumaDigitos(n / 10);
    }

    static void cuentaRegresiva(int n) {
        if (n == 0) {
            System.out.println("Despegue!");
            return;
        }
        System.out.print(n + " ");
        cuentaRegresiva(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Suma de digitos de 2026: " + sumaDigitos(2026));
        cuentaRegresiva(5);
    }
}
