import java.util.Scanner;

public class StudentVoteCheck {
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false; 
        }
        return age >= 18; 
    }

public class Main {
    public static void main(String[] args) {
        int[] ages = new int[10];
        StudentVoteCheck checker = new StudentVoteCheck();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();

            boolean eligible = checker.canStudentVote(ages[i]);

            if (eligible) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
    }
}
}