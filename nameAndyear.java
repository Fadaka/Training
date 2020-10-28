import java.util.Scanner;

public class nameAndyear {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter year of birth :");
        int YearOfBirth = scanner.nextInt();
        System.out.println("Enter your Name :");
        String Name = scanner.next();
        int age = 2020 - YearOfBirth;

        System.out.println("You are a person called "+ Name+" Your life started "+age+" years ago");
        scanner.close();

    }
}
