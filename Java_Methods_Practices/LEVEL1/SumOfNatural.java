import java.util.Scanner;

public class SumOfNatural {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer (n): ");
        int n = input.nextInt();
        if (n < 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            long sum = calculateSum(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }
    }
    public static long calculateSum(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}