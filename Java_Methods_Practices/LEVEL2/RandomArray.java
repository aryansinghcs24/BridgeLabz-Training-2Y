import java.util.Arrays;

public class RandomArray {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000;
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);

        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));

        double[] results = findAverageMinMax(randomNumbers);

        System.out.printf("Average value: %.2f\n", results[0]);
        System.out.printf("Minimum value: %.0f\n", results[1]);
        System.out.printf("Maximum value: %.0f\n", results[2]);
    }
}
