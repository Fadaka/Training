public class DigitSum {
    public static void main(String[] args) {
        System.out.println("The sum of the digits is "+SumDigits(223) );
        System.out.println("The sum of the digits is "+SumDigits(2237342) );
        System.out.println("The sum of the digits is "+SumDigits(223432) );
        System.out.println("The sum of the digits is "+SumDigits(-7678) );

    }

    public static int SumDigits(int number) {
        if (number < 10) {
            return -1; }
        int SumDigit = 0;
        while (number > 10) {
            int Digit = number % 10;
            SumDigit += Digit;
            number = number / 10;
            continue;
        }
        return SumDigit;
    }
}

