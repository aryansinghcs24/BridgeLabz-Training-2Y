import java.util.Scanner;

public class QuadraticEquation {
    static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return new double[0];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficient a (non-zero): ");
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a numeric value for a.");
            sc.next();
        }
        double a = sc.nextDouble();

        while (a == 0) {
            System.out.println("Coefficient a cannot be zero in a quadratic equation. Please enter again:");
            a = sc.nextDouble();
        }

        System.out.print("Enter coefficient b: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a numeric value for b.");
            sc.next();
        }
        double b = sc.nextDouble();

        System.out.print("Enter coefficient c: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a numeric value for c.");
            sc.next();
        }
        double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);

        switch (roots.length) {
            case 2 -> {
                System.out.printf("Root 1: %.4f\n", roots[0]);
                System.out.printf("Root 2: %.4f\n", roots[1]);
            }
            case 1 -> System.out.printf("Only root: %.4f\n", roots[0]);
            default -> System.out.println("No real roots.");
        }
    }
}
