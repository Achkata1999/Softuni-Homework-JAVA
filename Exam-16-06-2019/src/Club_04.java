import java.util.Scanner;

public class Club_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double profit = Double.parseDouble(scan.nextLine());
        double sum = 0;
        while (true) {
            String drink = scan.nextLine();
            if (drink.equals("Party!")) {
                System.out.printf("We need %.2f leva more.\n", profit - sum);
                break;
            }
            int number = Integer.parseInt(scan.nextLine());

            double price = drink.length() * number;
            if (price % 2 == 1) {
                price *= 0.75;
            }
            sum += price;
            if (sum >= profit) {
                System.out.println("Target acquired.");
                break;
            }
        }
        System.out.printf("Club income - %.2f leva.", sum);
    }
}
