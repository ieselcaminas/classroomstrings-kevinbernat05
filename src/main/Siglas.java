public class Siglas {
    public static String siglas(String[] original) {

        String siglas = "";

        for (int i = 0; i < original.length; i++) {
            if (Character.isUpperCase(original[i].charAt(0))) {
                siglas = siglas + original[i].charAt(0);
            }
        }
        return siglas;
    }

    public static void main(String[] args) {

        String[] original = new String[]{"Escuela", "Oficial",  "de", "Idiomas"};

        System.out.println(siglas(original));


    }
}
