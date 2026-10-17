public class four {
    public static int divisors(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(divisors(12));
        System.out.println(divisors(25));
    }
}
