import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a natural number: ");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Please enter a natural number (0 or positive).");
                return;
            }

            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + n + " is " + factorial);
        }
    }
}
