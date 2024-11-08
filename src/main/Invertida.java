package main;

import java.util.Arrays;

public class Invertida {
    public static String invertir(String cadena) {

        String separada[] = cadena.split(" ");

        String[] alreves = new String[separada.length];

        for (int i = separada.length - 1; i >= 0; i--) {
            alreves[separada.length - 1 - i] = separada[i];
        }
        return Arrays.toString(alreves);
    }
    public static void main(String[] args) {
        String cadena = "Esto es una frase";

        System.out.println(invertir(cadena));
    }
}
