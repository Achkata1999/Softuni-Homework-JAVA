import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String destination = scan.nextLine();




        while (!destination.equals("End")) {
            double needMoney = Double.parseDouble(scan.nextLine());
            int money = 0;
            while (money < needMoney) {
                double sum = Double.parseDouble(scan.nextLine());
                money += sum;
            }
            System.out.printf("Going to %s!\n", destination);
            destination = scan.nextLine();
        }


    }
}
