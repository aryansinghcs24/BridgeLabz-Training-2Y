import java.util.Scanner;

public class UniqueCharacters {
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

    static char[] findUniqueChars(String str) {
        int len = findLength(str);
        char[] uniques = new char[len]; 
        int uniqueCount = 0;
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            boolean seen = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (uniques[j] == c) {
                    seen = true;
                    break;
                }
            }
            if (!seen) {
                uniques[uniqueCount] = c;
                uniqueCount++;
            }
        }
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniques[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] uniqueChars = findUniqueChars(input);

        System.out.print("Unique characters: ");
        for (char c : uniqueChars) System.out.print(c + " ");
        System.out.println();
    }
}
