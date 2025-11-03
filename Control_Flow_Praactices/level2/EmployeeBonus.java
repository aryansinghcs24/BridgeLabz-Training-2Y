import java.util.Scanner;
class EmployeeBonus {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the Current Year: ");
            int currentYear = input.nextInt();
            System.out.print("Enter the Year of Joining: ");
            int joinYear = input.nextInt();
            int yearsOfService = currentYear - joinYear;

            if (yearsOfService > 3) {
                System.out.println("Bonus of Rs: 2500 /-");
            } else {
                System.out.println("No Bonus");
            }
        }
    }
}

