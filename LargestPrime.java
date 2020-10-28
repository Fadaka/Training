public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(39));

    }
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int i = 1;
        int max_int = 1;
        for ( i = 2; i <= number; i++) {
            if (number % i == 0) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        return -1;
                    }return i;

                }
            }
        }return max_int;

    }
}

