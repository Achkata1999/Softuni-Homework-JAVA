import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int wagon = Integer.parseInt(scan.nextLine());
        int sum = 0;

        int[] people = new int[wagon];
        for (int i = 0; i < wagon; i++) {
            people[i] = Integer.parseInt(scan.nextLine());
        }
        for (int i = 0; i < wagon; i++) {
            System.out.print(people[i] + " ");
            sum += people[i];

        }
        System.out.println();
        System.out.println(sum);
    }
}