import java.util.Scanner;

public class SwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double record = Double.parseDouble(scan.nextLine());
        double meter = Double.parseDouble(scan.nextLine());
        double sec = Double.parseDouble(scan.nextLine());

        double slow = meter / 15;
        slow = Math.floor(slow);
        double time = meter * sec + slow * 12.5;
        if (record > time) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", time);
        } else {
            double left = time - record;
            System.out.printf("No, he failed! He was %.2f seconds slower.",left);
        }
    }
}
