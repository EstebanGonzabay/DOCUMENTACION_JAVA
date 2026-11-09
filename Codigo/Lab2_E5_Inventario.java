// Laboratorio 2 - E5: inventario con vectores paralelos y menu (solucion docente)
import java.util.Scanner;

public class Lab2_E5_Inventario {

    static final int MAX = 50;
    static int[] codigo = new int[MAX];
    static int[] stock = new int[MAX];
    static int n = 0;

    static int buscar(int cod) {
        for (int i = 0; i < n; i++) if (codigo[i] == cod) return i;
        return -1;
    }

    static boolean agregar(int cod, int cant) {
        if (n == MAX || buscar(cod) >= 0) return false;
        codigo[n] = cod; stock[n] = cant; n++;
        return true;
    }

    static boolean eliminar(int cod) {
        int p = buscar(cod);
        if (p < 0) return false;
        for (int i = p; i < n - 1; i++) { codigo[i] = codigo[i + 1]; stock[i] = stock[i + 1]; }
        n--;
        return true;
    }

    static void ordenarPorCodigo() {
        for (int p = 1; p < n; p++)
            for (int j = 0; j < n - p; j++)
                if (codigo[j] > codigo[j + 1]) {
                    int a = codigo[j]; codigo[j] = codigo[j + 1]; codigo[j + 1] = a;
                    a = stock[j]; stock[j] = stock[j + 1]; stock[j + 1] = a;   // mover ambos
                }
    }

    static void listar() {
        for (int i = 0; i < n; i++) System.out.printf("%6d %6d%n", codigo[i], stock[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.print("\n1) Agregar 2) Eliminar 3) Buscar 4) Ordenar y listar 0) Salir: ");
            op = sc.nextInt();
            switch (op) {
                case 1 -> { System.out.print("Codigo y stock: ");
                            System.out.println(agregar(sc.nextInt(), sc.nextInt()) ? "Agregado" : "No se pudo agregar"); }
                case 2 -> { System.out.print("Codigo: "); System.out.println(eliminar(sc.nextInt()) ? "Eliminado" : "No existe"); }
                case 3 -> { System.out.print("Codigo: "); int p = buscar(sc.nextInt());
                            System.out.println(p >= 0 ? "Stock: " + stock[p] : "No existe"); }
                case 4 -> { ordenarPorCodigo(); listar(); }
                case 0 -> System.out.println("Fin");
                default -> System.out.println("Opcion no valida");
            }
        } while (op != 0);
    }
}
