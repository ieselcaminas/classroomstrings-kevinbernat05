public class SumarBinario {
    public static String sumaBinario(String num1, String num2) {

        while (num1.length() < num2.length()) {
            num1 = "0" + num1;
        }
        while (num2.length() < num1.length()) {
            num2 = "0" + num2;
        }

        String res = "";
        int suma = 0;
        int llevo = 0;

        for (int i = num1.length() - 1; i >= 0; i--) {
            int digitoA = Integer.parseInt("" + num1.charAt(i));
            int digitoB = Integer.parseInt("" + num2.charAt(i));

            suma = (digitoA + digitoB + llevo);
            if (suma == 0) {
            res = "0" + res;
            llevo = 0;
            } else if (suma == 1) {
                res = "1" + res;
                llevo = 0;
            } else if (suma == 2) {
                res = "0" + res;
                llevo = 1;
            } else if (suma == 3) {
                res = "1" + res;
                llevo = 1;
            }
        }
        if (llevo == 1) {
            res = "1" + res;
        }

        return res;
    }

    public static void main(String[] args) {
        String num1 = "1111";
        String num2 = "0110";
        System.out.println(sumaBinario(num1, num2));
    }
}
