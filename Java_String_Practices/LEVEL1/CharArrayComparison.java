import java.util.Arrays;
import java.util.Scanner;

public class CharArrayComparison {
    static char[] getChars(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }
    static boolean compareCharArrays(char[] a1, char[] a2) {
        return Arrays.equals(a1, a2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char[] charsUserMethod = getChars(input);
        char[] charsToCharArray = input.toCharArray();
        boolean areEqual = compareCharArrays(charsUserMethod, charsToCharArray);
        System.out.println("User-defined array: " + Arrays.toString(charsUserMethod));
        System.out.println("Built-in toCharArray(): " + Arrays.toString(charsToCharArray));
        System.out.println("Are both arrays equal? " + areEqual);
    }
}
