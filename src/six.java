public class six {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int A = 1;
        int B = 20;

        for (int i = A; i <= B; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}