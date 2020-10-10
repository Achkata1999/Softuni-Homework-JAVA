import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int[] number = new int[input.length];

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] + number[j] == n) {
                    System.out.printf("%d %d\n", number[i], number[j]);

                }
            }
        }
    }
}
