import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sum = 0;

        while (true) {
            String input = scan.nextLine();
            if (input.equals("Start")) {
                break;
            }
            double money = Double.parseDouble(input);
            if (money == 0.1 || money == 0.2 || money == 0.5 || money == 1 || money == 2) {
                sum += money;
            } else {
                System.out.printf("Cannot accept %.2f\n", money);
            }
        }

        while (true) {
            String input = scan.nextLine();
            if (input.equals("End")) {
                break;
            }
            switch (input) {
                case "Nuts":
                    if (sum >= 2.0) {
                        sum -= 2;
                        System.out.printf("Purchased %s\n", input);
                    } else {
                        System.out.println("Sorry, not enough money\n");
                    }
                    break;
                case "Water":
                    if (sum >= 0.7) {
                        sum -= 0.7;
                        System.out.printf("Purchased %s\n", input);
                    } else {
                        System.out.println("Sorry, not enough money\n");
                    }
                    break;
                case "Crisps":
                    if (sum >= 1.5) {
                        sum -= 1.5;
                        System.out.printf("Purchased %s\n", input);
                    } else {
                        System.out.println("Sorry, not enough money\n");
                    }
                    break;
                case "Soda":
                    if (sum >= 0.8) {
                        sum -= 0.8;
                        System.out.printf("Purchased %s\n", input);
                    } else {
                        System.out.println("Sorry, not enough money\n");
                    }
                    break;
                case "Coke":
                    if (sum >= 1) {
                        sum -= 1;
                        System.out.printf("Purchased %s\n", input);
                    } else {
                        System.out.println("Sorry, not enough money\n");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
        }
        System.out.printf("Change: %.2f\n", sum);

    }
}
