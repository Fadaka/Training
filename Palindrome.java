public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(555));

    }

        public static boolean isPalindrome(int number){
            int reverse = 0 , lastDigit ;
            int num=number;
            while(num != 0){
                lastDigit = num % 10;
                reverse =(reverse * 10) + lastDigit;
                num /=10;
            }

            if(reverse == number)


            {

                return true;

            }

            else{

                return false;

            }

        }

    }

