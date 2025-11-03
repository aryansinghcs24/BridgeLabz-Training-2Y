import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        if (number == 0) {
            System.out.println("Frequency of 0: 1");
            return;
        }

        long tempNumber = Math.abs(number); 
        
        int digitCount = 0;
        long tempCount = tempNumber;
        while (tempCount != 0) {
            tempCount /= 10;
            digitCount++;
        }

        int[] digits = new int[digitCount];
        int index = 0;
        while (tempNumber != 0) {
            digits[index] = (int) (tempNumber % 10);
            tempNumber /= 10;
            index++;
        }
        
        int[] frequency = new int[10]; 
        for (int i = 0; i < digitCount; i++) {
            int digit = digits[i];
            frequency[digit]++;
        }

        System.out.println("\n--- Digit Frequency ---");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Frequency of " + i + ": " + frequency[i]);
            }
        }
    }
}