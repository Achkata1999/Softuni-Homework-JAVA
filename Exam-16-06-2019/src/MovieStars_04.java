import java.util.Scanner;

public class MovieStars_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double money = Double.parseDouble(scan.nextLine());

        while (true) {
            String name = scan.nextLine();
            if (name.equals("ACTION")) {
                break;
            }
            if (name.length() > 15) {
                money -= money * 0.2;
            } else {
                double cost = Double.parseDouble(scan.nextLine());
                money -= cost;
            }
            if (money < 0) {
                break;
            }
        }
        if (money >= 0) {
            System.out.printf("We are left with %.2f leva.", money);
        } else {
            System.out.printf("We need %.2f leva for our actors.", Math.abs(money));
        }
    }
}
