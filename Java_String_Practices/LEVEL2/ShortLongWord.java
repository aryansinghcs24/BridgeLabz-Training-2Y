import java.util.Scanner;

public class ShortLongWord {

    public static int getLength(String str) {
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

    public static String[] customSplit(String str) {
        int length = getLength(str);
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int wordIndex = 0;
        int start = 0;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                words[wordIndex] = str.substring(start, i);
                wordIndex++;
                start = i + 1;
            }
        }

        words[wordIndex] = str.substring(start, length);

        return words;
    }
    public static String[][] getWordWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int len = getLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len); 
        }
        return result;
    }

    public static int[] findShortestLongest(String[][] wordWithLength) {
        int minIndex = 0, maxIndex = 0;

        int minLen = Integer.parseInt(wordWithLength[0][1]);
        int maxLen = Integer.parseInt(wordWithLength[0][1]);

        for (int i = 1; i < wordWithLength.length; i++) {
            int len = Integer.parseInt(wordWithLength[i][1]);

            if (len < minLen) {
                minLen = len;
                minIndex = i;
            }
            if (len > maxLen) {
                maxLen = len;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = customSplit(input);

        String[][] wordWithLength = getWordWithLength(words);

        int[] result = findShortestLongest(wordWithLength);

        System.out.printf("%-15s %-10s\n", "Word", "Length");
        System.out.println("-----------------------------");
        for (int i = 0; i < wordWithLength.length; i++) {
            System.out.printf("%-15s %-10s\n", wordWithLength[i][0], wordWithLength[i][1]);
        }

        System.out.println("\nShortest word : " + wordWithLength[result[0]][0] +
                " (Length: " + wordWithLength[result[0]][1] + ")");
        System.out.println("Longest word  : " + wordWithLength[result[1]][0] +
                " (Length: " + wordWithLength[result[1]][1] + ")");

    }
}
