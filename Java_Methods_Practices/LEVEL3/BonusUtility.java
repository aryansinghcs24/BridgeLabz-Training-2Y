import java.util.Random;

public class BonusUtility {

    static Random rand = new Random();
    public static int[][] generateEmployeeData(int numEmployees) {
        int[][] data = new int[numEmployees][2]; 
        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); 
            data[i][1] = rand.nextInt(10) + 1;       
        }
        return data;
    }

    public static double[][] calculateBonus(int[][] employees) {
        double[][] newData = new double[employees.length][2]; 
        for (int i = 0; i < employees.length; i++) {
            double salary = employees[i][0];
            int years = employees[i][1];
            double bonusPercent = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercent;
            newData[i][0] = salary + bonus;
            newData[i][1] = bonus;
        }
        return newData;
    }
    public static void displayTotals(int[][] oldData, double[][] newData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        for (int i = 0; i < oldData.length; i++) {
            totalOldSalary += oldData[i][0];
            totalNewSalary += newData[i][0];
            totalBonus += newData[i][1];
        }
        System.out.printf("%-20s %-20s %-20s%n", "Total Old Salary", "Total New Salary", "Total Bonus");
        System.out.printf("%-20.2f %-20.2f %-20.2f%n", totalOldSalary, totalNewSalary, totalBonus);
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        int[][] employeeData = generateEmployeeData(numEmployees);
        double[][] newSalaryAndBonus = calculateBonus(employeeData);

        System.out.printf("%-10s %-10s %-15s %-15s %-15s%n", "Emp No", "Years", "Old Salary", "New Salary", "Bonus");
        for (int i = 0; i < numEmployees; i++) {
            System.out.printf("%-10d %-10d %-15d %-15.2f %-15.2f%n", i + 1, employeeData[i][1], employeeData[i][0], newSalaryAndBonus[i][0], newSalaryAndBonus[i][1]);
        }

        System.out.println("Summary:");
        displayTotals(employeeData, newSalaryAndBonus);
    }
}
