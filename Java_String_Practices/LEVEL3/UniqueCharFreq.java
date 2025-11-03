import java.util.Scanner;

public class UniqueCharFreq {
    static char[] uniqueCharacters(String str) {
        int len = 0;
        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        char[] uniques = new char[len];
        int uniqCount = 0;
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < uniqCount; j++) {
                if (uniques[j] == c) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniques[uniqCount++] = c;
            }
        }
        char[] result = new char[uniqCount];
        for (int i = 0; i < uniqCount; i++) {
            result[i] = uniques[i];
        }
        return result;
    }
    static String[][] characterFrequencies(String str) {
        int[] freq = new int[256];
        int n = 0;
        try {
            while (true) {
                str.charAt(n);
                n++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }

        for (int i = 0; i < n; i++) {
            freq[str.charAt(i)]++;
        }

        char[] uniques = uniqueCharacters(str);
        String[][] result = new String[uniques.length][2];

        for (int i = 0; i < uniques.length; i++) {
            result[i][0] = Character.toString(uniques[i]);
            result[i][1] = Integer.toString(freq[uniques[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] result = characterFrequencies(input);

        System.out.println("Character : Frequency");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " : " + result[i][1]);
        }
    }
}
