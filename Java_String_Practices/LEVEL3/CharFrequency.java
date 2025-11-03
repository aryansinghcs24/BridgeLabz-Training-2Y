import java.util.Scanner;

public class CharFrequency {
    static String[][] findFrequencies(String str) {
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
            freq[(int) str.charAt(i)]++;
        }

        int uniqCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) uniqCount++;
        }

        String[][] res = new String[uniqCount][2];
        int idx = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                res[idx][0] = Character.toString((char) i);      
                res[idx][1] = Integer.toString(freq[i]);           
                idx++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] freqArr = findFrequencies(input);

        System.out.println("Character : Frequency");
        for (int i = 0; i < freqArr.length; i++) {
            System.out.println(freqArr[i][0] + " : " + freqArr[i][1]);
        }
    }
}
