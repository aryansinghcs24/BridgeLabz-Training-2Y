public class LineUtility {
    public static double euclideanDistance(int x1, int y1, int x2, int y2) {
        double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return dist;
    }
    public static double[] lineEquation(int x1, int y1, int x2, int y2) {
        double m = (double)(y2 - y1) / (x2 - x1);  
        double b = y1 - m * x1;                  
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        int x1 = 2, y1 = 4, x2 = 6, y2 = 8;

        double dist = euclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance between (%d,%d) and (%d,%d): %.3f%n", x1, y1, x2, y2, dist);

        double[] equation = lineEquation(x1, y1, x2, y2);
        System.out.printf("Equation of the line: y = %.2fx + %.2f%n", equation[0], equation[1]);
    }
}
