import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int sum = 0;

        while (num != 0) {
            int n = num % 10;
            num /= 10;
            sum += n;
        }
        System.out.println(sum);
    }
}
