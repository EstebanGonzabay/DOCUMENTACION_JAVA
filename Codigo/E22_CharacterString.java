// Metodos de biblioteca: Character y String
public class E22_CharacterString {
    public static void main(String[] args) {
        String placa = "pbc-1234";
        String mayus = placa.toUpperCase();
        System.out.println("Placa: " + mayus + " (" + mayus.length() + " caracteres)");

        int letras = 0, digitos = 0;
        for (int i = 0; i < mayus.length(); i++) {
            char c = mayus.charAt(i);
            if (Character.isLetter(c)) letras++;
            else if (Character.isDigit(c)) digitos++;
        }
        System.out.println("Letras: " + letras + ", digitos: " + digitos);
        System.out.println("Provincia: " + mayus.charAt(0));
        int numero = Integer.parseInt(mayus.substring(4));
        System.out.println("Parte numerica + 1 = " + (numero + 1));
    }
}
