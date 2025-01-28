import java.util.*;
public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] matrix1 = createRandomMatrix(rows, cols);
        int[][] matrix2 = createRandomMatrix(rows, cols);
        System.out.println("Matrix 1:");
        printMatrix(matrix1);    
        System.out.println("Matrix 2:");
        printMatrix(matrix2);
        System.out.println("Addition of matrices:");
        printMatrix(addMatrices(matrix1, matrix2));    
        System.out.println("Subtraction of matrices:");
        printMatrix(subtractMatrices(matrix1, matrix2));
		
        if (cols == rows) {
            System.out.println("Multiplication of matrices:");
            printMatrix(multiplyMatrices(matrix1, matrix2));
    
            System.out.println("Transpose of Matrix 1:");
            printMatrix(transposeMatrix(matrix1));
    
            if (rows == 2) {
                System.out.println("Determinant of Matrix 1: " + determinant2x2(matrix1));
                try {
                    System.out.println("Inverse of Matrix 1:");
                    printMatrix(inverse2x2(matrix1));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } else if (rows == 3) {
                System.out.println("Determinant of Matrix 1: " + determinant3x3(matrix1));
                try {
                    System.out.println("Inverse of Matrix 1:");
                    printMatrix(inverse3x3(matrix1));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        } else {
            System.out.println(
                    "Matrix multiplication, transpose, determinant, and inverse are only possible for square matrices.");
        }
        sc.close();
    }
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public static int determinant3x3(int[][] matrix) {
        int det = 0;
        for (int i = 0; i < 3; i++) {
            det += matrix[0][i] * (matrix[1][(i + 1) % 3] * matrix[2][(i + 2) % 3]
                    - matrix[1][(i + 2) % 3] * matrix[2][(i + 1) % 3]);
        }
        return det;
    }

    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) {
            throw new IllegalArgumentException("Matrix is singular and cannot be inverted.");
        }
        double[][] result = new double[2][2];
        result[0][0] = matrix[1][1] / (double) det;
        result[0][1] = -matrix[0][1] / (double) det;
        result[1][0] = -matrix[1][0] / (double) det;
        result[1][1] = matrix[0][0] / (double) det;
        return result;
    }

    public static double[][] inverse3x3(int[][] matrix) {
        int det = determinant3x3(matrix);
        if (det == 0) {
            throw new IllegalArgumentException("Matrix is singular and cannot be inverted.");
        }
        double[][] result = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[][] subMatrix = new int[2][2];
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (k != i && l != j) {
                            subMatrix[k < i ? k : k - 1][l < j ? l : l - 1] = matrix[k][l];
                        }
                    }
                }
                result[j][i] = Math.pow(-1, i + j) * determinant2x2(subMatrix) / (double) det;
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f ", val);
            }
            System.out.println();
        }
    }

}