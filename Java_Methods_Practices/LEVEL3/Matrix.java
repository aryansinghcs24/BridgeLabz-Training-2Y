import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10); 
        return matrix;
    }

    public static int[][] addMatrix(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }

    public static int[][] subtractMatrix(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }

    public static int[][] multiplyMatrix(int[][] A, int[][] B) {
        int rows = A.length, cols = B[0].length, n = B.length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < n; k++)
                    result[i][j] += A[i][k] * B[k][j];
        return result;
    }

    public static void printMatrix(int[][] matrix, String desc) {
        System.out.println(desc);
        for (int[] row : matrix) {
            for (int val : row)
                System.out.printf("%4d", val);
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows for matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns for matrix: ");
        int cols = sc.nextInt();

        int[][] A = createRandomMatrix(rows, cols);
        int[][] B = createRandomMatrix(rows, cols);

        printMatrix(A, "Matrix A:");
        printMatrix(B, "Matrix B:");

        int[][] sum = addMatrix(A, B);
        printMatrix(sum, "A + B:");

        int[][] diff = subtractMatrix(A, B);
        printMatrix(diff, "A - B:");

        System.out.print("Enter columns for multiplication matrix: ");
        int multCols = sc.nextInt();
        int[][] C = createRandomMatrix(cols, multCols);
        printMatrix(C, "Matrix for multiplication (B):");
        int[][] prod = multiplyMatrix(A, C);
        printMatrix(prod, "A x B:");
    }
}
