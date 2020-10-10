import java.util.Scanner;

public class Vacation2_0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine());
        String group = scan.nextLine();
        String day = scan.nextLine();

        double price = 0;

        switch (group) {
            case "Students":
                if (day.equals("Friday")) {
                    price += people * 8.45;
                } else if (day.equals("Saturday")) {
                    price += people * 9.80;
                } else if (day.equals("Sunday")) {
                    price += people * 10.46;
                }

                if (people >= 30) {
                    price -= price * 15 / 100;
                }
                break;
            case "Business":
                if (people >= 100) {
                    people -= 10;
                }

                if (day.equals("Friday")) {
                    price += people * 10.90;
                } else if (day.equals("Saturday")) {
                    price += people * 15.60;
                } else if (day.equals("Sunday")) {
                    price += people * 16;
                }
                break;
            case "Regular":
                if (day.equals("Friday")) {
                    price += people * 15;
                } else if (day.equals("Saturday")) {
                    price += people * 20;
                } else if (day.equals("Sunday")) {
                    price += people * 22.50;
                }

                if (people >= 10 && people <= 20) {
                    price -= price * 5 / 100;
                }
                break;
        }

        System.out.printf("Total price: %.2f", price);
    }
}
