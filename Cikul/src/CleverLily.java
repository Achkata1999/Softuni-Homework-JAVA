import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());
        double wash = Double.parseDouble(scan.nextLine());
        int toysPrice = Integer.parseInt(scan.nextLine());

        int toys = 0;
        double money = 0;
        double sum=0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                sum+=10;
                money += sum-1;
            } else {
                toys += 1;
            }
        }
        double price = toysPrice * toys + money;
        double finalSum = price - wash;
        if(price>=wash){
            System.out.printf("Yes! %.2f",finalSum);
        }else {
            System.out.printf("No! %.2f",Math.abs(finalSum));

        }
    }
}
