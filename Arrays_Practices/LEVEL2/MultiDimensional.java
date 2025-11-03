import java.util.Scanner;

public class MultiDimensional {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();


        double[][] personData = new double[numPersons][3]; 
        String[] weightStatus = new String[numPersons];


        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nEnter data for Person " + (i + 1) + ":");
            double weight;
            do {
                System.out.print("Enter weight (in kg): ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be a positive value. Please try again.");
                }
            } while (weight <= 0);
            personData[i][0] = weight;

            double height;
            do {
                System.out.print("Enter height (in meters): ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be a positive value. Please try again.");
                }
            } while (height <= 0);
            personData[i][1] = height;
        }
        for (int i = 0; i < numPersons; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];
            
            personData[i][2] = weight / (height * height);

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else { 
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\n--- BMI Results ---");
        System.out.printf("%-10s %-10s %-10s %-10s %s\n", "Person", "Weight(kg)", "Height(m)", "BMI", "Status");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %s\n",
                    (i + 1),
                    personData[i][0],
                    personData[i][1],
                    personData[i][2],
                    weightStatus[i]);
        }
        

    }
}