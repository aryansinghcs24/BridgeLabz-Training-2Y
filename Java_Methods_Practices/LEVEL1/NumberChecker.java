import java.util.Scanner;

public class NumberChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int result = checkNumber(number);
        switch (result) {
            case 1 -> System.out.println("The number is positive.");
            case -1 -> System.out.println("The number is negative.");
            default -> System.out.println("The number is zero.");
        }
    }
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}