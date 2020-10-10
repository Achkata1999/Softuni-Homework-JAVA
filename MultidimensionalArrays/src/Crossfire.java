import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] dimensions = scan.nextLine().split("\\s+");

        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);


        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        int number = 1;
        for (int row = 0; row < rows; row++) {
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int col = 0; col < cols; col++) {
                numbers.add(number);
                number++;
            }
            matrix.add(numbers);
        }

        String input = scan.nextLine();

        while (!input.equals("Nuke it from orbit")) {
            String[] tokens = input.split("\\s+");
            int targetRow = Integer.parseInt(tokens[0]);
            int targetCol = Integer.parseInt(tokens[1]);
            int radius = Integer.parseInt(tokens[2]);

            for (int row = targetRow - radius; row <= targetRow + radius; row++) {
                if (isValid(row, targetCol, matrix)) {
                    matrix.get(row).set(targetCol, 0);
                }
            }

            for (int col = targetCol - radius; col <= targetCol + radius; col++) {
                //  if (isValid(col, targetRow, matrix)) {
                //    matrix.get(targetRow).set(col, 0);
                //}
                if (col >= 0 && col < matrix.get(targetRow).size() && targetRow >= 0 && targetRow < matrix.size()) {
                    matrix.get(targetRow).set(col, 0);
                }

            }
            for (int i = 0; i < matrix.size(); i++) {
                matrix.get(i).removeAll(List.of(0));
                if (matrix.get(i).size() == 0) {
                    matrix.remove(i);
                    i--;
                }
            }
            input = scan.nextLine();
        }
        printMatrix(matrix);
    }

    private static void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for (int row = 0; row < matrix.size(); row++) {
            for (int col = 0; col < matrix.get(row).size(); col++) {
                System.out.print(matrix.get(row).get(col) + " ");
            }
            System.out.println();
        }
    }

    private static boolean isValid(int row, int col, ArrayList<ArrayList<Integer>> matrix) {
        return row >= 0 && row < matrix.size() && col >= 0 && col < matrix.get(row).size();
    }
}
