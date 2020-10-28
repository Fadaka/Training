public class ntw1 {
    public static void main(String[] args) {

        System.out.println(getDigitCount(25));
        System.out.println(reverse(25));
    }
        public static int numberToWords(int number) {
            int Digit = 1;
            if (number < 0) {
                return -1;
            }
            while (number >= 0) {
                Digit = number % 10;
                if (Digit == 1)
                    System.out.println("ONE");
                if (Digit == 2)
                    System.out.println("TWO");
                if (Digit == 3)
                    System.out.println("THREE");
                if (Digit == 4)
                    System.out.println("FOUR");
                if (Digit == 5)
                    System.out.println("FIVE");
                if (Digit == 6)
                    System.out.println("SIX");
                if (Digit == 7)
                    System.out.println("SEVEN");
                if (Digit == 8)
                    System.out.println("EIGHT");
                if (Digit == 9)
                    System.out.println("NINE");
                if (Digit == 0)
                    System.out.println("ZERO");
            }
            number /= 10;
            return Digit;
        }

        public static int reverse(int number) {
            int negative = 1;
            if (number < 0) {
                number *= -1;
                negative = -1;
                return number * negative;
            } else {

                int reverseNumber = 0;
                while (number > 0) {
                    reverseNumber = reverseNumber * 10;
                    reverseNumber = +number % 10;
                    number = number / 10;
                }
                return reverseNumber;
            }
        }

        public static int getDigitCount ( int number){
            if (number < 0) {
                return -1;
            }
            int count = 0;
            while (number > 0) {
                int total = number / 10;
                count++;
            }
            return count;
        }
    }



