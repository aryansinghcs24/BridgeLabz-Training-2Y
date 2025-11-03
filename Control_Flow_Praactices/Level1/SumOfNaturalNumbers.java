import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a natural number: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Please enter a positive natural number.");
                return;
            }
            int i = 1;
            int sumWhile = 0;
            while (i <= n) {
                sumWhile += i;
                i++;
            }
            int sumFormula = n * (n + 1) / 2;
            System.out.println("Sum using while loop: " + sumWhile);
            System.out.println("Sum using formula: " + sumFormula);

            if (sumWhile == sumFormula) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("There is a mismatch in the results.");
            }
        }
    }
}
