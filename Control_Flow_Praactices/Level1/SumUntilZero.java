import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        double total = 0.0;
        double number;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number (0 to end): ");
            number = scanner.nextDouble();

            while (number != 0) {
                total += number;
                System.out.print("Enter a number (0 to end): ");
                number = scanner.nextDouble();
            }
        }

        System.out.println("Total sum = " + total);
    }
}
