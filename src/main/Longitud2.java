package main;

public class Longitud2 {
    public static boolean longitud1(String cadena) {
        boolean contador = false;
        int caracteres = 4;

        String palabras[] = cadena.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == caracteres) {
                contador = true;
            }
        }
        return contador;
    }

    public static void main(String[] args) {

        String cadena = "Hola esto es un ejemplo";

        System.out.println(longitud1(cadena));


    }
}
