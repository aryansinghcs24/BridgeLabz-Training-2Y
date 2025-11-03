import java.util.Scanner;

public class Trigonometry {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an angle in degrees: ");
        double angleInDegrees = input.nextDouble();
        double[] results = calculateTrigonometricFunctions(angleInDegrees);

        System.out.println("\nFor the angle " + angleInDegrees + " degrees:");
        System.out.printf("Sine: %.4f\n", results[0]);
        System.out.printf("Cosine: %.4f\n", results[1]);
        System.out.printf("Tangent: %.4f\n", results[2]);

    }
    public static double[] calculateTrigonometricFunctions(double angle) {
        double angleInRadians = Math.toRadians(angle);
        double sinValue = Math.sin(angleInRadians);
        double cosValue = Math.cos(angleInRadians);
        double tanValue = Math.tan(angleInRadians);
        return new double[]{sinValue, cosValue, tanValue};
    }
}