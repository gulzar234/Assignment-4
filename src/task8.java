public class task8 {
    public static String decimalToBinary(int n) {
        String result = "";

        while (n > 0) {
            result = (n % 2) + result;
            n = n / 2;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Binary = " + decimalToBinary(13));
    }
}
