import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double priceHoliday = Double.parseDouble(scan.nextLine());
        int puzzles = Integer.parseInt(scan.nextLine());
        int dolls = Integer.parseInt(scan.nextLine());
        int bears = Integer.parseInt(scan.nextLine());
        int minions = Integer.parseInt(scan.nextLine());
        int trucks = Integer.parseInt(scan.nextLine());
        int toys = puzzles + dolls + bears + minions + trucks;
        double priceToy = puzzles * 2.60 + dolls * 3 + bears * 4.10 + minions * 8.20 + trucks * 2; //900
        if (toys >= 50) {
            priceToy *= 0.75;
        }
        priceToy *= 0.9;
        double left = priceToy - priceHoliday;
        if (left>=0) {
            System.out.printf("Yes! %.2f lv left.", left);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(left));

        }
    }
}
