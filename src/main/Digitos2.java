public class Digitos2 {
    public static int esNumero(String frase) {
        int contador = 0;
        boolean esNumero;

        String separada[] = frase.split(" ");

        for (int i = 0; i < separada.length; i++) {
            esNumero = true;
            for (int j = 0; j < separada[i].length(); j++) {
                if (!Character.isDigit(separada[i].charAt(j))) {
                    esNumero = false;
                    break;
                }
        }
            if (esNumero) {
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) {
        String frase = "1 20 hola 234 45aa 4h23h21 1231jhk1l231";

        System.out.println(esNumero(frase));
    }
}
