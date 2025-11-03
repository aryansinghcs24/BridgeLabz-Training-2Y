import java.util.Random;

public class TeamHeight {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;  
        }

        int sum = sumHeights(heights);
        double mean = meanHeight(sum, heights.length);
        int shortest = shortestHeight(heights);
        int tallest = tallestHeight(heights);

        System.out.println("Player heights (cm): ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println("\nMean height: " + mean);
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);
    }

    public static int sumHeights(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }
    public static double meanHeight(int sum, int n) {
        return (double) sum / n;
    }
    public static int shortestHeight(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }
    public static int tallestHeight(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }
}
