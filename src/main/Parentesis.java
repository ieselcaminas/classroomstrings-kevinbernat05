public class Parentesis {
    public static boolean esParentizada(String cadena) {
        boolean bien = false;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '(') {
                bien = false;

                for (int j = i + 1; j < cadena.length(); j++) {
                    if (cadena.charAt(j) == ')') {
                        bien = true;
                        i = j;
                        break;
                    } else if (cadena.charAt(j) == '(') {
                        bien = false;
                        break;
                    }
                }
                if (!bien) {
                    break;
                }
            } else if (cadena.charAt(i) == ')') {
                bien = false;
                break;
            }
        }
        return bien;
    }

    public static void main(String[] args) {
        String cadena = "una )cadena (mal (parentizada)";

        System.out.println(esParentizada(cadena));
    }
}
