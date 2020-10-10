import java.util.Scanner;

public class CinemaVoucher_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int voucher = Integer.parseInt(scan.nextLine());
        int ticket = 0;
        int other = 0;

        while (true) {
            String input = scan.nextLine();
            if (input.equals("End")) {
                break;
            }
            if (input.length() > 8) {
                voucher -= input.charAt(0) + input.charAt(1);
                if (voucher >= 0) {
                    ticket++;
                } else {
                    break;
                }
            } else {
                voucher -= input.charAt(0);
                if (voucher >= 0) {
                    other++;
                } else {
                    break;
                }
            }

        }
        System.out.println(ticket);
        System.out.println(other);
    }
}
