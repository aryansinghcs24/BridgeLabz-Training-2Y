import java.util.Scanner;

public class ArrayIndex {

    static void generateException(String[] names) {
        System.out.println("Accessing invalid index: " + names[names.length]);
    }
    static void handleException(String[] names) {
        try {
            System.out.println("Accessing invalid index: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i+1) + ": ");
            names[i] = scanner.nextLine();
        }
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Exception in generateException(): " + e.getMessage());
        }
        handleException(names);
    }
}
