import java.util.Scanner;

public class LoopCharFreq {
    static String[][] findFrequencies(String input) {
        char[] chars = input.toCharArray();
        int length = chars.length;
        int[] frequencies = new int[length];
        for (int i = 0; i < length; i++) {
            if (chars[i] == '\0') continue; 
            frequencies[i] = 1;
            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    frequencies[i]++;
                    chars[j] = '\0'; 
                }
            }
        }
        int uniqueCount = 0;
        for (char c : chars) {
            if (c != '\0') uniqueCount++;
        }
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '\0') {
                result[index][0] = Character.toString(chars[i]);
                result[index][1] = Integer.toString(frequencies[i]);
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] freqData = findFrequencies(input);

        System.out.println("Character : Frequency");
        for (String[] entry : freqData) {
            System.out.println(entry[0] + " : " + entry[1]);
        }
    }
}
