import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine());
        String group = scan.nextLine();
        String day = scan.nextLine();

        double price = 0;
        if (day.equals("Friday")) {
            switch (group) {
                case "Students":
                    price = people * 8.45;
                    if (people >= 30) {
                        price *= 0.85;
                    }
                    break;
                case "Business":
                    price = people * 10.90;
                    if (people >= 100) {
                        price -= 10 * 10.90;
                    }
                    break;
                case "Regular":
                    price = people * 15;
                    if (people >= 10 && people <= 20) {
                        price *= 0.05;
                    }
                    break;
            }
        } else if (day.equals("Saturday")) {
            switch (group) {
                case "Students":
                    price = people * 9.80;
                    if (people >= 30) {
                        price *= 0.85;
                    }
                    break;
                case "Business":
                    price = people * 15.60;
                    if (people >= 100) {
                        price -= 10 * 15.6;
                    }
                    break;
                case "Regular":
                    price = people * 20;
                    if (people >= 10 && people <= 20) {
                        price *= 0.05;
                    }
                    break;
            }
        } else if (day.equals("Sunday")) {
            switch (group) {
                case "Students":
                    price = people * 10.46;
                    if (people >= 30) {
                        price *= 0.85;
                    }
                    break;
                case "Business":

                    price = people * 16;
                    if (people >= 100) {
                        price -= 10 * 16;
                    }
                    break;
                case "Regular":
                    price = people * 22.50;
                    if (people >= 10 && people <= 20) {
                        price *= 0.05;
                    }
                    break;
            }
        }
        System.out.printf("Total price: %.2f", price);
    }
}