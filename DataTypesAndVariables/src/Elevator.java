import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine());
        int capacity = Integer.parseInt(scan.nextLine());

        double all = Math.ceil(people * 1.0 / capacity);

        System.out.printf("%.0f", all);
    }
}
