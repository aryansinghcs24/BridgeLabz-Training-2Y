import java.util.Scanner;

public class NumberMinMax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three integer numbers:");
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();
        int[] result = findSmallestAndLargest(number1, number2, number3);

        System.out.println("\nThe smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);
    }
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {

        int smallest = number1;
        int largest = number1;
        if (number2 < smallest) {
            smallest = number2;
        } else if (number2 > largest) {
            largest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        } else if (number3 > largest) {
            largest = number3;
        }

        int[] resultArray = new int[2];
        resultArray[0] = smallest;
        resultArray[1] = largest;
        return resultArray;
    }
}