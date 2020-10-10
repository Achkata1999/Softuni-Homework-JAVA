import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            String cha = scan.nextLine();
            char character = cha.charAt(0);
            int ascii = (int) character;
            sum += ascii;

        }
        System.out.printf("The sum equals: %d", sum);
    }
}
