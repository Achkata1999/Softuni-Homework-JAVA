import java.util.Scanner;

public class GraduationPt_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String student = scan.nextLine();
        double sum = 0;
        int year = 1;
        int ban = 0;

        while (year <= 12) {
            double rating = Double.parseDouble(scan.nextLine());
            if (rating < 4) {
                ban += 1;
                if (ban >= 2) {
                    System.out.printf("%s has been excluded at %d grade", student, year);
                    break;
                }
                continue;
            }
            sum += rating;
            year++;
        }
        if (year >=12) {
            double price = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", student, price);
        }

    }
}
