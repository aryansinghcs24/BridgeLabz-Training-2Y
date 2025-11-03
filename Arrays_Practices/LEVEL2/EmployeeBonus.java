import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        final int NUM_EMPLOYEES = 10;
        double[] oldSalary = new double[NUM_EMPLOYEES];
        double[] yearsOfService = new double[NUM_EMPLOYEES];
        double[] bonus = new double[NUM_EMPLOYEES];
        double[] newSalary = new double[NUM_EMPLOYEES];
        
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < NUM_EMPLOYEES; ) {
            System.out.println("Enter salary for employee " + (i+1) + ":");
            double sal = sc.nextDouble();
            System.out.println("Enter years of service for employee " + (i+1) + ":");
            double years = sc.nextDouble();
            
            if (sal <= 0 || years < 0) {
                System.out.println("Invalid input. Please enter again.");
                continue; 
            }
            
            oldSalary[i] = sal;
            yearsOfService[i] = years;
            i++;
        }

        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = oldSalary[i] * 0.05;
            } else {
                bonus[i] = oldSalary[i] * 0.02;
            }
            newSalary[i] = oldSalary[i] + bonus[i];
            
            totalBonus += bonus[i];
            totalOldSalary += oldSalary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nEmployee\tOld Salary\tYears\tBonus\tNew Salary");
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.printf("%d\t\t%.2f\t\t%.1f\t%.2f\t%.2f\n",
                (i+1), oldSalary[i], yearsOfService[i], bonus[i], newSalary[i]);
        }
        System.out.println("\nTotal Bonus to be paid: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
