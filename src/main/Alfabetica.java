public class Alfabetica {
    public static boolean esAlfabetica(String palabra) {

        boolean alf = false;

        for (int i = 0; i < palabra.length() - 1; i++) {
            if (palabra.charAt(i) <= palabra.charAt(i + 1)) {
                alf = true;
            } else {
                alf = false;
                break;
            }
        }
        return alf;
    }

    public static void main(String[] args) {

        String palabra = "abbbbbcce";

        if (esAlfabetica(palabra)) {
            System.out.println("La palabra es alfabética");
        }
        else {
            System.out.println("La palabra no es alfabética");
        }
    }
}
