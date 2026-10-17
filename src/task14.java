public class task14 {
    public static int transformDigits(int n) {
        int result = 0;
        int place = 1;

        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 == 0) {
                digit++;
            } else {
                digit--;
            }

            result = result + digit * place;
            place = place * 10;
            n = n / 10;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(transformDigits(983210));
    }
}
