import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        String[][] matrix = new String[rows][cols];

        fillMatrix(scan, rows, matrix);

        String command = scan.nextLine();

        while (!command.equals("END")) {
            boolean isValid = true;
            String[] tokens = command.split("\\s+");
            if (tokens[0].equals("swap") && tokens.length == 5) {
                for (int i = 1; i < tokens.length; i += 2) {
                    if (Integer.parseInt(tokens[i]) >= rows && Integer.parseInt(tokens[i + 1]) >= cols) {
                        System.out.println("Invalid input!");
                        isValid = false;
                        break;
                    }
                }
                if (isValid) {
                    int first1 = Integer.parseInt(tokens[1]);
                    int first2 = Integer.parseInt(tokens[2]);
                    int second1 = Integer.parseInt(tokens[3]);
                    int second2 = Integer.parseInt(tokens[4]);

                    String firstInerwal = matrix[first1][first2];
                    String secondInerwal = matrix[second1][second2];

                    matrix[first1][first2] = secondInerwal;
                    matrix[second1][second2] = firstInerwal;

                    printMatrix(rows, cols, matrix);

                }
            } else {
                System.out.println("Invalid input!");
            }

            command = scan.nextLine();
        }
        System.out.println();
    }

    private static void printMatrix(int rows, int cols, String[][] matrix) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }


    private static void fillMatrix(Scanner scan, int rows, String[][] matrix) {
        for (int row = 0; row < rows; row++) {
            matrix[row] = scan.nextLine().split("\\s+");
        }
    }
}
