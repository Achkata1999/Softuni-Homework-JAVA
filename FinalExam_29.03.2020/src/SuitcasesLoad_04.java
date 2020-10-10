import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class SuitcasesLoad_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double capacity = Double.parseDouble(scan.nextLine());
        int counter = 0;
        int complete = 0;

        while (true) {
            String input = scan.nextLine();
            if (input.equals("End")) {
                System.out.println("Congratulations! All suitcases are loaded!");
                break;
            }
            counter++;
            if (counter % 3 == 0) {
                capacity -= (Double.parseDouble(input) + Double.parseDouble(input) * 0.1);
            } else {
                capacity -= (Double.parseDouble(input));
            }
            if (capacity < 0) {
                System.out.println("No more space!");
                break;
            }
            complete++;
        }
        System.out.printf("Statistic: %d suitcases loaded.", complete);
    }

}
