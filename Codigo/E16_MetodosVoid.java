// Metodos void: agrupan instrucciones que solo realizan una accion
public class E16_MetodosVoid {

    static void imprimirLinea(int largo) {
        for (int i = 0; i < largo; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    static void mostrarEncabezado(String titulo) {
        imprimirLinea(30);
        System.out.println("  " + titulo);
        imprimirLinea(30);
    }

    public static void main(String[] args) {
        mostrarEncabezado("REPORTE DE CONSUMO");
        System.out.println("Cliente: Ana Torres");
        mostrarEncabezado("FIN DEL REPORTE");
    }
}
