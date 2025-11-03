import java.util.Scanner;

public class StringComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.next();
        System.out.print("Enter the second string: ");
        String str2 = scanner.next();

        boolean isEqualManually = compareStringsManually(str1, str2);
        System.out.println("Result using manual charAt() comparison: " + isEqualManually);

        boolean isEqualBuiltIn = str1.equals(str2);
        System.out.println("Result using built-in equals() method: " + isEqualBuiltIn);

        if (isEqualManually == isEqualBuiltIn) {
            System.out.println("The results from both methods are the same.");
        } else {
            System.out.println("The results from both methods are different.");
        }

    }


    public static boolean compareStringsManually(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false; 
            }
        }

        return true;
    }
}