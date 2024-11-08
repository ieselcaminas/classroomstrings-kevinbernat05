package main;

public class Longitud1 {
    public static int longitud1(String cadena) {
        int contador = 0;
        int caracteres = 4;

        String palabras[] = cadena.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == caracteres) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {

        String cadena = "Hola esto es un ejemplo";

        System.out.println(longitud1(cadena));


    }
}
