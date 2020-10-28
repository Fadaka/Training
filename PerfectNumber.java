public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        int Sum = 0;
        if (number < 1)
            return false;


        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                Sum += i;
            if (Sum == number) {
                return true;
            }

        }return false;
    }
}


