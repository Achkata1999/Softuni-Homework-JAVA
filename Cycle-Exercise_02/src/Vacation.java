import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Пари нужни за екскурзията - реално число в интервала [1.00…25000.00]
        // Налични пари - реално число в интервала [0.00...25000.00]
        //След това многократно се четат по два реда:
        // Вид действие - текст с възможности &quot;spend&quot; и &quot;save&quot;.
        // Сумата, която ще спести/похарчи - реално число в интервала [0.01…25000.00]
        double needMoney = Double.parseDouble(scan.nextLine());
        double realMoney = Double.parseDouble(scan.nextLine());
        int days = 0;
        int spend = 0;

        while (realMoney < needMoney) {
            days+=1;
            String text = scan.nextLine();
            double money = Double.parseDouble(scan.nextLine());
            if ("save".equals(text)) {
                spend=0;
                realMoney += money;
            } else {
                realMoney -= money;
                if (realMoney < 0) {
                    realMoney = 0;
                }
                spend += 1;
                if (spend == 5) {
                    System.out.println("You can't save the money.");
                    System.out.println(days);
                    break ;
                }
            }
        }
        if(realMoney>=needMoney){
            System.out.printf("You saved the money for %d days.",days);
        }


    }
}
