public class Pasatiempos {
    public static String sustituirVocales(String original){
        String sustituida = original.replaceAll("[AEIOUaeiou]", ".");

        return sustituida;
    }
    public static void main(String[] args) {

        String original = "un ejemplo de pasatiempos";
        String sustituida = sustituirVocales(original);

        System.out.println(sustituida);

    }
}
