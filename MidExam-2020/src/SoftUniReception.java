import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int employed = 3;
        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());

        int students = Integer.parseInt(scan.nextLine());
        int count = 0;
        int totalHour = 0;
        while (students > 0) {
            if (count % 3 == 0 && count != 0) {
                totalHour++;
            }
            students -= (first + second + third);
            count++;
            totalHour++;

        }
        System.out.printf("Time needed: %dh.", totalHour);
    }
}
