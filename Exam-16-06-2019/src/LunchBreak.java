import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Име на сериал – текст
        //2. Продължителност на епизод – цяло число в диапазона [10… 90]
        //3. Продължителност на почивката – цяло число в диапазона [10… 120]
        String film = scan.nextLine();
        int time = Integer.parseInt(scan.nextLine());
        int rest = Integer.parseInt(scan.nextLine());

        double lunch=rest*0.125;
        double pause = rest*0.25;
        double sum = rest-lunch-pause;
        double all= sum -time;

        if(time<=sum){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",film,all);
        }else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",film,Math.abs(all));
        }
    }
}
