// Busqueda secuencial: revisa uno por uno (no necesita orden)
public class E38_BusquedaSecuencial {

    static int buscar(String[] v, String clave) {
        for (int i = 0; i < v.length; i++) {
            if (v[i].equalsIgnoreCase(clave)) return i;   // encontrado
        }
        return -1;                                         // no esta
    }

    public static void main(String[] args) {
        String[] cedulas = {"1712", "0923", "1305", "2300", "0801"};
        String[] nombres = {"Ana", "Luis", "Maria", "Jorge", "Rosa"};
        int pos = buscar(cedulas, "2300");
        System.out.println(pos >= 0 ? "Encontrado: " + nombres[pos] : "No registrado");
        System.out.println("Buscar 9999 -> " + buscar(cedulas, "9999"));
    }
}
