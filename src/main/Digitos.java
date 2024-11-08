package main;

public class Digitos {
    public static int digitos(String frase) {
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (Character.isDigit(frase.charAt(i)))
                contador++;
        }
        return contador;
    }
    public static void main(String[] args) {
        String frase = "Hay 1 cosa 234en 2 clases.";

        System.out.println(digitos(frase));
    }
}
