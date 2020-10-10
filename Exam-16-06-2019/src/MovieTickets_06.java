import java.util.Scanner;

public class MovieTickets_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a1 = Integer.parseInt(scan.nextLine());
        int a2 = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());

        for (int i = a1; i <= a2 - 1; i++) {
            for (int j = 1; j <= n - 1; j++) {
                for (int k = 1; k <= n / 2 - 1; k++) {
                    int sum = j + k + i;
                    if (i % 2 != 0 && sum % 2 != 0) {
                        System.out.printf("%c-%d%d%d\n", (char) i, j, k, i);
                    }
                }
            }

        }

    }
}
