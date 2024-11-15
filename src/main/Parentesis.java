public class Parentesis {
    public static boolean esParentizada(String cadena) {
        int balance = 0;

        for (int i = 0; i < cadena.length(); i++) {

            if (cadena.charAt(i) == '(') {
                balance++;
            } else if (cadena.charAt(i)== ')') {
                balance--;

                if (balance < 0) {
                    return false;
                }
            }
        }
        return balance == 0;
    }
    public static void main(String[] args) {
        System.out.println(esParentizada("Esto (es (un ejemplo) (de) una (cadena bien) parentizada)"));
    }
}
