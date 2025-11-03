import java.util.Scanner;

public class ChocolateDivider {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total number of chocolates (N): ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter the number of children (M): ");
        int numberOfChildren = input.nextInt();
        if (numberOfChildren <= 0) {
            System.out.println("Error: The number of children must be greater than zero.");
        } else {
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            int chocolatesPerChild = result[0];
            int remainingChocolates = result[1];
            System.out.println("\nEach child will get " + chocolatesPerChild + " chocolates.");
            System.out.println("The remaining chocolates are: " + remainingChocolates);
        }
        input.close();
    }
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
}