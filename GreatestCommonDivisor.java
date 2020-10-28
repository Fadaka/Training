public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor (int First, int Second){
        if (First>10 || Second<10){
            return -1;
        }
        int gcd = 1;
        for
        (int i = 1;i<=First && i<=Second;i++ ) {
            if (First % i == 0 && Second % i == 0)
                gcd = i;
        }
        return gcd;
    }
}

