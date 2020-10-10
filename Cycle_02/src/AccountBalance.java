import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int input = 1;
        double sum = 0;
        while (input <= n) {
            double money = Double.parseDouble(scan.nextLine());
            if (money < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            sum+=money;
            System.out.printf("Increase: %.2f\n", money);
            input++;
        }
        System.out.printf("Total: %.2f", sum);
    }
}
