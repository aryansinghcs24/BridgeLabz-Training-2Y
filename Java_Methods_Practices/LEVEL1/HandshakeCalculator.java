import java.util.Scanner;

public class HandshakeCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        if (numberOfStudents < 0) {
            System.out.println("Invalid input. The number of students cannot be negative.");
        } else {
            int handshakes = calculateHandshakes(numberOfStudents);

            System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + handshakes + ".");
        }
    }
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}