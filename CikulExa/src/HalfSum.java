import java.util.Scanner;

public class HalfSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            sum += number;
            if (number > max) {
                max = number;
            }
        }
        int finall = sum - max;
        if (finall == max) {
            System.out.println("Yes");
            System.out.println("Sum = " + max);
        } else {
            int sum1 = max - finall;
            System.out.println("No");
            System.out.printf("Diff = %d",Math.abs(sum1));
        }
    }
}
