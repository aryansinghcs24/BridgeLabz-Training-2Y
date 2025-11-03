import java.util.Scanner;

public class NonRepeatingChar {
    static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }
    static char firstNonRepeating(String str) {
        int n = findLength(str);
        int[] freq = new int[256]; 
        for (int i = 0; i < n; i++) {
            freq[(int) str.charAt(i)]++;
        }
        for (int i = 0; i < n; i++) {
            if (freq[(int) str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char result = firstNonRepeating(input);

        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First non-repeating character: " + result);
        }

    }
}
