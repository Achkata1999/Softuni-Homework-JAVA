import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int stop = Integer.parseInt(scan.nextLine());
        int counter = start;
        int sum = 0;

        while (counter <= stop) {
            sum += counter;
            System.out.printf("%d ",counter );
            counter++;

        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
