import java.util.Scanner;

public class StringIndex {

    @SuppressWarnings("unused")
    static void generateException(String s) {

        System.out.println("Accessing index beyond length: " + s.charAt(s.length()));
    }

    static void handleException(String s) {
        try {
            System.out.println("Accessing index beyond length: " + s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        handleException(input);
    }
}
