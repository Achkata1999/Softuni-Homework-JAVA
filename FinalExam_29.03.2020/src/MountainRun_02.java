import java.util.Scanner;

public class MountainRun_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double record = Double.parseDouble(scan.nextLine());
        double meter = Double.parseDouble(scan.nextLine());
        double secToMeter = Double.parseDouble(scan.nextLine());

        double slow = meter / 50;
        double all = secToMeter * meter + Math.floor(slow) * 30;

        if (record > all) {
            System.out.printf("Yes! The new record is %.2f seconds.", all);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", all- record);
        }
    }
}
