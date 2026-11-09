// Laboratorio 1 - E3: biblioteca propia de calculos electricos (solucion docente)
package lab1util;

public class ElectricaUtil {
    private ElectricaUtil() { }

    public static double potencia(double voltaje, double corriente) {
        return voltaje * corriente;                 // P = V * I
    }

    public static double resistenciaSerie(double r1, double r2, double r3) {
        return r1 + r2 + r3;
    }

    public static double resistenciaParalelo(double r1, double r2, double r3) {
        return 1 / (1 / r1 + 1 / r2 + 1 / r3);
    }

    public static double costoMensual(double watts, double horasDia, double tarifaKwh) {
        return watts / 1000 * horasDia * 30 * tarifaKwh;
    }
}
