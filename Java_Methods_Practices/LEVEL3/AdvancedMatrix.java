import java.util.Random;

public class AdvancedMatrix {
    public static double[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10); 
        return matrix;
    }

    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        double[][] t = new double[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                t[j][i] = matrix[i][j];
        return t;
    }

    public static double determinant2x2(double[][] m) {
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }
    
    public static double determinant3x3(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) throw new ArithmeticException("Singular Matrix");
        double[][] inv = new double[2][2];
        inv[0][0] =  m[1][1]/det;
        inv[0][1] = -m[0][1]/det;
        inv[1][0] = -m[1][0]/det;
        inv[1][1] =  m[0][0]/det;
        return inv;
    }

    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) throw new ArithmeticException("Singular Matrix");
        double[][] inv = new double[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                double[][] minor = new double[2][2];
                int mRow = 0, mCol;
                for(int row=0;row<3;row++){
                    if(row==i) continue;
                    mCol=0;
                    for(int col=0;col<3;col++){
                        if(col==j) continue;
                        minor[mRow][mCol++] = m[row][col];
                    }
                    mRow++;
                }
                inv[j][i] = Math.pow(-1, i+j) * determinant2x2(minor) / det;
            }
        }
        return inv;
    }

    public static void displayMatrix(double[][] matrix, String label) {
        System.out.println(label);
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.3f", val);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("2x2 Matrix Test:");
        double[][] matrix2 = createRandomMatrix(2,2);
        displayMatrix(matrix2, "Matrix:");
        displayMatrix(transpose(matrix2), "Transpose:");
        System.out.println("Determinant: " + determinant2x2(matrix2));
        try {
            displayMatrix(inverse2x2(matrix2), "Inverse:");
        } catch (ArithmeticException ex) {
            System.out.println("Inverse: Singular Matrix (No Inverse)");
        }

        System.out.println("\n3x3 Matrix Test:");
        double[][] matrix3 = createRandomMatrix(3,3);
        displayMatrix(matrix3, "Matrix:");
        displayMatrix(transpose(matrix3), "Transpose:");
        System.out.println("Determinant: " + determinant3x3(matrix3));
        try {
            displayMatrix(inverse3x3(matrix3), "Inverse:");
        } catch (ArithmeticException ex) {
            System.out.println("Inverse: Singular Matrix (No Inverse)");
        }
    }
}
