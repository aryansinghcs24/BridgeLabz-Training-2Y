import java.util.Scanner;

public class PalindromeChecker {
    static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    static char[] reverseWithCharAt(String text) {
        int len = text.length();
        char[] reversed = new char[len];
        for (int i = 0; i < len; i++) {
            reversed[len - 1 - i] = text.charAt(i);
        }
        return reversed;
    }

    static boolean isPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseWithCharAt(text);
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text to check palindrome: ");
        String input = scanner.nextLine();

        boolean resIter = isPalindromeIterative(input);

        boolean resRecur = isPalindromeRecursive(input, 0, input.length() - 1);

        boolean resArray = isPalindromeArray(input);

        System.out.println("\nPalindrome using Iterative Logic: " + resIter);
        System.out.println("Palindrome using Recursive Logic: " + resRecur);
        System.out.println("Palindrome using Array Logic:     " + resArray);

    }
}
