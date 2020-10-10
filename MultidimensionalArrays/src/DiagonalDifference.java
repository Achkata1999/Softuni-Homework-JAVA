import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());

        int[][] matrix = new int[size][size];



        int dig1 = 0;
        int dig2 = 0;

        for (int row = 0; row < size; row++) {
            int[] input = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int current = 0;
            for (int col = 0; col < size; col++) {
                matrix[row][col] = input[current];
                if (row == col) {
                    dig1 += input[current];
                }
                if (col == size - row - 1) {
                    dig2 += input[current];
                }
                current++;
            }
        }
        int sum = dig1 - dig2;
        System.out.println(Math.abs(sum));
    }
}
