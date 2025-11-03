import java.util.Scanner;

public class LowerCaseCompare {
    static String toLowerCustom(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                sb.append((char)(c + 32)); 
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any text: ");
        String input = scanner.nextLine();
        String manualLower = toLowerCustom(input);
        String builtInLower = input.toLowerCase();
        boolean isSame = compareStrings(manualLower, builtInLower);
        System.out.println("Manual Lowercase: " + manualLower);
        System.out.println("Built-in Lowercase: " + builtInLower);
        System.out.println("Both are same: " + isSame);
    }
}
