import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        double SUM = 0;
        double numberCounter = 0;
        double AVG = 0;

        while (true) {
            boolean numberCheck = scanner.hasNextInt();
            if (numberCheck) {
                int number = scanner.nextInt();
                SUM += number;
                numberCounter++;
                 AVG= Math.round( SUM / numberCounter) ;
            } else {
                break;
            }
            scanner.nextLine();
        }
            System.out.println("SUM = " + SUM+" AVG = " + AVG);
            scanner.close();
        }
    }
