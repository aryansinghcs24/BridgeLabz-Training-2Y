import java.util.Scanner;

public class IllegalArgument {

    @SuppressWarnings("unused")
    static void generateException(String s, int start, int end) {

        System.out.println(s.substring(start, end));
    }

    static void handleException(String s, int start, int end) {
        try {
            System.out.println(s.substring(start, end));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int start = 5;
        int end = 2;
        handleException(str, start, end);
    }
}
