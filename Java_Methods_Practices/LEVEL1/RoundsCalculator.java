import java.util.Scanner;

public class RoundsCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lengths of the three sides of the triangular park (in meters):");

        System.out.print("Side 1: ");
        double side1 = input.nextDouble();

        System.out.print("Side 2: ");
        double side2 = input.nextDouble();

        System.out.print("Side 3: ");
        double side3 = input.nextDouble();

        if (isValidTriangle(side1, side2, side3)) {
            double rounds = calculateRounds(side1, side2, side3);

            System.out.printf("The athlete must complete %.2f rounds to finish a 5 km run.\n", rounds);
        } else {
            System.out.println("Invalid input. The given side lengths cannot form a triangle.");
        }

    }
    public static double calculateRounds(double side1, double side2, double side3) {
        double totalDistance = 5000.0;
        double perimeter = side1 + side2 + side3;
        return totalDistance / perimeter;
    }
    public static boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}