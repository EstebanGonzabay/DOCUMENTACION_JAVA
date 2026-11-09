// Laboratorio 1 - E3: programa que usa la biblioteca lab1util (solucion docente)
import java.util.Locale;
import lab1util.ElectricaUtil;

public class Lab1_E3_Biblioteca {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.printf("Potencia 120 V x 2.5 A: %.1f W%n", ElectricaUtil.potencia(120, 2.5));
        System.out.printf("Serie 10+20+30: %.1f ohm%n", ElectricaUtil.resistenciaSerie(10, 20, 30));
        System.out.printf("Paralelo 10|20|30: %.2f ohm%n", ElectricaUtil.resistenciaParalelo(10, 20, 30));
        System.out.printf("Refrigeradora 150 W, 24 h, $0.10: $%.2f/mes%n", ElectricaUtil.costoMensual(150, 24, 0.10));
    }
}
