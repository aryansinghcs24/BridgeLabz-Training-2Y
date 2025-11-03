import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5]; 


        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("\nResults:");
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("Number " + num + " is positive and even.");
                } else {
                    System.out.println("Number " + num + " is positive and odd.");
                }
            } else if (num < 0) {
                System.out.println("Number " + num + " is negative.");
            } else {
                System.out.println("Number " + num + " is zero.");
            }
        }

        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        System.out.println("\nComparison of first and last element:");
        if (first == last) {
            System.out.println("First element (" + first + ") and last element (" + last + ") are equal.");
        } else if (first > last) {
            System.out.println("First element (" + first + ") is greater than last element (" + last + ").");
        } else {
            System.out.println("First element (" + first + ") is less than last element (" + last + ").");
        }

    }
}
