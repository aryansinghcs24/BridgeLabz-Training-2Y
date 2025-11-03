import java.util.Scanner;

public class TrimString {
    public static int[] manualTrim(String str) {
        int start = 0, end = str.length() - 1;

        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        if (start > end) {
            return new int[]{0, -1}; 
        }

        return new int[]{start, end};
    }

    public static String manualSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean manualCompare(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with leading/trailing spaces: ");
        String input = sc.nextLine();
        int[] positions = manualTrim(input);
        String manuallyTrimmed = "";

        if (positions[1] >= positions[0]) { 
            manuallyTrimmed = manualSubstring(input, positions[0], positions[1]);
        }

        String builtinTrimmed = input.trim();
        boolean isSame = manualCompare(manuallyTrimmed, builtinTrimmed);

        System.out.println("\nOriginal String: [" + input + "]");
        System.out.println("Manually Trimmed: [" + manuallyTrimmed + "]");
        System.out.println("Built-in Trimmed: [" + builtinTrimmed + "]");
        System.out.println("Are both equal? " + isSame);

    }
}
