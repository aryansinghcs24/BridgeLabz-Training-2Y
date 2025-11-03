import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        // Taking user input
        try (Scanner scanner = new Scanner(System.in)) {
            // Taking user input
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            // Printing even numbers
            System.out.println("\nEven numbers between 1 and " + number + ":");
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            
            // Printing odd numbers
            System.out.println("\n\nOdd numbers between 1 and " + number + ":");
            for (int i = 1; i <= number; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
