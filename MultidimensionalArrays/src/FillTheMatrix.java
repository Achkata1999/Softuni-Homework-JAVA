import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[0]);

        int[][] matrix = new int[rows][cols];
        int number = 1;

        if (input[1].equals("A")) {
            fillMatrixTypeA(rows, cols, matrix, number);
        } else if (input[1].equals("B")) {
            fillMatrixTypeB(rows, cols, matrix, number);
        }

        printMatrix(rows, cols, matrix);
        System.out.println();
    }

    private static void printMatrix(int rows, int cols, int[][] matrix) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrixTypeB(int rows, int cols, int[][] matrix, int number) {
        for (int col = 0; col < cols; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < rows; row++) {
                    matrix[row][col] = number;
                    number++;
                }
            } else {
                for (int row = rows - 1; row >= 0; row--) {
                    matrix[row][col] = number;
                    number++;
                }
            }
        }
    }

    private static void fillMatrixTypeA(int rows, int cols, int[][] matrix, int number) {
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                matrix[row][col] = number;
                number++;
            }
        }
    }
}