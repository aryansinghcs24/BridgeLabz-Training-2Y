import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        if (number == 0) {
            System.out.println("Reversed number: 0");
            return;
        }

        int tempNumber = number;
        
        int digitCount = 0;
        if (tempNumber < 0) {
            tempNumber = -tempNumber; 
        }
        int tempCount = tempNumber;
        while (tempCount != 0) {
            tempCount /= 10;
            digitCount++;
        }

        int[] digits = new int[digitCount];
        int index = 0;
        tempNumber = Math.abs(number);
        while (tempNumber != 0) {
            digits[index] = tempNumber % 10;
            tempNumber /= 10;
            index++;
        }

        int[] reversedDigits = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            reversedDigits[i] = digits[digitCount - 1 - i];
        }

        System.out.print("The digits in reverse order are: ");
        if (number < 0) {
            System.out.print("-"); 
        }
        for (int i = 0; i < reversedDigits.length; i++) {
            System.out.print(reversedDigits[i]);
        }
        System.out.println();
    }
}