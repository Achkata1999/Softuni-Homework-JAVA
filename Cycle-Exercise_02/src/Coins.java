import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double moneyLv = Double.parseDouble(scan.nextLine());
        double money = Math.floor(moneyLv * 100);
        int coin = 0;
        while (money > 0) {
            if (money - 200 >= 0) {
                money -= 200;
                coin += 1;
            } else if (money - 100 >= 0) {
                money -= 100;
                coin += 1;
            } else if (money - 50 >= 0) {
                money -= 50;
                coin += 1;
            } else if (money - 20 >= 0) {
                money -= 20;
                coin += 1;
            } else if (money - 10 >= 0) {
                money -= 10;
                coin += 1;
            } else if (money - 5 >= 0) {
                money -= 5;
                coin += 1;
            } else if (money - 2 >= 0) {
                money -= 2;
                coin += 1;
            } else if (money - 1 >= 0) {
                money -= 1;
                coin += 1;
            }
        }
        System.out.println(coin);
    }
}
