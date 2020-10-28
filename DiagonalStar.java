public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {

            for (int x = 1; x <= number; x++) {
                for (int y = 1; y <=number; y++) {
                    if (y==x||x == y || x == number || y == number || x == 1 || y == 1 || y == (number - x + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");

                    }
                }
            }
            System.out.println();
        }
    }
}
