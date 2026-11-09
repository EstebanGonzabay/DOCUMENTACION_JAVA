// Maximo, minimo y su posicion en un vector
public class E28_MaxMinPosicion {
    public static void main(String[] args) {
        double[] temperaturas = {18.5, 21.0, 25.3, 19.8, 23.1, 16.4, 20.0};
        String[] dias = {"Lun", "Mar", "Mie", "Jue", "Vie", "Sab", "Dom"};

        int posMax = 0, posMin = 0;               // se inicia con el primer elemento
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > temperaturas[posMax]) posMax = i;
            if (temperaturas[i] < temperaturas[posMin]) posMin = i;
        }
        System.out.println("Maxima: " + temperaturas[posMax] + " (" + dias[posMax] + ")");
        System.out.println("Minima: " + temperaturas[posMin] + " (" + dias[posMin] + ")");
    }
}
