import java.util.Scanner;

public class BMICalculator {
    static String getBMIStatus(double bmi) {
        if (bmi <= 18.4)
            return "Underweight";
        else if (bmi <= 24.9)
            return "Normal";
        else if (bmi <= 39.9)
            return "Overweight";
        else
            return "Obese";
    }
    static String[][] calculateBMIStatus(double[][] data) {
        String[][] result = new String[10][4]; 
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0; 
            double bmi = weight / (heightM * heightM);
            String bmiStr = String.format("%.2f", bmi);
            String status = getBMIStatus(bmi);

            result[i][0] = String.format("%.1f", heightCm) + " cm";
            result[i][1] = String.format("%.1f", weight) + " kg";
            result[i][2] = bmiStr;
            result[i][3] = status;
        }
        return result;
    }
    static void printTable(String[][] bmiInfo) {
        System.out.printf("%-12s%-12s%-10s%-15s%n", "Height", "Weight", "BMI", "Status");
        for (int i = 0; i < bmiInfo.length; i++) {
            System.out.printf("%-12s%-12s%-10s%-15s%n",
                bmiInfo[i][0], bmiInfo[i][1], bmiInfo[i][2], bmiInfo[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] team = new double[10][2]; 
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i+1) + " weight (kg): ");
            while (!sc.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value for weight.");
                sc.next();
            }
            team[i][0] = sc.nextDouble();

            System.out.print("Person " + (i+1) + " height (cm): ");
            while (!sc.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value for height.");
                sc.next();
            }
            team[i][1] = sc.nextDouble();
        }

        String[][] result = calculateBMIStatus(team);
        printTable(result);
        
    }
}
