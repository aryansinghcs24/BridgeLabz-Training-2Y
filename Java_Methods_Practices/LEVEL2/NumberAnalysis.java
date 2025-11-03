import java.util.Scanner;

public class NumberAnalysis {
    static boolean isPositive(int n) {
        return n >= 0;
    }
    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (isPositive(arr[i])) {
                if (isEven(arr[i])) {
                    System.out.println(arr[i] + " is positive and even");
                } else {
                    System.out.println(arr[i] + " is positive and odd");
                }
            } else {
                System.out.println(arr[i] + " is negative");
            }
        }

        int result = compare(arr[0], arr[4]);
        switch (result) {
            case 1 -> System.out.println("First element is greater than last element");
            case 0 -> System.out.println("First and last elements are equal");
            default -> System.out.println("First element is less than last element");
        }
    }
}
