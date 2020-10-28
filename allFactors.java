public class allFactors {
    public static void printFactors(int number) {
        if (number < 1)
            System.out.println("Invalid Value");
        for (int i = 1; i <= number; i++) {
            if (i == number % 0 )
            System.out.println(i);
        }
    }
}

