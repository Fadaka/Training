public class lastDigitChecker {
    public static void main(String[] args) {
        System.out.println("has same Last Digit has produced a value of "+ hasSameLastDigit(23,32,42));

    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (a < 10 || b < 10 || c < 10) {
            return false;
        }
        if (a > 1000 || b > 1000 || c > 1000) {
            return false;
        }
        int LastDigitA = a % 10;
        int LastDigitB = b % 10;
        int LastDigitC = c % 10;

        if (LastDigitA == LastDigitB || LastDigitB == LastDigitC || LastDigitC == LastDigitA) {
            return true;
        }
else return false;
    }
    public static boolean isValid(int test){
        if(test<10 || test>1000){
            return false;
        }
        else return true;
    }
}
