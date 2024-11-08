package main;

public class Longitud3 {
    public static boolean longitud1(String cadena) {
        boolean contador = true;
        int caracteres = 5;

        String palabras[] = cadena.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() >= caracteres) {
                contador = false;
                break;
            }
        }
        return contador;
    }

    public static void main(String[] args) {

        String cadena = "Hola esto es un ejemplo.";
        boolean contador = longitud1(cadena);

        if (contador)
            System.out.println("Todas las palabras son cortas.");
         else
            System.out.println("Alguna de tus palabras es larga");

    }
}
