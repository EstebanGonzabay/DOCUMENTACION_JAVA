// Arreglo multidimensional: [piso][aula][dia] con estudiantes
public class E32_Tridimensional {
    public static void main(String[] args) {
        int pisos = 2, aulas = 3, dias = 5;
        int[][][] asistencia = new int[pisos][aulas][dias];

        for (int p = 0; p < pisos; p++)
            for (int a = 0; a < aulas; a++)
                for (int d = 0; d < dias; d++)
                    asistencia[p][a][d] = 20 + p * 5 + a + d;   // datos de ejemplo

        for (int p = 0; p < pisos; p++) {
            int totalPiso = 0;
            for (int a = 0; a < aulas; a++)
                for (int d = 0; d < dias; d++)
                    totalPiso += asistencia[p][a][d];
            System.out.println("Piso " + (p + 1) + ": " + totalPiso + " asistencias");
        }
        System.out.println("Elementos totales: " + pisos * aulas * dias);
    }
}
