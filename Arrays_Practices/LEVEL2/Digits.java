import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();


        long tempNumber = number;
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (tempNumber != 0 && index < maxDigit) {
            int digit = (int) (tempNumber % 10);
            digits[index] = digit;
            tempNumber /= 10;
            index++;
        }

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] < largest) {
                secondLargest = digits[i];
            }
        }
        
        if (index > 0) {
            System.out.println("The largest digit is: " + largest);
            System.out.println("The second largest digit is: " + secondLargest);
        } else {
            System.out.println("No digits to process.");
        }
    }
}