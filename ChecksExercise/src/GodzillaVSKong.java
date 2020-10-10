import java.util.Scanner;

public class GodzillaVSKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int people = Integer.parseInt(scan.nextLine());
        double price =Double.parseDouble(scan.nextLine());

        double decor = budget*0.1;
        double pricePeople =people*price;
        double sum =pricePeople +decor;
        double finalSum = budget-sum;
        if (people>150){
            double sale =pricePeople-pricePeople*0.1;
            double sum1 = sale + decor;
            double finalSum1 = budget -sum1;
            if(budget<sum1){
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.2f leva more.",Math.abs(finalSum1));
            }else {
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f leva left. ", finalSum1);
            }

        } else if(budget<sum){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",Math.abs(finalSum));
        }else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left. ", finalSum);
        }
    }
}
