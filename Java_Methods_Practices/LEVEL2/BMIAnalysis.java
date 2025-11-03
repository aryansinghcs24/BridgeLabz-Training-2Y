import java.util.Scanner;

public class BMIAnalysis {
    static void calculateBMI(double[][] data) {
        for (double[] data1 : data) {
            double weight = data1[0];
            double heightCm = data1[1];
            double heightM = heightCm / 100.0; 
            double bmi = weight / (heightM * heightM);
            data1[2] = bmi; 
        }
    }
    static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3]; 
        String[] status = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            while(!sc.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number for weight.");
                sc.next();
            }
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            while(!sc.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number for height.");
                sc.next();
            }
            data[i][1] = sc.nextDouble();
        }
        calculateBMI(data);
        for (int i = 0; i < 10; i++) {
            status[i] = getBMIStatus(data[i][2]);
        }
        System.out.println("\nPerson\tWeight (kg)\tHeight (cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%6d\t%10.2f\t%10.2f\t%6.2f\t%10s\n", (i + 1), data[i][0], data[i][1], data[i][2], status[i]);
        }
    }
}
