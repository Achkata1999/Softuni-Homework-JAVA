import java.util.Scanner;

public class MovieProfit_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Име на филм - текст
        //2. Брой дни - цяло число в диапазона [1… 90]
        //3. Брой билети - цяло число в диапазона [100… 100000]
        //4. Цена на билет - реално число в диапазона [5.0… 25.0]
        //5. Процент за киното - цяло число в диапазона [5... 35]
        String film = scan.nextLine();
        int day = Integer.parseInt(scan.nextLine());
        int ticket = Integer.parseInt(scan.nextLine());
        double price = Double.parseDouble(scan.nextLine());
        int percent = Integer.parseInt(scan.nextLine());

        double sum = day*ticket*price;
        double all=sum-sum*percent/100;
        System.out.printf("The profit from the movie %s is %.2f lv.",film,all  );
    }
}
