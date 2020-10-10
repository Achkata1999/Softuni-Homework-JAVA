import java.util.Scanner;

public class ChangeBureau_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //На първия ред – броят биткойни. Цяло число в интервала [0…20]
        // На втория ред – броят китайски юана. Реално число в интервала [0.00… 50 000.00]
        // На третия ред – комисионната. Реално число в интервала [0.00 ... 5.00]

        int bitcoin = Integer.parseInt(scan.nextLine());
        double china = Double.parseDouble(scan.nextLine());
        double comisune = Double.parseDouble(scan.nextLine());

        double sumChina = china * 0.15;
        double sum = (bitcoin * 1168  + sumChina * 1.76)/1.95;
        double all = sum - sum * comisune / 100;
        System.out.printf("%.2f", all);
    }
}
