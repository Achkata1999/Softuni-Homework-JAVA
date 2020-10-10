import javax.xml.namespace.QName;
import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ban = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int rating = Integer.parseInt(scan.nextLine());
        int low = 0;
        int problems = 0;
        int sum = 0;
        String lastproblem = "";

        while (!input.equals("Enough")) {
            problems += 1;
            sum += rating;

            if (rating <= 4) {
                low += 1;
                if (low == ban) {
                    System.out.printf("You need a break, %d poor grades.", low);
                    break;
                }
            }
            input = scan.nextLine();
            if (input.equals("Enough")) {
                double average = sum * 1.0 / problems;
                System.out.printf("Average score: %.2f\n", average);
                System.out.printf("Number of problems: %d\n", problems);
                System.out.printf("Last problem: %s", lastproblem);
                break;

            }
            lastproblem = input;
            rating = Integer.parseInt(scan.nextLine());
        }

    }
}
