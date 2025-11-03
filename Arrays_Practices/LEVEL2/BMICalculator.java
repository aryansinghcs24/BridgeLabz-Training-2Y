import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] statuses = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nEnter data for Person " + (i + 1) + ":");
            System.out.print("Enter weight (in kg): ");
            weights[i] = scanner.nextDouble();
            System.out.print("Enter height (in meters): ");
            heights[i] = scanner.nextDouble();
        }

        for (int i = 0; i < numPersons; i++) {

            bmis[i] = weights[i] / (heights[i] * heights[i]);
            
            if (bmis[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] >= 25.0 && bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else { 
                statuses[i] = "Obese";
            }
        }

        System.out.println("\n--- BMI Results ---");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nResults for Person " + (i + 1) + ":");
            System.out.printf("Height: %.2f m\n", heights[i]);
            System.out.printf("Weight: %.2f kg\n", weights[i]);
            System.out.printf("BMI: %.2f\n", bmis[i]);
            System.out.println("Status: " + statuses[i]);
        }

    }
}