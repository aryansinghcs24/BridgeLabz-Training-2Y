import java.util.Scanner;

public class SumUntilZeroNegative {
    public static void main(String[] args) {
        double total = 0.0;
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter a number (0 or negative to end): ");
                double input = scanner.nextDouble();

                if (input <= 0) {
                    break;
                }

                total += input;
            }
        }

        System.out.println("Total sum = " + total);
    }
}
