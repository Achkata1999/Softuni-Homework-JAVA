import java.util.Scanner;

public class SeriesCalculator_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Име на сериал - текст
        //• Брой сезони – цяло число в диапазона [1… 10]
        //• Брой епизоди – цяло число в диапазона [10… 80]
        //• Времетраене на обикновен епизод без рекламите – реално число в диапазона [40.0… 65.0]
        String film =scan.nextLine();
        int season = Integer.parseInt(scan.nextLine());
        int episode = Integer.parseInt(scan.nextLine());
        double time = Double.parseDouble(scan.nextLine());


        double sum =(time*0.2+time)*episode*season+10*season;
        System.out.printf("Total time needed to watch the %s series is %.0f minutes.",film,sum );
    }
}
