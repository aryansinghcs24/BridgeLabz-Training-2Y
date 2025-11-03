import java.util.Scanner;

public class StudentGrades2D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] marks = new int[numStudents][3]; 
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            String[] subjects = {"Physics", "Chemistry", "Maths"};
            for (int j = 0; j < 3; j++) {
                int mark;
                do {
                    System.out.print("Enter " + subjects[j] + " marks: ");
                    mark = scanner.nextInt();
                    if (mark < 0 || mark > 100) {
                        System.out.println("Marks must be between 0 and 100. Please try again.");
                    }
                } while (mark < 0 || mark > 100);
                marks[i][j] = mark;
            }
        }

        for (int i = 0; i < numStudents; i++) {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (double) totalMarks / 3;

            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nResults for Student " + (i + 1) + ":");
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.printf("Percentage: %.2f%%\n", percentages[i]);
            System.out.println("Grade: " + grades[i]);
        }
    }
}