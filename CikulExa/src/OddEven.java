import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        double oddSum = 0*1.0;
        double oddMin = Integer.MAX_VALUE;
        double oddMax = Integer.MIN_VALUE;

        double evenSum = 0;
        double evenMin = Integer.MAX_VALUE;
        double evenMax = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scan.nextLine());
            if (i % 2 == 0) {
                evenSum += number;
                if (number > evenMax) {
                    evenMax = number;
                }
                if (number < evenMin) {
                    evenMin = number;
                }
            } else {
                oddSum += number;
                if (number > oddMax) {
                    oddMax = number;
                }
                if (number < oddMin) {
                    oddMin = number;
                }
            }
        }

        System.out.printf("OddSum=%.2f,\n", oddSum);
        if (oddMin != Integer.MAX_VALUE) {
            System.out.printf("OddMin=%.2f,\n", oddMin);
        } else {
            System.out.println("OddMin=No,");
        }
        if (oddMax != Integer.MIN_VALUE) {
            System.out.printf("OddMax=%.2f,\n", oddMax);
        } else {
            System.out.println("OddMax=No,");
        }
        System.out.printf("EvenSum=%.2f,\n", evenSum);

        if (evenMin != Integer.MAX_VALUE) {
            System.out.printf("EvenMin=%.2f,\n", evenMin);
        } else {
            System.out.println("EvenMin=No,");
        }
        if (evenMax != Integer.MIN_VALUE) {
            System.out.printf("EvenMax=%.2f\n", evenMax);
        } else {
            System.out.println("EvenMax=No");
        }

    }
}
