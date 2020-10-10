import java.util.Scanner;

public class maximalSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();
        int cols = scan.nextInt();
        int[][] matrix = new int[rows][cols];

        fillMatrix(scan, rows, cols, matrix);

        int maxSum = Integer.MIN_VALUE;

        int[][] bigSumMatrix = new int[3][3];

        int startRow = 0;
        int startCol = 0;

        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {
                int matrixSum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2] +
                        matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2] +
                        matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];

                if (maxSum < matrixSum) {
                    startRow = row;
                    startCol = col;
                    maxSum = matrixSum;

                }
            }
        }
        System.out.println("Sum = " + maxSum);
        for (int row = startRow; row < startRow + 3; row++) {
            for (int col = startCol; col < startCol + 3; col++) {
                System.out.print(matrix[row][col] + " ");

            }
            System.out.println();
        }


    }

    private static void fillMatrix(Scanner scan, int rows, int cols, int[][] matrix) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = scan.nextInt();
            }
        }
    }
}
