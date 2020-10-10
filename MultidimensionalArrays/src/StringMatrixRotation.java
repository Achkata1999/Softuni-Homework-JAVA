import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String rotation = scan.nextLine();
        int deg = Integer.parseInt(rotation.split("[()]+")[1]) % 360;

        System.out.println();
        int wordsSize = 0;
        int largesWord = 0;

        ArrayList<String> words = new ArrayList<>();

        String input = scan.nextLine();
        while (!input.equals("END")) {
            words.add(input);
            if (input.length() > largesWord) {
                largesWord = input.length();
            }
            input = scan.nextLine();
            wordsSize++;
        }
        int rows = wordsSize;
        int cols = largesWord;

        char[][] matrix = new char[wordsSize][largesWord];

        for (int row = 0; row < wordsSize; row++) {
            for (int col = 0; col < largesWord; col++) {
                if (col < words.get(row).length()) {
                    matrix[row][col] = words.get(row).charAt(col);
                } else {
                    matrix[row][col] = ' ';
                }
            }
        }

        if (deg == 90) {
            for (int col = 0; col < cols; col++) {
                for (int row = rows - 1; row >= 0; row--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        } else if (deg == 180) {
            for (int row = rows - 1; row >= 0; row--) {
                for (int col = cols - 1; col >= 0; col--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        } else if (deg == 270) {
            for (int col = cols - 1; col >= 0; col--) {
                for (int row = 0; row < rows; row++) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }

        } else if (deg == 0) {
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        }

    }


}


