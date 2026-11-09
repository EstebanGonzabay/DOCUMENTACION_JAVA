// Ambito: variables locales, de bloque y atributos static
public class E20_Ambito {

    static int llamadas = 0;            // atributo static: vive toda la ejecucion

    static int cuadrado(int n) {
        llamadas++;                     // se puede usar en cualquier metodo
        int resultado = n * n;          // local: solo existe dentro de cuadrado
        return resultado;
    }

    public static void main(String[] args) {
        int suma = 0;                   // local de main
        for (int i = 1; i <= 3; i++) {  // i es de bloque: solo existe en el for
            suma += cuadrado(i);
        }
        // System.out.println(i);       // ERROR: i no existe aqui
        // System.out.println(resultado); // ERROR: resultado es local de cuadrado
        System.out.println("Suma de cuadrados: " + suma);
        System.out.println("Llamadas a cuadrado: " + llamadas);
    }
}
