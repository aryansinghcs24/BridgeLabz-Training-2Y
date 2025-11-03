public class NumCheck {

    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    public static int sumSquaresDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumDigits(digits);
        return (sum != 0 && number % sum == 0);
    }
    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }
        int count = 0;
        for (int f : freq) {
            if (f > 0) count++;
        }
        int[][] result = new int[count][2];
        int idx = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                result[idx][0] = i;       
                result[idx][1] = freq[i]; 
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 123224213;

        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        int[] digits = getDigitsArray(number);
        System.out.print("Digits array: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        System.out.println("Sum of digits: " + sumDigits(digits));
        System.out.println("Sum of squares of digits: " + sumSquaresDigits(digits));
        System.out.println("Is Harshad Number? " + isHarshadNumber(number, digits));

        int[][] freqArr = digitFrequency(digits);
        System.out.println("Digit Frequencies:");
        System.out.println("Digit\tFrequency");
        for (int[] freqArr1 : freqArr) {
            System.out.println(freqArr1[0] + "\t" + freqArr1[1]);
        }
    }
}
