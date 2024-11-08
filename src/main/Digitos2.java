package main;

public class Digitos2 {
    public static int digitos(String frase) {
        int contador = 0;

        String separada[] = frase.split(" ");

        for (int i = 0; i < separada.length; i++) {
            if (Character.isDigit(separada[i].charAt(0)))
                contador++;
            else if (Character.isAlphabetic(separada[i].charAt(0)))
                contador--;
        }
        return contador;
    }
    public static void main(String[] args) {
        String frase = "1 20 hola 234 45aa 4h23h21 1231jhk1l231";

        System.out.println(digitos(frase));
    }
}
