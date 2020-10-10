import java.util.Scanner;

public class TimeMinutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());
        int sum = minutes + 15;
        if (sum >= 60) {
            hour += 1;
            sum -= 60;
        }
        if (hour >= 24) {
            hour -= 24;
        }
        if (sum < 10) {
            System.out.printf("%d:0%d", hour, sum);
        } else {
            System.out.printf("%d:%d", hour, sum);
        }
    }
}
