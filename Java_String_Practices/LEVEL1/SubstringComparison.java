import java.util.Scanner;

public class SubstringComparison {
    static String substringWithCharAt(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String text = sc.nextLine();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String subCharAt = substringWithCharAt(text, start, end);
        System.out.println("Substring (using charAt): " + subCharAt);

        String subStringMethod = text.substring(start, end);
        System.out.println("Substring (using substring()): " + subStringMethod);

        boolean areEqual = compareUsingCharAt(subCharAt, subStringMethod);

        System.out.println("Are the substrings equal? " + areEqual);
    }
}
