import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double money = Double.parseDouble(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String series = scan.nextLine();
            double cost = Double.parseDouble(scan.nextLine());
            switch (series) {
                case "Thrones":
                    money -= cost * 0.5;
                    break;
                case "Lucifer":
                    money -= cost * 0.6;
                    break;
                case "Protector":
                    money -= cost * 0.7;
                    break;
                case "TotalDrama":
                    money -= cost * 0.8;
                    break;
                case "Area":
                    money -= cost * 0.9;
                    break;
                default:
                    money -= cost;
                    break;
            }
    }
        if(money>=0){
            System.out.printf("You bought all the series and left with %.2f lv.",money);
        }else {
            System.out.printf("You need %.2f lv. more to buy the series!",Math.abs(money));

        }
}
}
